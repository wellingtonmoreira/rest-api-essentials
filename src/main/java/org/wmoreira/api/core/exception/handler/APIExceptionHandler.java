package org.wmoreira.api.core.exception.handler;

import org.apache.http.entity.ContentType;
import org.wmoreira.api.core.exception.APIException;
import org.wmoreira.api.core.exception.InternalServerErrorException;
import org.wmoreira.api.core.parser.JsonParser;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wellington.362@gmail.com
 */

public enum APIExceptionHandler {
    INSTANCE;

    public void handleResponse(HttpServletResponse response, Exception exc) {
        Throwable cause = exc.getCause();

        if (exc instanceof APIException || (cause != null && cause instanceof APIException)) {
            handleException(response, (APIException) cause);
        } else {
            handleException(response, new InternalServerErrorException());
        }
    }

    void handleException(HttpServletResponse response, APIException aex) {
        try {
            response.setStatus(aex.getStatus());
            response.setContentType(ContentType.APPLICATION_JSON.getMimeType());
            String error = JsonParser.INSTANCE.toJson(Error.of(aex.getStatus(), aex.getMessage()));
            response.getOutputStream().write(error.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

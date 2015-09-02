package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class UnsupportedMediaTypeException extends APIException {
    public static final int STATUS = 415;

    public UnsupportedMediaTypeException() {
        super(STATUS);
    }

    public UnsupportedMediaTypeException(Exception exception) {
        super(STATUS, exception);
    }

    public UnsupportedMediaTypeException(String message) {
        super(STATUS, message);
    }

    public UnsupportedMediaTypeException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public UnsupportedMediaTypeException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public UnsupportedMediaTypeException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

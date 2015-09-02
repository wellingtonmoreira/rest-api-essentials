package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class BadGatewayException extends APIException {
    public static final int STATUS = 502;

    public BadGatewayException() {
        super(STATUS);
    }

    public BadGatewayException(Exception exception) {
        super(STATUS, exception);
    }

    public BadGatewayException(String message) {
        super(STATUS, message);
    }

    public BadGatewayException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public BadGatewayException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public BadGatewayException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }


}

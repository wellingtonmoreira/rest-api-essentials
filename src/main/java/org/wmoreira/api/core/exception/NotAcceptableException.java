package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class NotAcceptableException extends APIException {
    public static final int STATUS = 406;

    public NotAcceptableException() {
        super(STATUS);
    }

    public NotAcceptableException(Exception exception) {
        super(STATUS, exception);
    }

    public NotAcceptableException(String message) {
        super(STATUS, message);
    }

    public NotAcceptableException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public NotAcceptableException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public NotAcceptableException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

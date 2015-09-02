package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class RequestEntityTooLargeException extends APIException {
    public static final int STATUS = 413;

    public RequestEntityTooLargeException() {
        super(STATUS);
    }

    public RequestEntityTooLargeException(Exception exception) {
        super(STATUS, exception);
    }

    public RequestEntityTooLargeException(String message) {
        super(STATUS, message);
    }

    public RequestEntityTooLargeException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public RequestEntityTooLargeException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public RequestEntityTooLargeException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class RequestTimeoutException extends APIException {
    public static final int STATUS = 408;

    public RequestTimeoutException() {
        super(STATUS);
    }

    public RequestTimeoutException(Exception exception) {
        super(STATUS, exception);
    }

    public RequestTimeoutException(String message) {
        super(STATUS, message);
    }

    public RequestTimeoutException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public RequestTimeoutException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public RequestTimeoutException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class ServiceUnavailableException extends APIException {
    public static final int STATUS = 503;

    public ServiceUnavailableException() {
        super(STATUS);
    }

    public ServiceUnavailableException(Exception exception) {
        super(STATUS, exception);
    }

    public ServiceUnavailableException(String message) {
        super(STATUS, message);
    }

    public ServiceUnavailableException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public ServiceUnavailableException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public ServiceUnavailableException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

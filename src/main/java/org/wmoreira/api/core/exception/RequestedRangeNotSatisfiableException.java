package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class RequestedRangeNotSatisfiableException extends APIException {
    public static final int STATUS = 416;

    public RequestedRangeNotSatisfiableException() {
        super(STATUS);
    }

    public RequestedRangeNotSatisfiableException(Exception exception) {
        super(STATUS, exception);
    }

    public RequestedRangeNotSatisfiableException(String message) {
        super(STATUS, message);
    }

    public RequestedRangeNotSatisfiableException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public RequestedRangeNotSatisfiableException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public RequestedRangeNotSatisfiableException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

package org.wmoreira.api.core.exception;

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
}

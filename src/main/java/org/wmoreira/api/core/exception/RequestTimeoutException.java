package org.wmoreira.api.core.exception;

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
}

package org.wmoreira.api.core.exception;

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
}

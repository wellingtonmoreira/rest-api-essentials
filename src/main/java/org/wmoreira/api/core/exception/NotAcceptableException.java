package org.wmoreira.api.core.exception;

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
}

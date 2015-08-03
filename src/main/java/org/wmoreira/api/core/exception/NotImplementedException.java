package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class NotImplementedException extends APIException {
    public static final int STATUS = 501;

    public NotImplementedException() {
        super(STATUS);
    }

    public NotImplementedException(Exception exception) {
        super(STATUS, exception);
    }

    public NotImplementedException(String message) {
        super(STATUS, message);
    }
}

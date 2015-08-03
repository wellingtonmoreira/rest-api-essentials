package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class ConflictException extends APIException {
    public static final int STATUS = 409;

    public ConflictException() {
        super(STATUS);
    }

    public ConflictException(Exception exception) {
        super(STATUS, exception);
    }

    public ConflictException(String message) {
        super(STATUS, message);
    }
}

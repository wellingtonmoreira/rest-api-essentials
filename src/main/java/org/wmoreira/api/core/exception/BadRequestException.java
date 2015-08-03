package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class BadRequestException extends APIException {
    public static final int STATUS = 400;

    public BadRequestException() {
        super(STATUS);
    }

    public BadRequestException(Exception exception) {
        super(STATUS, exception);
    }

    public BadRequestException(String message) {
        super(STATUS, message);
    }
}

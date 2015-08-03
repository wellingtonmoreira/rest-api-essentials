package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class InternalServerErrorException extends APIException {
    public static final int STATUS = 500;

    public InternalServerErrorException() {
        super(STATUS);
    }

    public InternalServerErrorException(Exception exception) {
        super(STATUS, exception);
    }

    public InternalServerErrorException(String message) {
        super(STATUS, message);
    }
}

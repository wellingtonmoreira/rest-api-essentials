package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class UnsupportedMediaTypeException extends APIException {
    public static final int STATUS = 415;

    public UnsupportedMediaTypeException() {
        super(STATUS);
    }

    public UnsupportedMediaTypeException(Exception exception) {
        super(STATUS, exception);
    }

    public UnsupportedMediaTypeException(String message) {
        super(STATUS, message);
    }
}

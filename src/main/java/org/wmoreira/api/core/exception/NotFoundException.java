package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class NotFoundException extends APIException {
    public static final int STATUS = 404;

    public NotFoundException() {
        super(STATUS);
    }

    public NotFoundException(Exception exception) {
        super(STATUS, exception);
    }

    public NotFoundException(String message) {
        super(STATUS, message);
    }
}

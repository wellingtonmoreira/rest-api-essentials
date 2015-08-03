package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class ForbiddenException extends APIException {
    public static final int STATUS = 403;

    public ForbiddenException() {
        super(STATUS);
    }

    public ForbiddenException(Exception exception) {
        super(STATUS, exception);
    }

    public ForbiddenException(String message) {
        super(STATUS, message);
    }

}

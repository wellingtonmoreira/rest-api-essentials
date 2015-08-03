package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class UnauthorizedException extends APIException {
    public static final int STATUS = 401;

    public UnauthorizedException() {
        super(STATUS);
    }

    public UnauthorizedException(Exception exception) {
        super(STATUS, exception);
    }

    public UnauthorizedException(String message) {
        super(STATUS, message);
    }
}

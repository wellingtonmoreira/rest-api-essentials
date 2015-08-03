package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class BadGatewayException extends APIException {
    public static final int STATUS = 502;

    public BadGatewayException() {
        super(STATUS);
    }

    public BadGatewayException(Exception exception) {
        super(STATUS, exception);
    }

    public BadGatewayException(String message) {
        super(STATUS, message);
    }
}

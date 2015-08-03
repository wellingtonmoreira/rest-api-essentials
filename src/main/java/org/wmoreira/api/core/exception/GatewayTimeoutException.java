package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class GatewayTimeoutException extends APIException {
    public static final int STATUS = 504;

    public GatewayTimeoutException() {
        super(STATUS);
    }

    public GatewayTimeoutException(Exception exception) {
        super(STATUS, exception);
    }

    public GatewayTimeoutException(String message) {
        super(STATUS, message);
    }
}

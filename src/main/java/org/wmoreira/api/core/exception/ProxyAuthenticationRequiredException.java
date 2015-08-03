package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class ProxyAuthenticationRequiredException extends APIException {
    public static final int STATUS = 407;

    public ProxyAuthenticationRequiredException() {
        super(STATUS);
    }

    public ProxyAuthenticationRequiredException(Exception exception) {
        super(STATUS, exception);
    }

    public ProxyAuthenticationRequiredException(String message) {
        super(STATUS, message);
    }
}

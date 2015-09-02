package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

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

    public ProxyAuthenticationRequiredException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public ProxyAuthenticationRequiredException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public ProxyAuthenticationRequiredException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

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

    public GatewayTimeoutException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public GatewayTimeoutException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public GatewayTimeoutException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

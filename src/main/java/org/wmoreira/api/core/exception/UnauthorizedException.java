package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

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

    public UnauthorizedException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public UnauthorizedException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public UnauthorizedException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

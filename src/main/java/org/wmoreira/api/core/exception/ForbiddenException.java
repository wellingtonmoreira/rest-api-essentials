package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

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

    public ForbiddenException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public ForbiddenException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public ForbiddenException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

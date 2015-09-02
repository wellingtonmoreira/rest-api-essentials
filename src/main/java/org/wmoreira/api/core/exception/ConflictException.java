package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class ConflictException extends APIException {
    public static final int STATUS = 409;

    public ConflictException() {
        super(STATUS);
    }

    public ConflictException(Exception exception) {
        super(STATUS, exception);
    }

    public ConflictException(String message) {
        super(STATUS, message);
    }

    public ConflictException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public ConflictException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public ConflictException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

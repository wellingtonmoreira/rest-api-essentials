package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class NotFoundException extends APIException {
    public static final int STATUS = 404;

    public NotFoundException() {
        super(STATUS);
    }

    public NotFoundException(Exception exception) {
        super(STATUS, exception);
    }

    public NotFoundException(String message) {
        super(STATUS, message);
    }

    public NotFoundException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public NotFoundException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public NotFoundException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

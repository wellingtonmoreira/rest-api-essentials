package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class BadRequestException extends APIException {
    public static final int STATUS = 400;

    public BadRequestException() {
        super(STATUS);
    }

    public BadRequestException(Exception exception) {
        super(STATUS, exception);
    }

    public BadRequestException(String message) {
        super(STATUS, message);
    }

    public BadRequestException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public BadRequestException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public BadRequestException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

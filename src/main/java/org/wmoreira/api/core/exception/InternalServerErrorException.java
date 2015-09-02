package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class InternalServerErrorException extends APIException {
    public static final int STATUS = 500;

    public InternalServerErrorException() {
        super(STATUS);
    }

    public InternalServerErrorException(Exception exception) {
        super(STATUS, exception);
    }

    public InternalServerErrorException(String message) {
        super(STATUS, message);
    }

    public InternalServerErrorException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public InternalServerErrorException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public InternalServerErrorException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

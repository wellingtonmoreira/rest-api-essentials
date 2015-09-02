package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class UnprocessableEntityException extends APIException {
    public static final int STATUS = 422;

    public UnprocessableEntityException() {
        super(STATUS);
    }

    public UnprocessableEntityException(Exception exception) {
        super(STATUS, exception);
    }

    public UnprocessableEntityException(String message) {
        super(STATUS, message);
    }

    public UnprocessableEntityException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public UnprocessableEntityException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public UnprocessableEntityException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

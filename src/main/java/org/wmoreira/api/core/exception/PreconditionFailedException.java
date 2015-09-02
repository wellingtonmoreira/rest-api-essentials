package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class PreconditionFailedException extends APIException {
    public static final int STATUS = 412;

    public PreconditionFailedException() {
        super(STATUS);
    }

    public PreconditionFailedException(Exception exception) {
        super(STATUS, exception);
    }

    public PreconditionFailedException(String message) {
        super(STATUS, message);
    }

    public PreconditionFailedException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public PreconditionFailedException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public PreconditionFailedException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

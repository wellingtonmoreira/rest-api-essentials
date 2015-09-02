package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class FailedDependencyException extends APIException {
    public static final int STATUS = 424;

    public FailedDependencyException() {
        super(STATUS);
    }

    public FailedDependencyException(Exception exception) {
        super(STATUS, exception);
    }

    public FailedDependencyException(String message) {
        super(STATUS, message);
    }

    public FailedDependencyException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public FailedDependencyException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public FailedDependencyException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

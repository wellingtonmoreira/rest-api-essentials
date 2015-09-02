package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class ExpectationFailedException extends APIException {
    public static final int STATUS = 417;

    public ExpectationFailedException() {
        super(STATUS);
    }

    public ExpectationFailedException(Exception exception) {
        super(STATUS, exception);
    }

    public ExpectationFailedException(String message) {
        super(STATUS, message);
    }

    public ExpectationFailedException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public ExpectationFailedException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public ExpectationFailedException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

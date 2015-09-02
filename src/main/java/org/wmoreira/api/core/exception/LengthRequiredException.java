package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class LengthRequiredException extends APIException {
    public static final int STATUS = 411;

    public LengthRequiredException() {
        super(STATUS);
    }

    public LengthRequiredException(Exception exception) {
        super(STATUS, exception);
    }

    public LengthRequiredException(String message) {
        super(STATUS, message);
    }

    public LengthRequiredException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public LengthRequiredException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public LengthRequiredException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

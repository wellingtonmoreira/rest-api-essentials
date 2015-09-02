package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class GoneException extends APIException {
    public static final int STATUS = 410;

    public GoneException() {
        super(STATUS);
    }

    public GoneException(Exception exception) {
        super(STATUS, exception);
    }

    public GoneException(String message) {
        super(STATUS, message);
    }

    public GoneException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public GoneException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public GoneException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

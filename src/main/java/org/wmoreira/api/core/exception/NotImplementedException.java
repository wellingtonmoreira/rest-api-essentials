package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class NotImplementedException extends APIException {
    public static final int STATUS = 501;

    public NotImplementedException() {
        super(STATUS);
    }

    public NotImplementedException(Exception exception) {
        super(STATUS, exception);
    }

    public NotImplementedException(String message) {
        super(STATUS, message);
    }

    public NotImplementedException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public NotImplementedException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public NotImplementedException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

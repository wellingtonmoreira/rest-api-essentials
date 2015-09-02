package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

public class LockedException extends APIException {
    public static final int STATUS = 423;

    public LockedException() {
        super(STATUS);
    }

    public LockedException(Exception exception) {
        super(STATUS, exception);
    }

    public LockedException(String message) {
        super(STATUS, message);
    }

    public LockedException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public LockedException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public LockedException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }


}

package org.wmoreira.api.core.exception;
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
}

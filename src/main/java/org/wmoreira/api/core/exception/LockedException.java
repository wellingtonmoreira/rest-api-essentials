package org.wmoreira.api.core.exception;
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
}

package org.wmoreira.api.core.exception;

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
}

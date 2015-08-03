package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class LenghtRequiredException extends APIException {
    public static final int STATUS = 411;

    public LenghtRequiredException() {
        super(STATUS);
    }

    public LenghtRequiredException(Exception exception) {
        super(STATUS, exception);
    }

    public LenghtRequiredException(String message) {
        super(STATUS, message);
    }
}

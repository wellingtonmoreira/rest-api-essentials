package org.wmoreira.api.core.exception;

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

    @Override
    public String getDefaultMessage() {
        return "Length required";
    }
}

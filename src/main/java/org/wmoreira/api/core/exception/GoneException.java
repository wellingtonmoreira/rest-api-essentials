package org.wmoreira.api.core.exception;

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
}

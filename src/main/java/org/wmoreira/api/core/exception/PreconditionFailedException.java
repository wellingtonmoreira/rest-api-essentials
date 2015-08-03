package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class PreconditionFailedException extends APIException {
    public static final int STATUS = 412;

    public PreconditionFailedException() {
        super(STATUS);
    }

    public PreconditionFailedException(Exception exception) {
        super(STATUS, exception);
    }

    public PreconditionFailedException(String message) {
        super(STATUS, message);
    }
}

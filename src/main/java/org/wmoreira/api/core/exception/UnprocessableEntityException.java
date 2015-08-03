package org.wmoreira.api.core.exception;
/**
 * @author wellington.362@gmail.com
 */

public class UnprocessableEntityException extends APIException {
    public static final int STATUS = 422;

    public UnprocessableEntityException() {
        super(STATUS);
    }

    public UnprocessableEntityException(Exception exception) {
        super(STATUS, exception);
    }

    public UnprocessableEntityException(String message) {
        super(STATUS, message);
    }
}

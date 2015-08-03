package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class PaymentRequiredException extends APIException {
    public static final int STATUS = 402;

    public PaymentRequiredException() {
        super(STATUS);
    }

    public PaymentRequiredException(Exception exception) {
        super(STATUS, exception);
    }

    public PaymentRequiredException(String message) {
        super(STATUS, message);
    }
}

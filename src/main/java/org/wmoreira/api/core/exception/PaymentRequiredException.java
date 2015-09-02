package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

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

    public PaymentRequiredException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public PaymentRequiredException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public PaymentRequiredException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }
}

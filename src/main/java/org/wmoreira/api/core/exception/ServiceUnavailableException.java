package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

public class ServiceUnavailableException extends APIException {
    public static final int STATUS = 503;

    public ServiceUnavailableException() {
        super(STATUS);
    }

    public ServiceUnavailableException(Exception exception) {
        super(STATUS, exception);
    }

    public ServiceUnavailableException(String message) {
        super(STATUS, message);
    }
}

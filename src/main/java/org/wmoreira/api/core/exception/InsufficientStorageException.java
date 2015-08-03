package org.wmoreira.api.core.exception;
/**
 * @author wellington.362@gmail.com
 */

public class InsufficientStorageException extends APIException {
    public static final int STATUS = 507;

    public InsufficientStorageException() {
        super(STATUS);
    }

    public InsufficientStorageException(Exception exception) {
        super(STATUS, exception);
    }

    public InsufficientStorageException(String message) {
        super(STATUS, message);
    }
}

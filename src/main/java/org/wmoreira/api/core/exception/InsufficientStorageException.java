package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.List;

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

    public InsufficientStorageException(List<APIViolation> violations) {
        super(STATUS, violations);
    }

    public InsufficientStorageException(Exception exception, List<APIViolation> violations) {
        super(STATUS, exception, violations);
    }

    public InsufficientStorageException(String message, List<APIViolation> violations) {
        super(STATUS, message, violations);
    }

}

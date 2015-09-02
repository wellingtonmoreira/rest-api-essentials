package org.wmoreira.api.core.exception;

import org.wmoreira.api.core.exception.handler.APIViolation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

@SuppressWarnings("serial")
public abstract class APIException extends RuntimeException {

    private int status;
    private String message;
    private List<APIViolation> violations = new ArrayList<>();

    public APIException(int status) {
        this.status = status;
    }

    public APIException(int status, List<APIViolation> violations) {
        this(status);
        this.violations = violations;
    }

    public APIException(int status, Exception exception) {
        this.initCause(exception);
        this.status = status;
    }

    public APIException(int status, Exception exception, List<APIViolation> violations) {
        this(status, exception);
        this.violations = violations;
    }

    public APIException(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public APIException(int status, String message, List<APIViolation> violations) {
        this(status, message);
        this.violations = violations;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<APIViolation> getViolations() {
        return violations;
    }

    public void setViolations(List<APIViolation> violations) {
        this.violations = violations;
    }
}

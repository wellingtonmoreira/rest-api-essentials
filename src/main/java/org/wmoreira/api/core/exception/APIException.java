package org.wmoreira.api.core.exception;

/**
 * @author wellington.362@gmail.com
 */

@SuppressWarnings("serial")
public abstract class APIException extends RuntimeException {

    private int status;
    private String message;

    public APIException(int status) {
        this.status = status;
    }

    public APIException(int status, Exception exception) {
        this.initCause(exception);
        this.status = status;
    }

    public APIException(int status, String message) {
        this.status = status;
        this.message = message;
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

}

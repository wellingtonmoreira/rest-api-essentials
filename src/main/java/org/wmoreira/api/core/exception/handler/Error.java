package org.wmoreira.api.core.exception.handler;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Created by welingtonmoreira on 28/08/15.
 */
@JsonAutoDetect
public class Error {
    private final int status;
    private final String message;

    private Error(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public static Error of(int status, String message) {
        return new Error(status, message);
    }

    public String getMessage() {
	return message;
    }

    public int getStatus() {
	return status;
    }
}

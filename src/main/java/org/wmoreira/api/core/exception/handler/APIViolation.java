package org.wmoreira.api.core.exception.handler;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Created by welingtonmoreira on 02/09/15.
 */
@JsonAutoDetect
public class APIViolation {
    private Integer id;
    private final String message;

    private APIViolation(String message) {
        this.message = message;
    }

    private APIViolation(int id, String message) {
        this.message = message;
    }

    public static APIViolation of(String message) {
        return new APIViolation(message);
    }

    public static APIViolation of(int id, String message) {
        return new APIViolation(id, message);
    }

    public Integer getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}

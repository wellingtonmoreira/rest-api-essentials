package org.wmoreira.api.core.exception.handler;

import org.codehaus.jackson.annotate.JsonAutoDetect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wellington.362@gmail.com
 */

@JsonAutoDetect
public class APIError {
    private final int status;
    private final String message;
    private final List<APIViolation> violations;

    private APIError(int status, String message) {
        violations = new ArrayList<>();
        this.status = status;
        this.message = message;
    }

    private APIError(int status, String message, List<APIViolation> violations) {
        this.status = status;
        this.message = message;
        this.violations = violations;
    }

    public static APIError of(int status, String message) {
        return new APIError(status, message);
    }

    public static APIError of(int status, String message, List<APIViolation> violations) {
        return new APIError(status, message, violations);
    }

    public String getMessage() {
	return message;
    }

    public int getStatus() {
	return status;
    }

    public List<APIViolation> getViolations() {
        return Collections.unmodifiableList(violations);
    }
}

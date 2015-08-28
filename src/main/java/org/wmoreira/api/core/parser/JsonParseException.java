package org.wmoreira.api.core.parser;

public class JsonParseException extends RuntimeException {

    public JsonParseException() {
        super();
    }

    public JsonParseException(Exception exception) {
        super(exception);
    }

    public JsonParseException(String message) {
	super(message);
    }
}

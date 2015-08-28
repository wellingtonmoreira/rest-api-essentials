package org.wmoreira.api.core.parser;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by welingtonmoreira on 28/08/15.
 */
public enum JsonParser {
    INSTANCE;

    ObjectMapper mapper = new ObjectMapper();

    public <T> T fromJson(String json, Class<T> type) throws JsonParseException {
        try {
            return mapper.readValue(json, type);
        } catch (Exception exc) {
            throw new JsonParseException(exc);
        }
    }

    public String toJson(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (Exception exc) {
            throw new JsonParseException(exc);
        }
    }
}

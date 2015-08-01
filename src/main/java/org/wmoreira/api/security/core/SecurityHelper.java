package org.wmoreira.api.security.core;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.NotAuthorizedException;

/**
 * @author wellington.362@gmail.com
 */

public interface SecurityHelper {
    void checkDenyAll() throws NotAuthorizedException;
    boolean isPermitAll();
    void authorize() throws NotAuthorizedException;
    boolean isAdmin();
    void checkRoles() throws ForbiddenException;
}

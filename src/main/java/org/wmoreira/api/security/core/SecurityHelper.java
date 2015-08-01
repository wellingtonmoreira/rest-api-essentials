package org.wmoreira.api.security.core;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.NotAuthorizedException;

public interface SecurityHelper {

    /**
     * Check if the requested
     * resource denies all incoming requests.
     *
     * example: @DenyAll annotated resource
     * @throws NotAuthorizedException if resource denies all incoming requests
     * @author wellington.362@gmail.com
     */
    void checkDenyAll() throws NotAuthorizedException;

    /**
     * Check if the requested
     * resource permits all incoming requests.
     *
     * example: @PermitAll annotated resource
     * @return true if the resource permits all incoming requests, false otherwise
     * @author wellington.362@gmail.com
     */
    boolean isPermitAll();

    /**
     * Authorize the User requesting the resource
     *
     * example: Retrieve user state by providing its 'token' and
     * store it somewhere (please make it transient!).
     * @throws NotAuthorizedException if user state cannot be found by the provided 'token'
     * @author wellington.362@gmail.com
     */
    void authorize() throws NotAuthorizedException;

    /**
     * Check if authorized user is an administrator
     *
     * @return true if the user is an administrator, false otherwise
     * @author wellington.362@gmail.com
     */
    boolean isAdmin();

    /**
     * Check if authorized user roles corresponds to the resource's
     *
     * @throws ForbiddenException if the requested resource is forbidden
     * to the requesting user
     * @author wellington.362@gmail.com
     */
    void checkRoles() throws ForbiddenException;
}

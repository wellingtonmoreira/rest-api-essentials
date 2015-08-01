package org.wmoreira.api.security.core;

import javax.ws.rs.ForbiddenException;

/**
 * Avoid 'after authorization' methods being called before proper authorization
 *
 * @author wellington.362@gmail.com
 */

public interface AfterAuthorizationSecurityChain {
    AfterAuthorizationSecurityChain checkAdmin();
    void checkRoles() throws ForbiddenException;}

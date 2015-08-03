package org.wmoreira.api.core.security;

import org.wmoreira.api.core.exception.ForbiddenException;

/**
 * @author wellington.362@gmail.com
 */

public interface AfterAuthorizationSecurityChain {
    AfterAuthorizationSecurityChain checkAdmin();
    void checkRoles() throws ForbiddenException;}

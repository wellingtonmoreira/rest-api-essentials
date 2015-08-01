package org.wmoreira.api.security.core;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.NotAuthorizedException;

/**
 * @author wellington.362@gmail.com
 */

public final class SecurityChain {
    private final SecurityHelper securityHelper;
    private boolean allowed = false;

    private static SecurityChain of(SecurityHelper securityHelper) {
        return new SecurityChain(securityHelper);
    }

    private SecurityChain(SecurityHelper securityHelper) {
        this.securityHelper = securityHelper;
    }

    SecurityChain checkDenyAll() throws NotAuthorizedException {
        securityHelper.checkDenyAll();
        return this;
    }

    SecurityChain checkPermitAll() {
        allowed = securityHelper.isPermitAll();
        return this;
    }

    SecurityChain authorize() throws NotAuthorizedException {
        if (!allowed) {
            securityHelper.authorize();
        }
        return this;
    }

    SecurityChain checkAdmin() {
        if (!allowed) {
            allowed = securityHelper.isAdmin();
        }
        return this;
    }

    boolean checkRoles() throws ForbiddenException {
        if (!allowed) {
            securityHelper.checkRoles();
        }
        return true;
    }
}

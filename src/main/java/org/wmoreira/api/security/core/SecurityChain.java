package org.wmoreira.api.security.core;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.NotAuthorizedException;

/**
 * @author wellington.362@gmail.com
 */

public final class SecurityChain implements BeforeAuthorizationSecurityChain, AfterAuthorizationSecurityChain {
    private final SecurityHelper securityHelper;
    private boolean allowed = false;

    public static BeforeAuthorizationSecurityChain of(SecurityHelper securityHelper) {
        if (securityHelper == null) {
            /* "Nice try buddy, but a null SecurityHelper SHALL NOT PASS!"*/
            throw new IllegalArgumentException("securityHelper must not be null");
        }

        return new SecurityChain(securityHelper);
    }

    private SecurityChain(SecurityHelper securityHelper) {
        this.securityHelper = securityHelper;
    }

    @Override
    public BeforeAuthorizationSecurityChain checkDenyAll() throws NotAuthorizedException {
        securityHelper.checkDenyAll();
        return this;
    }

    @Override
    public BeforeAuthorizationSecurityChain checkPermitAll() {
        allowed = securityHelper.isPermitAll();
        return this;
    }

    @Override
    public AfterAuthorizationSecurityChain authorize() throws NotAuthorizedException {
        if (!allowed) {
            securityHelper.authorize();
        }
        return this;
    }

    @Override
    public AfterAuthorizationSecurityChain checkAdmin() {
        if (!allowed) {
            allowed = securityHelper.isAdmin();
        }
        return this;
    }

    @Override
    public void checkRoles() throws ForbiddenException {
        if (!allowed) {
            securityHelper.checkRoles();
        }
    }
}

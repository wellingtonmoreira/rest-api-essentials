package org.wmoreira.api.core.security;

import org.wmoreira.api.core.exception.UnauthorizedException;
import org.wmoreira.api.core.exception.ForbiddenException;

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
    public BeforeAuthorizationSecurityChain checkDenyAll() throws UnauthorizedException {
        securityHelper.checkDenyAll();
        return this;
    }

    @Override
    public BeforeAuthorizationSecurityChain checkPermitAll() {
        allowed = securityHelper.isPermitAll();
        return this;
    }

    @Override
    public AfterAuthorizationSecurityChain authorize() throws UnauthorizedException {
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

    boolean isAllowed() {
        return allowed;
    }
}

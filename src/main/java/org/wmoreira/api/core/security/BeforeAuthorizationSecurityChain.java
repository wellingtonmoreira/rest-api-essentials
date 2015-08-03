package org.wmoreira.api.core.security;

import org.wmoreira.api.core.exception.UnauthorizedException;

/**
 * @author wellington.362@gmail.com
 */

public interface BeforeAuthorizationSecurityChain {
    BeforeAuthorizationSecurityChain checkDenyAll() throws UnauthorizedException;
    BeforeAuthorizationSecurityChain checkPermitAll();
    AfterAuthorizationSecurityChain authorize() throws UnauthorizedException;
}

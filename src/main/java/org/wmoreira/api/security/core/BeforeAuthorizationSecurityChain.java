package org.wmoreira.api.security.core;

import javax.ws.rs.NotAuthorizedException;

/**
 * @author wellington.362@gmail.com
 */

public interface BeforeAuthorizationSecurityChain {
    BeforeAuthorizationSecurityChain checkDenyAll() throws NotAuthorizedException;
    BeforeAuthorizationSecurityChain checkPermitAll();
    AfterAuthorizationSecurityChain authorize() throws NotAuthorizedException;
}

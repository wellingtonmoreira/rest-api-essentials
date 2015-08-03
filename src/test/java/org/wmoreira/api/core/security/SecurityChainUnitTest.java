package org.wmoreira.api.core.security;

import org.junit.Before;
import org.junit.Test;
import org.wmoreira.api.core.exception.ForbiddenException;
import org.wmoreira.api.core.exception.UnauthorizedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * @author wellington.362@gmail.com
 */

public class SecurityChainUnitTest {
    BeforeAuthorizationSecurityChain beforeAuthorizationSecurityChainInstance;
    AfterAuthorizationSecurityChain afterAuthorizationSecurityChain;
    SecurityHelper helper;

    @Before
    public void setUp() {
        helper = mock(SecurityHelper.class);
        beforeAuthorizationSecurityChainInstance = SecurityChain.of(helper);
        afterAuthorizationSecurityChain = beforeAuthorizationSecurityChainInstance.authorize();
    }

    @Test(expected = UnauthorizedException.class)
    public void testCheckDenyAllCaseAnnotationPresent() {
        doThrow(UnauthorizedException.class).when(helper).checkDenyAll();
        beforeAuthorizationSecurityChainInstance.checkDenyAll();
    }

    @Test(expected = UnauthorizedException.class)
    public void testAuthorizeErrorCaseUnauthorized() {
        doThrow(UnauthorizedException.class).when(helper).authorize();
        beforeAuthorizationSecurityChainInstance.authorize();
    }

    @Test(expected = ForbiddenException.class)
    public void testCheckRolesErrorCaseForbidden() {
        doThrow(ForbiddenException.class).when(helper).checkRoles();
        afterAuthorizationSecurityChain.checkRoles();
    }

    public void testIsAdminCaseTrue() {
        when(helper.isAdmin()).thenReturn(true);
        afterAuthorizationSecurityChain.checkAdmin();
        assertTrue(((SecurityChain)afterAuthorizationSecurityChain).isAllowed());
    }

    public void testIsAdminCaseFalse() {
        when(helper.isAdmin()).thenReturn(true);
        afterAuthorizationSecurityChain.checkAdmin();
        assertFalse(((SecurityChain) afterAuthorizationSecurityChain).isAllowed());
    }
}

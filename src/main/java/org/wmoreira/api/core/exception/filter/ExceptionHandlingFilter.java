package org.wmoreira.api.core.exception.filter;

import org.wmoreira.api.core.exception.handler.APIExceptionHandler;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wellington.362@gmail.com
 */

public class ExceptionHandlingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } catch (Exception exc) {
            HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
            APIExceptionHandler.INSTANCE.handleResponse(httpResponse, exc);
        }
    }

    @Override
    public void destroy() {

    }
}

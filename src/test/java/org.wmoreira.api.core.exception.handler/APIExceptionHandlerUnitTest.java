package org.wmoreira.api.core.exception.handler;

import org.junit.Before;
import org.junit.Test;
import org.wmoreira.api.core.exception.NotFoundException;
import org.wmoreira.api.core.exception.UnauthorizedException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;

/**
 * @author wellington.362@gmail.com
 */

public class APIExceptionHandlerUnitTest {
    APIExceptionHandler instance;
    HttpServletResponse response;
    ServletOutputStream outputStream;

    @Before
    public void setUp() throws IOException {
        instance = APIExceptionHandler.INSTANCE;
        response = mock(HttpServletResponse.class);
        outputStream = mock(ServletOutputStream.class);

        when(response.getOutputStream()).thenReturn(outputStream);
    }

    @Test
    public void testHandleResponseSuccessCaseAPIExceptionDefaultMessage() throws IOException {
        instance.handleResponse(response, new Exception(new NotFoundException()));
        verify(response, times(1)).setStatus(404);
    }

    @Test
    public void testHandleResponseSuccessCaseAPIExceptionCustomMessage() throws IOException {
        String message = "Custom exception message";

        instance.handleResponse(response, new Exception(new NotFoundException(message)));

        verify(response, times(1)).setStatus(404);
        verify(response, times(1)).getOutputStream();
        verify(outputStream, times(1)).write(message.getBytes());
    }

    @Test
    public void testHandleResponseSuccessCaseNotAPIException() throws IOException {
        instance.handleResponse(response, new ArrayIndexOutOfBoundsException());

        verify(response, times(1)).setStatus(500);
    }

    @Test(expected = RuntimeException.class)
    public void testHandleResponseErrorCase1() throws IOException {
        when(response.getOutputStream()).thenThrow(IOException.class);

        instance.handleResponse(response, new Exception(new UnauthorizedException("Unauthorized")));
    }
}

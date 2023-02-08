package com.jafa.security;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import lombok.extern.log4j.Log4j;

@Log4j
public class MemberAccessDeniedHanlder implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		log.info("접근거부처리 핸들러");
		log.info(accessDeniedException.getMessage());
		StackTraceElement[] stackTrace = accessDeniedException.getStackTrace();
		log.info(Arrays.toString(stackTrace));
		response.sendRedirect(request.getContextPath()+"/member/accessError");
	}
}

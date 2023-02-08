<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ include file="layout/header.jsp" %>

<div class="container">
	<h1>메인</h1>
	<sec:authorize access="isAnonymous()"> <!-- 권한이 없는 경우(로그인을 하지 않은 사용자) -->
	<a href="${contextPath}/member/login">로그인</a><br>
	<a href="${contextPath }/member/join">회원가입</a><br>
	</sec:authorize>
	<a href="${contextPath}/member/all">모든사용자</a><br>
	<a href="${contextPath}/member/myPage">회원페이지</a><br>
	
	<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_SUB_ADMIN')">
		<a href="${contextPath}/member/admin">관리자페이지</a><br>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()"> <!-- 권한이 있는 경우(로그인한 사용자) -->
	<form action="${contextPath}/member/logout" method="post">
		<p><sec:authentication property="principal.username"/>님 로그인중 </p>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		<button class="btn btn-primary">로그아웃</button>
	</form>
	</sec:authorize>
</div>

<%@ include file="layout/footer.jsp" %>

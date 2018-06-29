<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>

<%!private String getFormattedCalendar(Calendar c) {
		return String.format("%tY-%<tm-%<td", c);
	}%>
<%
	Calendar since = GregorianCalendar.getInstance();
	since.set(Calendar.YEAR, 2007);
	since.set(Calendar.MONTH, Calendar.FEBRUARY);
	since.set(Calendar.DATE, 5);

	String sinceDate = getFormattedCalendar(since);
%>
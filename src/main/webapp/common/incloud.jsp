<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${ctx }/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="${ctx }/css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${ctx }/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${ctx }/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${ctx }/js/transDictionary.js"></script>

<%@page import="java.util.List" %>
<%@page import="com.jmj.entity.CaaeProject" %>
<%@page import="com.jmj.entity.SwCaaeProject" %>
<%@page import="com.jmj.entity.GqCaaeProject" %>
<%@page import="com.jmj.entity.CaaeSeller" %>
<%@page import="com.jmj.entity.CaaeObject" %>
<%@page import="com.jmj.entity.CaaeFinance" %>
<%@page import="com.jmj.entity.CaaeHolder" %>
<%@page import="com.jmj.entity.CaaeBuyer" %>
<%@page import="com.jmj.entity.CaaeAssess" %>
<%@page import="com.jmj.entity.CaaeTrade" %>
<%@page import="com.jmj.entity.CaaeBidinfo" %>
<%@page import="com.jmj.entity.CaaeTenderinfo" %>
<%@page import="com.jmj.common.UtilCommon" %>

<%
CaaeProject caaeProject = (CaaeProject) request.getAttribute("caaeProject");
if(!UtilCommon.objectNotNull(caaeProject))caaeProject = new CaaeProject();
SwCaaeProject swCaaeProject = (SwCaaeProject) request.getAttribute("swCaaeProject");
if(!UtilCommon.objectNotNull(swCaaeProject))swCaaeProject = new SwCaaeProject();
GqCaaeProject gqCaaeProject = (GqCaaeProject) request.getAttribute("gqCaaeProject");
if(!UtilCommon.objectNotNull(gqCaaeProject))gqCaaeProject = new GqCaaeProject();
CaaeSeller caaeSeller = (CaaeSeller) request.getAttribute("caaeSeller");
if(!UtilCommon.objectNotNull(caaeSeller))caaeSeller = new CaaeSeller();
CaaeAssess caaeAssess = (CaaeAssess) request.getAttribute("caaeAssess");
if(!UtilCommon.objectNotNull(caaeAssess))caaeAssess = new CaaeAssess();
CaaeObject caaeObject = (CaaeObject) request.getAttribute("caaeObject");
if(!UtilCommon.objectNotNull(caaeObject))caaeObject = new CaaeObject();
CaaeFinance caaeFinance = (CaaeFinance) request.getAttribute("caaeFinance");
if(!UtilCommon.objectNotNull(caaeFinance))caaeFinance = new CaaeFinance();
CaaeBuyer caaeBuyer = (CaaeBuyer) request.getAttribute("caaeBuyer");
if(!UtilCommon.objectNotNull(caaeBuyer))caaeBuyer = new CaaeBuyer();
CaaeTrade caaeTrade = (CaaeTrade) request.getAttribute("caaeTrade");
if(!UtilCommon.objectNotNull(caaeTrade))caaeTrade = new CaaeTrade();
%>

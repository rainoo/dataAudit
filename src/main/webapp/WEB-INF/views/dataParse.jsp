<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.jmj.entity.CaaeProject" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript" src="${ctx }/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${ctx }/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${ctx }/js/extendPagination.js"></script>
<script type="text/javascript" src="${ctx }/js/colResizable-1.6.min.js"></script>
<script type="text/javascript" src="${ctx }/js/jquery.datetimepicker.full.min.js"></script>
<script type="text/javascript">
var data_openurl_manager={root:'${ctx}'};
</script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@include file="/common/title.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${ctx }/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<link href="${ctx }/css/style.css" rel="stylesheet" type="text/css">
<link href="${ctx }/css/jquery.datetimepicker.css" rel="stylesheet"
	type="text/css">
<style type="text/css">
table thead tr th {
	overflow: hidden;
}
</style>
</head>

<body>
	<%@include file="/common/top.jsp"%>

	<div class="container-fluid" style="margin-top: 5px;">
		<div class="row">
			<%@include file="/common/leftMenu.jsp"%>
			<div class="col-md-10" style="margin-top: 10px;">
				<form class="form-horizontal" id="formData">
					<input type="hidden" name="projectClassifyCode" value="${type }"/>
					<div class="form-group">
						<div class="tab-pane">
							<table class="table table-bordered">
								<tr>
									<td align="center" width="50px" rowspan="3">序号</td>
									<td align="center" width="200px" rowspan="3">交易机构</td>
									<td align="center" class="col-md-2" colspan="6">总数</td>
									<td align="center" class="col-md-2" colspan="6">今日新增</td>
								</tr>
								<tr>
									<td align="center" class="col-md-1" colspan="2">实物</td>
									<td align="center" class="col-md-1" colspan="2">股权</td>
									<td align="center" class="col-md-1" colspan="2">增资</td>
									<td align="center" class="col-md-1" colspan="2">实物</td>
									<td align="center" class="col-md-1" colspan="2">股权</td>
									<td align="center" class="col-md-1" colspan="2">增资</td>
								</tr>
								<tr>
									<td class="col-md-1">挂牌</td>
									<td class="col-md-1">成交</td>
									<td class="col-md-1">挂牌</td>
									<td class="col-md-1">成交</td>
									<td class="col-md-1">挂牌</td>
									<td class="col-md-1">成交</td>
									<td class="col-md-1">挂牌</td>
									<td class="col-md-1">成交</td>
									<td class="col-md-1">挂牌</td>
									<td class="col-md-1">成交</td>
									<td class="col-md-1">挂牌</td>
									<td class="col-md-1">成交</td>
								</tr>
								<c:forEach items="${listPro}" var="list" varStatus="status">
								<tr>
									<td>${status.index + 1 }</td>
									<td>${list.tradInstitutionName}</td>
									<td>${list.entityCountA02}</td>
									<td>${list.entityCountA06}</td>
									<td>${list.propertyCountA02}</td>
									<td>${list.propertyCountA06}</td>
									<td>${list.capitalCountA02}</td>
									<td>${list.capitalCountA06}</td>
									<td>${list.todayEntityCountA02}</td>
									<td>${list.todayEntityCountA06}</td>
									<td>${list.todayPropertyCountA02}</td>
									<td>${list.todayPropertyCountA06}</td>
									<td>${list.todayCapitalCountA02}</td>
									<td>${list.todayCapitalCountA06}</td>
								</tr>
								</c:forEach>
							</table>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>

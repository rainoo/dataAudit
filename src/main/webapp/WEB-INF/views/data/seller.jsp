<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:choose>
	<c:when test="<%=!UtilCommon.objectNotNull(caaeSeller)%>">
		暂无数据！
	</c:when>
	<c:otherwise>
		<form class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">转让方名称：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeSeller.getSellerName())?caaeSeller.getSellerName():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">转让方代码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeSeller.getSellerCode())?caaeSeller.getSellerCode():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">转让方类别：</label>
			<div class="col-sm-3">
				<input class="form-control" id="sellerType" value="<%=caaeSeller.getSellerType() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">转让方角色：</label>
			<div class="col-sm-3">
				<input class="form-control" id="sellerRole" value="<%=caaeSeller.getSellerRole() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">转让方电话：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeSeller.getSellerPhone())?caaeSeller.getSellerPhone():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">转让方邮箱：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeSeller.getSellerEmail())?caaeSeller.getSellerEmail():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">转让方地址：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeSeller.getSellerAddress())?caaeSeller.getSellerAddress():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">转让方经济类型：</label>
			<div class="col-sm-3">
				<input class="form-control" id="economyType" value="<%=caaeSeller.getEconomyType() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">拟转让比例：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeSeller.getSellPercent())?caaeSeller.getSellPercent():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">监管机构(部门)：</label>
			<div class="col-sm-3">
				<input class="form-control" id="monitorName" value="<%=caaeSeller.getMonitorName() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">监管机构（部门）地区代码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=caaeSeller.getMonitorArea() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">集团企业（公司）总部代码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeSeller.getHqName())?caaeSeller.getHqName():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">集团企业（公司）总部名称：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeSeller.getHqCode())?caaeSeller.getHqCode():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">批准单位：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeSeller.getAuthorizeUnit())?caaeSeller.getAuthorizeUnit():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">批准文件类型：</label>
			<div class="col-sm-3">
				<input class="form-control" id="authorizeFileType" value="<%=caaeSeller.getAuthorizeFileType() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">批准文件名称：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeSeller.getAuthorizeFileName())?caaeSeller.getAuthorizeFileName():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">批准日期：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeSeller.getAuthorzeDate(),"1") %>" readonly>
			</div>
		</div>
		</form>
	</c:otherwise>
</c:choose>
<script>
	$("#sellerType").val(sellerTypeTrans("<%=caaeSeller.getSellerType() %>"));
	$("#sellerRole").val(sellerRoleTrans("<%=caaeSeller.getSellerRole() %>"));
	$("#economyType").val(economyTypeTrans("<%=caaeSeller.getEconomyType() %>"));
	$("#monitorName").val(monitorNameTrans("<%=caaeSeller.getMonitorName() %>"));
	$("#authorizeFileType").val(authorizeFileTypeTrans("<%=caaeSeller.getAuthorizeFileType() %>"));
</script>
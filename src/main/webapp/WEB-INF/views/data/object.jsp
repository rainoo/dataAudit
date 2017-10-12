<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:choose>
	<c:when test="<%=!UtilCommon.objectNotNull(caaeObject)%>">
		暂无数据！
	</c:when>
	<c:otherwise>
		<form class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">标的企业名称：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeObject.getSubjectCompanyName())?caaeObject.getSubjectCompanyName():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">本次拟转让产（股）权比例（%）：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeObject.getSellPercent())?caaeObject.getSellPercent():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">组织机构代码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeObject.getSubjectCompanyCode())?caaeObject.getSubjectCompanyCode():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">所在地区：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=caaeObject.getZone() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">所属行业：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=caaeObject.getIndustryCode() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">经济类型：</label>
			<div class="col-sm-3">
				<input class="form-control" id="type" value="<%=caaeObject.getEconomyType() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">职工人数：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeObject.getEmployeeQuantity())?caaeObject.getEmployeeQuantity():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">企业是否含有国有划拨土地：</label>
			<div class="col-sm-3">
				<input class="form-control" id="employeeQuantity" value="<%=caaeObject.getEmployeeQuantity() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">经营规模：</label>
			<div class="col-sm-3">
				<input class="form-control" id="managerScale" value="<%=caaeObject.getManagerScale() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">公司类型：</label>
			<div class="col-sm-3">
				<input class="form-control" id="economyNature" value="<%=caaeObject.getEconomyNature() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">业务范围：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeObject.getBusinessScope())?caaeObject.getBusinessScope():"" %>" readonly>
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label">法定代表人：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeObject.getLegalPerson())?caaeObject.getLegalPerson():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">公司注册地地址：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeObject.getRegisteredAddress())?caaeObject.getRegisteredAddress():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">注册资本：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeObject.getRegisteredCapital())?caaeObject.getRegisteredCapital():"" %>" readonly>
			</div>
		</div>
		</form>
	</c:otherwise>
</c:choose>
<script>
	$("#type").val(economyTypeTrans("<%=caaeObject.getEconomyType() %>"));
	$("#employeeQuantity").val(getTOrF("<%=caaeObject.getEmployeeQuantity() %>"));
	$("#managerScale").val(managerScaleTrans("<%=caaeObject.getManagerScale() %>"));
	$("#economyNature").val(economyNatureTrans("<%=caaeObject.getEconomyNature() %>"));
</script>
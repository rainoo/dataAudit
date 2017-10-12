<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:choose>
	<c:when test="<%=!UtilCommon.objectNotNull(caaeFinance)%>">
		暂无数据！
	</c:when>
	<c:otherwise>
		<form class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">审计年度：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeFinance.getAuditYear())?caaeFinance.getAuditYear():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">审计机构：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeFinance.getAuditUnit())?caaeFinance.getAuditUnit():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">资产总额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeFinance.getAuditAsset())?caaeFinance.getAuditAsset():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">净资产（所有者权益）：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeFinance.getAuditEquity())?caaeFinance.getAuditEquity():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">负债总额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeFinance.getAuditDebt())?caaeFinance.getAuditDebt():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">营业收入：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeFinance.getAuditEarning())?caaeFinance.getAuditEarning():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">利润总额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeFinance.getAuditProfit())?caaeFinance.getAuditProfit():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">净利润：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeFinance.getAuditNetProfit())?caaeFinance.getAuditNetProfit():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">报表日期：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeFinance.getStmtDate(),"1") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">报表类型：</label>
			<div class="col-sm-3">
				<input class="form-control" id="stmtType" value="<%=caaeFinance.getStmtType() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">资产总额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeFinance.getStmtAsset())?caaeFinance.getStmtAsset():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">净资产（所有者权益）：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeFinance.getStmtEquity())?caaeFinance.getStmtEquity():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">负债总额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeFinance.getStmtDebt())?caaeFinance.getStmtDebt():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">营业收入：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeFinance.getStmtEarning())?caaeFinance.getStmtEarning():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">利润总额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeFinance.getStmtProfit())?caaeFinance.getStmtProfit():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">净利润：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeFinance.getStmtNetProfit())?caaeFinance.getStmtNetProfit():"" %>" readonly>
			</div>
		</div>
		</form>
	</c:otherwise>
</c:choose>
<script>
	$("#stmtType").val(stmtTypeTrans("<%=caaeFinance.getStmtType() %>"));
</script>
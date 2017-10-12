<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:choose>
	<c:when test="<%=!UtilCommon.objectNotNull(caaeAssess)%>">
		暂无数据！
	</c:when>
	<c:otherwise>
		<form class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">转让标的评估值或账面净值：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeAssess.getObjectEvaluateValue())?caaeAssess.getObjectEvaluateValue():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">评估机构：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeAssess.getEvaluateUnit())?caaeAssess.getEvaluateUnit():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">评估核准(备案)单位：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeAssess.getApproveUnit())?caaeAssess.getApproveUnit():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">核准(备案)日期：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeAssess.getApproveDate(),"1") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">评估基准日：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeAssess.getEvaluateDate(),"1") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">基准日审计机构：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeAssess.getEvaluateDateAuditor())?caaeAssess.getEvaluateDateAuditor():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">律师事务所：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeAssess.getLawFirm())?caaeAssess.getLawFirm():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">总资产评估值：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeAssess.getEvaluateAsset())?caaeAssess.getEvaluateAsset():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">总资产账面值：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeAssess.getBookAsset())?caaeAssess.getBookAsset():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">净资产评估值：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeAssess.getEvaluateEquity())?caaeAssess.getEvaluateEquity():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">净资产账面值：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeAssess.getBookEquity())?caaeAssess.getBookEquity():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">总负债评估值：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeAssess.getEvaluateDebt())?caaeAssess.getEvaluateDebt():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">总负债账面值：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeAssess.getBookDebt())?caaeAssess.getBookDebt():"" %>" readonly>
			</div>
		</div>
		</form>
	</c:otherwise>
</c:choose>

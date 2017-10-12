<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/incloud.jsp" %>
<html>
<%@include file="/common/title.jsp" %>
<body>
	<%@include file="/common/top.jsp" %>
	<div class="container-fluid" style="margin-top: 5px;">
		<div class="row">
			<%@include file="/common/leftMenu.jsp" %>
			<div class="col-md-10" style="margin-top: 10px;">
				<form class="form-horizontal">
				<div class="form-group">
					<label class="col-sm-2 control-label">受让方名称：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeTrade.getBuyerName())?caaeTrade.getBuyerName():"" %>" readonly>
					</div>
					<label class="col-sm-2 control-label">成交金额：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeTrade.getTradeValue())?caaeTrade.getTradeValue():"" %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">成交日期：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.dateFormater(caaeTrade.getTradeDate(),"1") %>" readonly>
					</div>
					<label class="col-sm-2 control-label">交易方式：</label>
					<div class="col-sm-3">
						<input class="form-control" id="exchangeType" value="<%=caaeTrade.getExchangeType() %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">组织交易时间：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeTrade.getTransactionTime())?caaeTrade.getTransactionTime():"" %>" readonly>
					</div>
					<label class="col-sm-2 control-label">付款方式：</label>
					<div class="col-sm-3">
						<input class="form-control" id="paymentType" value="<%=caaeTrade.getPaymentType() %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">首付金额：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeTrade.getFirstPayValue())?caaeTrade.getFirstPayValue():"" %>" readonly>
					</div>
					<label class="col-sm-2 control-label">首付比例：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeTrade.getFirstPayPercent())?caaeTrade.getFirstPayPercent():"" %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">尾款付款期限：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.dateFormater(caaeTrade.getRemainPayDate(),"1") %>" readonly>
					</div>
					<label class="col-sm-2 control-label">更改交易方式的原因：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeTrade.getChangeExTypeReason())?caaeTrade.getChangeExTypeReason():"" %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">产权交易合同签订日期：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.dateFormater(caaeTrade.getContrSignDate(),"1") %>" readonly>
					</div>
					<label class="col-sm-2 control-label">产权交易合同生效日期：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.dateFormater(caaeTrade.getContrEffectDate(),"1") %>" readonly>
					</div>
				</div>
				</form>
			</div>
		</div>
	</div>
</body>
<script>
	$("#exchangeType").val(exchangeTypeTrans("<%=caaeTrade.getExchangeType() %>"));
	$("#paymentType").val(paymentTypeTrans("<%=caaeTrade.getPaymentType() %>"));
	$("#confirmResult").val(getTOrF("<%=caaeBuyer.getConfirmResult() %>"));
</script>
</html>

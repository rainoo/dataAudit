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
				<form class="form-horizontal" id="buyer">
				<div class="form-group">
					<label class="col-sm-2 control-label">受让方名称：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeBuyer.getBuyerName())?caaeBuyer.getBuyerName():"" %>" readonly>
					</div>
					<label class="col-sm-2 control-label">受让方代码：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeBuyer.getBuyerCode())?caaeBuyer.getBuyerCode():"" %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">受让方类别：</label>
					<div class="col-sm-3">
						<input class="form-control" id="buyerType" value="<%=caaeBuyer.getBuyerType() %>" readonly>
					</div>
					<label class="col-sm-2 control-label">受让方角色：</label>
					<div class="col-sm-3">
						<input class="form-control" id="buyerRole" value="<%=caaeBuyer.getBuyerRole() %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">受让方电话：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeBuyer.getBuyerPhone())?caaeBuyer.getBuyerPhone():"" %>" readonly>
					</div>
					<label class="col-sm-2 control-label">受让方邮箱：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeBuyer.getBuyerEmail())?caaeBuyer.getBuyerEmail():"" %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">所在地区：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=caaeBuyer.getZone() %>" readonly>
					</div>
					<label class="col-sm-2 control-label">所属行业：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=caaeBuyer.getIndustryCode() %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">经营规模：</label>
					<div class="col-sm-3">
						<input class="form-control" id="managerScale" value="<%=caaeBuyer.getManagerScale() %>" readonly>
					</div>
					<label class="col-sm-2 control-label">经济类型：</label>
					<div class="col-sm-3">
						<input class="form-control" id="economyType" value="<%=caaeBuyer.getEconomyType() %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">公司类型：</label>
					<div class="col-sm-3">
						<input class="form-control" id="economyNature" value="<%=caaeBuyer.getEconomyNature() %>" readonly>
					</div>
					<label class="col-sm-2 control-label">注册资本：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeBuyer.getRegisteredCapital())?caaeBuyer.getRegisteredCapital():"" %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">登记日期：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.dateFormater(caaeBuyer.getRegisterDate(),"1") %>" readonly>
					</div>
					<label class="col-sm-2 control-label">是否受理：</label>
					<div class="col-sm-3">
						<input class="form-control" id="acceptResult" value="<%=caaeBuyer.getAcceptResult() %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">受理/不受理日期：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.dateFormater(caaeBuyer.getAcceptDate(),"1") %>" readonly>
					</div>
					<label class="col-sm-2 control-label">不受理原因：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeBuyer.getNoAcceptReason())?caaeBuyer.getNoAcceptReason():"" %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">是否确认资格：</label>
					<div class="col-sm-3">
						<input class="form-control" id="confirmResult" value="<%=caaeBuyer.getConfirmResult() %>" readonly>
					</div>
					<label class="col-sm-2 control-label">确认/取消资格日期：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.dateFormater(caaeBuyer.getConfirmDate(),"1") %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">取消资格的原因：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeBuyer.getNoConfirmReason())?caaeBuyer.getNoConfirmReason():"" %>" readonly>
					</div>
					<label class="col-sm-2 control-label">退出日期：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.dateFormater(caaeBuyer.getQuitDate(),"1") %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">退出原因：</label>
					<div class="col-sm-3">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeBuyer.getQuitReason())?caaeBuyer.getQuitReason():"" %>" readonly>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">业务范围：</label>
					<div class="col-sm-8">
						<input class="form-control" value="<%=UtilCommon.strNotNull(caaeBuyer.getBusinessScope())?caaeBuyer.getBusinessScope():"" %>" readonly>
					</div>
				</div>
				</form>
			</div>
		</div>
	</div>
</body>
<script>
	$("#buyerType").val(sellerTypeTrans("<%=caaeBuyer.getBuyerType() %>"));
	$("#buyerRole").val(sellerRoleTrans("<%=caaeBuyer.getBuyerRole() %>"));
	$("#managerScale").val(managerScaleTrans("<%=caaeBuyer.getManagerScale() %>"));
	$("#economyType").val(economyTypeTrans("<%=caaeBuyer.getEconomyType() %>"));
	$("#economyNature").val(economyNatureTrans("<%=caaeBuyer.getEconomyNature() %>"));
	$("#acceptResult").val(getTOrF("<%=caaeBuyer.getAcceptResult() %>"));
	$("#confirmResult").val(getTOrF("<%=caaeBuyer.getConfirmResult() %>"));
</script>
</html>

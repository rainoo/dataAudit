<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
	var data_openurl_manager={root:'${ctx}'};
	function audit(val){
		var proTransId = "<%=caaeProject.getProTransId() %>";
		var data = $("#text").val();
		$.ajax({
			type: "POST",
			async:false,
			url:data_openurl_manager.root+'/process/audit',
			data:{auditStatus:val,auditData:proTransId,auditOpinion:data},
			dataType: "json",
			success:function(data){
				alert(data.msg);
			},
			error: function() {
	        	alert("网络异常");
	        }
		});
	}
</script>
<form class="form-horizontal">
	<div class="form-group">
		<label class="col-sm-2 control-label">项目名称：</label>
		<div class="col-sm-2">
			<input id="projectname" class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getProjectName())?caaeProject.getProjectName():"" %>" readonly>
		</div>
		<label class="col-sm-2 control-label">项目编号：</label>
		<div class="col-sm-2">
			<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getProjectCode())?caaeProject.getProjectCode():"" %>" readonly>
		</div>
		<label class="col-sm-2 control-label">审核状态：</label>
		<div class="col-sm-2">
			<input class="form-control" id="audtiStatus" value="<%=caaeProject.getAuditStatus() %>" readonly>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">业务状态：</label>
		<div class="col-sm-2">
			<input class="form-control" id="businessStatus" value="<%=caaeProject.getBusinessStatus() %>" readonly>
		</div>
		<label class="col-sm-2 control-label">挂牌价格：</label>
		<div class="col-sm-2">
			<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getProjectPrice())?caaeProject.getProjectPrice():"" %>" readonly>
		</div>
		<label class="col-sm-2 control-label">上报时间：</label>
		<div class="col-sm-2">
			<input class="form-control" id="resumeDate" value="<%=UtilCommon.dateFormater(caaeProject.getReportTime(),"2") %>" readonly>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">保证金：</label>
		<div class="col-sm-2">
			<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getDeposit())?caaeProject.getDeposit():"" %>" readonly>
		</div>
		<label class="col-sm-2 control-label">发布日期：</label>
		<div class="col-sm-2">
			<input class="form-control" id="publishDate" value="<%=UtilCommon.dateFormater(caaeProject.getPublishDate(),"1") %>" readonly>
		</div>
		<label class="col-sm-2 control-label">截止日期：</label>
		<div class="col-sm-2">
			<input class="form-control" id="expireDate" value="<%=UtilCommon.dateFormater(caaeProject.getExpireDate(),"1") %>" readonly>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">审核意见：</label>
		<div class="col-sm-8">
			<textarea id="text" class="form-control" rows="5"></textarea>
		</div>
		<div class="btn-group btn-group-justified">
			<div style="text-align: center;margin-bottom: 10px;">
				<button id="btn1" type="button" value="3" class="btn btn-primary btn-lg" onclick="audit(this.value)">审核通过</button>
				<button id="btn2" type="button" value="2" class="btn btn-primary btn-lg" onclick="audit(this.value)">审核不通过</button>
			</div>
		</div>
	</div>
</form>
<script>
	$("#audtiStatus").val(auditStatusTrans("<%=caaeProject.getAuditStatus() %>"));
	$("#businessStatus").val(businessStatusTrans("<%=caaeProject.getBusinessStatus() %>"));
	var auditStatus = "<%=caaeProject.getAuditStatus() %>";
	if(auditStatus != 1){
		$("#text").attr("disabled",true);
		$("#btn1").attr("disabled",true);
		$("#btn2").attr("disabled",true);
	}
</script>
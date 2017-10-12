<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:choose>
	<c:when test="<%=!UtilCommon.objectNotNull(caaeProject)%>">
		暂无数据！
	</c:when>
	<c:otherwise>
		<form class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">项目名称：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getProjectName())?caaeProject.getProjectName():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">项目编号：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getProjectCode())?caaeProject.getProjectCode():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">创建时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getCreateTime(),"3") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">最后更新时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getLastUpdate(),"3") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">统一交易标识码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getUnifiedDealCode())?caaeProject.getUnifiedDealCode():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">项目分类代码：</label>
			<div class="col-sm-3">
				<input class="form-control" id="projectClassifyCode" value="<%=caaeProject.getProjectClassifyCode() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">资产类别：</label>
			<div class="col-sm-3">
				<input class="form-control" id="projectType" value="<%=caaeProject.getProjectType() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">挂牌价格：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getProjectPrice())?caaeProject.getProjectPrice():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">挂牌起止日期：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getPublishDate(),"1")%> 至 <%=UtilCommon.dateFormater(caaeProject.getExpireDate(),"1") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">挂牌期间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getPublishDuration())?caaeProject.getPublishDuration():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">是否自动延期：</label>
			<div class="col-sm-3">
				<input class="form-control" id="postPone" value="<%=caaeProject.getPostPone() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">交易方式：</label>
			<div class="col-sm-3">
				<input class="form-control" id="preExchangeType" value="<%=caaeProject.getPreExchangeType() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">交易机构网站链接：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getProjectUrl())?caaeProject.getProjectUrl():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">网络竞价系统的链接：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getWebBidUrl())?caaeProject.getWebBidUrl():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">交易系统标识码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getPlatformCode())?caaeProject.getPlatformCode():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">公共服务平台标识码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getPubServicePlatCode())?caaeProject.getPubServicePlatCode():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">数据时间戳：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getDataTimestamp(),"2") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">业务状态：</label>
			<div class="col-sm-3">
				<input class="form-control" id="status" value="<%=caaeProject.getBusinessStatus() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">异常状态：</label>
			<div class="col-sm-3">
				<input class="form-control" id="exceptionStatus" value="<%=caaeProject.getExceptionStatus() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">是否捆绑转让：</label>
			<div class="col-sm-3">
				<input class="form-control" id="isBind" value="<%=swCaaeProject.getIsBind() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">权利人是否有意向行使优先购买权：</label>
			<div class="col-sm-3">
				<input class="form-control" id="hasPriority" value="<%=swCaaeProject.getHasPriority() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">是否国有资产转让：</label>
			<div class="col-sm-3">
				<input class="form-control" id="isGz" value="<%=caaeProject.getIsGz() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">资产属性：</label>
			<div class="col-sm-3">
				<input class="form-control" id="property" value="<%=UtilCommon.strNotNull(swCaaeProject.getProperty())?swCaaeProject.getProperty():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">恢复时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getResumeDate(),"1") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">是否交纳保证金：</label>
			<div class="col-sm-3">
				<input class="form-control" id="isDeposit" value="<%=caaeProject.getIsDeposit() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">保证金金额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getDeposit())?caaeProject.getDeposit():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">保证金交纳开始时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getDepositDate(),"2") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">保证金交纳结束时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getDepositDateEnd(),"2") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">终结时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getTerminateDate(),"1") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">终结原因：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getTerminateReason())?caaeProject.getTerminateReason():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">中止时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getPauseDate(),"1") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">中止原因：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getPauseReason())?caaeProject.getPauseReason():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">网络竞价开始时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getWebBidDateStart(),"2") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">网络竞价结束时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getWebBidDateEnd(),"2") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">限时报价期（秒）：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.integerNotNull(swCaaeProject.getLimitTime())?swCaaeProject.getLimitTime():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">是否允许事后行权：</label>
			<div class="col-sm-3">
				<input class="form-control" id="allowEndPrio" value="<%=swCaaeProject.getAllowEndPrio() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">行权方式：</label>
			<div class="col-sm-3">
				<input class="form-control" id="allowHollPrio" value="<%=swCaaeProject.getAllowHollPrio() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">是否允许最高报价人追加报价：</label>
			<div class="col-sm-3">
				<input class="form-control" id="allowEndBid" value="<%=swCaaeProject.getAllowEndBid() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">是否收取服务费：</label>
			<div class="col-sm-3">
				<input class="form-control" id="isCommission" value="<%=swCaaeProject.getIsCommission() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">服务费比例：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(swCaaeProject.getComPercent())?swCaaeProject.getComPercent():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">服务费金额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(swCaaeProject.getCommission())?swCaaeProject.getCommission():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">加价幅度分组：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(swCaaeProject.getIncrementGroup())?swCaaeProject.getIncrementGroup():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">加价幅度分组值：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(swCaaeProject.getIncrementValue())?swCaaeProject.getIncrementValue():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">交易机构负责人：</label>
			<div class="col-sm-8">
				<input class="form-control" value="负责人：<%=UtilCommon.strNotNull(caaeProject.getProcontact())?caaeProject.getProcontact():"" %>；联系方式：<%=UtilCommon.strNotNull(caaeProject.getProcontactMobile())?caaeProject.getProcontactMobile():"" %>；邮箱地址：<%=UtilCommon.strNotNull(caaeProject.getProcontactEmail())?caaeProject.getProcontactEmail():"" %>；" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">交易机构部门负责人：</label>
			<div class="col-sm-8">
				<input class="form-control" value="负责人：<%=UtilCommon.strNotNull(caaeProject.getDeptcontact())?caaeProject.getDeptcontact():"" %>；联系方式：<%=UtilCommon.strNotNull(caaeProject.getDeptcontactMobile())?caaeProject.getDeptcontactMobile():"" %>；" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">会员机构名称：</label>
			<div class="col-sm-8">
				<input class="form-control" value="会员机构名称：<%=UtilCommon.strNotNull(caaeProject.getMemberOrg())?caaeProject.getMemberOrg():"" %>；会员经纪人：<%=UtilCommon.strNotNull(caaeProject.getMemberBroker())?caaeProject.getMemberBroker():"" %>；联系方式<%=UtilCommon.strNotNull(caaeProject.getMemberMobile())?caaeProject.getMemberMobile():"" %>；邮箱地址：<%=UtilCommon.strNotNull(caaeProject.getMemberEmail())?caaeProject.getMemberEmail():"" %>；" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">资产概况：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(swCaaeProject.getCatalog())?swCaaeProject.getCatalog():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">转让说明事项：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(swCaaeProject.getTransferNotes())?swCaaeProject.getTransferNotes():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">手动延牌原因：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getManPostponeReason())?caaeProject.getManPostponeReason():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">受让方资格条件：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(swCaaeProject.getBuyerPostulate())?swCaaeProject.getBuyerPostulate():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">重大事项披露：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(swCaaeProject.getImportantInfo())?swCaaeProject.getImportantInfo():"" %>" readonly>
			</div>
		</div>
		</form>
	</c:otherwise>
</c:choose>
<script>
	$("#projectClassifyCode").val(projectClassifyCodeTrans("<%=caaeProject.getProjectClassifyCode() %>"));
	$("#projectType").val(projectTypeTrans("<%=caaeProject.getProjectType() %>"));
	$("#postPone").val(getTOrF("<%=caaeProject.getPostPone() %>"));
	$("#preExchangeType").val(exchangeTypeTrans("<%=caaeProject.getPreExchangeType() %>"));
	$("#status").val(businessStatusTrans("<%=caaeProject.getBusinessStatus() %>"));
	$("#exceptionStatus").val(exceptionStatusTrans("<%=caaeProject.getExceptionStatus() %>"));
	$("#isDeposit").val(getTOrF("<%=caaeProject.getIsDeposit() %>"));
	$("#allowEndPrio").val(getTOrF("<%=swCaaeProject.getAllowEndPrio() %>"));
	$("#allowHollPrio").val(allowHollPrioTrans("<%=swCaaeProject.getAllowHollPrio() %>"));
	$("#allowEndBid").val(getTOrF("<%=swCaaeProject.getAllowEndBid() %>"));
	$("#isCommission").val(getTOrF("<%=swCaaeProject.getIsCommission() %>"));
	$("#isBind").val(getTOrF("<%=swCaaeProject.getIsBind() %>"));
	$("#hasPriority").val(getTOrF("<%=swCaaeProject.getHasPriority() %>"));
	$("#isGz").val(getTOrF("<%=caaeProject.getIsGz() %>"));
	$("#property").val(propertyTrans("<%=swCaaeProject.getProperty() %>"));
</script>
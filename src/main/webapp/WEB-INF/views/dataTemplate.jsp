<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:forEach var="project" items="${projectList}">
<tr>
	<td>
	<c:choose>
		<c:when test="${project.auditStatus=='3' }">
		<input type="checkbox" disabled="disabled"/>
		</c:when>
		<c:otherwise>
		<input type="checkbox" name="chk_list" value="${project.proTransId }"/>
		</c:otherwise>
	</c:choose>
	</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;"><a href="${ctx }/proinfo/index?proTransId=${project.proTransId }&projectClassifyCode=${project.projectClassifyCode}">${project.projectCode }</a></td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">
	<c:choose>
		<c:when test="${ project.sensitivityStatus=='1'}">
			正常
		</c:when>
		<c:otherwise>
			异常
		</c:otherwise>
	</c:choose>
	
	</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">${project.sensitivityNote }</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">
		<c:choose>
			<c:when test="${project.auditStatus =='1'}">
				未审核
			</c:when>
			<c:when test="${project.auditStatus =='2'}">
				未通过
			</c:when>
			<c:otherwise>
				已过审
			</c:otherwise>
		</c:choose>
	</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">${project.auditOpinion }</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">
		<c:choose>
		<c:when test="${project.isGz=='T' }">国有</c:when>
		<c:otherwise>民营</c:otherwise>
		</c:choose>
	</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">${project.tradInstitutionName }</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">${project.zone }</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">${project.projectName }</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">${project.industryCode }</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">${project.projectPrice }</td>
	<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;"><fmt:formatDate value="${project.reportTime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<c:if test="${project.businessStatus =='A01'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">预挂牌</td>
	</c:if>
	<c:if test="${project.businessStatus =='A01-1'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">预挂牌撤牌</td>
	</c:if>
	<c:if test="${project.businessStatus =='A02'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">正式挂牌</td>
	</c:if>
	<c:if test="${project.businessStatus =='A03'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">延牌</td>
	</c:if>
	<c:if test="${project.businessStatus =='A04'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">摘牌</td>
	</c:if>
	<c:if test="${project.businessStatus =='A05'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">撤牌</td>
	</c:if>
	<c:if test="${project.businessStatus =='A05_1'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">遴选</td>
	</c:if>
	<c:if test="${project.businessStatus =='A06'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">交易成交</td>
	</c:if>
	<c:if test="${project.businessStatus =='A07'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">交割</td>
	</c:if>
	<c:if test="${project.businessStatus =='A08'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">交易中止</td>
	</c:if>
	<c:if test="${project.businessStatus =='A09'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">交易恢复</td>
	</c:if>
	<c:if test="${project.businessStatus =='A10'}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;">交易终结</td>
	</c:if>
	<c:if test="${project.businessStatus ==''}">
		<td style="overflow:hidden;word-break: keep-all;white-space:nowrap;"></td>
	</c:if>
</tr>
</c:forEach>
<script type="text/javascript">
$("table").colResizable();
$("#checkAll").click(function(){
    	if(this.checked){
    		$("input[name='chk_list']").prop("checked",true);
    	}else{
    		$("input[name='chk_list']").prop("checked",false);
    	}
	});
</script>
 



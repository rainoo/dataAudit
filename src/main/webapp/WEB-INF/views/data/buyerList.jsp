<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${listCaaeBuyer.isEmpty() || listCaaeBuyer.size()<=0}">
		暂无数据！
	</c:when>
	<c:otherwise>
		<table class="table table-bordered">
		<tr><th>受让方名称</th><th>受让方类别</th><th>所在地区</th><th>所属行业</th><th>登记日期</th></tr>
		<c:forEach items="${listCaaeBuyer}" var="caaeBuyer">
			<tr>
				<td><a href="${ctx }/proinfo/selectBuyer?buyerId=${caaeBuyer.uuid }">${caaeBuyer.buyerName }</a></td>
				<td>
					<c:choose>
						<c:when test="${caaeBuyer.buyerType!=null }">
							${caaeBuyer.buyerType }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeBuyer.zone!=null }">
							${caaeBuyer.zone }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeBuyer.industryCode!=null }">
							${caaeBuyer.industryCode }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeBuyer.registerDate!=null }">
							${caaeBuyer.registerDate }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
		</table>
	</c:otherwise>
</c:choose>

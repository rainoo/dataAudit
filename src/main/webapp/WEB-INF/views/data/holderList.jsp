<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${listCaaeHolder.isEmpty() || listCaaeHolder.size()<=0}">
		暂无数据！
	</c:when>
	<c:otherwise>
		<table class="table table-bordered">
		<tr><th>序号</th><th>股东名称</th><th>持股比例</th></tr>
		<c:forEach items="${listCaaeHolder}" var="caaeHolder">
			<tr>
				<td>
					<c:choose>
						<c:when test="${caaeHolder.holderNo!=null }">
							${caaeHolder.holderNo }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeHolder.holderName!=null }">
							${caaeHolder.holderName }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeHolder.holdingRatio!=null }">
							${caaeHolder.holdingRatio }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
		</table>
	</c:otherwise>
</c:choose>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${listCaaeTenderinfo.isEmpty() || listCaaeTenderinfo.size()<=0}">
		暂无数据！
	</c:when>
	<c:otherwise>
		<table class="table table-bordered">
		<tr><th>投标人</th><th>投标分数</th><th>投标价格</th></tr>
		<c:forEach items="${listCaaeTenderinfo}" var="caaeTenderinfo">
			<tr>
				<td>
					<c:choose>
						<c:when test="${caaeTenderinfo.tenderer!=null }">
							${caaeTenderinfo.tenderer }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeTenderinfo.tenderScore!=null }">
							${caaeTenderinfo.tenderScore }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeTenderinfo.tenderPrice!=null }">
							${caaeTenderinfo.tenderPrice }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
		</table>
	</c:otherwise>
</c:choose>

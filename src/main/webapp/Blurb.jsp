<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div style="margin-bottom: 10px;">
  <c:forEach var="rating" items="${work.ratings}" varStatus="loop">
    <span class="label label-${bean.classForRating(rating.id)}">
      ${rating.name}
    </span>&nbsp;
  </c:forEach>

  <c:forEach var="warning" items="${work.warnings}" varStatus="loop">
    <span class="label label-${bean.classForWarning(warning.id)}">
      ${warning.name}
    </span>&nbsp;
  </c:forEach>
</div>

<div><b>Fandoms:</b> <c:forEach var="fandom" items="${work.fandoms}" varStatus="loop">${fandom.name}<c:if test="${!loop.last}">, </c:if></c:forEach></div>

<div>${work.getSummary()}</div>

<%--private boolean complete;--%>
<%--private boolean restricted;--%>

<c:if test="${work.revisedAt != null}"><p><b>Last revised:</b> ${bean.formatDate(work.revisedAt)}</p></c:if>


<%--private long wordCount;--%>
<%--private URL url;--%>
<%--private URL commentUrl;--%>

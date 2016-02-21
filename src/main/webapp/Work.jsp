<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="bean" class="com.eburrows.openshift.ArchiveBean" scope="session"/>
<c:set var="work" value="${bean.getWork(param.id)}" scope="request"/>

<t:layout>
  <jsp:attribute name="pageTitle"><c:out value="${work.title}" /></jsp:attribute>

  <jsp:body>
    <div class="well">
      <jsp:include page="Blurb.jsp"/>

      <c:if test="${work.notes != ''}"><b>Notes:</b> ${work.notes}</c:if>

      <a href="${work.commentUrl}">Comment on this work at Archive of our Own</a>
    </div>

    <div>
      <c:forEach var="chapter" items="${work.chapters}">
        <h3>Chapter ${chapter.position}</h3>
        <c:if test="${chapter.title != ''}"><h2>${chapter.title}</h2></c:if>

        <div>${chapter.content}</div>

      </c:forEach>
    </div>
    <c:if test="${work.endnotes != ''}"><b>End Notes:</b> ${work.endnotes}</c:if>
  </jsp:body>

</t:layout>

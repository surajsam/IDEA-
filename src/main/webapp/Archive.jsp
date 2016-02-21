<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="bean" class="com.eburrows.openshift.ArchiveBean" scope="session" />

<t:layout>
  <jsp:attribute name="pageTitle">API Proof of Concept - Java</jsp:attribute>

  <jsp:body>
    <ul class="pagination">
      <li><a href="/Archive.jsp?fandom=${param.fandom}&page=1">&laquo;</a></li>
      <li class="${param.page==1 ? "active" : ""}"><a href="/Archive.jsp?fandom=${param.fandom}&page=1">1</a></li>
      <li class="${param.page==2 ? "active" : ""}"><a href="/Archive.jsp?fandom=${param.fandom}&page=2">2</a></li>
      <li class="${param.page==3 ? "active" : ""}"><a href="/Archive.jsp?fandom=${param.fandom}&page=3">3</a></li>
      <li class="${param.page==4 ? "active" : ""}"><a href="/Archive.jsp?fandom=${param.fandom}&page=4">4</a></li>
      <li class="${param.page==5 ? "active" : ""}"><a href="/Archive.jsp?fandom=${param.fandom}&page=5">5</a></li>
      <li><a href="/Archive.jsp?fandom=${param.fandom}&page=6">&raquo;</a></li>
    </ul>

    <c:set var="works" value="${bean.getWorksByFandom(param.fandom, param.page)}"/>
    <c:forEach var="work" items="${works}">
      <div style="border-bottom: 1px #e2e2e2 solid">
        <c:set var="work" value="${work}" scope="request"/>
        <h4><a href="<c:out value="/Work.jsp?id=${work.getId()}"/>"><c:out value="${work.getTitle()}" /></a>
          <small>by <c:forEach var="creator" items="${work.creators}" varStatus="loop">${creator.name}<c:if test="${!loop.last}">, </c:if></c:forEach> </small>
        </h4>
        <jsp:include page="Blurb.jsp"/>
      </div>
    </c:forEach>
    <c:if test="${empty works}">
      <p>Archive of our Own returned no results.</p>
    </c:if>
  </jsp:body>

</t:layout>


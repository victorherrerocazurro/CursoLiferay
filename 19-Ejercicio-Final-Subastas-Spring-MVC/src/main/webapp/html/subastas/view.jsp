<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects/>

<aui:layout>
	<aui:column columnWidth="100">
		<table class="table table-bordered table-hover table-striped">
		<thead class="table-columns">
			<tr>
				<th>NOMBRE PRODUCTO</th>
				<th>DESCRIPION PRODUCTO</th>
				<th>SUBASTADOR</th>
				<th>ESTADO</th>
				<th>FECHA INICIO</th>
				<th>FECHA FIN</th>
				<c:if test="<%= themeDisplay.isSignedIn() %>">
					<th></th>
				</c:if>
			</tr>
		</thead>
		<tbody class="table-data">
		<c:forEach items="${subastasActivas}" var="subasta">
			<tr>
				<td>${subasta.producto.nombre}</td>
				<td>${subasta.producto.descripcion}</td>
				<td>${subasta.idSubastador}</td>
				<td>${subasta.estado}</td>
				<td>${subasta.fechaInicio}</td>
				<td>${subasta.fechaFin}</td>
				<c:if test="<%= themeDisplay.isSignedIn() %>">
				<td>
					<portlet:renderURL var="pujarURL">
						<portlet:param name="myaction" value="nuevaPuja" />
						<portlet:param name="idSubasta" value="${subasta.id}" />
					</portlet:renderURL>
					<a href="${pujarURL}">Pujar</a>					
				</td>
				</c:if>
			</tr>	
		</c:forEach>
		</tbody>
		</table>
	</aui:column>
</aui:layout>



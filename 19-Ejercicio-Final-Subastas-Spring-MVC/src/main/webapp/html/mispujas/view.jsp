<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>

<portlet:defineObjects />
<theme:defineObjects />

<aui:layout>
	<aui:column columnWidth="100">
		<c:choose>
			<c:when test="<%=themeDisplay.isSignedIn()%>">

				<table class="table table-bordered table-hover table-striped">
					<thead class="table-columns">
						<tr>
							<th>NOMBRE PRODUCTO</th>
							<th>DESCRIPION PRODUCTO</th>
							<th>SUBASTADOR</th>
							<th>ESTADO SUBASTA</th>
							<th>FECHA INICIO</th>
							<th>FECHA FIN</th>
							<th>PUJA</th>
							<th>FECHA PUJA</th>
							<th>ESTADO PUJA</th>
							<th></th>
						</tr>
					</thead>
					<tbody class="table-data">
						<c:forEach items="${misPujas}" var="puja">
							<tr>
								<td>${puja.subasta.producto.nombre}</td>
								<td>${puja.subasta.producto.descripcion}</td>
								<td>${puja.subasta.idSubastador}</td>
								<td>${puja.subasta.estado}</td>
								<td>${puja.subasta.fechaInicio}</td>
								<td>${puja.subasta.fechaFin}</td>
								<td>${puja.puja}</td>
								<td>${puja.fecha}</td>
								<td>${puja.estado}</td>
								<portlet:renderURL var="rePujarURL">
									<portlet:param name="myaction" value="rePujar" />
									<portlet:param name="idSubasta" value="${puja.subasta.id}" />
								</portlet:renderURL>
								<td><a href="${rePujarURL}">RePujar</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:when>
			<c:otherwise>
				Debe loguearse para visualizar esta funcionalidad
			</c:otherwise>
		</c:choose>
	</aui:column>
</aui:layout>



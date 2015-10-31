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
							<th>ESTADO SUBASTA</th>
							<th>FECHA INICIO</th>
							<th>FECHA FIN</th>
							<c:if test="<%=themeDisplay.isSignedIn()%>">
								<th></th>
							</c:if>
						</tr>
					</thead>
					<tbody class="table-data">
						<c:forEach items="${misSubastas}" var="subasta">
							<tr>
								<td>${subasta.producto.nombre}</td>
								<td>${subasta.producto.descripcion}</td>
								<td>${subasta.estado}</td>
								<td>${subasta.fechaInicio}</td>
								<td>${subasta.fechaFin}</td>
								<c:if test="<%=themeDisplay.isSignedIn()%>">
									<td><portlet:renderURL var="pujasSubastaURL">
											<portlet:param name="myaction" value="pujas" />
											<portlet:param name="idSubasta" value="${subasta.id}" />
										</portlet:renderURL> <a href="${pujasSubastaURL}">Pujas</a></td>
								</c:if>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<portlet:renderURL var="nuevaSubastasURL">
					<portlet:param name="myaction" value="nuevaSubasta" />
				</portlet:renderURL>
				<aui:button type="button" value="Nueva Subasta"
					href="${nuevaSubastasURL}" />
			</c:when>
			<c:otherwise>
				Debe loguearse para visualizar esta funcionalidad
			</c:otherwise>
		</c:choose>
	</aui:column>
</aui:layout>



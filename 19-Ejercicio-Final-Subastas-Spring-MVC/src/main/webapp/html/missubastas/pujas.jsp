<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>

<portlet:defineObjects />
<theme:defineObjects />

<aui:layout>
	<aui:column columnWidth="100">
		<aui:layout>
			<aui:column columnWidth="50">
				<aui:input name="nombre" type="text" label="Nombre de producto" disabled="true" value="${subasta.producto.nombre}"></aui:input>
			</aui:column>
			<aui:column columnWidth="50">
				<aui:input name="descripcion" type="text" label="Descricpion de producto" disabled="true" value="${subasta.producto.descripcion}"></aui:input>
			</aui:column>
		</aui:layout>
		<table class="table table-bordered table-hover table-striped">
			<thead class="table-columns">
				<tr>
					<th>PUJA</th>
					<th>FECHA PUJA</th>
					<th>ESTADO PUJA</th>
				</tr>
			</thead>
			<tbody class="table-data">
				<c:forEach items="${pujas}" var="puja">
				<tr>
					<td>${puja.puja}</td>
					<td>${puja.fecha}</td>
					<td>${puja.estado}</td>
				</tr>	
			</c:forEach>
			</tbody>
		</table>
		<portlet:renderURL var="misSubastasURL">
		</portlet:renderURL>
		<aui:button type="button" value="Volver" href="${misSubastasURL}" />
	</aui:column>
</aui:layout>



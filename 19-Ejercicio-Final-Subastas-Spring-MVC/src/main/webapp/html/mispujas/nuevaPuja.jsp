<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>

<portlet:defineObjects />
<theme:defineObjects />

<c:if test="<%=themeDisplay.isSignedIn()%>">

	<portlet:actionURL var="pujarURL">
		<portlet:param name="myaction" value="rePujar" />
		<portlet:param name="idSubasta" value="${subasta.id}" />
		<portlet:param name="idPujador" value="${user.userId}" />
	</portlet:actionURL>
	<portlet:renderURL var="subastasURL">
	</portlet:renderURL>

	<aui:layout>
		<aui:column columnWidth="50">
			<aui:input name="nombre" type="text" label="Nombre de producto"
				disabled="true" value="${subasta.producto.nombre}"></aui:input>
			<aui:input name="descripcion" type="text"
				label="Descricpion de producto" disabled="true"
				value="${subasta.producto.descripcion}"></aui:input>
			<aui:input name="estado" type="text" label="Estado" disabled="true"
				value="${subasta.estado}"></aui:input>
		</aui:column>
		<aui:column columnWidth="50">
			<aui:input name="fechaInicio" type="text" label="Fecha Inicio"
				disabled="true" value="${subasta.fechaInicio}"></aui:input>
			<aui:input name="fechaFin" type="text" label="Fecha Fin"
				disabled="true" value="${subasta.fechaFin}"></aui:input>
			<aui:input name="pujaMaxima" type="text" label="Puja maxima"
				disabled="true" value="${pujaMaxima}"></aui:input>
		</aui:column>
	</aui:layout>
	<aui:layout>
		<aui:column columnWidth="100">
			<aui:form action="${pujarURL}" method="post">
				<aui:input name="puja" type="text" label="Puja">
					<aui:validator name="required"
						errorMessage="Para pujar es necesario establecer una cantidad" />
				</aui:input>
				<aui:button type="submit" value="Pujar" />
				<aui:button type="button" value="Volver" href="${subastasURL}" />
			</aui:form>
		</aui:column>
	</aui:layout>
</c:if>



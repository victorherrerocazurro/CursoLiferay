<%@page import="com.subastas.modelo.entidades.Subasta"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>

<portlet:defineObjects />
<theme:defineObjects />

<c:if test="<%=themeDisplay.isSignedIn()%>">
	<portlet:actionURL var="nuevaSubastaURL">
		<portlet:param name="myaction" value="nuevaSubasta" />
	</portlet:actionURL>
	<portlet:renderURL var="misSubastasURL">
	</portlet:renderURL>

	<aui:form action="${nuevaSubastaURL}" method="post">
		<aui:layout>
			<aui:column columnWidth="50">
				<aui:input name="nombre" type="text" label="Nombre de producto">
					<aui:validator name="required"
						errorMessage="Es necesario introducir un nombre de producto" />
				</aui:input>
				<aui:input name="descripcion" type="text"
					label="Descripion de producto"></aui:input>
				<aui:input name="idSubastador" type="hidden" label="Subastador"
					value="${user.userId}"></aui:input>
			</aui:column>
			<aui:column columnWidth="50">
<!-- 				<div class="aui-datepicker aui-helper-clearfix"> -->
					<aui:input type="text" name="fechaInicio" id="fechaInicio"
						label="Fecha Inicio" />
<!-- 				</div> -->
<!-- 				<div class="aui-datepicker aui-helper-clearfix"> -->
					<aui:input type="text" name="fechaFin" id="fechaFin"
						label="Fecha Fin" />
<!-- 				</div> -->

			</aui:column>
		</aui:layout>
		<aui:layout>
			<aui:column columnWidth="100">
				<aui:button type="submit" value="Nueva Subasta" />
				<aui:button type="button" value="Volver" href="${misSubastasURL}" />
			</aui:column>
		</aui:layout>
	</aui:form>
</c:if>

<aui:script>
	AUI().use('aui-datepicker', function(Y) {
		new Y.DatePicker({
			trigger : '#<portlet:namespace />fechaInicio',
			mask : '%d/%m/%y',
			popover : {
				zIndex : 1
			}
		});
	});

	AUI().use('aui-datepicker', function(Y) {
		new Y.DatePicker({
			trigger : '#<portlet:namespace />fechaFin',
			mask : '%d/%m/%y',
			popover : {
				zIndex : 1
			}
		});
	});
</aui:script>
					

				
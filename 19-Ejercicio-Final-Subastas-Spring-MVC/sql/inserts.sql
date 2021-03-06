INSERT INTO PRODUCTOS (PRODUCTOS.NOMBRE,PRODUCTOS.DESCRIPCION) VALUES ('Raton','Raton para ordenador USB');
INSERT INTO PRODUCTOS (PRODUCTOS.NOMBRE,PRODUCTOS.DESCRIPCION) VALUES ('Monitor','Monitor Led 17"');
INSERT INTO PRODUCTOS (PRODUCTOS.NOMBRE,PRODUCTOS.DESCRIPCION) VALUES ('Teclado','Teclado inhalambrico USB');
INSERT INTO PRODUCTOS (PRODUCTOS.NOMBRE,PRODUCTOS.DESCRIPCION) VALUES ('Jarron','Jarron de la dinastia Ming');

INSERT INTO SUBASTAS (SUBASTAS.ID_PRODUCTO,SUBASTAS.ID_SUBASTADOR,SUBASTAS.ESTADO,SUBASTAS.FECHA_INICIO,SUBASTAS.FECHA_FIN) 
VALUES (1,1,'activa','2015-05-20','2015-05-21');
INSERT INTO SUBASTAS (SUBASTAS.ID_PRODUCTO,SUBASTAS.ID_SUBASTADOR,SUBASTAS.ESTADO,SUBASTAS.FECHA_INICIO,SUBASTAS.FECHA_FIN) 
VALUES (2,1,'activa','2015-05-20','2015-05-21');
INSERT INTO SUBASTAS (SUBASTAS.ID_PRODUCTO,SUBASTAS.ID_SUBASTADOR,SUBASTAS.ESTADO,SUBASTAS.FECHA_INICIO,SUBASTAS.FECHA_FIN) 
VALUES (3,1,'activa','2015-05-20','2015-05-21');
INSERT INTO SUBASTAS (SUBASTAS.ID_PRODUCTO,SUBASTAS.ID_SUBASTADOR,SUBASTAS.ESTADO,SUBASTAS.FECHA_INICIO,SUBASTAS.FECHA_FIN) 
VALUES (5,2,'activa','2015-05-20','2015-05-21');

INSERT INTO PUJAS (PUJAS.ID_SUBASTA,PUJAS.ID_PUJADOR,PUJAS.PUJA,PUJAS.FECHA,PUJAS.ESTADO)
VALUES(1,1,12.3,'2015-05-20','maxima');
INSERT INTO PUJAS (PUJAS.ID_SUBASTA,PUJAS.ID_PUJADOR,PUJAS.PUJA,PUJAS.FECHA,PUJAS.ESTADO)
VALUES(1,2,15.5,'2015-05-20','maxima');
INSERT INTO PUJAS (PUJAS.ID_SUBASTA,PUJAS.ID_PUJADOR,PUJAS.PUJA,PUJAS.FECHA,PUJAS.ESTADO)
VALUES(1,3,16.7,'2015-05-20','maxima');
INSERT INTO PUJAS (PUJAS.ID_SUBASTA,PUJAS.ID_PUJADOR,PUJAS.PUJA,PUJAS.FECHA,PUJAS.ESTADO)
VALUES(2,3,6.2,'2015-05-20','maxima');
INSERT INTO PUJAS (PUJAS.ID_SUBASTA,PUJAS.ID_PUJADOR,PUJAS.PUJA,PUJAS.FECHA,PUJAS.ESTADO)
VALUES(2,2,7.2,'2015-05-20','maxima');
INSERT INTO PUJAS (PUJAS.ID_SUBASTA,PUJAS.ID_PUJADOR,PUJAS.PUJA,PUJAS.FECHA,PUJAS.ESTADO)
VALUES(2,3,8.2,'2015-05-20','maxima');

--CONSULTA PARA OBTENER LAS SUBASTAS ACTIVAS
SELECT P.NOMBRE, P.DESCRIPCION, S.ESTADO, S.FECHA_INICIO, S.FECHA_FIN FROM SUBASTAS AS S INNER JOIN PRODUCTOS AS P ON S.ID_PRODUCTO = P.ID WHERE S.ESTADO = 'activa';

--CONSULTA DE SUBASTAS POR USUARIO
SELECT P.NOMBRE, P.DESCRIPCION, S.ESTADO, S.FECHA_INICIO, S.FECHA_FIN FROM SUBASTAS AS S INNER JOIN PRODUCTOS AS P ON S.ID_PRODUCTO = P.ID WHERE S.ID_SUBASTADOR = 2;

--CONSULTA DE PUJAS POR USUARIO
SELECT P.NOMBRE, P.DESCRIPCION, S.ESTADO AS ESTADO_SUBASTA, S.FECHA_INICIO, S.FECHA_FIN, PJ.PUJA, PJ.FECHA, PJ.ESTADO AS ESTADO_PUJA FROM PUJAS AS PJ 
INNER JOIN SUBASTAS AS S ON PJ.ID_SUBASTA = S.ID
INNER JOIN PRODUCTOS AS P ON S.ID_PRODUCTO = P.ID 
WHERE PJ.ID_PUJADOR = 3;

--PUJAS GANADORAS DE SUBASTAS ACTIVAS
SELECT S.ESTADO AS ESTADO_SUBASTA, P.NOMBRE, PJ.PUJA, PJ.ID_PUJADOR, PJ.ESTADO AS ESTADO_PUJA FROM PUJAS AS PJ 
INNER JOIN SUBASTAS AS S ON PJ.ID_SUBASTA = S.ID
INNER JOIN PRODUCTOS AS P ON S.ID_PRODUCTO = P.ID
AND PJ.PUJA = (SELECT MAX(PJ.PUJA) AS PUJA_MAXIMA FROM PUJAS AS PJ
	INNER JOIN SUBASTAS AS S ON PJ.ID_SUBASTA = S.ID
	WHERE S.ESTADO = 'activa'
	GROUP BY PJ.ID_SUBASTA);

--PUJAS GANADORAS DE SUBASTAS FINALIZADAS
SELECT S.ESTADO AS ESTADO_SUBASTA, P.NOMBRE, PJ.PUJA, PJ.ID_PUJADOR, PJ.ESTADO AS ESTADO_PUJA FROM PUJAS AS PJ 
INNER JOIN SUBASTAS AS S ON PJ.ID_SUBASTA = S.ID
INNER JOIN PRODUCTOS AS P ON S.ID_PRODUCTO = P.ID
AND PJ.PUJA = (SELECT MAX(PJ.PUJA) AS PUJA_MAXIMA FROM PUJAS AS PJ
	INNER JOIN SUBASTAS AS S ON PJ.ID_SUBASTA = S.ID
	WHERE S.ESTADO = 'finalizado'
	GROUP BY PJ.ID_SUBASTA);
	
--CONSULTA DE ACTUALIZACION DE ESTADO DE SUBASTA
UPDATE SUBASTAS
SET ESTADO='finalizado'
WHERE ID=1;
	
--CONSULTA DE ACTUALIZACION DE ESTADO DE PUJA
UPDATE PUJAS
SET ESTADO='superada'
WHERE ID=1;

UPDATE PUJAS
SET ESTADO='superada'
WHERE ID=2;

UPDATE PUJAS
SET ESTADO='maxima'
WHERE ID=3; 
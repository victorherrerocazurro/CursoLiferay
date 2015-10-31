create table ProductosSubasta (
	productoId LONG not null primary key,
	nombre VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	precioSalida DOUBLE,
	subastadorId LONG,
	pujaMaxima DOUBLE,
	pujadorId LONG,
	fechaFin DATE null,
	fechaInicio DATE null,
	fechaPujaMaxima DATE null
);

create table Subastas (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	producto VARCHAR(75) null,
	estado VARCHAR(75) null,
	pujaInicial DOUBLE,
	pujaMaxima DOUBLE,
	pujadorId LONG,
	pujadorName VARCHAR(75) null,
	fechaFin DATE null
);

create table Subastas_Course (
	courseId LONG not null primary key,
	courseName VARCHAR(75) null,
	courseGroup VARCHAR(75) null,
	userId LONG
);

create table Subastas_JournalArticle (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	resourcePrimKey LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	folderId LONG,
	classNameId LONG,
	classPK LONG,
	treePath VARCHAR(75) null,
	articleId VARCHAR(75) null,
	version DOUBLE,
	title STRING null,
	urlTitle VARCHAR(75) null,
	description STRING null,
	content VARCHAR(75) null,
	layoutUuid VARCHAR(75) null,
	displayDate DATE null,
	expirationDate DATE null,
	reviewDate DATE null,
	indexable BOOLEAN,
	smallImage BOOLEAN,
	smallImageId LONG,
	smallImageURL VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);

create table Subastas_Student (
	studentId LONG not null primary key,
	studentName VARCHAR(75) null,
	studentPlace VARCHAR(75) null,
	studentCollege VARCHAR(75) null,
	userId LONG
);

create table Subastas_Students_Courses (
	courseId LONG not null,
	studentId LONG not null,
	primary key (courseId, studentId)
);
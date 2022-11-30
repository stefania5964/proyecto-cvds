--drop table reservas;
--drop table recursos;
--drop table tiporecurso;
--drop table ubicaciones;
--drop table Usuarios;
--drop table roles;



--Recursos
CREATE TABLE ROLES (
	tipo VARCHAR(50) not null
);

ALTER table ROLES ADD PRIMARY KEY (tipo);

CREATE TABLE TIPORECURSO (
	tipo VARCHAR(50) not null
);

ALTER table TIPORECURSO ADD PRIMARY KEY (tipo);

CREATE TABLE RECURSOS (
	id_recursos INTEGER NOT NULL,
	tipo VARCHAR(50) NOT NULL,
	ubicacion VARCHAR(10) not null,
	estado VARCHAR(8) not null,
	capacidad smallint not null
);

ALTER table RECURSOS ADD PRIMARY KEY (id_recursos);
ALTER table RECURSOS add CONSTRAINT FK_recursos_tipo FOREIGN KEY(tipo) REFERENCES TIPORECURSO(tipo);

CREATE TABLE USUARIOS (
	id_user INTEGER not null,
	nombres VARCHAR(50) NOT NULL,
	programa VARCHAR(50) NOT null,
	rol VARCHAR(50) not null,
	correo VARCHAR(50) not null,
	contrasena VARCHAR(20) not null
	
);

ALTER table USUARIOS ADD PRIMARY KEY (id_user);
ALTER table USUARIOS add CONSTRAINT FK_usuarios_rol FOREIGN KEY(rol) REFERENCES ROLES(tipo);

CREATE TABLE RESERVAS (
	codigo INTEGER NOT NULL,
	recurso INTEGER not null,
	usuario INTEGER not null,
	horaInicial time not null,
	horaFinal time not null,
	periodicidad VARCHAR(17) NOT NULL,
	fechaFinal date not NULL
);
ALTER table RESERVAS ADD PRIMARY KEY (codigo);
ALTER table RESERVAS ADD CONSTRAINT FK_reserva_recurso FOREIGN KEY(recurso) REFERENCES RECURSOS(id_recursos);
ALTER table RESERVAS ADD CONSTRAINT FK_reserva_usuarios FOREIGN KEY(usuario) REFERENCES USUARIOS(id_user);


insert into tiporecurso values ('Sala_de_estudio');
insert into tiporecurso values ('Computador');
insert into tiporecurso values ('EquipoVisual');

insert into reservas values (default,1,'david perez','7:00:00','9:00:00','2 horas','05-12-2022');


insert into recursos values (default, 'Sala_de_estudio', 'Biblioteca satelite', 'Activo', 7);
insert into recursos values (default, 'Computador', 'Biblioteca satelite', 'Activo', 1);

insert into roles values ('Administrador');
insert into roles values ('Usuario');

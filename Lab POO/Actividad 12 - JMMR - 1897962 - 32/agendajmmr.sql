CREATE DATABASE agendajmmr;

use agendajmmr;

CREATE TABLE CONTACTOS
(
IdContacto int primary Key not null,
Nombre varchar (25) not null,
Apellido varchar (25) not null,
Correo varchar (25) not null,
Telefono varchar (10) not null,
Direccion varchar (40) not null
);

drop database agendajmmr;

drop user 'Tarea'@'localhost';
create user 'Tarea'@'localhost' identified by 'Tarea';
grant all privileges on Tareadb.* to 'Tarea'@'localhost';
flush privileges;

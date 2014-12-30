
create table IF NOT EXISTS person  (
   id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
   first_name Varchar(100) NOT NULL,
   last_name Varchar(100) NOT NULL
) Engine InnoDB;
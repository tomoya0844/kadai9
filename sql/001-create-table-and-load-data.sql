DROP TABLE IF EXISTS movies;

CREATE TABLE users (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  occupation VARCHAR(100) NOT NULL UNIQUE,
  PRIMARY KEY(id)
);

INSERT INTO users (name, occupation) VALUES ("田中", "医者");
INSERT INTO users (name, occupation) VALUES ("小松", "小学校教諭");
INSERT INTO users (name, occupation) VALUES ("小川", "SE");
INSERT INTO users (name, occupation) VALUES ("小林", "農家");

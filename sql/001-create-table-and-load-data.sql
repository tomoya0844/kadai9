DROP TABLE IF EXISTS movies;

CREATE TABLE users (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  Occupation VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO users (name, Occupation) VALUES ("田中", "医者");
INSERT INTO users (name, Occupation) VALUES ("小松", "小学校教諭");
INSERT INTO users (name, Occupation) VALUES ("小松", "SE");
INSERT INTO users (name, Occupation) VALUES ("小松", "農家");

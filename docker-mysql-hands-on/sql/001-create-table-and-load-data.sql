DROP TABLE IF EXISTS cats;

CREATE TABLE cats(
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(10) NOT NULL,
  age int NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO cats(name, age) VALUES("おもち",2);
INSERT INTO cats(name, age) VALUES("コア",3);
INSERT INTO cats(name, age) VALUES("ゴンち",5);
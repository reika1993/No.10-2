DROP TABLE IF EXISTS cats;

CREATE TABLE cats(
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(10) NOT NULL,
  age int NOT NULL,
  sex VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO cats(name, age,sex) VALUES("おもち",2,"メス");
INSERT INTO cats(name, age,sex) VALUES("コア",3,"オス");
INSERT INTO cats(name, age,sex) VALUES("ゴンち",5,"オス");
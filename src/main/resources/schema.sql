CREATE TABLE IF NOT EXISTS  PLAYER (
   ID INT NOT NULL,
   name VARCHAR(50),
   age INT NOT NULL
);

TRUNCATE TABLE PLAYER;

INSERT INTO PLAYER VALUES (1, 'SERHAT', 30);
INSERT INTO PLAYER VALUES (2, 'ALI HAYDAR', 29);
INSERT INTO PLAYER VALUES (3, 'MUSTAFA KARAKAYA', 30);
INSERT INTO PLAYER VALUES (4, 'KUBRA OZKAN', 26);
INSERT INTO PLAYER VALUES (5, 'FERHAT SALMANLI', 29);
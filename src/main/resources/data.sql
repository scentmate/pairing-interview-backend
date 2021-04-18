DROP TABLE IF EXISTS movie;

CREATE TABLE movie (
  id IDENTITY PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  description VARCHAR(500) NOT NULL
);

INSERT INTO movie (title, description) VALUES ('Wonder Woman 1984', 'A botched store robbery places Wonder Woman in a global battle against a powerful and mysterious ancient force that puts her powers in jeopardy.');
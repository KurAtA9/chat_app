CREATE TABLE IF NOT EXISTS rooms(
  id      SERIAL          NOT NULL,
  rooms   VARCHAR(128)    NOT NULL,
  PRIMARY KEY (id)
);
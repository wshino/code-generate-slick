CREATE TABLE users (
  id serial PRIMARY KEY,
  first_name varchar(100) NOT NULL,
  last_name varchar(100) NOT NULL,
  birth_date timestamp NOT NULL
);

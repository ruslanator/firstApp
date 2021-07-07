BEGIN;

DROP TABLE IF EXISTS product CASCADE;
CREATE TABLE product (id bigserial PRIMARY KEY, title VARCHAR(255), cost int);
INSERT INTO product (title, cost) VALUES
('banana', 11),
('orange', 72),
('apple', 5),
('peach', 102),
('tomato', 99);

COMMIT;
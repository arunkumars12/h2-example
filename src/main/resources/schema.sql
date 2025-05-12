CREATE TABLE address (
    address_id BIGINT,
    city VARCHAR(255),
    state VARCHAR(255),
    PRIMARY KEY (address_id, city) -- Composite key
);

CREATE TABLE app_user (
    id BIGINT AUTO_INCREMENT,
    name VARCHAR(255) not null unique,
    address_id BIGINT,
    address_city VARCHAR(255), -- Reference to the composite key (no foreign key constraint)
    PRIMARY KEY (id)
);


INSERT INTO address (address_id, city, state) VALUES (1, 'New York', 'NY');
INSERT INTO address (address_id, city, state) VALUES (2, 'Los Angeles', 'CA');

INSERT INTO app_user (id, name, address_id, address_city) VALUES (1, 'John', 1, 'New York');
INSERT INTO app_user (id, name, address_id, address_city) VALUES (2, 'Jane', 2, 'Los Angeles');

CREATE TABLE shoe(
    id INTEGER PRIMARY,
    bar_code VARCHAR(100),
    description VARCHAR(250) NOT NULL,
);

CREATE TABLE brand(
    id INTEGER PRIMARY,
    name VARCHAR(50)
);

CREATE TABLE location(
    id INTEGER PRIMARY,
    bar_code VARCHAR(20),
    location_code VARCHAR(20),
    location_type VARCHAR(10),
);
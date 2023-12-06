CREATE TABLE User (
    username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE MusicSelector (
    id SERIAL PRIMARY KEY,
    songname VARCHAR(255) NOT NULL,
    songartist VARCHAR(255) NOT NULL
);

CREATE TABLE SleepTracker (
    id SERIAL PRIMARY KEY,
    dreamname VARCHAR(20) NOT NULL,
    dreamdescription VARCHAR(1000),
    username VARCHAR(255) REFERENCES User(username),
    songid INT REFERENCES MusicSelector(id)
);

ALTER TABLE User
ADD CONSTRAINT username_format_check CHECK (username ~* '^[a-z0-9._-]+@[a-z]+\.[a-z]{2,4}$'),
ADD CONSTRAINT password_length_check CHECK (length(password) >= 8);

ALTER TABLE SleepTracker
ADD CONSTRAINT dreamname_format_check CHECK (dreamname ~* '^[a-z0-9._-]+@[a-z]+\.[a-z]{2,4}$');

-- DROP TABLE applications;

CREATE TABLE IF NOT EXISTS applications(
    id SERIAL PRIMARY KEY NOT NULL,
    name TEXT NOT NULL,
    email TEXT NOT NULL,
    school TEXT NOT NULL,
    eligible BOOLEAN NOT NULL,
    age INTEGER,
    phone TEXT,
    graduation DATE,
    aptitude TEXT,
    dedication TEXT,
    passion TEXT
);

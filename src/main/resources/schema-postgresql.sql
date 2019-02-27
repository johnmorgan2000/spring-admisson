-- DROP TABLE applications;

CREATE TABLE IF NOT EXISTS applications(
    id SERIAL PRIMARY KEY NOT NULL,
    name TEXT NOT NULL,
    email TEXT NOT NULL,
    school TEXT NOT NULL,
    eligible BOOLEAN NOT NULL,
    age INTEGER,
    phone TEXT,
    graduation TEXT,
    aptitude TEXT,
    dedication TEXT,
    passion TEXT,
    meeting TEXT
);

ALTER TABLE applications OWNER TO "user";
-- GRANT ALL ON TABLE applications TO "user";

-- GRANT ALL PRIVILEGES ON DATABASE "application-db" TO "user";

-- INSERT INTO applications (name, email, school, eligible, age, phone, graduation, aptitude, dedication, passion) VALUES ('Cole Anderson', 'fake@email.com', 'Charleston', true, 19, '7775554444', 'None', 'None', 'None', 'None');

SELECT * FROM applications;

-- Creating the Clients table
CREATE TABLE Clients (
id SERIAL PRIMARY KEY,
name VARCHAR(100),
phone VARCHAR(20),
address VARCHAR(255)
);

-- Creating the Landlords table
CREATE TABLE Landlords (
id SERIAL PRIMARY KEY,
name VARCHAR(100),
phone VARCHAR(20),
address VARCHAR(255)
);

-- Creating the Apartments table
CREATE TABLE Apartments (
id SERIAL PRIMARY KEY,
address VARCHAR(255),
number_of_rooms INTEGER,
rent_cost NUMERIC(10, 2),
landlord_id INTEGER REFERENCES Landlords(id)
);

-- Creating the Rent table
CREATE TABLE Rent (
id SERIAL PRIMARY KEY,
client_id INTEGER REFERENCES Clients(id),
apartment_id INTEGER REFERENCES Apartments(id),
start_date DATE,
end_date DATE
);

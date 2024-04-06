-- Inserting test data into Clients table
INSERT INTO Clients (name, phone, address)
VALUES
    ('Client 1', '123-456-7890', '123 Main St'),
    ('Client 2', '234-567-8901', '456 Elm St'),
    ('Client 3', '345-678-9012', '789 Oak St'),
    ('Client 4', '456-789-0123', '321 Pine St'),
    ('Client 5', '567-890-1234', '654 Cedar St'),
    ('Client 6', '678-901-2345', '987 Maple St'),
    ('Client 7', '789-012-3456', '135 Walnut St'),
    ('Client 8', '890-123-4567', '246 Birch St'),
    ('Client 9', '901-234-5678', '357 Spruce St'),
    ('Client 10', '012-345-6789', '468 Fir St');

-- Inserting test data into Landlords table
INSERT INTO Landlords (name, phone, address)
VALUES
    ('Landlord 1', '111-222-3333', '111 First Ave'),
    ('Landlord 2', '222-333-4444', '222 Second Ave'),
    ('Landlord 3', '333-444-5555', '333 Third Ave'),
    ('Landlord 4', '444-555-6666', '444 Fourth Ave'),
    ('Landlord 5', '555-666-7777', '555 Fifth Ave'),
    ('Landlord 6', '666-777-8888', '666 Sixth Ave'),
    ('Landlord 7', '777-888-9999', '777 Seventh Ave'),
    ('Landlord 8', '888-999-0000', '888 Eighth Ave'),
    ('Landlord 9', '999-000-1111', '999 Ninth Ave'),
    ('Landlord 10', '000-111-2222', '000 Tenth Ave');

-- Inserting test data into Apartments table
INSERT INTO Apartments (address, number_of_rooms, rent_cost, landlord_id)
VALUES
    ('123 Main St', 2, 1200.00, 1),
    ('456 Elm St', 3, 1500.00, 2),
    ('789 Oak St', 1, 900.00, 3),
    ('321 Pine St', 2, 1300.00, 4),
    ('654 Cedar St', 1, 800.00, 5),
    ('987 Maple St', 2, 1100.00, 6),
    ('135 Walnut St', 3, 1600.00, 7),
    ('246 Birch St', 2, 1250.00, 8),
    ('357 Spruce St', 1, 850.00, 9),
    ('468 Fir St', 2, 1150.00, 10);

-- Inserting test data into Rent table
INSERT INTO Rent (client_id, apartment_id, start_date, end_date)
VALUES
    (1, 1, '2024-04-01', '2024-04-30'),
    (2, 2, '2024-04-05', '2024-05-05'),
    (3, 3, '2024-04-10', '2024-05-10'),
    (4, 4, '2024-04-15', '2024-05-15'),
    (5, 5, '2024-04-20', '2024-05-20'),
    (6, 6, '2024-04-25', '2024-05-25'),
    (7, 7, '2024-04-30', '2024-05-30'),
    (8, 8, '2024-05-01', '2024-06-01'),
    (9, 9, '2024-05-05', '2024-06-05'),
    (10, 10, '2024-05-10', '2024-06-10');

/*  REGISTRATION (UserRegistration) */
create database UrbanParkEase;
use UrbanParkEase;
CREATE TABLE Users (
    userId INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    gender VARCHAR(10),
    email_Id VARCHAR(100) UNIQUE,
    password VARCHAR(255),
    dob DATE,
    address VARCHAR(255),
    state VARCHAR(50),
    city VARCHAR(50),
    pincode VARCHAR(10),
    aadharNumber VARCHAR(20)
);
select * from  Users;

INSERT INTO Users (firstName, lastName, gender, email_Id, password, dob, address, state, city, pincode, aadharNumber)
VALUES ('John', 'Doe', 'Male', 'john.doe@example.com', 'password123', '1990-01-01', '123 Street Name', 'State', 'City', '12345', '1234567890');


/* Booking */

create database UrbanParkEase;
use UrbanParkEase;
CREATE TABLE ParkingBooking (
    bookingId INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    vehicleType VARCHAR(50),
    vehicleNumber VARCHAR(20),
    email_Id VARCHAR(100),
    phoneNumber VARCHAR(15),
    parkingName VARCHAR(100),
    selectSlot VARCHAR(20),
    fromBookingDate DATE,
    toBookingDate DATE,
    fromTime TIME,
    toTime TIME
);
select * from  ParkingBooking;

INSERT INTO ParkingBooking (firstName, lastName, vehicleType, vehicleNumber, email_Id, phoneNumber, parkingName, selectSlot, fromBookingDate, toBookingDate, fromTime, toTime)
VALUES ('John', 'Doe', 'Car', 'ABC123', 'john.doe@example.com', '1234567890', 'Parking XYZ', 'Slot A', '2023-12-23', '2023-12-25', '10:00:00', '12:00:00');

/* Login */

create database UrbanParkEase;
use UrbanParkEase;
CREATE TABLE UserLogin (
    userId INT AUTO_INCREMENT PRIMARY KEY,
    userName VARCHAR(50) UNIQUE,
    password VARCHAR(100)
);
Select * from UserLogin;
-- Insert data into Login table
INSERT INTO UserLogin (userName, password)
VALUES ('john_doe', 'password123');


/* AddProvider */ 
create database UrbanParkEase;
use UrbanParkEase;
CREATE TABLE Provider (
    providerId INT AUTO_INCREMENT PRIMARY KEY,
    providerName VARCHAR(100),
    address VARCHAR(255),
    slotsCapacity INT,
    mobile VARCHAR(15)
);

select* from  Provider;
-- Insert data into AddProvider table
INSERT INTO Provider (providerName, address, slotsCapacity, mobile)
VALUES ('Example Provider', '123 Example St, City, Country', 50, '1234567890');

CREATE TABLE admin_user (
    username varchar(255), 
    password varchar(255)
);

select * from admin_user;
insert into admin_user (username ,password) values ('Shubham', 'shubham123');
drop database urbanparkease;
drop table Provider;
select * from user_login_modal;
insert into user_login_modal (username ,password) values ('ShubhamHirve','Shubham@123');
select * from user_registrationmodel;




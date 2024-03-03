
--
-- Host: localhost    Database: student
-- Create the student database
CREATE DATABASE IF NOT EXISTS studentdb;

-- Switch to the student database
USE studentdb;

-- Create the students table
CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    UNIQUE KEY username_unique (username),
    UNIQUE KEY phone_number_unique (phone_number),
    UNIQUE KEY email_unique (email)
);

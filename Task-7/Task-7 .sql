-- Create a new table
CREATE TABLE `newdataset`.`cricketer_info` (
  `player_id` INT NOT NULL,
  `player_name` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`player_id`),
  UNIQUE INDEX `player_id_UNIQUE` (`player_id` ASC)
);

-- Insert data into the new table
INSERT INTO `newdataset`.`cricketer_info` (player_id, player_name, country, role) 
VALUES (201, 'Joe Root', 'England', 'Batsman'),
       (202, 'Kane Williamson', 'New Zealand', 'Batsman'),
       (203, 'Steve Smith', 'Australia', 'Batsman'),
       (204, 'Babar Azam', 'Pakistan', 'Batsman'),
       (205, 'Kagiso Rabada', 'South Africa', 'Bowler'),
       (206, 'Rashid Khan', 'Afghanistan', 'Bowler');

-- Read data from the new table
SELECT * FROM newdataset.cricketer_info;

SELECT * FROM newdataset.cricketer_info WHERE player_id = 201;

-- Update data in the new table
UPDATE newdataset.cricketer_info
SET player_name = 'Virat Kohli', country = 'India', role = 'Batsman' 
WHERE player_id = 201;

-- Delete data from the new table
DELETE FROM newdataset.cricketer_info WHERE player_id = 206;

-- Verify deletion
SELECT * FROM newdataset.cricketer_info;

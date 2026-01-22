  /*
	1. Alter table sold_cars
		alter column seller
		drop the not null constraint
*/
ALTER TABLE sold_cars
ALTER COLUMN seller DROP NOT NULL;

/*
	2. Update sold_cars setting the seller to null
	     where the seller was Frankie
	     hint: you can select his id from staff in query.js first
*/
UPDATE sold_cars
SET seller = NULL
WHERE seller = 5;

/*
	3. Delete Frankie Fender from the staff table
*/

DELETE FROM staff
WHERE name = 'Frankie Fender';

/*
	Select name, role, sold_price from staff
	Inner join with sold_cars
		matching seller with staff.id	
*/

SELECT name, role, sold_price FROM staff
INNER JOIN sold_cars
ON seller = staff.id;

/*
	Use full join to show the name, role and sold_price
		from staff
	Full join with sold_cars
		matching seller with staff.id	
*/
SELECT name, role, sold_price FROM staff
FULL JOIN sold_cars
ON seller = staff.id;

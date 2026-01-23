/*
	Select the name, role and city from sold_cars
	
	Join with the staff and dealerships tables
		use appropriate joins to show staff who have no dealership_id
		
	Include a where clause to find
		- null values in sold_cars
		- staff who have the role 'Salesperson'
*/

SELECT name, role, city
FROM sold_cars
FULL JOIN staff 
	ON sold_cars.seller = staff.id
LEFT JOIN dealerships
	ON staff.dealership_id = dealerships.id
WHERE sold_cars.id IS NULL
AND role = 'Salesperson';

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


/*
	Show the city and state of dealerships
		with a count of the cars sold
		aliased as cars_sold
		
	Select from sold_cars
		join with the relevant tables
		
	Include dealerships which have no sold cars
	
	Order the count in descending order
		
	Hint: you may need to join using a table not included in our columns
*/

SELECT
	D.city,
	D.state,
	COUNT(SC.id) AS cars_sold
FROM sold_cars SC
	LEFT JOIN cars C ON SC.cars_id = C.id
	RIGHT JOIN dealerships D ON C.dealership_id = D.id
GROUP BY D.city, D.state
ORDER BY cars_sold DESC;

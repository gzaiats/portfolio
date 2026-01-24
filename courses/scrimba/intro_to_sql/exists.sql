/*
	Select the city, state and date established of dealerships
		Where there are no existing cars in stock
		
	Format the date in 'YYYY-MM-DD' format using TO_CHAR()
		and alias it as 'est'
*/

SELECT city, state, TO_CHAR(established, 'YYYY-MM-DD') AS est
  FROM dealerships D
  WHERE NOT EXISTS (
    SELECT 1 FROM cars WHERE dealership_id = D.id
  );

/*
	Select the name of salespeople
		(role = 'Salesperson')
	who have not sold a car for more than $45,000
*/

SELECT name FROM staff S
  WHERE role = 'Salesperson'
  AND NOT EXISTS (
    SELECT 1 FROM sold_cars SC
      WHERE SC.seller = s.id AND SC.sold_price > 45000
  ) AND EXISTS (
    SELECT 1 FROM sold_cars SC where seller = s.id
  );

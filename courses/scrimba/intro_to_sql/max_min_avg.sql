/*
	Use the AVG aggregate function to find the average price
		where the brand is Bentley
*/
SELECT AVG(price) FROM cars
  WHERE brand = 'Bentley';

/*
	Select the average, minimum and maximum price from cars
		where sold is true
	Round the average up to the nearest whole number
		and use 'avg' as the alias for that result	
*/

SELECT
  CEIL(AVG(price)) AS avg,
	MIN(price),
	MAX(price)
FROM cars
  WHERE sold IS TRUE;

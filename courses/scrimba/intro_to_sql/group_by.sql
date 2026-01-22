/*
	Select the condition, and a count of the condition from cars
		group by the condition column
*/

SELECT condition, count(condition) FROM cars
  GROUP BY condition;

/*
	Select:
		* the brand
		* a count of the brand
		* and an average of the price for each brand
		* round the average down to the nearest number
		* alias the average as 'AVG' in your output
	From cars where
		the car has not been sold
	Group the table by brand.
*/

SELECT brand, COUNT(brand), FLOOR(AVG(price)) AS AVG FROM cars
  WHERE sold IS NOT true
	GROUP BY brand;

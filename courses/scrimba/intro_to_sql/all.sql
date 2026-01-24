/*
	Select the brand, model and year from cars
	Where the year is before all cars with a brand of 'Ford'
	Order the results by year
*/

SELECT brand, model, year FROM cars
  WHERE year < ALL (
    SELECT year FROM cars WHERE brand = 'Ford'
  )
ORDER BY year;

/*
	Select the brand, model, city, and price from cars
		joined with dealerships where cars(dealership_id) matches dealerships(id)
	where the price is greater than the price of all sold cars
	order the results by city
*/

SELECT brand, model, city, price FROM cars
  JOIN dealerships ON dealership_id = dealerships.id
  WHERE price > ALL (
      SELECT sold_price FROM sold_cars
  )
ORDER BY city;

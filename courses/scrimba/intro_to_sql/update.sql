/*
	Update the record for the Aston Martin DB4 with ID 14
		set the condition to 5
		and the price to 465000
*/

UPDATE cars SET
  condition = 5,
	price = 465000
WHERE
  brand = 'Aston Martin'
	AND model = 'DB4'
	AND id = 14;

/*
	Set the condition to 1
		and the price to $10,000
	where the car's brand is Porsche
		and sold is false
*/
UPDATE cars SET
	  price = 10000,
		condition = 1
  WHERE 
	  brand = 'Porsche'
		AND sold IS false;

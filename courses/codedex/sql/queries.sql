/* 01. Introduction
Copy and paste the following statement:
SELECT * FROM shows;
Then press the "Run" button and wait 1-2 seconds.
You should see the shows table appear. See if you recognize any of the shows!
Press "Mark complete" and then "Next" to continue.
Happy coding! (ﾉ ◕ ヮ ◕)ﾉ*:･ﾟ ✧ */
SELECT * FROM shows;

/* 02. SELECT
Select all the columns from the shows table.
Now, select just the name and genre columns of the shows table. */
SELECT * FROM shows;
SELECT name, genre FROM shows;

/* 03. Streaming Wars
The term "Streaming Wars" was coined to describe the era of competition between video streaming services such as Netflix, HBO, Disney+, etc. 🏰
Use DISTINCT to select the unique streaming services in the shows table. */
SELECT DISTINCT genre
FROM shows;

/* 04. Rotten Tomatoes
Rotten Tomatoes is a movie/show review site created by college students at the University of California, Berkeley.
🍅 When at least 60% of reviews for a movie or TV show are positive, a red tomato is displayed to indicate it's "Fresh".
🦠 When less than 60% of reviews for a movie or TV show are positive, a green splat is displayed to indicate it's "Rotten".
Find all the shows in the table that bombed (with a tomatometer less than 60). */
SELECT *
FROM shows
WHERE tomatometer < 60;

/* 05. LIKE
Suppose we are searching for a comedy show.
Select all the shows with the genre including pattern "com" for genres like sitcom, rom-com, stand-up comedy, etc. */
SELECT *
FROM shows
WHERE genre
LIKE 'sitcom';

/* 06. Golden Age
The New Golden Age of Television is considered to have begun in 1999 with Jersey mobster show, “The Sopranos”.
Find all shows released in the Golden Age, from 1999 to 2024. Have you seen any of those? */
SELECT *
FROM shows
WHERE year
BETWEEN 1999 AND 2024;

/* 07. ORDER BY
Using ORDER BY, sort the table from the highest tomatometer rating to lowest. */
SELECT name, genre, stream, year, tomatometer
FROM shows
ORDER BY tomatometer DESC;

/* 08. NYC Restaurants
It has the following columns:
id
name
cuisine
borough
neighborhood
price
yelp_review
Play around with the table and try to find out:
What are all the unique cuisines in the table?
What are all the Chinese restaurants? Italian?
What are all the spots in Greenpoint (a neighborhood in Brooklyn)?
Where are the cheap eats? The bougie ones?
Bonus: Formulate your own questions and post your findings on Twitter by clicking the icon below, then head over to #CodedexRestaurants and comment on another learner's work. Be nice! :) */

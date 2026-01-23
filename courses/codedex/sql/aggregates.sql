/* 09. Music Playlist
In the code editor, run the following:
SELECT *
FROM playlist;
It has the following columns:
title
artist
album
year
genre
plays (total number of streams)
duration (song length in seconds)
We will use this table throughout the chapter.
Are there any songs you recognize? */
SELECT *
FROM playlist;

/* 10. Counting Rows
Find the total number of rows in the playlist table with COUNT(). */
SELECT COUNT(*)
FROM playlist;

/* 11. Old & New
What is the oldest song in the playlist? What about the newest song?
Use MIN() and MAX() to find out! */
SELECT title, artist, MIN(year)
FROM playlist;
SELECT title, artist, MAX(year)
FROM playlist;

/* 12. Total Playtime
How long is this playlist? Use SUM() to find the total duration. */
SELECT SUM(duration)
FROM playlist;

/* 13. Billboard Hot 100
In 1998, the average length of a song on Billboard Hot 100 was 4 minutes and 22 seconds. In 2018, the average length was approximately 3 minutes and 30 seconds.
How long is an average song? Find the average duration of a song. ⏰ */
SELECT AVG(duration)
FROM playlist;

/* 14. GROUP BY
Using GROUP BY, find all the different artists and their average number of plays in two columns. */
SELECT artist, AVG(plays)
FROM playlist
GROUP BY artist;

/* 15. Video Games
Codédex is a team of gamers and we put together our top 40 games of all-time. 🎮
It’s in a new games table that you can play around with:
SELECT *
FROM games;
It has the following columns:
id
title
genre
studio
headquarters
language
year
metascore
players
You can formulate your own questions, but here are some of ours:
What is the most popular game in the list?
What are the counts of all the programming languages?
What are the average Metascores for each of the genres?
Once you are done, post a screenshot of your findings on Twitter by clicking the icon below, and then head over to #CodedexVideoGames and review another learner's work! */
SELECT title, players
FROM games
ORDER BY players DESC;

SELECT COUNT(language)
FROM games;

SELECT genre, AVG(metascore)
FROM games
GROUP BY genre
ORDER BY metascore;

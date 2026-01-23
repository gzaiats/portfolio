/* 22. Joins
Here are some of the tables that we'll be working with later in this chapter:
movies and directors
books and authors
students and teachers
Use SELECT * to return each of the tables and get familiar with what’s inside!
Press "Mark complete" and then "Next" to continue. */
SELECT * FROM movies;
SELECT * FROM directors;
SELECT * FROM books;
SELECT * FROM authors;
SELECT * FROM students;
SELECT * FROM teachers;

/* 23. Locked In
Let’s pull up two tables:
books
authors
Can you guess which columns are the primary keys and which one is the foreign key? author_id is foreign on books, id is primary key on authors
Check the solutions to see if you got it roughly correct. */
SELECT * FROM books;
SELECT * FROM authors;

/* 24. Inner Join
We have two tables in the database: books and authors.
Check them out again to see how they could be connected.
Join the two tables using JOIN/INNER JOIN and select 2-3 columns of your choice. */
SELECT book_id, title, year
FROM books
INNER JOIN authors ON books.autor_id = authors.id;

/* 25. LEFT JOIN
Let’s try it out using the two tables in the database again: books and authors.
Join the two tables using LEFT JOIN/LEFT OUTER JOIN and select 2-3 columns of your choice.
Do you notice the difference? */
SELECT book_id, title, year
FROM books
LEFT JOIN authors
ON books.author_id = authors.id;

/* 26. Students & Teachers
We have a students table and a teachers table in a school database ready for you. Use SELECT to see what they look like.
Let's do a roll call. Can you use UNION to get all the names from both tables? */
SELECT name
FROM students
UNION 
SELECT name
FROM teachers;

/* 27. Online Shop
Imagine you run an online Shopify store and have to manage all the orders, products, and customers.
The data are all kept in three tables.
orders has the following columns:
id
date
customer
customer_id
fulfilled
item_id
products has the following columns:
id
name
price
active
inventory
customers has the following columns:
id
name
location
email_subscriber
Use joins and what we learned in previous chapters to find insights about the data. You can formulate your own questions, but here are some of ours:
What are the best selling items? What are the most underperforming ones?
What are all the orders the customers bought?
What days had the highest sales? And the lowest?
Once you are done, post a screenshot of your findings on Twitter by clicking the icon below, and then head over to #CodedexOnlineShop and review another learner's work. Be supportive of your fellow learners! :) */

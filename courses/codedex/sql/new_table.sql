/* 16. Create Table
Copy the following into the code editor:
CREATE TABLE companies (
  id INTEGER,
  name TEXT,
  headquarters TEXT,
  year INTEGER
);
And then use:
SELECT *
FROM companies;
Nothing happened when you clicked Run? Don’t worry, that’s because there’s nothing in the companies table yet! */
CREATE TABLE companies (
  id INTEGER,
  name TEXT,
  headquarters TEXT,
  year INTEGER
);

SELECT *
FROM companies;

/* 17. Insert Into
Find 2-3 tech companies that you like and use INSERT statements to add their info (id, name, headquarters, founded year) into the companies table you created.
Try SELECT * after.
Note: This exercise has the table we created in the previous one, so no need to do CREATE TABLE again. */
INSERT INTO companies (id, name, headquarters, year)
VALUES (1, 'Star Stable Entertainment AB', 'Stockholm', 2010);

INSERT INTO companies (id, name, headquarters, year)
VALUES (2, 'Owlient', 'Paris', 2005);

INSERT INTO companies (id, name, headquarters, year)
VALUES (3, 'RockStar Games', 'New York', 1998);

SELECT *
FROM companies;

/* 18. Alter Table
In the code editor, add a website column to the companies table. */
ALTER TABLE companies
ADD COLUMN website TEXT;

/* 19. Update Set
In the code editor, update all websites in the websites column.
It should look something like:
id	name	headquarters	year	website
1	X	San Francisco 🌁	2006	x.com
2	Duolingo	Pittsburgh 🐝	2011	duolingo.com
3	BeReal	Paris 🇫🇷	2020	bereal.com
4	Codédex	Brooklyn 🌉	2022	codedex.io
Use SELECT * to make sure it’s good to go! */
UPDATE companies
SET website = 'https://www.starstable.com/'
WHERE id = 1;

SELECT *
FROM companies;

/* 20. Delete From
Delete one or two rows in your table.
Use SELECT * to query everything again to make sure it’s good to go! */
DELETE FROM companies
WHERE name = 'Twitter';

SELECT *
FROM companies;

/*  21. BFFs
It’s 2024 and it’s so hard to keep track of all your friend’s birthdays and contact info!
Make a personal relationship management tool (sometimes nicknamed “personal CRM”), that helps people organize and manage their personal and professional relationships!
Start by using a CREATE TABLE and add a few columns.
Here are some ideas:
name
birthday
location
note
anything else that’s not sensitive info!
And fill it in with their details!
Now, you can always text them on their birthday! */

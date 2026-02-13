Build a Book Catalog Table
Build an app that is functionally similar to this example project. Try not to copy the example project, give it your own personal style.

Objective: Fulfill the user stories below and get all the tests to pass to complete the lab.

User Stories:

1. You should create a table element that lists book information.
2. Your table should have a table head element with one row in it.
3. The row in your table head element should have four table header elements, with the text of Title, Author, Genre, and Publication Year, in that order.
4. Your table should have a table body element with at least five rows in it.
5. Each row in your table body should have four table data elements that display the book's Title, Author, Genre, and Publication Year.
6. Your table should have a table footer element with one row in it.
7. The row in your table footer element should have a table data element that spans four columns and has the text Total Books: N where N should be replaced by the number of books in your table.

Tests
1. You should have one table element.
2. You should have one thead element within your table element.
3. You should have one tr element within your thead element.
4. You should have four th elements within your thead element's row.
5. Your four th elements should have the text Title, Author, Genre, and Publication Year, in that order.
6. You should have one tbody element within your table element.
7. Your tbody element should have at least five rows.
8. Each row in your tbody element should have exactly four td elements as children.
9. Each td element in your table body should have text with book information.
10. You should have one tfoot element within your table element.
11. You should have exactly one tr element in your tfoot element.
12. The td element in your tfoot element's row should have it's colspan attribute set to 4.
13. The td element in your tfoot element's row should have the text Total Books: N where N is the number of books in your table.

Starting code:
```
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Book Catalog</title>
</head>

<body>
</body>

</html>
```

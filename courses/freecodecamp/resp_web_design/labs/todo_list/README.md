Build a Stylized To-Do list
Build an app that is functionally similar to this example project. Try not to copy the example project, give it your own personal style.

In this lab, you will practice the different styles that can be applied to links when they are hovered over, focused, clicked, and visited.

Objective: Fulfill the user stories below and get all the tests to pass to complete the lab.

User Stories:

1. You should have one unordered list with the class todo-list.
2. Inside the unordered list, you should have four list items.
3. Inside each list item, there should be:
 - An input element with the type checkbox and id set to a unique value.
 - A label element with the for attribute set to the corresponding input element's id.
 - An unordered list with the class sub-item.
 - A list item with an anchor element in it. The anchor should have the class sub-item-link, a valid href value, and a target value that makes the link open in a new tab.
4. Your a elements should not have any text decorations.
5. You should set the text color of unvisited links to a color of your choice.
6. When your links are visited, the color should change to another color of your choice.
7. When your links are hovered over, the color should change to another color of your choice.
8. When your links are focused, there should be a colored outline around the link.
9. When your links are clicked, the color should change to another color of your choice.
Note: Be sure to link your stylesheet in your HTML and apply your CSS.

Tests
1. You should have one unordered list with the class todo-list.
2. You should have four list items inside the unordered list.
3. The li inside the ul with the class todo-list should contain an input element with the type of checkbox.
4. The li inside the ul with the class todo-list should contain a label element.
5. All input elements should have an id.
6. All label elements should have a for attribute.
7. All label elements should have some text.
8. The id and for attributes of the input and label elements pairs, should have corresponding values.
9. After the label elements, there should be an unordered list with the class sub-item.
10. The li inside the ul with the class sub-item should have an anchor element with the class sub-item-link.
11. All anchor elements should have a valid href attribute.
12. All anchor elements should have text.
13. Each a element should have a target attribute with the value of _blank.
14. Your a elements should not have any text decorations.
15. Unvisited links should have a text color set to a color of your choice.
16. The links should change color when hovered over.
17. The links should change color when they are being clicked.
18. The links should have an outline when focused.
19. The links should change color once visited.

Starting code:

HTML:
```
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Styled To-Do List</title>
</head>

<body>

</body>

</html>
```

CSS: none

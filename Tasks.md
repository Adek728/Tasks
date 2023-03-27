## Table of contents
* [Task #1: List of students](#list-of-students)
* [Task #2: Like list](#like-list)

## List of students
Tale University is a bit messy, and can't maintain an ordered list of their student. Tale's dean wants to print a sortet list of his students by the gpa, last name and age and post it on the walls so everybody can be impressed of his great students.

Given a list of students, sort them by (from most important to least important):

    GPA (descending)
    First letter of last name (ascending)
    Age (ascending)

And the class Student:

```java
class Student {
  ...
  int getGpa();
  int getAge();
  String getFullName();
}
```
Return the sorted result as full names string, comma separated.

For Example, given the list (name, age, gpa):

    David Goodman, 23, 88
    Mark Rose, 25, 82
    Jane Doe, 22, 90
    Jane Dane, 25, 90

sort(students) should return "Jane Doe, Jane Dane, David Goodman, Mark Rose"


## Like list
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

```
[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
```

Note: For 4 or more names, the number in `"and 2 others"` simply increases.


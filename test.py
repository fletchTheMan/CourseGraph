import bs4
from bs4 import BeautifulSoup

file = open("Courses/Accounting (ACCT).html")
soup = BeautifulSoup(file, "html.parser")
courseContainer = soup.find(id="coursescontainer")
courseLevels = courseContainer.children
for currentCourseLevel in courseLevels:
    for course in currentCourseLevel.children:
       if(isinstance(course, bs4.element.NavigableString)):
           print(course)
           continue
       elif((str)(course.name) == "h3"):
           continue
       else:
           name = ""
           creditHours = 0
           titleElement = course.find(class_="courseblocktitle") 
           name = titleElement.strong.string.rstrip(":")
           print(type(titleElement.strings))

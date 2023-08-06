import bs4
from bs4 import BeautifulSoup

courseListFile = open("CourseListFile.txt", "rt")
for line in courseListFile:
    with open("Courses/" + line.rstrip("\n")) as fp:
        soup = BeautifulSoup(fp, "html.parser")
        f = open("outfiles/" + line.rstrip(".html\n") + ".txt", "wt")
        courseContainer = soup.find(id="coursescontainer")
        courseLevels = courseContainer.children
        for currentCourseLevel in courseLevels:
            for course in currentCourseLevel.children:
                if(isinstance(course, bs4.element.NavigableString)):
                    continue
                elif((str)(course.name) == "h3"):
                    continue
                else:
                    name = ""
                    creditHours = 0
                    description = ""
                    requirements = ""
                    titleElement = course.find(class_="courseblocktitle") 
                    name = titleElement.strong.string.rstrip(":")
                    print(titleElement.strings[2])
                    descElement = course.find(class_="courseblockdesc")
                    description = descElement.string
                    if(description == None or description == ""):
                        description = ''.join(descElement.strings)
                    prereqs = course.find(class_="prereq")
                    if(prereqs != None):
                        for requirement in prereqs.find_all('a'):
                            if(requirements == ""):
                                requirements = requirement['title']
                            else:
                                requirements = requirements + " " + requirement['title']
                    if(name == None or name == ""):
                        name = "No Name"
                    if(description == None or description == ""):
                        description = course.find
                    if(requirements == None or requirements == ""):
                        requirements = "No requirements found, PLEASE CHECK WEBSITE"
                    f.write(name + "\n")
                    f.write(str(creditHours) + "\n")
                    f.write(str(description) + "\n")
                    f.write(str(requirements) + "\n\n")
        f.close()





#f = open("test_outfile", "wt")
#with open("Courses/Computing (COMP) George Mason University.html") as fp:
#        soup = BeautifulSoup(fp, "html.parser")
#        courseElements = soup.find_all(class_="courseblock")
#        for element in courseElements:
#            f.write(element.find(class_="courseblocktitle").get_text() + "\n")
#            f.write(element.find(class_="courseblockdesc").get_text() + "\n")
#            courseElementsExtra = element.find_all(class_="courseblockextra")
#            for extraElement in courseElementsExtra:
#                f.write(extraElement.get_text() + "\n")
#            f.write("\n")
#f.close()
#for element in course.children:
#                        print(str(element) + " element with type: " + str(type(element)) + "\n")
#                        if(isinstance(element, bs4.element.NavigableString)):
#                            continue
#                        elif(element['class'] == "courseblocktitle"):
#                            name = element.strong.string.rstrip(":")
#                            temp = element.string
#                            creditHours = temp.index(len(temp) - 11)
#                        elif(element['class'] == "courseblockdesc"):
#                            description = element.string
#                        else:
#                            prereqs = element.find(class_="prereq")
#                            if(prereqs != None):
#                                for requirement in prereqs.find_all('a'):
#                                    requirements = requirements + requirement['title']

from bs4 import BeautifulSoup
import requests

class Course:
    def __init__(self, courseName, courseCredits, courseDesc):
        self.courseName = courseName
        self.courseCredits = courseCredits
        self.courseDesc = courseDesc





#courseListFile = open("CourseListFile.txt", "rt")
#for line in courseListFile:
#    with open("Courses/" + line.rstrip("\n")) as fp:
#        soup = BeautifulSoup(fp, "html.parser")
#        f = open("outfiles/" + line.rstrip(".html\n"), "wt")
#        courseElements = soup.find_all(class_="courseblock")
#        for element in courseElements:
#            f.write(element.find(class_="courseblocktitle").get_text() + "\n")
#            f.write(element.find(class_="courseblockdesc").get_text() + "\n")
#            courseElementsExtra = element.find_all(class_="courseblockextra")
#            for extraElement in courseElementsExtra:
#                f.write(extraElement.get_text() + "\n")
#            f.write("\n")
#        f.close()





#f = open("test_outfile", "wt")
#
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

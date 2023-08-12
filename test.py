#from bs4 import BeautifulSoup
#import requests

#page = requests.get('https://catalog.gmu.edu/courses/acct/')
#file = open("pageWhtmlparser.html", "wt")
#soup = BeautifulSoup(page.content, "html.parser")
#file.write(str(soup.prettify()))
#file.close()

stringToChange = "Hello\n my\n friends\n I\n hate\n having\n to\n deal\n with\n this"
print(stringToChange)
if(stringToChange.count("\n") != 0):
    stringToChange = stringToChange.replace("\n", "")
print(stringToChange)

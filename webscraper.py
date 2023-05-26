from bs4 import BeautifulSoup
import requests

baseURL = 'https://catalog.gmu.edu' 
url = baseURL + '/courses/'
page = requests.get(url)
soup = BeautifulSoup(page.content, 'html.parser')
current_tag = soup.find(id="/courses/")
coursePages = current_tag.find_all('a')
for coursePage in coursePages:
    newURL = baseURL + coursePage.get('href')
    if(coursePage.string.find("Honors") != -1):
        continue
    else:
        f = open("Courses/" + coursePage.string  + ".html", "wt");
        newPage = requests.get(newURL)
        f.write(newPage.text)
        f.close()

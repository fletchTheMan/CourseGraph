from bs4 import BeautifulSoup
import requests

baseURL = 'https://catalog.gmu.edu/' 
url = baseURL + 'courses/'
page = requests.get(url)
soup = BeautifulSoup(page.content, 'html.parser')
current_tag = soup.find(id="/courses/")
coursePages = current_tag.find_all('a')
for coursePage in coursePages:
    newURL = baseURL + coursePage.get('href')
    f = open("Courses/" + coursePage.string, "wt")
    newPage = requests.get(newURL)
    content = (str)(newPage.content) 
    f.write(content)
    f.close()

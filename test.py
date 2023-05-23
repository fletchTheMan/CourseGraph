from bs4 import BeautifulSoup

fp = open("test.html")
soup = BeautifulSoup(fp, "html.parser")
print(soup.P)

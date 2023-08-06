test:
	javac Test.java
	java Test
clear:
	rm *.class
build:
	javac *.java
run:
	javac *.java
	java GUI
init:
	mkdir Courses
	mkdir outfiles
	python webscraper.py
	ls Courses > CourseListFile.txt
	python courseParser.py
	ls outfiles > outfilesList.txt

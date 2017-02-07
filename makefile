# 
# makefile
# 
# input file for 'make' build tool ( /usr/bin/make )
# to build https://github.com/JaysGitLab/cs-5666-greeting-bclinthall/projects/1
# following Dr. Fenwick's solution for CS 5666 JUnit sample
#
# #
# # @author B. Clint Hall
# # @author Dr Fenwick
# # @version Spring 2017
# #
#

# Set up locations for the jar files and URIs to fetch them from.
JUNIT_JAR = junit-4.12.jar
JUNIT_URI = https://github.com/junit-team/junit4/releases/download/r4.12/$(JUNIT_JAR)
HAMCREST_JAR = hamcrest-core-1.3.jar
HAMCREST_URI = http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/$(HAMCREST_JAR)
CLASSPATH = -cp .:$(JUNIT_JAR)
CC = javac $(CLASSPATH) -Xlint:deprecation

# Teach make how to use javac to convert between .java and .class
.SUFFIXES: .java .class
.java.class:
	$(CC) $<

default:
	@echo "usage: make target"
	@echo "available targets: compile, test, clean"

compile: javatrix/Matrix.class junit/MatrixTest.class
	@echo "compiled"
	
MatrixTest.class: $(JUNIT_JAR)

clean:
	rm -f javatrix/Matrix.class
	rm -f junit/MatrixTest.class

test:  javatrix/Matrix.class junit/MatrixTest.class
	java -cp .:$(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore junit.MatrixTest

# Add makefile targets that download the jars automatically if they
# are not present locally.
$(JUNIT_JAR):
	curl $(JUNIT_URI) -o $(JUNIT_JAR) --silent --location
$(HAMCREST_JAR):
	curl $(HAMCREST_URI) -o $(HAMCREST_JAR) --silent --location

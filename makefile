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

JUNIT_JAR = /usr/share/java/junit-4.10.jar
HAMCREST_JAR = /usr/share/java/hamcrest/core-1.1.jar

default:
	@echo "usage: make target"
	@echo "available targets: compile, test, clean"

compile: javatrix/Matrix.java junit/MatrixTest.java
	javac -cp .:$(JUNIT_JAR) junit/MatrixTest.java
	javac javatrix/Matrix.java

clean:
	rm -f javatrix/Matrix.class
	rm -f junit/MatrixTest.class

test:  javatrix/Matrix.class junit/MatrixTest.class
	java -cp .:$(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore junit.MatrixTest





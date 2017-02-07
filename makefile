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

compile: Matrix.java MatrixTest.java
	javac -cp .:$(JUNIT_JAR) MatrixTest.java
	javac Matrix.java

clean:
	rm -f Matrix.class
	rm -f MatrixTest.class

test:  Matrix.class MatrixTest.class
	java -cp .:$(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore MatrixTest





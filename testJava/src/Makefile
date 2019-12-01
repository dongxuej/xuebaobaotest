#javac src/*.java

#jar cvfm my.jar MANIFEST.MF *.class

default_target: all

.PHONY : default_target

#=============================================================================
# Set environment variables for the build.

CC = javac
JAR = jar

all : check_build_system
	$(CC) *.java
	$(JAR) cvfm test.jar META-INF/MANIFEST.MF *.class
	

check_build_system:
	@echo "\ncheck_build_system..."
.PHONY : check_build_system

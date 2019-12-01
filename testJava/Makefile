#javac src/*.java

#jar cvfm my.jar MANIFEST.MF *.class

default_target: all

.PHONY : default_target

#=============================================================================
# Set environment variables for the build.

CC = javac
JAR = jar

all : check_build_system
	$(CC) src/*.java
	$(JAR) cvfm test.jar src/META-INF/MANIFEST.MF src/*.class
	

check_build_system:
	@echo "\ncheck_build_system..."
.PHONY : check_build_system

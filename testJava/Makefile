#javac src/*.java

#jar cvfm my.jar MANIFEST.MF *.class

default_target: all

.PHONY : default_target

#=============================================================================
# Set environment variables for the build.

CC = javac
JAR = jar
DIR = dir
SRC_LIST_TMP_NAME = src_list.txt
DES_DIR = bin
FIND = find
SRC_LIST_PATH = $(DES_DIR)/$(SRC_LIST_TMP_NAME)
MANIFEST = src/META-INF/MANIFEST.MF



all : check_build_system
	@$(FIND) . -name "*.java">$(SRC_LIST_PATH)
	@$(CC) -d $(DES_DIR) @$(SRC_LIST_PATH)
	@$(JAR) cvfm test.jar $(MANIFEST) -C $(DES_DIR) .
#$(CC) -d $(DES_DIR) *.java dream/*.java selfdir/*.java deract/*.java
#$(JAR) cvfm test.jar META-INF/MANIFEST.MF $(DES_DIR)/*.class
#$(JAR) cvfm test.jar META-INF/MANIFEST.MF *.class\
#dream/*.class dream/denum/*.class selfdir/*.class deract/*.class
#find .. -name "*.java" > srclist.txt
#javac -d bin @srclist.txt
#$(DIR) ../src/*.java>srclist.txt
	

create_des_dir:
	@echo "create des dir..."
	@rm -rf $(DES_DIR)
	@mkdir $(DES_DIR)
.PHONY : create_des_dir

check_build_system : create_des_dir
	@echo "\ncheck_build_system..."

.PHONY : check_build_system

# iste422
Repository for ISTE 422 -- Application Development Practices


## Exercise 4 & 5
The point of this exercise is to take the HelloWorld.java file and build an executable JAR file.

Here are the commands you would use to do this from the command line:

	javac -sourcepath src -d build/classes src/oata/HelloWorld.java
	java -cp build/classes oata.HelloWorld 
	echo Main-Class: oata.HelloWorld>myManifest
	mkdir build/jar
	jar cfm build/jar/HelloWorld.jar myManifest -C build/classes .
	java -jar build/jar/HelloWorld.jar
	
Your task is to automate this build utilizing the following build systems:

### Make
Create a _Makefile_ that can be used to build the jar file automatically. For [reference see this link](https://www.gnu.org/software/make/manual/make.html "GNU Make").

### Ant
Create a _build.xml_ file that can be used by Ant to build the jar file automatically. For [reference see this link](https://ant.apache.org/manual/ "Ant Manual").

### Maven
Create a _pom.xml_ file that can be used by Maven to build the jar file automatically. For [reference see this link](https://maven.apache.org/guides/getting-started/ "Maven Manual").

### Gradle
Create a _build.gradle_ file that can be used by Gradle to build the jar file automatically.  For [reference see this link](https://docs.gradle.org/current/userguide/userguide_single.html "Gradle Manual").

Feel free to reorganize the file/directory structure.  You will submit a zip of your git project.  Don't forget to document your commit messages. You ***did*** remember to commit your changes, right?  I should be able to build your project using each tool and then execute

	java -jar <your jar file>
	
And get the application to run.

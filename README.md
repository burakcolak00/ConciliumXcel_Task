# ConciliumXcel_Task Automation Project - BDD Framework With Cucumber

### Codes and Tests Prepared By:
Burak Colak

This project is a Cucumber BDD (Behavior-Driven Development) implementation for the Conciliumxcel - Bootflow Academy SDET (Software Development Engineer in Test) internship program. It provides a structured framework for writing and executing automated tests using Cucumber, along with integration with other tools and libraries.

### Getting Started
To get started with this framework, you will need to have the following software on your system.

### Install JDK: ###

Install Java 8 JDK
JDK 8 Doc: http://docs.oracle.com/javase/8/docs/
JDK 8 Download: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Java Version: JDK 1.8.0_51
You can check this by typing in the command line: ```java –version``` (Java 8 is required for the build)
Set the JAVA_HOME system environment variable to /System/Library/Frameworks/JavaVM.framework/Versions/CurrentJDK/Home
Add $JAVA_HOME to the PATH system environment variable

### Install Maven: ###

Maven 3.0.x is available by default in Mac OS X(3.0.3 in Lion,3.0.2 in Snow Leopard after Java for Mac OS X 10.6 update 4)
Verify this using mvn –version from the command line
To upgrade to Maven 3.2.1, do the following
Download the Maven 3.2.1 binary zip from http://maven.apache.org/download.html.
Unzip the downloaded file (apache-maven-3.2.1-bin.zip) to the desired location (e.g., /Applications).
Set the M2_HOME system environment variable to the installation directory (e.g., /Applications/apache-maven-3.2.1).
Prepend $M2_HOME/bin to the PATH system environment variable.
From the command line, verify that Maven has been installed correctly: ```mvn --version```

### Installation: ###
1. Clone the repository:
```
git clone https://github.com/burakcolak00/ConciliumXcel_Task.git
```
2. Navigate to the project directory:
```
cd ConciliumXcel_Task
```
3. Install dependencies:
```
mvn clean install
```

### Test Execution: ###
1. Open the terminal or command prompt and navigate to the root directory of the project.
```
cd ConciliumXcel_Task
```
2. Run the following command to download the required dependencies:

```
mvn clean install\
```
3. Run the following command to run the tests:

```
mvn verify\
```



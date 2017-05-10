# CrossLanguage

## About
Maven Repository to leverage Scala and Java code together

## 2 Apps in the Repository
app1: Uses Java Class (Point) in Scala Main Class (org.app.app1.scala.PointRunner$)
app2: Uses Scala Class (Point) in Java Main Class (org.app.app2.java.PointRunner)

## Takeaway:
The POM file is the highlight of this project. It allows for cross functioning of the classes written in different programming languages.

## Maven packaging
$ mvn clean package

## Fat Jar Execution
### To execute the main class as mentioned in the POM file in the description of maven-assembly-plugin tag (mainClass)
$ java -jar target/cross-language-1.0-SNAPSHOT-jar-with-dependencies.jar 
Java Runner
(15, 30)

### To exeute a specific mainClass
java -cp target/cross-language-1.0-SNAPSHOT-jar-with-dependencies.jar org.app.app1.scala.PointRunner
Scala Runner
(10, 20)

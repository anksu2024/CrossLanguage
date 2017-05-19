# CrossLanguage

## About
<p>Introduction : Maven Repository to leverage Scala and Java code together
Description  : Template for creating a project that can work with both Scala and Java classes
Author       : Ankit Sarraf
Date         : May 09, 2017
</p>

## 2 Apps in the Repository
app1: Uses Java Class (Point) in Scala Main Class (org.app.app1.scala.PointRunner$)
<br/>app2: Uses Scala Class (Point) in Java Main Class (org.app.app2.java.PointRunner)

## Takeaway:
The POM file is the highlight of this project. It allows for cross functioning of the classes written in different programming languages.

## Maven packaging
$ mvn clean package -Dlatest.scala.version=2.13.0-M1 -Dmaven.compiler.plugin.source=1.8 -Dmaven.compiler.plugin.target=1.8 -Dmaven.assembly.plugin.version=3.0.0

## Fat Jar Execution
### Execute main class as mentioned in POM
$ java -jar target/cross-language-1.0-SNAPSHOT-jar-with-dependencies.jar 
<br>Java Runner
<br>(15, 30)

### To execute a specific mainClass
$ java -cp target/cross-language-1.0-SNAPSHOT-jar-with-dependencies.jar org.app.app1.scala.PointRunner
<br>Scala Runner
<br>(10, 20)

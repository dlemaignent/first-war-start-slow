Sample application to reproduce first launch issue : https://github.com/spring-projects/spring-boot/pull/29998#issuecomment-1050686533

pom.xml is full of many dependencies to make the first launch slower

In Tomcat conf it's possible to disable/enable set new ExtractingRoot() in ressources.

The application can be launched with java -jar target/first-war-start-slow-0.0.1-SNAPSHOT.war the issue is the same as launch war directly

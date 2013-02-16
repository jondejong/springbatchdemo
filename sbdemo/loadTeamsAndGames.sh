mvn clean
mvn install
cd target
java -jar sbdemo-1.0-SNAPSHOT.jar teamJob.xml teamJob
java -jar sbdemo-1.0-SNAPSHOT.jar gameJob.xml gameJob
cd ..

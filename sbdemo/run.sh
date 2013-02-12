mvn clean
mvn install
cd ./target
java -jar sbdemo-1.0-SNAPSHOT.jar applicationContext.xml gameJob
cd ..

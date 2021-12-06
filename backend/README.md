-> https://www.callicoder.com/spring-boot-file-upload-download-rest-api-example/
# test it

## With maven
mvn package
mvn spring-boot:run
curl -d "category=toto&longitude=10&lattitude=5" -X POST http://localhost:8080/dechets/1

This repository uses rest assured with wiremock to test doctor appointment details.<br/>

<strong>Setup Mock Server as a standalone server to mock the api response:</strong><br/>
Navigate to wiremock jar file path and open cmd.<br/>
Run this command: java -jar wiremock-standalone-3.4.1.jar<br/><br/>
If the above command run succesfully you will be able to see below output<br/><br/>
![image](https://github.com/Anjalijirole/JavaRestAssured/assets/105169120/e05c12c5-c78c-4d89-badc-886e167f4b17)
<br/><br/>Verify that the wiremock mappings are working as expected.<br/>
Navigate to http://localhost:8080/__admin/mappings <br/><br/>
You will be able to see mappings as below<br/>
![image](https://github.com/Anjalijirole/JavaRestAssured/assets/105169120/18d0ca70-47fc-4c36-b496-622cae0e8b99)
<br/><br/><strong> Run rest assured api automation via maven</strong><br/>
mvn test verify<br/>
Once the test is successfull verify the html report which would be similar as below<br/><br/><br/>
![image](https://github.com/Anjalijirole/JavaRestAssured/assets/105169120/769fe24b-e68a-4c39-bbaa-000ad53103c6)


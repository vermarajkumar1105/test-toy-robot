#Test Toy Robot Application 

- The application is a simulation of a toy robot moving on a square tabletop, of dimensions 5 x 5 units.

-To run & test the test-toy-robot application follow below steps:
1. Extract the test-toy-robot.zip file in your laptop/desktop any code base folder
2. Import in Intellij/Eclipse any IDE, I would recommend to use Intellij
3. Run below commands :
	3.1 If you are using Intellij then run-(mvn clean install) command in Intellij terminal project will build successfully.
	3.2 If you are using Eclipes right click on test-toy-robot->run as->maven build then write- (clean install) command in Goals apply and run in case build will fail due to mvn life cycle plugin compatibility of the eclipse though project will work fine just follow continue below steps.
	3.3 You can run this app from command prompt(cmd) directly as well.
4. Go to inside com.test.toy.robot package and right click on ToyRobotApplication then Run As-> Java Application.
5. Spring Boot test-toy-robot application started now you are able to see message on console logs- 
	Spring Boot Toy Robot Application Running...
	Tomcat started on port(s): 8086 (http) with context path
Note: Default port number is changed because sometimes other applications are running on the same port so it gives error while starting the application port is already in used. 
6. Copy-paste and enter the below URL in google chrome browser
	http://localhost:8086/swagger-ui.html#!/robot-simulation-controller/newSimulationRoundUsingPOST
After entering this url you will able to see one of the Swagger UI screen that has been integrated and configured in code to make API call easily instead of calling through POSTMAN tool or you can also use POSTMAN if  you want to use for the testing.
7. In below simulationRound field has text box and it shows required input parameter.
8. Copy Below Input Parameter format that is expected with application object-

Testing Expected scenarios :
1. 
Input-

{"commands":[
"PLACE 0,0,NORTH",
"MOVE",
"REPORT"	
]} 
	
Output-

{
    "output": [
        "0,1,NORTH"
    ]
}

2. 
Input-

{"commands":[
"PLACE 0,0,NORTH",
"LEFT",
"REPORT"	
]}
	
Output-

{
    "output": [
        "0,0,WEST"
    ]
}

3. 
Input-

{"commands":[
"PLACE 1,2,EAST",
"MOVE",
"MOVE",
"LEFT",
"MOVE",
"REPORT"	
]}
	
Output-

{
    "output": [
        "3,3,NORTH"
    ]
}

# Notes:
- All commands will be ignored until a valid PLACE command.
- The REST-API response object is a Report object that contains a list of reports, which is the output of the REPORT command if any. 
- Test cases have written.


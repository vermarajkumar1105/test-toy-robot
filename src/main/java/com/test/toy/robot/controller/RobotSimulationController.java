package com.test.toy.robot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.toy.robot.model.Report;
import com.test.toy.robot.model.SimulationRound;
import com.test.toy.robot.service.RobotSimulationService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class RobotSimulationController {

	@Autowired
	private RobotSimulationService simulationService;

	@RequestMapping(value = "/robot/simulation", method = RequestMethod.POST)
	@ApiOperation(value = "Robot Simulation API call to move Cardinal Direction", notes = "Robot Simulation API call to move Cardinal Direction !")
	@ApiParam(value = "Toy Robot request object", defaultValue = "{\"commands\":[\n\"PLACE 1,2,EAST\",\n\"MOVE\",\n\"MOVE\",\n\"LEFT\",\n\"MOVE\",\n\"REPORT\"\t\n]}\n")
	public ResponseEntity<Report> newSimulationRound(@RequestBody SimulationRound simulationRound) {
		Report report = simulationService.start(simulationRound);
		return new ResponseEntity<Report>(report, HttpStatus.CREATED);

	}

}

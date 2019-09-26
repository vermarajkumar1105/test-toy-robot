package com.test.toy.robot.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.toy.robot.model.Report;
import com.test.toy.robot.model.SimulationRound;
import com.test.toy.robot.service.impl.RobotSimulationServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RobotSimulationServiceImpl.class)
public class RobotSimulationServiceImplTest {

	@Autowired
	private RobotSimulationService robotSimulationService;

	@Test
	public void start() {
		Report report = new Report();
		report.addOutput("0,1,NORTH");
		SimulationRound round = new SimulationRound();
		round.addCommand("PLACE 0,0,NORTH");
		round.addCommand("LEFT");
		round.addCommand("RIGHT");
		round.addCommand("MOVE");
		round.addCommand("REPORT");
		Assert.assertEquals(robotSimulationService.start(round), report);
	}

}

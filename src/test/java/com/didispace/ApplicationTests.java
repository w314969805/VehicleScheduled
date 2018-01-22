package com.didispace;

import com.didispace.domain.p.TspVehicle;
import com.didispace.domain.p.TspVehicleRepository;
import com.didispace.domain.s.Vehicle;
import com.didispace.domain.s.VehicleRepository;
import oracle.jdbc.driver.OracleDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	@Autowired
	private TspVehicleRepository tspVehicleRepository;
	@Autowired
	private VehicleRepository vehicleRepository;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {

		List<Vehicle> find = vehicleRepository.findAll();
		TspVehicle vehicle = new TspVehicle();
		find.stream().forEach(v -> {
			System.out.println("vin:"+v.getVin()+",电机号："+v.getMotoNo());
			//vehicle.setVin(v.getVin());
			//vehicle.setPowerNo(v.getMotoNo());
			//tspVehicleRepository.save(vehicle);
		});

		//Assert.assertEquals(5, tspVehicleRepository.findAll().size());

		//Assert.assertEquals(3, vehicleRepository.findAll().size());

	}


}

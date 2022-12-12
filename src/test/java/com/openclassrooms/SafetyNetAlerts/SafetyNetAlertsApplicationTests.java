package com.openclassrooms.SafetyNetAlerts;

import com.SafetyNetAlerts.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SafetyNetAlertsApplicationTests {

	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetSafetyNetAlerts() {
		String expected = "SafetyNetAlerts is up and running !";
		String result = bs.getSafetyNetAlerts().getValue();
		assertEquals(expected, result);
	}

}

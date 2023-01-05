package com.openclassrooms.SafetyNetAlerts;

import com.SafetyNetAlerts.model.GlobalData;
import com.SafetyNetAlerts.repository.Impl.GlobalDataRepositoryImpl;
import com.SafetyNetAlerts.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SafetyNetAlertsApplicationTest {

	//@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetSafetyNetAlerts() {
		String expected = "SafetyNetAlerts is up and running !";
		String result = bs.getSafetyNetAlerts().getValue();
		assertEquals(expected, result);

		GlobalDataRepositoryImpl gdr = new GlobalDataRepositoryImpl();

		GlobalData globaldata = gdr.read();
		System.out.println(globaldata);
		assertEquals(1,1);
	}



}

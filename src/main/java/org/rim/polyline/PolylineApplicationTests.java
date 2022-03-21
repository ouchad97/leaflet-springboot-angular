package org.rim.polyline;

import org.junit.jupiter.api.Test;
import org.rim.polyline.services.PolylineService;
import org.rim.polyline.shared.dto.PolylineDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PolylineApplicationTests {

	@Autowired //injecter le bean ** Injection des dépendances
	private PolylineService polylineService;
	
	@Test
	void contextLoads() {
	}
	
	 
}

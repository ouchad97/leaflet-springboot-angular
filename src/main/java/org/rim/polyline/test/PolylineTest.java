package org.rim.polyline.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
 

import org.junit.jupiter.api.Test;
import org.rim.polyline.services.PolylineService;
import org.rim.polyline.shared.dto.PolylineDto;

@SpringBootTest
public class PolylineTest {

	@Autowired
	PolylineService polylineService;

 
@Test
public void getdevice() { 
	 
	//PolylineDto deviceDto = polylineService.getPolylineByDeviceId(429911);
	//System.out.println("////// "+deviceDto.getLatitude()+deviceDto.getLongitude());
	 
}
}


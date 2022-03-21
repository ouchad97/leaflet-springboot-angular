package org.rim.polyline.services;
  
import java.util.Date;
import java.util.List;

import org.rim.polyline.shared.dto.PolylineDto;
import org.springframework.stereotype.Service; 

@Service
public interface PolylineService  {
  
	PolylineDto getPolylineByDeviceId(Integer deviceId);
	List<PolylineDto> getAllPolylines();
}
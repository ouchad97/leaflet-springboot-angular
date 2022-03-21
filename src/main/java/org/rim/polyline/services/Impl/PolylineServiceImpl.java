package org.rim.polyline.services.Impl;
 
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.rim.polyline.entities.PolylineEntity;
import org.rim.polyline.repositories.PolylineRepository;
import org.rim.polyline.services.PolylineService; 
import org.rim.polyline.shared.dto.PolylineDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

@Service  // indique que cette class est un service
public class PolylineServiceImpl implements PolylineService {

	@Autowired  //injecter le bean ** Injection des dépendances
	PolylineRepository polylineRepository;
 

	 
	@Override
	public PolylineDto getPolylineByDeviceId(Integer deviceId) {

		PolylineEntity checkDevice = polylineRepository.findTopByDeviceId(deviceId);
		if (checkDevice == null)
			throw new RuntimeException("Date not existe");
		PolylineDto polylineDto= new PolylineDto();
		BeanUtils.copyProperties(checkDevice, polylineDto);
		return polylineDto;
	} 
	
	
	@Override
	public List<PolylineDto> getAllPolylines() {
		List<PolylineEntity> id_device = (List<PolylineEntity>)polylineRepository.findAll();
		Type listType = new TypeToken<List<PolylineDto>>() {}.getType();
		List<PolylineDto>  polylineDto = new ModelMapper().map(id_device, listType);
		return polylineDto;
	}

 
}

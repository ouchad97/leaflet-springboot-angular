package org.rim.polyline.controllers;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.rim.polyline.responses.PolylineResponse;
import org.rim.polyline.services.PolylineService;
import org.rim.polyline.shared.dto.PolylineDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200") //access from angular port
@RestController 
@RequestMapping("/devices") // localhost:8080/numbers  mapper url(requette)
public class PolylineController {

	@Autowired //injecter le bean ** Injection des dépendances
	PolylineService polylineService;

	@GetMapping(path = "/{id_device}")
	public ResponseEntity<PolylineResponse> getPolyline(@PathVariable Integer deviceId) {

		PolylineDto polylineDto = polylineService.getPolylineByDeviceId(deviceId);

		PolylineResponse polylineResponse = new PolylineResponse();

		BeanUtils.copyProperties(polylineDto, polylineResponse);

		return new ResponseEntity<PolylineResponse>(polylineResponse, HttpStatus.OK);
	}
	
	 
	
	
	@GetMapping //Afficher les nums
	public ResponseEntity<List<PolylineResponse>> getAllPolylines() {
		List<PolylineDto> devices = polylineService.getAllPolylines();
		Type listType = new TypeToken<List<PolylineResponse>>() {
		}.getType();
		List<PolylineResponse> devicesResponse = new ModelMapper().map(devices, listType);
		return new ResponseEntity<List<PolylineResponse>>(devicesResponse, HttpStatus.OK);

	}
   
	
}

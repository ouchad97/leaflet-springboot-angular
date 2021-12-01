package org.number.store.controllers;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.number.store.requests.NumberRequest;
import org.number.store.responses.NumberResponse;
import org.number.store.services.NumberService;
import org.number.store.shared.dto.NumberDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200") //access from angular port
@RestController 
@RequestMapping("/numbers") // localhost:8080/numbers  mapper url(requette)
public class NumberController {

	@Autowired //injecter le bean ** Injection des dépendances
	NumberService numberService;

	@GetMapping(path = "/{id}")
	public ResponseEntity<NumberResponse> getUser(@PathVariable String id) {

		NumberDto numberDto = numberService.getNumberByNumId(id);

		NumberResponse numberResponse = new NumberResponse();

		BeanUtils.copyProperties(numberDto, numberResponse);

		return new ResponseEntity<NumberResponse>(numberResponse, HttpStatus.OK);
	}

	@GetMapping //Afficher les nums
	public ResponseEntity<List<NumberResponse>> getUsers() {
		List<NumberDto> users = numberService.getAllNumbers();
		Type listType = new TypeToken<List<NumberResponse>>() {
		}.getType();
		List<NumberResponse> usersResponse = new ModelMapper().map(users, listType);
		return new ResponseEntity<List<NumberResponse>>(usersResponse, HttpStatus.OK);

	}

	@PostMapping //Ajouter nums
	public ResponseEntity<NumberResponse> createUser(@RequestBody NumberRequest numberRequest) throws Exception {

		NumberDto numberDto = new NumberDto();

		BeanUtils.copyProperties(numberRequest, numberDto);

		NumberDto createUser = numberService.createNumber(numberDto);

		NumberResponse numberResponse = new NumberResponse();

		BeanUtils.copyProperties(createUser, numberResponse);

		return new ResponseEntity<NumberResponse>(numberResponse, HttpStatus.CREATED);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<NumberResponse> updateUser(@PathVariable String id, @RequestBody NumberRequest numberRequest) {

		NumberDto numberDto = new NumberDto();

		BeanUtils.copyProperties(numberRequest, numberDto);

		NumberDto updateUser = numberService.updateNumber(id, numberDto);

		NumberResponse numberResponse = new NumberResponse();

		BeanUtils.copyProperties(updateUser, numberResponse);

		return new ResponseEntity<NumberResponse>(numberResponse, HttpStatus.ACCEPTED);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable String id) {

		numberService.deleteNumber(id);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}

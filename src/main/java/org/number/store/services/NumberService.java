package org.number.store.services;

import java.util.List;

import org.number.store.shared.dto.NumberDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface NumberService  {

	NumberDto createNumber(NumberDto number);
 

	NumberDto getNumberByNumId(String numId);

	NumberDto updateNumber(String id, NumberDto numberDto);

	void deleteNumber(String numId);
 
	List<NumberDto> getAllNumbers();
}
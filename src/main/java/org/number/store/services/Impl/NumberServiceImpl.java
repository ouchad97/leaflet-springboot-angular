package org.number.store.services.Impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.number.store.entities.NumberEntity;
import org.number.store.repositories.NumberRepository;
import org.number.store.services.NumberService;
import org.number.store.shared.Utils;
import org.number.store.shared.dto.NumberDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service  // indique que cette class est un service
public class NumberServiceImpl implements NumberService {

	@Autowired  //injecter le bean ** Injection des dépendances
	NumberRepository numberRepository;

	@Autowired  //injecter le bean ** Injection des dépendances
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired  //injecter le bean ** Injection des dépendances
	Utils util;

	@Override
	public NumberDto createNumber(NumberDto number) {

		NumberEntity numberEntity = new NumberEntity();

		NumberEntity checkUser = numberRepository.findByNum(number.getNum());

		if (checkUser != null)
			throw new RuntimeException("Number Alrady Exists !");

		BeanUtils.copyProperties(number, numberEntity);


		numberEntity.setNumId(util.generateStringId(32));

		NumberEntity newUser = numberRepository.save(numberEntity);

		NumberDto numberDto = new NumberDto();
		BeanUtils.copyProperties(newUser, numberDto);

		return numberDto;
	}

 	 
 

	@Override
	public NumberDto getNumberByNumId(String numId) {

		NumberEntity numberEntity = numberRepository.findByNumId(numId);

		if (numberEntity == null)
			throw new UsernameNotFoundException(numId);

		NumberDto numberDto = new NumberDto();

		BeanUtils.copyProperties(numberEntity, numberDto);

		return numberDto;
	}

	@Override
	public NumberDto updateNumber(String id, NumberDto numberDto) {
		
		NumberEntity numberEntity = numberRepository.findByNumId(id);
		if (numberEntity == null)
			throw new UsernameNotFoundException(id);

		numberEntity.setNum(numberDto.getNum());
		NumberEntity userUpdated = numberRepository.save(numberEntity);

		NumberDto user = new NumberDto();

		BeanUtils.copyProperties(userUpdated, user);

		return user;
	}

	@Override
	public void deleteNumber(String numId) {
		
		NumberEntity numberEntity = numberRepository.findByNumId(numId);
		
		if(numberEntity == null) throw new UsernameNotFoundException(numId); 
		
		numberRepository.delete(numberEntity);
		
	}

	@Override
	public List<NumberDto> getAllNumbers() {
		List<NumberEntity> numbers = (List<NumberEntity>)numberRepository.findAll();
		Type listType = new TypeToken<List<NumberDto>>() {}.getType();
		List<NumberDto>  numberDto = new ModelMapper().map(numbers, listType);
		return numberDto;
	}


 


}

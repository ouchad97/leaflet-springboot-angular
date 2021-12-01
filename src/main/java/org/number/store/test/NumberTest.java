package org.number.store.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.number.store.services.NumberService;
import org.number.store.shared.dto.NumberDto;

@SpringBootTest
public class NumberTest {

	@Autowired
	NumberService numberService;

	@Test
	public void testaddUser() {
		
		NumberDto numberDto = new NumberDto(2122);
		numberService.createNumber(numberDto);
		System.out.print(numberDto.toString());
	}}



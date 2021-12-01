package org.number.store;

import org.junit.jupiter.api.Test;
import org.number.store.services.NumberService;
import org.number.store.shared.dto.NumberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NumberApplicationTests {

	@Autowired //injecter le bean ** Injection des dépendances
	private NumberService numberService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testaddNumber() {
		
		NumberDto numberDto = new NumberDto(212);
		numberService.createNumber(numberDto);
		System.out.print(numberDto.toString());
	}
	
}

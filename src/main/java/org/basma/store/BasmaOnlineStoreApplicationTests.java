package org.basma.store;

import org.basma.store.services.UserService;
import org.basma.store.shared.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BasmaOnlineStoreApplicationTests {

	@Autowired
	private UserService userService;
	
	@Test
	void contextLoads() {
	}
	
 
	
	
	@Test
	public void testaddUser() {
		
		UserDto userDto = new UserDto("NomTest", "PrenomTest", "EmailTest@email.com","aaa");
		userService.createUser(userDto);
		
		
//		UserDto userDto = new UserDto("NomTest", "PrenomTest", "EmailTest@email.com","aaa"); 
//		UserDto createUser = userService.createUser(userDto);
//		UserResponse userResponse = new UserResponse();
//		BeanUtils.copyProperties(createUser, userResponse);

		
		System.out.print(userDto.toString());
	}
	
}

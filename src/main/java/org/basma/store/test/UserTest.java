package org.basma.store.test;

import org.basma.store.services.Impl.UserServiceImpl;
import org.basma.store.shared.dto.UserDto;
import org.junit.Test; 

public class UserTest {

//	
	@Test
	public void testaddUser() {

		UserServiceImpl userService = new UserServiceImpl();

		UserDto user = new UserDto("NomTest", "PrenomTest", "EmailTest@email.com","aaa");
		userService.createUser(user);

		System.out.print(user.toString());
//
	}
}

package com.taskproject.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskproject.entity.Users;
import com.taskproject.payload.UserDto;
import com.taskproject.repository.UserRepository;
import com.taskproject.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDto createUser(UserDto userDto) {
		//UserDto is not an entity of Users
		
		Users user = userDtoToEntity(userDto);
		Users savedUser = userRepository.save(user);
		return entityToUserDto(savedUser);
	}
	
	private Users userDtoToEntity(UserDto userDto) {
		Users users =  new Users();
		users.setName(userDto.getName());
		users.setEmail(userDto.getEmail());
		users.setPassword(userDto.getPassword());
		
		return users;
	}
	
	private UserDto entityToUserDto(Users savedUser) {
		UserDto userdto = new UserDto();
		userdto.setId(savedUser.getId());
		userdto.setName(savedUser.getName());
		userdto.setEmail(savedUser.getEmail());
		userdto.setPassword(savedUser.getPassword());
		
		return userdto;
	}

	
	
}

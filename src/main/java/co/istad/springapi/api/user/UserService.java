package co.istad.springapi.api.user;

import co.istad.springapi.api.user.web.CreateUserDto;
import co.istad.springapi.api.user.web.UserDto;

public interface UserService {
    UserDto createNewUser(CreateUserDto createUserDto);
    UserDto findUserById(Integer id);
}

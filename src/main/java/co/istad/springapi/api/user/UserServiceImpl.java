package co.istad.springapi.api.user;

import co.istad.springapi.api.user.web.CreateUserDto;
import co.istad.springapi.api.user.web.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;
    private final UserMapStruct userMapStruct;
    @Override
    public UserDto createNewUser(CreateUserDto createUserDto) {
        User user = userMapStruct.createUserDtoToUser(createUserDto);

        userMapper.insert(user);
        UserDto userDto = userMapStruct.userToUserDto(user);

        return userDto;
    }

    @Override
    public UserDto findUserById(Integer id) {

        User user = userMapper.selectById(id).orElseThrow();

        return null;
    }
}

package co.edu.cue.bowlingalley_quiceno.services;

import co.edu.cue.bowlingalley_quiceno.domain.entities.User;
import co.edu.cue.bowlingalley_quiceno.mapping.dtos.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> listUsers();
    UserDto getUserById(int id);
    UserDto saveUser(UserDto user);
}
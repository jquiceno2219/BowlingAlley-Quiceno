package co.edu.cue.bowlingalley_quiceno.mapping.mappers;

import co.edu.cue.bowlingalley_quiceno.domain.entities.User;
import co.edu.cue.bowlingalley_quiceno.mapping.dtos.UserDto;

import java.util.List;

public class UserMapper {
    public static UserDto mapFrom(User source){
        return new UserDto(source.getUserId(), source.getName(), source.getEmail(), source.getIsUserAffiliate());
    }

    public static User mapFrom (UserDto source){
        return new User(source.userId(),
                source.name(),
                source.email(),
                source.isUserAffiliate());
    }

    public static List<UserDto> mapFrom(List<User> source){
        return source.parallelStream().map(e-> mapFrom(e)).toList();
    }
}

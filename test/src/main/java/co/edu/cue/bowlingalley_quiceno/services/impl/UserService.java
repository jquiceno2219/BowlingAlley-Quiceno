package co.edu.cue.bowlingalley_quiceno.services.impl;

import co.edu.cue.bowlingalley_quiceno.domain.entities.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
    User getUserById(int id);
    User saveUser(User user);
}
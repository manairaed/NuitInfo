package tn.nuitinfo.nuitinfo.Services;

import tn.nuitinfo.nuitinfo.Models.Role;
import tn.nuitinfo.nuitinfo.Models.User;
import tn.nuitinfo.nuitinfo.Services.Registration.RegistrationRequest;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);

    User registerUser(RegistrationRequest request);
    List<User> getAllUsers ();



}


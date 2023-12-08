package tn.nuitinfo.nuitinfo.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.nuitinfo.nuitinfo.Models.User;
import tn.nuitinfo.nuitinfo.Repositories.UserRepository;
import tn.nuitinfo.nuitinfo.Services.Registration.RegistrationRequest;
import tn.nuitinfo.nuitinfo.Services.UserService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {

    @Autowired
    UserRepository userRep;

    @Autowired
    UserService userService;

    @RequestMapping(path = "all",method = RequestMethod.GET)
    public List<User> getAllUsers() {
        // Print statement for demonstration purposes
        System.out.println("Fetching all users...");

        List<User> users = userRep.findAll();

        // Print the number of users retrieved
        System.out.println("Number of users: " + users.size());

        return users;

    }


    @PostMapping("/register")
    public User register(@RequestBody RegistrationRequest request) {
        return userService.registerUser(request);

    }





}
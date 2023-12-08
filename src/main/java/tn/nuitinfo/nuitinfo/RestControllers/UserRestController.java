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
        return userRep.findAll();
    }


    @PostMapping("/register")
    public User register(@RequestBody RegistrationRequest request) {
        return userService.registerUser(request);

    }


    @GetMapping("/verifyEmail/{token}")
    public User verifyEmail(@PathVariable("token") String token){
        return userService.validateToken(token);
    }


}
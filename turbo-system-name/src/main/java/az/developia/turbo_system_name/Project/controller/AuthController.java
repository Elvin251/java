package az.developia.turbo_system_name.Project.controller;

import org.springframework.web.bind.annotation.*;

import az.developia.turbo_system_name.Project.requestresponse.*;
import az.developia.turbo_system_name.Project.requestresponse.MessageResponse;
import az.developia.turbo_system_name.Project.service.AuthService;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service){
        this.service=service;
    }

    @PostMapping("/register")
    public MessageResponse register(@RequestBody RegisterRequest req){
        service.register(req);
        return new MessageResponse("Registered Successfully!");
    }

    @PostMapping("/login")
    public MessageResponse login(@RequestBody LoginRequest req){
        boolean ok=service.login(req);
        if(ok) return new MessageResponse("Login Success!");
        return new MessageResponse("Login Failed!");
    }
}
package az.developia.turbo_system_name.Project.service;

import org.springframework.stereotype.Service;
import az.developia.turbo_system_name.Project.entity.Role;
import az.developia.turbo_system_name.Project.entity.UserEntity;
import az.developia.turbo_system_name.Project.repository.UserRepository;
import az.developia.turbo_system_name.Project.requestresponse.RegisterRequest;
import az.developia.turbo_system_name.Project.requestresponse.LoginRequest;

@Service
public class AuthService {

    private final UserRepository repo;

    public AuthService(UserRepository repo){
        this.repo=repo;
    }

    public void register(RegisterRequest req){
        UserEntity u=new UserEntity();
        u.setUsername(req.getUsername());
        u.setPassword(req.getPassword());
        u.setRole(Role.USER);
        repo.save(u);
    }

    public boolean login(LoginRequest req){
        UserEntity u=repo.findByUsername(req.getUsername());
        if(u==null) return false;
        return u.getPassword().equals(req.getPassword());
    }
}
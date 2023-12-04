package pupc.edu.pe.pastillero.service;

import org.springframework.stereotype.Service;
import pupc.edu.pe.pastillero.dto.request.LoginRequest;
import pupc.edu.pe.pastillero.dto.request.UserRequest;
import pupc.edu.pe.pastillero.dto.response.LoginResponse;
import pupc.edu.pe.pastillero.dto.response.UserResponse;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public LoginResponse login(LoginRequest request) {
        LoginResponse response = new LoginResponse();
        response.setUserId(0234L);
        response.setUserCode("asdfgghjk");
        return response;
    }

    @Override
    public UserResponse crearUser(UserRequest request) {
        return null;
    }

    @Override
    public UserResponse editarUser(UserRequest request) {
        return null;
    }
}

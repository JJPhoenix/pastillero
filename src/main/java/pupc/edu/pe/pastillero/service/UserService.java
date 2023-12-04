package pupc.edu.pe.pastillero.service;

import pupc.edu.pe.pastillero.dto.request.LoginRequest;
import pupc.edu.pe.pastillero.dto.request.UserRequest;
import pupc.edu.pe.pastillero.dto.response.LoginResponse;
import pupc.edu.pe.pastillero.dto.response.UserResponse;

public interface UserService {
    LoginResponse login(LoginRequest request);
    UserResponse crearUser(UserRequest request);
    UserResponse editarUser(UserRequest request);
}

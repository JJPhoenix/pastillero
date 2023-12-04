package pupc.edu.pe.pastillero.dto.request;

import lombok.Data;

@Data
public class LoginRequest {
    String user;
    String password;
}

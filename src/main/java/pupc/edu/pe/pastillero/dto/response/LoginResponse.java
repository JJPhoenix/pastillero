package pupc.edu.pe.pastillero.dto.response;

import lombok.Data;
import pupc.edu.pe.pastillero.dto.base.Response;

@Data
public class LoginResponse extends Response {
    private Long userId;
    private String userCode;

    String nombre;
    String user;
    String apellidoPaterno;
    String apellidoMaterno;
}

package pupc.edu.pe.pastillero.dto.response;

import lombok.Data;
import pupc.edu.pe.pastillero.dto.base.Request;
import pupc.edu.pe.pastillero.dto.request.UserRequest;

@Data
public class UserResponse extends Request {
    private Long userId;
    String user;
}

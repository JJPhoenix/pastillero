package pupc.edu.pe.pastillero.dto.base;

import lombok.Data;
import pupc.edu.pe.pastillero.enums.ResultCodeEnum;

@Data
public class Response {
    private String code = ResultCodeEnum.OK.getCode();
    private String message = ResultCodeEnum.OK.getMessage();

    public void setValue(String code, String message){
        this.code = code;
        this.message = message;
    }
}

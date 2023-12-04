package pupc.edu.pe.pastillero.dto.response;

import lombok.Data;
import pupc.edu.pe.pastillero.dto.RecetaDto;
import pupc.edu.pe.pastillero.dto.base.Response;

import java.util.List;

@Data
public class RecetasResponse extends Response {
    List<RecetaDto> recetas;
}

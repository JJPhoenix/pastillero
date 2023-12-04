package pupc.edu.pe.pastillero.dto.request;

import lombok.Data;
import pupc.edu.pe.pastillero.dto.IndicacionDto;

import java.util.Date;
import java.util.List;

@Data
public class RecetaRequest {
    String recetaId;
    Date fechaEmision;
    String diagnostico;
    String indicacionExtra;
    String estado;
    String medico;
    Date fechaCita;
    List<IndicacionDto> indicaciones;
}

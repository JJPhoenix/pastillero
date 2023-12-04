package pupc.edu.pe.pastillero.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RecetaDto {
    String idReceta;
    String idMedico;
    Date fechaEmision;
    String diagnostico;
    String indicacionExtra;
    String estado;
    Date fechaCita;
    List<IndicacionDto> listaIndicacion;
}

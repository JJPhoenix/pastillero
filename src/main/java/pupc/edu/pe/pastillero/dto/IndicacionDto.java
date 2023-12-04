package pupc.edu.pe.pastillero.dto;

import lombok.Data;

import java.util.List;

@Data
public class IndicacionDto {
    String indicacionId;
    String medicamentoId;
    int dosisRecetada;
    int dosisTomada;
    int frecuencia;
    int duracion;
    String estado;
    List<MedicamentoDto> medicamentos;
}

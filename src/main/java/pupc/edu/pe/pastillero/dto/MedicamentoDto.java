package pupc.edu.pe.pastillero.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MedicamentoDto {
    String medicamentoId;
    String nombreComercial;
    String tipo;
    String fabricante;
    double concentracion;
    String descripcion;
    String imagen;
}

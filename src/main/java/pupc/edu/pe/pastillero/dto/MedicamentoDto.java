package pupc.edu.pe.pastillero.dto;

import lombok.Data;

@Data
public class MedicamentoDto {
    String medicamentoId;
    String nombreComercial;
    String tipo;
    String fabricante;
    double concentracion;
    String descripcion;
    String imagen;
}

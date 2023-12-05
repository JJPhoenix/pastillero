package pupc.edu.pe.pastillero.dto.request;

import lombok.Data;

@Data
public class MedicamentoRegistroRequest {

    String medicamentoId;
    String nombreComercial;
    String tipo;
    String fabricante;
    double concentracion;
    String descripcion;
    String imagen;
}

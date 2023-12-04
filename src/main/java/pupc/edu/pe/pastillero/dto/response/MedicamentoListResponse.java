package pupc.edu.pe.pastillero.dto.response;

import lombok.Data;
import pupc.edu.pe.pastillero.dto.MedicamentoDto;
import pupc.edu.pe.pastillero.dto.base.Response;

import java.util.ArrayList;
import java.util.List;

@Data
public class MedicamentoListResponse extends Response {
    private List<MedicamentoDto> medicamentos = new ArrayList<>();
}

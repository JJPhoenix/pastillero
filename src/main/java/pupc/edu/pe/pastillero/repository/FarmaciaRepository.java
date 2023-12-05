package pupc.edu.pe.pastillero.repository;

import pupc.edu.pe.pastillero.model.Medicamento;

import java.util.List;

public interface FarmaciaRepository {
    List<Medicamento> buscarMedicamentos(String medicamento);
}

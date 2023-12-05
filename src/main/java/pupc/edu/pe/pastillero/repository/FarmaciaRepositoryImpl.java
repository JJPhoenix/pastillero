package pupc.edu.pe.pastillero.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pupc.edu.pe.pastillero.dto.MedicamentoDto;
import pupc.edu.pe.pastillero.model.Medicamento;

import java.util.List;

@Repository
public class FarmaciaRepositoryImpl implements FarmaciaRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Medicamento> buscarMedicamentos(String medicamento) {
        String sql = "SELECT * FROM medicamento WHERE alguna_columna = ?";
        return jdbcTemplate.query(sql, new Object[]{medicamento},(resultSet, rowNum) -> {
            Medicamento producto = new Medicamento();
            return producto;
        });
    }
}

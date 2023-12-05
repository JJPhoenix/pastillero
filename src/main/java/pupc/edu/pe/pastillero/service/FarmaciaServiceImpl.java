package pupc.edu.pe.pastillero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.MedicamentoDto;
import pupc.edu.pe.pastillero.dto.request.MedicamentoRequest;
import pupc.edu.pe.pastillero.dto.response.MedicamentoListResponse;
import pupc.edu.pe.pastillero.model.Medicamento;
import pupc.edu.pe.pastillero.repository.FarmaciaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FarmaciaServiceImpl implements FarmaciaService{

    @Autowired
    FarmaciaRepository repository;
    @Override
    public MedicamentoListResponse buscarFarmacia(String request) {
        MedicamentoListResponse response = new MedicamentoListResponse();
        List<MedicamentoDto> medicamentoDtos = new ArrayList<>();

        /*List<Medicamento> medicamentos = repository.buscarMedicamentos(request);
        medicamentos.forEach(medicamento -> {
        });*/
        medicamentoDtos.add(new MedicamentoDto("01","Paracetamol 500mg"," Tableta",
                "",500,"CAJA 100 UN","https://dcuk1cxrnzjkh.cloudfront.net/imagesproducto/030102L.jpg"));
        response.setMedicamentos(medicamentoDtos);
        return response;
    }

    @Override
    public ApplicantResponse registrarFarmacia(MedicamentoRequest request) {
        return null;
    }
}

package pupc.edu.pe.pastillero.service;

import pupc.edu.pe.pastillero.dto.ApplicantResponse;
import pupc.edu.pe.pastillero.dto.request.RecetaRequest;
import pupc.edu.pe.pastillero.dto.response.RecetasResponse;

public interface RecetaService {
    ApplicantResponse crearReceta(RecetaRequest request, String idUser);
    ApplicantResponse editarReceta(RecetaRequest request, String idUser);
    ApplicantResponse eliminarReceta(RecetaRequest request, String idUser);
    RecetasResponse verRecetas(String idUser);
}

package pupc.edu.pe.pastillero.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class UserRequest {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String celular;
    Date fechaNacimiento;
    String contactoEmergencia;
    String provincia;
    String departamento;
    String distrito;
    String direccion;
    double peso;
    double talla;
    String tipoSangre;
    String alergias;
}

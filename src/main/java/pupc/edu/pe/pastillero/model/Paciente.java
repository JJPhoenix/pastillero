package pupc.edu.pe.pastillero.model;

import lombok.Data;

import java.util.Date;

@Data
public class Paciente {
    private String id_paciente;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private Date annio_nacimiento;
    private String genero;
    private String tipo_documento;
    private String documento;
    private String alergia;
    private String provincia;
    private String distrito;
    private String departamento;
    private String direccion;
    private Date fecha_creacion;
    private Date fecha_modificacion;
    private String tipo_operacion;
    private String usuario_operacion;
    private String ip_operacion;
}

package Capa_Logica_Negocios.Models.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {
    private int Id;
    private String Nombre;
    private String Contrasena;
    private String Email;


}

package Capa_Logica_Negocios.Models.Entity;

import jakarta.persistence.*;
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
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Contrasena")
    private String Contrasena;
    @Column(name = "Email")
    private String Email;


}

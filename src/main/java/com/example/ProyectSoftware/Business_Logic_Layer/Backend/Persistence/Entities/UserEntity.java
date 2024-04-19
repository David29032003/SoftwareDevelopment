package com.example.ProyectSoftware.Business_Logic_Layer.Backend.Persistence.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")//nombre de la tabla en la base de datos
public class UserEntity {
    //identificador único del usuario en la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    //nombre del usuario
    @Column(name = "name")
    private String name;

    //contraseña del usuario
    @Column(name = "password")
    private String password;

    //correo electrónico del usuario
    @Column(name = "email")
    private String email;

    //metodos getters y setters para cada uno de los atributos
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
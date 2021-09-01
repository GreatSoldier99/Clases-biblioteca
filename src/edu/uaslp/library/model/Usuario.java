package edu.uaslp.library.model;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String clave;
    private String phone;
    private String email;
    private LocalDate registerDate;
    private String address;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre1) {
        nombre = nombre1;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String numero) {
        clave = numero;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String numero) {
        phone = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String correo) {
        email = correo;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate fecha) {
        registerDate = fecha;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String calle, String numero, String colonia) {
        address = calle + " " + numero + " " + colonia;
    }
}

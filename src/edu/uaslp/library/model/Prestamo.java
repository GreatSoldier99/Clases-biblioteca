package edu.uaslp.library.model;

import java.time.LocalDateTime;

public class Prestamo {
    private LocalDateTime fechaHora;
    private Usuario usuario;
    private Libro[] libros;
    private Empleado empleado;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fecha) {
        fechaHora = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario persona) {
        usuario = persona;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] obras) {
        libros = obras;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado peon) {
        empleado = peon;
    }
}

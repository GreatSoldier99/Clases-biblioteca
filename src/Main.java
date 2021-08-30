import java.time.LocalDate;
import java.time.LocalDateTime;

class Libro{
    private String author;
    private String isbn;
    private String title;
    private String editorial;

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String nombre){
        author=nombre;
    }

    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String numero){
        isbn=numero;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String nombre){
        title=nombre;
    }

    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String nombre){
        editorial=nombre;
    }
}

class Usuario{
    private String nombre;
    private String clave;
    private String phone;
    private String email;
    private LocalDate registerDate;
    private String address;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre1){
        nombre=nombre1;
    }

    public String getClave(){
        return clave;
    }
    public void setClave(String numero){
        clave=numero;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String numero){
        phone=numero;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String correo){
        email=correo;
    }

    public LocalDate getRegisterDate(){
        return registerDate;
    }
    public void setRegisterDate(LocalDate fecha){
        registerDate=fecha;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String calle, String numero, String colonia){
        address=calle+" "+numero+" "+colonia;
    }
}

class Empleado{
    private String nombre;
    private String clave;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre1){
        nombre=nombre1;
    }

    public String getClave(){
        return clave;
    }
    public void setClave(String numero){
        clave=numero;
    }
}

class Prestamo{
    private LocalDateTime fechaHora;
    private Usuario usuario;
    private Libro libros;
    private Empleado empleado;

    public LocalDateTime getFechaHora(){
        return fechaHora;
    }
    public void setFechaHora(LocalDateTime fecha){
        fechaHora=fecha;
    }

    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario persona){
        usuario=persona;
    }

    public Libro getLibros(){
        return libros;
    }
    public void setLibros(Libro obras){
        libros=obras;
    }

    public Empleado getEmpleado(){
        return empleado;
    }
    public void setEmpleado(Empleado peon){
        empleado=peon;
    }
}

/*class AdministradorDeUsuarios{
    public Usuario dameUsuarioPorClave(String clave){
    }
}

class AdministradorDeLibros{
    public Libro dameLibroPorClave(String clave){
    }
}

class AdministradorDePrestamos{
    public void registraPrestamo(Empleado empleado, Usuario usuario, Libro libros[]){
    }
}*/

public class Main {
    public static void main(String[] args) {
    }
}
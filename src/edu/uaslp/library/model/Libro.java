package edu.uaslp.library.model;

public class Libro {
    private String author;
    private String isbn;
    private String title;
    private String editorial;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String nombre) {
        author = nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String numero) {
        isbn = numero;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String nombre) {
        title = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String nombre) {
        editorial = nombre;
    }
}

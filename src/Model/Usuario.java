package Model;

public class Usuario {
    private int idUsuario;
    private String Nombre;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}

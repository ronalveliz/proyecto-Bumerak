package Clases2;

public class Usuario {
    String firstname;
    String lastname;
    int edad;
    String email;
    boolean active;

    public Usuario() {
    }

    public Usuario(String firstname, String lastname, int edad, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.edad = edad;
        this.email = email;
        this.active = true;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }
}

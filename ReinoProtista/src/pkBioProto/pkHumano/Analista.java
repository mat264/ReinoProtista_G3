package pkBioProto.pkHumano;

public class Analista extends Persona{
    private String Login;
    private String password;

    public Analista(String nombre, String apellido) {
        super(nombre, apellido);
    }
    public Analista(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }

    public boolean setClave(String Login, String password) {
    if (this.Login != null && this.password != null) {
        setLogin(Login);
        setPassword(password);
        return true;
    }
    return false;
}
public String getLogin() {
        return Login;
    }
    public void setLogin(String login) {
        this.Login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

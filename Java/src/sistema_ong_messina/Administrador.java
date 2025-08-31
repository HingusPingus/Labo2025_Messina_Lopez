package sistema_ong_messina;

import java.time.LocalDate;

public class Administrador extends Personal{
    private String codigo;
    private String nombreUsuario;
    private String contraseña;


    public Administrador(String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, String codigo, String nombreUsuario, String contraseña) throws ContraseñaException {
        super(codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta);
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = verificarContrasenia(contraseña);
    }

    public Administrador(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, String codigo, String nombreUsuario, String contraseña) throws ContraseñaException {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta);
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = verificarContrasenia(contraseña);
    }

    public Administrador(String nombre, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, String codigo, String nombreUsuario, String contraseña) throws ContraseñaException {
        super(nombre, edad, direccion, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta);
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = verificarContrasenia(contraseña);
    }

    public Administrador(String nombre, String apellido, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, String codigo, String nombreUsuario, String contraseña) throws ContraseñaException {
        super(nombre, apellido, edad, direccion, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta);
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = verificarContrasenia(contraseña);
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String verificarContrasenia(String contrasenia) throws ContraseñaException{
        boolean upper=false, special=false;

        if(contrasenia.length()>=8) {
            for (int i = 0; i < contrasenia.length(); i++) {
                if (Character.isUpperCase(contrasenia.charAt(i))) {
                    upper = true;
                }
                if (!Character.isLetterOrDigit(contrasenia.charAt(i))) {
                    special = true;
                }
            }
            if (!upper || !special) {
                throw new ContraseñaException("hubo un error en la contraseña, por favor trate de nuevo. recuerde poner un caracter especial y una mayuscula");
            }
            else{
                return contrasenia;
            }
        }
        else{
            throw new ContraseñaException("la contraseña no puede tener menos de 8 caracteres.");
        }
    }

    @Override
    public void accionSolidaria() {
        System.out.println(getNombreUsuario());
        System.out.println(getNombre());
    }
}

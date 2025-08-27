package sistemas_ong;

public class Administracion extends Personal {
    private String codCompu;
    private String usuario;
    private String contraseña;






    public void verificar_contraseña(){
        try {
            boolean upper=false;
            boolean special=false;
            if (contraseña.length() >= 8) {
                for (int i = 0; i < contraseña.length(); i++) {
                    if(Character.isUpperCase(contraseña.charAt(i))){
                        upper=true;
                    }
                    if(!Character.isLetter(contraseña.charAt(i))){
                        special=true;
                    }
                }
                if(!upper || !special){
                    throw new ContraseñaNoValidaException("Contraseña no valida, introduzca una contraseña con al menos una mayuscula y un caracter especial");
                }
            }else{
                throw new ContraseñaNoValidaException("Contraseña no valida, introduzca una contraseña con al menos 8 caracteres");
            }
        } catch (ContraseñaNoValidaException e) {
            System.out.println(e);
        }

    }

    @Override
    public String quienSoy() {
        return "Admin";
    }
}

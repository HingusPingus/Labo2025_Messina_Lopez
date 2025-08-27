package sistemas_ong;

import java.util.HashSet;

public class ONG {

    private static HashSet<Barrio> barrioAdmin;
    private static HashSet<Barrio> barrioProfe;
    private static HashSet<Barrio> barrioVolunin;
    private static HashSet<Barrio> barrioVolunex;


    public static HashSet<Barrio> adonde(String quien){
        switch (quien){
            case "Admin":
                return barrioAdmin;
            case "Profe":
                return barrioProfe;
            case"VolunIn":
                return barrioVolunin;
            case "VolunEx":
                return barrioVolunex;
            default:
                return new HashSet<>();
        }
    }

}

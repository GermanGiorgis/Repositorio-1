

package Contraseña;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class ValidarContraseña {
    // Método para validar la contraseña
    public static boolean ValidarContraseña(String contraseña1) {
        // Expresión regular para verificar la contraseña
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{6,}$";

        // Compila la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);

        // Crea un matcher para la contraseña dada
        Matcher matcher = pattern.matcher(contraseña1);
       // Devuelve verdadero si la contraseña cumple con la expresión regular
        return matcher.matches();
    }
}


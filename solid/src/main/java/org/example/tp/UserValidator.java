package org.example.tp;

public class UserValidator {

    public static boolean validateUsername(String username) {
        // Valider le nom d'utilisateur (ex: longueur, caractères autorisés)
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    public static boolean validatePassword(String password) {
        // Valider le mot de passe (ex: longueur, complexité)
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }

}

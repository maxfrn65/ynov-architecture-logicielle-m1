package org.example.tp;

public class UserAuthentication {

    public static void loginUser(String username, String password) {
        // Valider le nom d'utilisateur et le mot de passe
        if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)) {
            // Authentifier l'utilisateur
            System.out.println("Utilisateur connecté avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }

}

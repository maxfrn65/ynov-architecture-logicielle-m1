package org.example.tp;

public class UserRegistration {

    public static void registerUser(String username, String password) {
        // Valider le nom d'utilisateur et le mot de passe
        if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)) {
            // Enregistrer l'utilisateur dans la base de données
            System.out.println("Utilisateur enregistré avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }
}

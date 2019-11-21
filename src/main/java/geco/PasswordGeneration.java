package geco;

import java.util.Random;

/**
 * Classe permettant la génération
 * d'un mot de passe aléatoire.
 */
public class PasswordGeneration {
    /**
     * Liste des caractères
     */
    private String  allowedChars =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public String getRandomPassword(){
        StringBuilder password = new StringBuilder();
        Random rand = new Random();
        for(int i = 0; i < 8; i++) {
            int randomNumber = rand.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(randomNumber));
        }
        return password.toString();
    }
}

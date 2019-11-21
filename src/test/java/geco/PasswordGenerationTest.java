package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void getRandomPassword() {
        // Given
        PasswordGeneration pg = new PasswordGeneration();
        // When
        String res = pg.getRandomPassword();
        // Then
        assertEquals("La taille du mot de passe genere doit etre de 8 caractères.",
                8, res.length());
    }
}
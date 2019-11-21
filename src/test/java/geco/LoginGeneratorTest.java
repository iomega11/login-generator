package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    LoginService loginService;

    @Before
    public void setUp(){
        loginService = new LoginService(
                new String[] {"JROL","BPER","CGUR","JDU","JRAL","JRAL1"});
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        /* CT1 */
        // Given
        String nom = "Durand";
        String prenom = "Paul";
        String login = "PDUR";
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        // When
        String loginGenere = loginGenerator.generateLoginForNomAndPrenom(nom,prenom);
        // Then
        assertEquals(login,loginGenere);
        // Il faudrait aussi tester que la liste des logins est bien incrémentée
        // de la bonne valeur.
    }
}
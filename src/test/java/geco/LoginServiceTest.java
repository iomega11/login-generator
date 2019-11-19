package geco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void loginExists() {
        // Given
        String login = "login";
        String[] logins = {login};
        LoginService logSer = new LoginService(logins);
        // When
        boolean res = logSer.loginExists(login);
        // Then
        assertTrue(res);

        // Given
        String[] logins2 = {};
        logSer = new LoginService(logins2);
        // When
        res = logSer.loginExists(login);
        // Then
        assertFalse(res);

    }

    @Test
    public void addLogin() {
        // Given
        String login = "login";
        String[] logins = {};
        LoginService logSer = new LoginService(logins);
        // When
        logSer.addLogin(login);
        // Then
        assertTrue(logSer.loginExists(login));
    }

    @Test
    public void findAllLoginsStartingWith() {
        // Given
        String login = "login";
        String[] logins = {"login1","login2","notAlogin"};
        List<String> expected = new ArrayList<>();
        expected.add("login1");
        expected.add("login2");
        LoginService logSer = new LoginService(logins);
        // When
        List<String> res = logSer.findAllLoginsStartingWith(login);
        // Then
        assertEquals(res,expected);
    }

    @Test
    public void findAllLogins() {
        // Given
        String login = "login";
        String[] logins = {"login1","login2","notAlogin"};
        List<String> expected = new ArrayList<>();
        expected.add("login1");
        expected.add("login2");
        expected.add("notAlogin");
        LoginService logSer = new LoginService(logins);
        // When
        List<String> res = logSer.findAllLogins();
        // Then
        assertEquals(res,expected);
    }
}

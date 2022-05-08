import caesarCipher.Encryption;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class EncryptionTest {
    @Test
    void encrypt_acceptsAndDisplaysTextInput_text() {
        Scanner keyboard = new Scanner(System.in);
        Expected String text = keyboard.next();
    }
}

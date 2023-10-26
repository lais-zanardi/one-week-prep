package one.week.prep.day.three;


class CeaserCipherResult {
    public static String ceaserCipher(String s, int k) {
        StringBuilder encryptedCharacters = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                char encryptedChar = (char) (base + (currentChar - base + k) % 26);
                encryptedCharacters.append(encryptedChar);
            } else {
                // Non-letter characters should remain unchanged
                encryptedCharacters.append(currentChar);
            }
        }

        return encryptedCharacters.toString();
    }
}

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "There's-a-starman-waiting-in-the-sky";
        CeaserCipherResult.ceaserCipher(s, 3);
    }
}


package caesarCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Decryption {
    private String cipherText;
    private int key;

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String text) {
        this.cipherText = text;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Decryption(String text, Integer key) {
        this.cipherText = text;
        this.key = key;


    }

    // Encrypts plain text with a key
    public static StringBuffer encrypt(String cipherText, int key)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<cipherText.length(); i++)
        {
            if (Character.isUpperCase(cipherText.charAt(i)))
            {
                char ch = (char)(((int)cipherText.charAt(i) +
                        key + 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)cipherText.charAt(i) +
                        key + 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Please enter your cipher text, preferably a one-word text");
        String cipherText = bufferedReader.readLine();
        System.out.println("Please enter your decryption key between 1 and 25");
        Integer key = Integer.valueOf(bufferedReader.readLine());
        System.out.println("Your cipher text is:\n "+encrypt(cipherText,key));
    }
}


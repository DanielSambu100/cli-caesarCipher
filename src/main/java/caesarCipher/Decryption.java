package caesarCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static sun.security.util.Debug.args;


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
    public static StringBuffer encrypt(String cipherText, int key) {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<cipherText.length(); i++)
        {
            if(cipherText[i] == true){
                result+=char(int(cipherText[i]+key-65)%26 +65);
            }
            //Encrypt Lowercase letters
	else {
            result+=char(int(cipherText[i]+key-97)%26 +97);
        }
        //Return the resulting string
        return result;
        }

    // Driver code
    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Please enter your cipher text, preferably a one-word text");
        String cipherText = bufferedReader.readLine();
        System.out.println("Please enter your decryption key between 1 and 25");
        Integer key = Integer.valueOf(bufferedReader.readLine());
        System.out.println("Your cipher text is:\n "+encrypt(cipherText,key));
    }
}


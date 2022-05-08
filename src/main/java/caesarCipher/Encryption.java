package caesarCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Encryption {
    private String text;
    private Integer key;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Encryption(String text, Integer key) {
        this.text = text;
        this.key = key;


    }

    // Encrypts plain text with a key
    public static StringBuffer encrypt(String text, int key)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        key - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        key - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Please enter your plain text, preferrably a one-word text");
        String text = bufferedReader.readLine();
        System.out.println("Please enter your key between 1 and 25");
        Integer key = Integer.valueOf(bufferedReader.readLine());
        System.out.println("Your cipher text is:\n "+encrypt(text,key));
    }
}

public class Cipher {
    private static final char[] lookupTable = new char[26];

    static {

        for (int i = 0; i < 26; i++) {
            lookupTable[i] = (char) ('Z' - i);
        }
    }

    public String Encrypt(String message){

        char[] letters = message.toCharArray();
        String cipher = "";

        for (char a:
                letters) {
            if(Character.isLetter(a)){
                int pos = Character.toUpperCase(a) - 'A';
                char encryptedChar = (char) ('Z'-pos);
                cipher+=encryptedChar;
            }
            else{
                cipher+=a;
            }
        }

        return cipher;
    }
    public String Decrypt(String cipher){

        char[] letters = cipher.toCharArray();
        String message = "";

        for (char a:
                letters) {
            if(Character.isLetter(a)){
                int pos = 'Z' - Character.toUpperCase(a);
                char decryptedChar = (char) ('A' + pos);
                message+=decryptedChar;
            }
            else{
                message+=a;
            }
        }

        return message;
    }

}

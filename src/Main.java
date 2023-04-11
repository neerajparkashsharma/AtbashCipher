public class Main {
    public static void main(String[] args) {

        Cipher c = new Cipher();

        String encrypted= c.Encrypt("Neeraj Parkash Sharma");
        System.out.println("Encrypted --> "+ encrypted);

        String decrypted = c.Decrypt(encrypted);
        System.out.println("Decrypted --> "+ decrypted);




    }


}


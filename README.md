# AtbashCipher 

This is a Java implementation of the Atbash cipher, a monoalphabetic substitution cipher used for encrypting and decrypting messages. The Atbash cipher replaces each letter in the plaintext with its corresponding letter in the reversed alphabet.
## Getting Started
To use this implementation of the Atbash cipher, simply download or clone the repository and import the Cipher class into your project. Then, create a new instance of the Cipher class and use its Encrypt and Decrypt methods to encrypt and decrypt messages, respectively.

```java
// instance of Cipher Class
Cipher c = new Cipher();

//encrypting the text
String encrypted= c.Encrypt("Neeraj Parkash Sharma");
System.out.println("Encrypted --> "+ encrypted);

//decrypting the encrypted text
String decrypted = c.Decrypt(encrypted);
System.out.println("Decrypted --> "+ decrypted);


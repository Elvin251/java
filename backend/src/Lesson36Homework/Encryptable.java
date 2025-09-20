package Lesson36Homework;

interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

class AES implements Encryptable {
    public String encrypt(String data) { return "[AES]" + data; }
    public String decrypt(String encryptedData) { return encryptedData.replace("[AES]", ""); }
}

class RSA implements Encryptable {
    public String encrypt(String data) { return "[RSA]" + data; }
    public String decrypt(String encryptedData) { return encryptedData.replace("[RSA]", ""); }
}

class Main10 {
    public static void main(String[] args) {
        Encryptable aes = new AES();
        String enc = aes.encrypt("Hello");
        System.out.println(enc);
        System.out.println(aes.decrypt(enc));
    }
}

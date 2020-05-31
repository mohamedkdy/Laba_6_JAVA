package Lab6;
import java.io.*;


    // шифрование и дешифрование

public class Main {


    public static void main(String[] args) throws IOException {
        
        //что хотим зашифровать
        char[] WhatToEncrypt = {'l','a','b','a','p','o','j','a','b','e'};

        char[] decrypted = new char[10];


        System.out.println("What To Encrypt: " + String.valueOf(WhatToEncrypt));


        try(Lab6.CustomWriter customWriter = new Lab6.CustomWriter(new FileWriter("enc.txt"),'5')) {
            customWriter.write(WhatToEncrypt);
            customWriter.flush();
        } catch (IOException e) {
            e.printStackTrace(); //printStackTrace() печатает местах, где произошло исключение в исходном коде, что позволяет автору, который написал программу, чтобы увидеть, что пошло не так.
        }
            FileReader fr = new FileReader("enc.txt");
            char[] encrypted = new char[10];
            fr.read(encrypted);
        try(
            Lab6.CustomReader customReader = new Lab6.CustomReader(new FileReader("enc.txt"), '5')) {
             customReader.read(decrypted);
             FileWriter dw = new FileWriter("dec.txt");
             dw.write(decrypted);
             dw.flush();
             dw.close();
}

catch (IOException e){


    e.printStackTrace();


}

           System.out.println("Encrypted: " + String.valueOf(encrypted));

           System.out.println("Decrypted: " + String.valueOf(decrypted));

    }


}
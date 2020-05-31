package Lab6;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class CustomWriter extends FilterWriter

{
      private char key;

      //конструктор класса, создаёт новый экземпляр CustomWriter
    protected CustomWriter(Writer out, char key) {
        super(out);
        this.key = key;
    }

    @Override
    //перегружает родительский метод write
    public void write(char[] input) throws IOException {
        for(int i = 0; i < input.length;i++){
            input[i] = encrypt(input[i]);
        }
        super.write(input);
    }

    //метод зашифровывает символ
    private char encrypt(char input){
        return (char)((input - key) );
    }
}

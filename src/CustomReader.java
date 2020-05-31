package Lab6;
import java.io.*;

public class CustomReader extends FilterReader {
    private char key;
/*
protected: такой класс или член класса доступен из любого места 
в текущем классе или пакете или в производных классах,
 даже если они находятся в других пакета.*/

    //конструктор класса

    protected CustomReader(Reader in, char key) {
        super(in);
        this.key= key;
    }


  @Override
  //перезагрууженный метод read
    public int read(char[] output) throws IOException {
        int temp = super.read(output);
        for(int i =0;i<output.length;i++)
        {
            output[i] = decypt(output[i]);
        }
        return temp;
        }

   
   }
}
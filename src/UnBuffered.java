import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by tomas on 10/29/15.
 */
public class UnBuffered {


    Random rant = new Random();
    byte[] bytes = new byte[1024];

    public void write(){
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(Constants.filename);
            rant.nextBytes(bytes);

            for(int i=0; i<Constants.filesize; i++){
                //rant.nextBytes(bytes);
                for(int j=0; j<bytes.length; j++){
                    fos.write(bytes[j]);    //Skriv en stribe tilfældige char.
                }
            }
        } catch(IOException ioe){
            System.out.println("Der skete en fejl: ioe " + ioe);
        } finally{
            try {
                fos.close();
            } catch(IOException io){
                System.out.println("Der skete en fejl: io " + io);
            }
        }

    }

    public void read(){
        FileInputStream  fis = null;
        try{
            fis = new FileInputStream(Constants.filename);

            for(int i=0; i<Constants.filesize; i++){
                fis.read(bytes);    //Skriv en stribe tilfældige char.
            }
        } catch(IOException ioe){
            System.out.println("Der skete en fejl: ioe " + ioe);
        } finally{
            try {
                fis.close();
            } catch(IOException io){
                System.out.println("Der skete en fejl: io " + io);
            }
        }
    }
}

import java.io.*;
import java.util.Random;

/**
 * Created by tomas on 10/29/15.
 */
public class Buffered {
    byte[] bytes = new byte[1024];

    public void write(){
        BufferedOutputStream bfos = null;
        Random rant = new Random();
        rant.nextBytes(bytes);

        try{
            bfos = new BufferedOutputStream(new FileOutputStream(Constants.filename));

            for(int i=0; i<Constants.filesize; i++){
                rant.nextBytes(bytes);
                for( int j=0; j<bytes.length; j++){
                    bfos.write(bytes[j]);    //Skriv en tilfældig char.
                }

            }
        } catch(IOException ioe){
            System.out.println("Der skete en fejl: ioe " + ioe);
        } finally{
            try {
                bfos.close();
            } catch(IOException io){
                System.out.println("Der skete en fejl: io " + io);
            }
        }
    }

    public void read(){
        BufferedInputStream bfis = null;

        try{
            bfis = new BufferedInputStream(new FileInputStream(Constants.filename));

            for(int i=0; i<Constants.filesize; i++){
                bfis.read(bytes);    //Skriv en tilfældig char.
            }
        } catch(IOException ioe){
            System.out.println("Der skete en fejl: ioe " + ioe);
        } finally{
            try {
                bfis.close();
            } catch(IOException io){
                System.out.println("Der skete en fejl: io " + io);
            }
        }
    }
}
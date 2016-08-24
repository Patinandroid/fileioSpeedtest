/**
 * Created by tomas on 10/29/15.
 */
public class RunClient {
	public static void main(String args[]){
		long startTime;

		UnBuffered ub = new UnBuffered();
		Buffered b = new Buffered();

        //Write
		startTime = System.currentTimeMillis();
		ub.write();
		System.out.println("Unbuffered write: " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		b.write();
		System.out.println("Buffered write:   " + (System.currentTimeMillis() - startTime) + "ms");

		//Read
		System.out.println();
		startTime = System.currentTimeMillis();
		ub.read();
		System.out.println("Unbuffered read:  " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		b.read();
		System.out.println("Buffered read:    " + (System.currentTimeMillis() - startTime) + "ms");

        }
}

package pruefungsvorbereitung;
import java.util.Arrays;
public class VCE2014ExamCQuestion044 {

	public static void main(String[] args) {
		Object [] myObjects2 = {
				(Object)new Integer(12),
				(Object)new Integer(13),
				(Object)new Integer(5),
				};
				Arrays.sort(myObjects2);

		Object [] myObjects1 = {
				(Object)new Integer(12),
				(Object)new String("foo"),
				(Object)new Integer(5),
				(Object)new Boolean(true)
				};
				Arrays.sort(myObjects1);
		
		Object [] myObjects = {
				new Integer(12),
				new String("foo"),
				new Integer(5),
				new Boolean(true)
				};
				Arrays.sort(myObjects);
				for(int i=0; i<myObjects.length; i++) {
				System.out.print(myObjects[i].toString());
				System.out.print(" ");
				}
	}

}

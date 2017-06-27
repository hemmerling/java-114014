package pruefungsvorbereitung;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class VCE2014ExamCQuestion073 {

	public static void main(String[] args) {
		HashMap props = new HashMap();
		props.put("key45", "some value");
		props.put("key12", "some other value");
		props.put("key39", "yet another value");
		Set s = props.keySet();
		
		//Arrays.sort(s);
		s = new TreeSet(s);
		//Collections.sort(s);
		//s = new SortedSet(s);
		System.out.println(Arrays.asList(s));
		
	}

}

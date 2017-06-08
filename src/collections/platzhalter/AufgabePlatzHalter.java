package collections.platzhalter;

import java.util.List;

public class AufgabePlatzHalter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AufgabePlatzHalter aufgabePlatzHalter = new AufgabePlatzHalter();
	
		List list = null;
		List<?> listUnknown = null;//? = ? extends Object
		List<Object> listObject = null;
		List<? super Object> listSuperObject = null;
		List<? extends Object> listExtendsObject = null;
		List<Inter> listInter = null;
		List<? super Inter> listSuperInter = null;
		List<? extends Inter> listExtendsInter = null;
		List<Base> listBase = null;
		List<? super Base> listSuperBase = null;
		List<? extends Base> listExtendsBase = null;
		List<Derived> listDerived = null;
		List<? super Derived> listSuperDerived = null;
		List<? extends Derived> listExtendsDerived = null;
		List<A> listA = null;
		List<? super A> listSuperA = null;
		List<? extends A> listExtendsA = null;
		List<C> listC = null;
		List<? super C> listSuperC = null;
		List<? extends C> listExtendsC = null;
		List<AD> listAD = null;
		List<? super AD> listSuperAD = null;
		List<? extends AD> listExtendsAD = null;
		List<ADD> listADD = null;
		List<? super ADD> listSuperADD = null;
		List<? extends ADD> listExtendsADD = null;

	    // was compiliert?
		
//		1.   listSuperA  = listSuperInter;
		listSuperA  = listSuperInter;
//		2.   listDerived = listSuperC;
		listDerived = listSuperC;
//		3.   listExtendsADD  = listADD;
		listExtendsADD  = listADD;
//		4.   listExtendsBase = listExtendsADD;
		listExtendsBase = listExtendsADD;
//		5.   listAD  = listBase;
		listAD  = listBase;
//		6.   listADD = listSuperA;
		listADD = listSuperA;
//		7.   listExtendsBase = listExtendsBase;
		listExtendsBase = listExtendsBase;
//		8.   listBase    = listExtendsADD;
		listBase    = listExtendsADD;
//		9.   listObject  = listExtendsDerived;
		listObject  = listExtendsDerived;
//		10. listSuperA  = listExtendsInter;
		listSuperA  = listExtendsInter;
//		11. listSuperObject = listAD;
		listSuperObject = listAD;
//		12. listSuperC = listExtendsAD;
		listSuperC = listExtendsAD;
//		13. listExtendsAD = listExtendsADD;
		listExtendsAD = listExtendsADD;
//		14. listDerived = listADD;
		listDerived = listADD;
//		15. listADD = listA;
		listADD = listA;
//		16. listBase = listA;
		listBase = listA;
//		17. listSuperBase = listInter;
		listSuperBase = listInter;
//		18. listSuperBase = listUnknown;
		listSuperBase = listUnknown;
//		19. listExtendsObject = listA;
		listExtendsObject = listA;
//		20. listExtendsC = listSuperC;
		listExtendsC = listSuperC;
//		21. listUnknown = listExtendsAD;
		listUnknown = listExtendsAD;
//		22. listSuperDerived = listA;
		listSuperDerived = listA;
//		23. listSuperDerived = listInter;
		listSuperDerived = listInter;
//		24. listDerived = listAD;
		listDerived = listAD;
//		25. listExtendsInter = listSuperBase;
		listExtendsInter = listSuperBase;
//		26. listExtendsBase = list;
		listExtendsBase = list;
//		27. listExtendsObject = listExtendsC;
		listExtendsObject = listExtendsC;
//		28. listAD = listObject;
		listAD = listObject;
//		29. listExtendsC = listUnknown;
		listExtendsC = listUnknown;
//		30. listSuperC = listA;
		listSuperC = listA;
//		31. listExtendsInter = listExtendsBase;
		listExtendsInter = listExtendsBase;
//		32. listExtendsObject = listSuperDerived;
		listExtendsObject = listSuperDerived;
//		33. listExtendsObject = listExtendsADD;
		listExtendsObject = listExtendsADD;
//		34. listSuperDerived = listExtendsC;
		listSuperDerived = listExtendsC;
//		35. listAD = listSuperObject;
		listAD = listSuperObject;
//		36. listSuperAD = listSuperDerived;
		listSuperAD = listSuperDerived;
//		37. listExtendsAD = listA;
		listExtendsAD = listA;
//		38. listUnknown = listSuperC;
		listUnknown = listSuperC;
//		39. listExtendsADD = listC;
		listExtendsADD = listC;
//		40. listAD = listSuperAD;
		listAD = listSuperAD;
//		41. listSuperBase = listExtendsAD;
		listSuperBase = listExtendsAD;
//		42. listC = listSuperA;
		listC = listSuperA;
//		43. listA = listInter;
		listA = listInter;
//		44. list = listSuperAD;
		list = listSuperAD;
//		45. listObject = listExtendsInter;
		listObject = listExtendsInter;
//		46. listSuperA = listSuperA;
		listSuperA = listSuperA;
//		47. listExtendsAD = listExtendsC;
		listExtendsAD = listExtendsC;
//		48. list = listADD;
		list = listADD;
//		49. listA = listDerived;
		listA = listDerived;
//		50. listUnknown = listSuperA;
		listUnknown = listSuperA;

	}

}

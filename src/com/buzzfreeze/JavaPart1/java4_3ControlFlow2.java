package com.buzzfreeze.JavaPart1;

public class java4_3ControlFlow2 {

	public static void main(String[] args) {
//		Lab 5
//		???ҧ????????Ѵ??ô??·??a.??ô A ??Ҥ?ṹ = 80b.??ô B ??Ҥ?ṹ = 70 c.??ô C ??Ҥ?ṹ = 60d.??ô D ??Ҥ?ṹ = 50 e.??ô F ??Ҥ?ṹ = 40f.??ô E ??Ҥ?ṹ??繤???????

		
		int grade = 20;
		switch (grade) {
		case 80:
			System.out.println("A");
			break;
		case 70:
			System.out.println("B");
			break;
		case 60:
			System.out.println("C");
			break;
		case 50:
			System.out.println("D");
			break;
		case 40:
			System.out.println("F");
			break;

		default:
			System.out.println("E");
		}
	}

}

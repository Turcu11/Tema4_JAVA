public class Main {

	public static void main(String[] args) {
		Carte c1 = new Carte(115);
		Carte c2 = new Carte(238);
		Carte c3 = new Carte(483);

//		if (c1.equals(c3)) {
//			System.out.println("Sunt la fel");
//		} else {
//			System.out.println("Nu sunt la fel");
//		}

		Patrat p1 = new Patrat(4.16);
		System.out.println(p1);

		int s1 = Suma.suma(2, 4);
		int s2 = Suma.suma(1, 7, 5);
		int s3 = Suma.suma(18, 2, 4, 2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

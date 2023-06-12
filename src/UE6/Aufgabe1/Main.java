package UE6.Aufgabe1;

public class Main {

	public static void main(String[] args) {
		SortierterIntBaum b = new SortierterIntBaum();
		System.out.println(b);

		b.add(5);;				// ( ()5() )
		System.out.println(b);	
		b.add(3);				// (( ()3() )5())
		System.out.println(b);
		b.add(2);				// (( ( ()2() )3() )5())
		b.add(4);				// (( ( ()2() )3( ()4() ) )5())
		b.add(7);;
		b.add(9);;
		System.out.println(b);
	}

}

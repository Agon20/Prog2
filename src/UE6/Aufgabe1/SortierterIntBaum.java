package UE6.Aufgabe1;// Klasse UE6.Aufgabe1.SortierterIntBaum
// - Binärbaum
// - für int
// - sortiert

public class SortierterIntBaum {
	Knoten root = null;
	class Knoten{
		int val;
		Knoten ltb, rtb = null;
		
		Knoten(int v){
			val = v;
		}
	}
	
	public void add(int v) {
		if(null == root) {
			root = new Knoten(v);
			return;
		}
		insert(v, root);		// rekusives Einfügen
	}

	private void insert(int v, Knoten k) {
		if(v == k.val) return;
		
		// fügt v unterhalb von k ein
		if(v < k.val) 
			insertLinks(v,k);
		else
			insertRechts(v,k);	
	}
	
	void insertLinks(int v, Knoten k) {
		if(null == k.ltb) 
			k.ltb = new Knoten(v);
		else 
			insert(v, k.ltb);
	}
	void insertRechts(int v, Knoten k) {
		if(null == k.rtb)
			k.rtb = new Knoten(v);
		else
			insert(v, k.rtb);
	}
	/*
	public boolean contains(int v) {
		return(containsIn(v, root));
	}
	boolean containsIn(int v, Knoten k) {
		if(null == k) return false;
		if(v == k.val) return true;
		if(v < k.val) {
			
		}
	}
	*/
	
	String toString(Knoten k) {
		String s = "(";
		if(null != k) {
			s += toString(k.ltb);
			s = s + k.val;
			s += toString(k.rtb);
		}
		s += ")";
		return s;
	}
	
	public String toString() {
		return toString(root);
	}
}

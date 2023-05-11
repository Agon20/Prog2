package UE2.Aufgabe6;

public class Paar<E,Z> {
    private E e;
    private Z z;

    public Paar(E e, Z z){
        this.e = e;
        this.z = z;
    }
    public E getErstes(){
        return this.e;
    }
    public Z getZweites(){
        return this.z;
    }
    public E setErstes(E e){
        E e2 = this.e;
        this.e = e;
        return e2;
    }
    public Z setZweites(Z z){
        Z z2 = this.z;
        this.z = z;
        return z2;
    }
    public void setBeides(E e, Z z){
        this.e = e;
        this.z = z;
    }
    public boolean equals(Paar<E,Z> p){
        E e2 = p.getErstes();
        Z z2 = p.getZweites();
        return this.e == e2 && this.z == z2;
    }
    public String toString() {
        return "(" + this.e.toString() + "," + this.z.toString() + ")";
    }
}

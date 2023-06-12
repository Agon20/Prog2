package UE3.Aufgabe1;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class EVL<T> {
    ListenEl first = null;
    ListenEl last = null;
    int size = 0;
    class ListenEl{
        T data;
        ListenEl next;

        ListenEl(T o){
            data = o;
            next = null;
        }
    }
    public void addFirst(T o) throws NullPointerException{
        if(o == null){throw new NullPointerException("Argument cannot be null");}
        ListenEl e = new ListenEl(o);
        if(null == first){first = e; last = e;}
        else{e.next = first; first = e;}
        size++;
    }
    public void addLast(T e) throws NullPointerException {
        if(e == null){throw new NullPointerException("Argument can not be null");}
        ListenEl f = new ListenEl(e);
        if(null == last){first = f; last = f;}
        else{
            ListenEl current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = f;
            last = f;
        }
        size++;
    }
    public T removeFirst() throws NoSuchElementException {
        if(null != first){
            T r = first.data;
            first = first.next;
            size--;
            if(size == 0){last = null;}
            return r;
        }
        throw new NoSuchElementException("Can't remove from empty List");
    }
    public T removeLast() throws NoSuchElementException {
        T r = null;
        if(null != last){
            r = last.data;
            if(first == last){first = null; last = null;}else{
                ListenEl current = first;
                while(current.next != last){
                    current = current.next;
                }
                current.next = null;
                last = current;
            }
            size--;
            return r;
        }
        throw new NoSuchElementException("Can't remove from empty l+ist");
    }
    public T getFirst() throws NoSuchElementException {
        if(null != first){
            return first.data;
        }
        throw new NoSuchElementException("Can't get first Object from empty List");
    }
    public T getLast() throws NoSuchElementException {
        if(null != last){
            return last.data;
        }
        throw new NoSuchElementException("Can't get last Object from empty List");
    }
    public boolean contains(T e) throws NoSuchElementException {
        if(first != null){
            ListenEl current = first;
            for(int i = 0; i < size; i++){
                System.out.println(current.data);
                if(e == current.data){
                    return true;
                }
                current = current.next;
            }
        }
        throw new NoSuchElementException("Can't find object from List");
    }
    public int size(){return size;}
    public String toString() throws NullPointerException {
        if(first == null){ throw new NullPointerException("Empty list, nothing to return...");}
        String ergebnis = "";
        if (first == last){
            ergebnis = (String) first.data;
        }else{
            ListenEl current = first;
            while (current != last){
                System.out.println(current.data);
                ergebnis += current.data + "-";
                current = current.next;
            }
            ergebnis += current.data ;
        }
        return ergebnis;
    }
    public void zip (EVL<T> other){
        EVL<T> zwischenablage = new EVL<>();
        int count = other.size() + this.size();
        for (int i = 0; i < count; i++){
            if (this.size() != 0){zwischenablage.addLast(this.removeFirst());}
            if (other.size() != 0){zwischenablage.addLast(other.removeFirst());}
        }
        for (int i = 0; i < count; i++){
            this.addLast(zwischenablage.removeFirst());
        }
    }
}

package UE3.Aufgabe5;

import java.util.NoSuchElementException;

public class RDVL<T> {
    ListenEl entry = null;
    int size = 0;
    class ListenEl{
        T data;
        ListenEl next;
        ListenEl before;

        ListenEl(T o){
            data = o;
            before = null;
            next = null;
        }
    }
    boolean isEmpty(){
        return size() == 0;
    }
    int size(){
        return size;
    }
    void add(T e){
        if(e == null){throw new NullPointerException("Argument cannot be null");}
        ListenEl o = new ListenEl(e);
        if(entry == null){entry = o; entry.next = o; entry.before = o;}
        else{
            entry.before.next = o;
            o.before = entry.before;
            entry.before = o;
            o.next = entry;
        }
        size++;
    }
    void remove(){
        if(entry == null){throw new NullPointerException("Can't remove from empty list");}
        if (entry.next == entry && entry.before == entry){
            entry = null;
        }else{
            entry.next.before = entry.before;
            entry = entry.next;
            entry.before.next = entry.next;
        }
        size--;
    }
    String element(){
        if(entry == null){throw new NullPointerException("Empty list, nothing to return.");}
        return entry.data.toString();
    }
    void next(int s){
        ListenEl current = entry;
        for (int i = 0; i < s; i++){
            current = current.next;
        }
        mover(current, s);
        size++;
    }
    void prev(int s){
        ListenEl current = entry;
        for (int i = 0; i < s; i++){
            current = current.before;
        }
        mover(current, s);
        size++;
    }
    private void mover(ListenEl current, int s){
        if(s != 0) {
            entry.next.before = entry.before;
            entry.before.next = entry.next;
            current.next.before = entry;
            entry.next = current.next;
            entry.before = current;
            current.next = entry;
        }
    }
}

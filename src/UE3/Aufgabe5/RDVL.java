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
        if(entry == null){entry = o;}
        else{
            if(entry.before != null){
                entry.before.next = o;
                o.before = entry.before;
            }else if(entry.next == null){
                entry.next = o;
                o.before = entry;
            }
            entry.before = o;
            o.next = entry;
        }
    }
    void remove(){
        if(entry == null){throw new NullPointerException("Can't remove from empty list")}
        else {
            entry.next.before = entry.before;
            entry.before.next = entry.next;
            entry = entry.next;
        }
    }
    String element(){
        if(entry == null){throw new NullPointerException("Empty list, nothing to return.");}
        return (String) entry.data;
    }
    void next(int s){
        ListenEl current = entry;
        for (int i = 0; i > s; i++){
            current = current.next;
        }
        if(s != 0) {
            entry.next.before = entry.before;
            entry.before.next = entry.next;
            current.next.before = entry;
            entry.next = current.next;
            entry.before = current;
            current.next = entry;
        }
    }
    void prev(int s){
        ListenEl current = entry;
        for (int i = 0; i > s; i++){
            current = current.before;
        }
        if(s != 0){
            entry.next.before = entry.before;
            entry.before.next = entry.next;
            current.next.before = entry;
            entry.next = current.next;
            entry.before = current;
            current.next = entry;
        }
    }
}

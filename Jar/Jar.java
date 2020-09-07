package Jar;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {

    private Deque<T> content;

    public Jar() {
        this.content = new ArrayDeque<>();
    }

    public void add( T vlado){
        this.content.push(vlado);
    }

    public T remove(){

        return this.content.pop();
    }
}

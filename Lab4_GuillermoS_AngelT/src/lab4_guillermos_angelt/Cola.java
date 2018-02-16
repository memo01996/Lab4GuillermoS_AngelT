package lab4_guillermos_angelt;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    LinkedList Cola = new LinkedList();
    private int size = 0;
    private Nodo head = null;

    public LinkedList getCola() {
        return Cola;
    }

    public void setCola(LinkedList Cola) {
        this.Cola = Cola;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    private void queue() {

    }

    private void Peek() {
        Cola.peek();
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    private void getsized() {
        Cola.size();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Lab6;

/**
 *
 * @author Gm
 */
public class Queue {
    private int[] elements;
    private int size;
    private int capacity;

    public Queue() {
        this.elements = new int[8];
        this.size = 0;
        this.capacity = 8;
    }

    public void enqueue(int v) {
        // check if size exceeds capacity.
        // if so double capacity.
        if (this.size == this.capacity) {
            this.capacity *= 2;

            int[] newArray = new int[this.capacity];

            // copy elements in array.
            for (int i = 0; i < this.size; ++i) {
                newArray[i] = this.elements[i];
            }

            this.elements = newArray;
        }

        this.elements[this.size] = v;

        this.size++;
    }

    public int dequeue() {
        // check if dequeue empty.
        if (this.empty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        int firstElement = this.elements[0];

        // shift elements to left by 1 element.
        for (int i = 1; i < this.size; ++i) {
            this.elements[i - 1] = this.elements[i];
        }

        this.size--;

        return firstElement;
    }

    public boolean empty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public int[] getElements() {
        return elements;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class ArrayStack<E> implements Stack<E> {

      // array to store the elements

      private E array[];

      private int size;

     public ArrayStack(int capacity) {

	             // if capacity is invalid, using default size of 20

	             if (capacity < 0) {

	                   array = (E[]) new Object[20];

	             } else {

	                   // otherwise initializing the array with specified capacity

	                   array = (E[]) new Object[capacity];

	             }

	             size = 0;

      }
      public E pop() {

            if (size == 0) {

                  return null;

            }
            E data = array[size - 1];

            size--;

            return data;

      }

      // returns the top element without removing

      public E top() {

            // returning null if empty

            if (size == 0) {

                  return null;

            }

            // returning top element

            return array[size - 1];

      }
      public void push(E element) {

            // returning if full

            if (size == array.length) {

                  return;

            }

            // adding element to index size

            array[size] = element;

            // incrementing size

            size++;

      }

      public boolean isEmpty() {

            return size == 0;

      }
      public int size() {

            return size;

      }
      public void reverse() {
            ArrayStack<E> temp = new ArrayStack<E>(this.array.length);

            while (!isEmpty()) {

                 temp.push(this.pop());
           }

            this.array = temp.array;
            this.size = temp.size;
     }
      public String toString() {

            String data = "[";

            for (int i = 0; i < size(); i++) {

                  data += array[i];

                  if (i != size() - 1) {

                        data = data + ", ";

                  }

            }

            data = data +  "] (top)";

            return data;

      }
      public static void main(String args[]){                    // confusing to create main class
                                                            // thank you


  }
}
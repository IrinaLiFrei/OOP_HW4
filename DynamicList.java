package OOP_HW4;

import java.util.Arrays;

public class DynamicList<T extends Comparable<T>>{
    
        private int length;
        private T[] array;


        public int getLength() {
            return length;
        }

        public DynamicList() {
        this.length = 0;
        this.array = (T[]) new Comparable[0];
        }

        public void add(T el) {
            if (this.length == this.array.length) {
                int newLength = this.length + 1; 
                T[] newArray= (T[]) new Comparable[newLength];
                for (int i = 0; i < this.length; i++) {
                    newArray[i] = this.array[i];
                }
                this.array = newArray;
            }
            this.array[this.length++] = el;
        }

        public void print () {
            for (int i = 0; i < length; i++) {
                System.out.print(this.array[i] + " ");
            }
            System.out.println();
        }

        public void removeByIndex(int num) {
            if (num < 0 || num >= length) {
                throw new IndexOutOfBoundsException();
            }
            for (int i = num + 1; i < this.length; i++) {
                this.array[i - 1] = this.array[i];
              }
              this.array = Arrays.copyOf(this.array, this.length - 1);
              length--;
            }

         public void removeByValue(T el) {
            int i, j;
            int count = 0;
            for (i = j = 0; j < array.length; ++j)
                if (!el.equals(array[j]))
                    array[i++] = array[j];
                    else
            count++;
            this.length -= count;
            array = Arrays.copyOf(array, length);
            }

        public T getMin() {
            if (length == 0) {
                System.out.println("No elements.");
            }
            T min = array[0];
            for (int i = 0; i < length; i++) {
                if (array[0] instanceof Number){
                    if ((Integer) array[i] < (Integer) min) {
                        min = array[i];
                    }
                }
                    else if (array[0] instanceof String) {
                        if (array[i].toString().length() < min.toString().length()){
                            min = array[i];
                        }
                    }
            }
        
            return min;
        }

        public T getMax() {
            if (length == 0) {
                System.out.println("No elements.");
            }
            T max = array[0];
            for (int i = 0; i < length; i++) {
                if (array[0] instanceof Number) {
                    if ((Integer) array[i] > (Integer) max) {
                        max = array[i];
                    }
                } else if (array[0] instanceof String) {
                    if (array[i].toString().length() > max.toString().length()) {
                        max = array[i];
                    }
                }
            }
            return max;
        }
    

        public void getSum() {
            if (length == 0) {
                System.out.println("No elements.");
            }
            if (array[0] instanceof Number){
                int sum = 0;
                for (int i = 0; i < length; i++) {
                    sum += (Integer) array[i];
                }
                System.out.println(sum);
            }
            else if (array[0] instanceof String){
                String sum = "";
            for (int i = 0; i < length; i++) {
                sum += (String) array[i]; 
            }
            System.out.println(sum);
            }
        }

        public void getProduct() {
            if (length == 0) {
                System.out.println("No elements.");
            }
            if (array[0] instanceof Number){
                int product = (Integer) array[0];
                for (int i = 1; i < this.length; i++) {
                    product *= (Integer) array[i];
                }
                System.out.println(product);
            } else {
            System.out.println("Product cannot be found.");
            }
        }

        public boolean isPresent(T value) {
            for (int i = 0; i < length; i++) {
                if (array[i].equals(value))
                    return true;
            }
            return false;
        }

        public void bubbleSort() {
            for (int i = 0; i < this.array.length; i++) {
                for (int j = 0; j < this.length - i - 1; j++) {
                    if (this.array[j].compareTo(this.array[j + 1]) > 0) {
                        T temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    
        public void insertSort() {
            for (int i = 1; i < length; i++) {
                T temp = array[i];
                int j = i - 1;
                while (j >= 0 && array[j].compareTo(temp) > 0) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = temp;
            }
        }
    
        public void selectSort() {
            for (int i = 0; i < length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (array[j].compareTo(array[minIndex]) < 0) {
                        minIndex = j;
                    }
                }
                T temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        public T getByIndex(int num) {
            if (num < 0 || num >= length) {
                throw new IndexOutOfBoundsException();
            }
            return this.array[num];
        }

        public void setByIndex(int num, T value) {
            if (num < 0 || num >= length) {
                throw new IndexOutOfBoundsException();
            }
            this.array[num] = value;
        }
    
}




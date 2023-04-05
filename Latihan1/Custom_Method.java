package Latihan1;

import java.util.Vector;

public class Custom_Method <E> extends Vector<E> {

        public Custom_Method() {
        }
        public E addItem(E item) {
            addElement(item);

            return item;
        }

        public E remove() {
            E       obj;
            int     len = size();

            obj = readtop();
            removeElementAt(len - 1);

            return obj;
        }


        public E readtop() {
            int     len = size();

            if (len == 0)
                System.out.println("Stack Kosong");
            return elementAt(len - 1);
        }


        public boolean unfilled() {
            return size() == 0;
        }


        public  int searchItem(Object o) {
            int i = lastIndexOf(o);

            if (i >= 0) {
                return size() - i;
            }
            return -1;
        }

    }


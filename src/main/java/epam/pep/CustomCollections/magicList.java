package epam.pep.CustomCollections;

import java.util.*;

class magicList<T> extends AbstractList<T> implements List<T> {

    private final T[] a;
    private int sizeOfList;

    magicList(T[] array) throws sizeLessThanExpectedException {
        if(array.length < 10){
            throw new sizeLessThanExpectedException("Size less than expected. Minimum size is 10.");
        }
        a = array;
        sizeOfList = array.length;
    }

    public T get(int index) {
        return a[index];
    }

    public T set(int index, T element) {
        T oldValue = a[index];
        a[index] = element;
        return oldValue;
    }

    public int size() {
        return a.length;
    }

    public T remove(int removalIndex) {
        T removedElement = a[removalIndex];
            for(int index = removalIndex; index < sizeOfList - 1; index ++){
                a[index] = a[index + 1];
        }
            sizeOfList -= 1;
            return removedElement;
    }
/*
 * Methods to try to ass the appending function to magicList
 */
    /*
    public void append(T element){
        T resultantArray[];
        T[] elementArray = new T[1];
        elementArray[0] = element;
        System.arraycopy(a, 0, resultantArray, 0, sizeOfList);
        System.arraycopy(element, 0, resultantArray, sizeOfList, 1);
        sizeOfList += 1;
        a = resultantArray;
        }
    */
    
    public boolean add(T element) {
    	return super.add(element);
    }

    public String print(){
    	String message = "";
        for(int index = 0; index < sizeOfList; index ++){
            //System.out.println(a[index]);
        	message += a[index];
        }
        return message;
        }    
}
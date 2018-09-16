package week12.hashset;

import week07.Task_LinkedList.LinkedListOwn;
import week08.hashmap.HashMapOwn;

import java.util.*;

public class HashSetOwn<E> implements Set<E> {

    private HashMapOwn<E, Object> map;
    private static final Object PRESENT = new Object();

    public HashSetOwn() {
        map = new HashMapOwn<>();
    }

    public HashSetOwn(Collection<? extends E> c) {
        int minCapacityForCollection = c.size() * 3 / 4 + 1;
        map = minCapacityForCollection >= 17 ? new HashMapOwn<>(minCapacityForCollection) : new HashMapOwn<>(17);
        addAll(c);
    }

    public HashSetOwn(int initialCapacity, float loadFactor) {
        map = new HashMapOwn<>(initialCapacity, loadFactor);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keyIterator();
        //throw new UnsupportedOperationException("This operation is not supported now...");
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean add(E e) {
        //Если элемент добавлен на пустое место или вместо др элемента (разница только по самим эл-м, которые и есть ключи)
        //, вернуть true (map.put(e,PRESENT) != null).
        //Если же элемент уже присутствует , вернуть false (map.put(e,PRESENT) == null).
        return map.put(e, PRESENT) == null;
    }

    @Override
    public boolean remove(Object o) {
        //Если элемент найден и удален, map.remove(o) возвращает V по сигнатуре метода, в нашем случае это всегда PRESENT -- Возвращаем true
        //Если же элемент в коллекции отсутствует (возвращен null), вернуть false (map.put(e,PRESENT) != PRESENT).
        return map.remove(o) == PRESENT;
    }

    @Override
    public void clear() {
        map.clear();
    }


    @Override
    public Object[] toArray() {//DO with Iterator<E> of this collection
        Object[] array = new Object[this.size()];
        int index = 0;
        for (E elem: this) {
            array[index++] = elem;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {//DO with Iterator<E> of this collection
        if (a.length <= size()) {
            return (T[]) toArray();
        }
        T[] result = a;
        result[size()] = null;
        int i = 0;
        for (E elem: this)
            result[i++] = (T) elem;
        return result;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object elem : c) {
            if (!this.contains(elem)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E elem : c) {
            if (!this.contains(elem)) {
                this.add(elem);
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        List listOfRetainElements = new LinkedListOwn();
        int initSize = this.size();
        for (Object elem : c) {
            if (this.contains(elem)) {
                listOfRetainElements.add(elem);
            }
        }
        this.clear();
        this.addAll(listOfRetainElements);
        return initSize != 0;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object elem : c) {
            if (this.contains(elem)) {
                this.remove(elem);
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (E elem: this) {
            result.append(result.length() == 0 ? "" : ", ");
            result.append(elem.toString());
        }
        return "[" + result.toString() + "]";
        //return Arrays.toString(this.toArray());
    }
}

package week08.hashmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class HashMapOwn<K, V> implements Map<K, V> {

    private static final int DEFAULT_CAPACITY = 17;

    public HashMapOwn() {
        this(DEFAULT_CAPACITY);
    }

    private HashMapOwn(int capacity) {
        array = new Object[capacity];
    }

    private Object[] array;
    private int size = 0;

    // private int MAXIMUM_CAPACITY = 1073741824;
    // private float DEFAULT_LOAD_FACTOR = 0.75f;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        //for (int index = key.hashCode() % array.length; array[key.hashCode() % array.length] != null; index++){
        if (array[key.hashCode() % array.length] != null) {
            return true;
        }
        //}
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int index = 0; index < array.length; index++) {
            if (array[index].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }//TODO

    @Override
    public V put(K key, V value) {
        return null;
    }//TODO

    @Override
    public V remove(Object key) {
        return null;
    }//TODO

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() { //TODO

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public final String toString() {
        return "";
    }
}

package week08.hashmap;

import java.util.*;

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
        int index = 0;
        if (key != null) {
            index = key.hashCode() % array.length;
        }
        if (array[index] != null) {
            List<Node<K, V>> nodeList = (List) array[index];
            for (Node<K, V> node : nodeList) {
                if (key == null && node.key == null || key.equals(node.key)) {
                    return node.value;
                }
            }
        }
        return null;
    }//TODO

    @Override
    public V put(K key, V value) {
        //1) Создать эл-т Node<K,V> c ключом и значением
        Node<K, V> newNode;
        //2) Найти индекс ячейки для помещения Node
        int index = 0;
        if (key == null) {
            newNode = new Node(0, key, value, null);
        } else {
            newNode = new Node(key.hashCode(), key, value, null);
            index = key.hashCode() % array.length;
        }
        //2.1) Если ячейка пуста, Создать новый связный список,
        if (array[index] == null) {
            List nodeList = new LinkedList();
            //2.1.1) Поместить список в ячейку с найденным индексом
            array[index] = nodeList;
            //2.1.2) Поместить эл-т Node в связный список
            nodeList.add(newNode);
            //2.2) Если ячейка не пуста,
        } else {
            //2.2.1) если оба Key==null или совпадают Key, заменить в эл-те Node с ключом key значение value на переданное в метод значение value
            List<Node<K, V>> nodeList = (LinkedList) array[index];
            for (Node<K, V> node : nodeList) {
                if (key == null && node.key == null || key.equals(node.key)) {
                    V oldValue = node.value;
                    node.value = value;
                    return oldValue;
                }
            }
            //2.2.2) если не совпадают Key, добавить эл-т Node в имеющийся связный список,
            nodeList.add(newNode);
        }
        //3) Увеличить счетчик записей
        size++;
        return null;
    }//TODO


    @Override
    public V remove(Object key) {
        int index = 0;
        if (key != null) {
            index = key.hashCode() % array.length;
        }
        if (array[index] != null) {
            List<Node<K, V>> nodeList = (List) array[index];
            for (Node<K, V> node : nodeList) {
                if (key == null && node.key == null || key.equals(node.key)) {
                    V oldValue = node.value;
                    nodeList.remove(node);
                    size--;
                    return oldValue;
                }
            }
        }
        return null;
    }//TODO

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() { //TODO
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
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
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != null) {
                for (Node<K, V> node : (List<Node<K, V>>) array[i]) {
//                    if (node != null) {
                    result.append(result.length() == 0 ? "" : ", ");
                    result.append(node.toString());
//                    }
                }
            }
        }
        return "{" + result.toString() + "}";
    }

    static class Node<K, V> implements Map.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;
        Node<K, V> first;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey() {
            return key;
        }

        public final V getValue() {
            return value;
        }

        public final String toString() {
            return key + "=" + value;
        }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Map.Entry) {
                Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
                if (Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue()))
                    return true;
            }
            return false;
        }
    }
}

package week07.Task_LinkedList;

import java.util.*;

/**
 * Implement your own LinkedListOwn (should implement List<E>), so that it would be testable with the unit
 * and performance tests from the previous task.
 */

public class LinkedListOwn<E> implements List<E>, Queue<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Node current = first; current != null; current = current.next) {
            if (current.item.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (Node current = first; current != null; current = current.next) {
            array[i++] = current.item;
        }
        return array;
    }

    @Override
    public Iterator<E> iterator() {//TODO
        return new Iterator<E>() {
            private int elementIndex = 0;
            private Node<E> currentNode = first;

            public boolean hasNext() {
                if (currentNode == null) {
                    return false;
                }
                return currentNode.next != null;
            }

            public E next() {
                if (elementIndex != 0) {
                    currentNode = currentNode.next;
                }
                elementIndex++;

                return currentNode.item;
            }

            public void remove() {
                if (currentNode == null) {
                    throw new IllegalStateException("");
                }
                if (currentNode == first && first == last) {
                    first = null;
                    last = null;
                } else if (currentNode == first) {
                    currentNode = first.next;
                    currentNode.prev = null;
                    first = currentNode;
                } else if (currentNode == last) {
                    currentNode = last.prev;
                    currentNode.next = null;
                    last = currentNode;
                } else {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                    currentNode = currentNode.next;
                }
                size--;
            }

            /*                if (currentNode == null) {
                    throw new IllegalStateException("");
                }
                if (currentNode == first && first == last) {
                    first = null;
                    last = null;
                    elementIndex = 0;
                } else if (currentNode == last) {
                    currentNode = last.prev;
                    currentNode.next = null;
                    last = currentNode;
                    elementIndex--;
                } else if (currentNode == first) {
                    currentNode.next.prev = null;
                    first = currentNode.next;
                    elementIndex = 0;
                } else {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                    currentNode = currentNode.next;
                    elementIndex--;
                }
                size--;*/
        };
    }

    @Override
    public <T> T[] toArray(T[] a) {//TODO optional
        if (a.length <= size) {
            return (T[]) toArray();
        }
        T[] result = a;
        result[size] = null;
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = (T) x.item;
        return result;
    }

    @Override
    public boolean add(E e) {
        Node<E> node = new Node<>();
        node.item = e;
        if (size == 0) {
            first = node;
        } else {
            last.next = node;
            node.prev = last;
        }
        size++;
        last = node;
        return true;
    }

    @Override
    public boolean offer(E e) {
        this.add(e);
        return true;
    }

    @Override
    public E remove() {
        E old = this.get(0);
        this.remove(0);
        return old;
    }

    @Override
    public E poll() {
        if (this.size() == 0) {
            return null;
        }
        E old = this.get(0);
        this.remove(this.peek());
        return old;
    }

    @Override
    public E element() {
        return this.get(0);
    }

    @Override
    public E peek() {
        if (this.size() == 0) {
            return null;
        }
        return this.get(0);
    }

    @Override
    public boolean remove(Object o) {
        for (Node current = first; current != null; current = current.next) {
            if (current.item.equals(o)) {
                if (first == last) {
                    first = null;
                    last = null;
                } else if (current == first) {
                    first.next.prev = null;
                    first = first.next;
                } else if (current == last) {
                    last.prev.next = null;
                    last = last.prev;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Set set = new HashSet();
        for (Node current = first; current != null; current = current.next) {
            set.add(current.item);
        }
        for (Object o : c) {
            if (!set.contains(o)) return false;
        }
        return true;
//        List listOddSmall = new ArrayList();
//        List listEvenSmall = new ArrayList();
//        List listOddBig = new ArrayList();
//        List listEvenBig = new ArrayList();
//        for (Node current = first; current != null; current = current.next) {
//            if ((Integer) current.item % 2 > 0 && (Integer) current.item < 1_250_000_000) {
//                listOddSmall.add(current.item);
//            } else if ((Integer) current.item % 2 > 0) {
//                listOddBig.add(current.item);
//            } else if ((Integer) current.item < 1_250_000_000) {
//                listEvenSmall.add(current.item);
//            } else {
//                listEvenBig.add(current.item);
//            }
//        }
//        for (Object element : c) {
//            if ((Integer) element % 2 > 0 && (Integer) element < 1_250_000_000) {
//                if (!listOddSmall.contains(element)) {
//                    return false;
//                }
//            } else if ((Integer) element % 2 > 0) {
//                if (!listOddBig.contains(element)) {
//                    return false;
//                }
//            } else if ((Integer) element < 1_250_000_000) {
//                if (!listEvenSmall.contains(element)) {
//                    return false;
//                }
//            } else if (!listEvenBig.contains(element)) {
//                return false;
//            }
//        }
//        return true;
    }


    @Override
    public boolean addAll(Collection<? extends E> c) {//TODO
        for (E elem : c) {
            this.add(elem);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {//TODO
        for (Object elem : c) {
            this.remove(elem);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Oops");
    }


    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Oops");
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new UnsupportedOperationException("Incorrect index of the search element");
        }
        if (index == 0) {
            return first.item;
        }
        if (index == size - 1) {
            return last.item;
        }
        int i = 0;
        Node current = first;
        while (current != null) {
            if (i == index) {
                return (E) current.item;
            } else {
                i++;
                current = current.next;
            }
        }
        return null;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index > size - 1) {
            throw new UnsupportedOperationException("Incorrect index of the search element");
        }
        if (index == 0) {
            E old = first.item;
            first.item = element;
            return old;
        }
        if (index == size - 1) {
            E old = last.item;
            last.item = element;
            return old;
        }
        int i = 0;
        Node current = first;
        while (current != null) {
            if (i == index) {
                E old = (E) current.item;
                current.item = element;
                return old;
            } else {
                i++;
                current = current.next;
            }
        }
        return null;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new UnsupportedOperationException("Incorrect index of the element being added");
        }
        if (size == 0) {
            Node<E> newNode = new Node<>();
            newNode.item = element;
            last = newNode;
            first = newNode;
            size++;
            return;
        }
        if (index == 0) {
            Node<E> newNode = new Node<>();
            newNode.item = element;
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
            size++;
            return;
        }
        if (index == size) {
            Node<E> newNode = new Node<>();
            newNode.item = element;
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
            size++;
            return;
        }
        int i = 0;
        for (Node current = first; current != null; current = current.next) {
            if (i == index) {
                Node<E> newNode = new Node<>();
                newNode.item = element;
                current.prev.next = newNode;
                newNode.prev = current.prev;
                current.prev = newNode;
                newNode.next = current;
                size++;
                return;
            } else {
                i++;
            }
        }
        return;
    }

    @Override
    public E remove(int index) {
        int i = 0;
        for (Node current = first; current != null; current = current.next) {
            if (i == index) {
                E old = (E) current.item;

                if (current == first) {
                    if (current.next != null) {
                        first = current.next;
                        first.prev = null;
                    } else {
                        first = null;
                        last = null;
                    }
                } else if (current == last) {
                    last = current.prev;
                    last.next = null;
                } else {
                    current.next.prev = current.prev;
                    current.prev.next = current.next;
                }

/*                if (current.prev != null) {

                } else if (current.next != null) {
                    first = current.next;
                    current = first;
                    current.prev = null;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    first = null;
                    last = null;
                }*/
                size--;
                return old;
            }
            i++;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int i = 0;
        for (Node current = first; current != null; current = current.next) {
            if (current.item.equals(o)) {
                return i;
            } else {
                i++;
            }
        }
        throw new UnsupportedOperationException("This element not live in this LinkedListOwn");
    }

    @Override
    public int lastIndexOf(Object o) {
        int i = size - 1;
        for (Node current = last; current != null; current = current.prev) {
            if (current.item.equals(o)) {
                return i;
            } else {
                i--;
            }
        }
        throw new UnsupportedOperationException("This element not live in this LinkedListOwn");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Oops");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Oops");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Oops");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Node current = first; current != null; current = current.next) {
            result.append(result.length() == 0 ? "" : ", ");
            result.append(current.item);
        }
        return "[" + result.toString() + "]";
    }

    protected static class Node<E> {
        private E item;
        private Node<E> next;
        private Node<E> prev;
    }
}
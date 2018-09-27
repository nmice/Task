package week12.binarysearchtree;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

public class BinarySearchTreeOwn<E> implements Set<E> {

    private static class BSTOComparator<E extends Comparable> implements Comparator<E> {
        @Override
        public int compare(E o1, E o2) {
            return o1.compareTo(o2);
        }
    }

    private static final int DEFAULT_CAPACITY = 16;
    private Comparator<? super E> bstoComparator = new BSTOComparator();

    public BinarySearchTreeOwn() {
        this(DEFAULT_CAPACITY, null);
    }

    public BinarySearchTreeOwn(int capacity) {
        this(capacity, null);
    }

    public BinarySearchTreeOwn(Comparator comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public BinarySearchTreeOwn(int capacity, Comparator comparator) {
        if (capacity < 1) {
            throw new IllegalArgumentException();
        }
        if (comparator != null) {
            this.bstoComparator = comparator;
        }
        array = new Object[capacity];
    }

    private Object[] array;
    private int size = 0;
    private Node<E> root;

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
        if (size == 0) {
            return false;
        }
        E e = (E) o;
        return getMatchingNode(e, root) != null;
    }

    private Node<E> getMatchingNode(E e, Node<E> node) {
        if (bstoComparator.compare(e, node.item) == 0) {
            return node;
        }
        if (bstoComparator.compare(e, node.item) < 0) {
            if (node.leftBranch != null) {
                return getMatchingNode(e, node.leftBranch);
            }
        }
        if (bstoComparator.compare(e, node.item) > 0) {
            if (node.rightBranch != null) {
                return getMatchingNode(e, node.rightBranch);
            }
        }
        return null;
    }

    @Override
    public boolean add(Object o) {
        E e = (E) o;
        if (size == 0) {
            root = new Node<>();
            root.item = e;
            size++;
            return true;
        }
        if (bstoComparator.compare(e, root.item) == 0) {
            return false;
        }
        return addChild(e, root) != null;
    }

    private Node<E> addChild(E e, Node<E> node) {
        if (bstoComparator.compare(e, node.item) == 0) {
            return null;
        } else if (bstoComparator.compare(e, node.item) < 0) {
            if (node.leftBranch != null) {
                addChild(e, node.leftBranch);
                return node;
            } else {
                Node<E> leftChild = new Node<>();
                node.leftBranch = leftChild;
                leftChild.item = e;
                leftChild.parent = node;
            }
        } else {
            if (node.rightBranch != null) {
                addChild(e, node.rightBranch);
                return node;
            } else {
                Node<E> rightChild = new Node<>();
                node.rightBranch = rightChild;
                rightChild.item = e;
                rightChild.parent = node;
            }
        }
        size++;
        return node;
    }

    @Override
    public boolean remove(Object o) {
        E e = (E) o;
        if (o == null) {
            return false;
        }
        if (size == 0) {
            return false;
        }
        if (bstoComparator.compare(e, root.item) == 0) {
            if (size == 1) {
                root = null;
                size--;
                return true;
            }
            if (root.leftBranch == null) {
                root = root.rightBranch;
                root.parent = null;
                size--;
                return true;
            }
            if (root.rightBranch == null) {
                root = root.leftBranch;
                root.parent = null;
                size--;
                return true;
            }
            Node<E> replacementNode = getLeftmostNode(root.rightBranch);
            root.item = replacementNode.item;
            remove(replacementNode);
            return true;
        }
        Node<E> nodeToBeRemove = getMatchingNode(e, root);
        if (nodeToBeRemove == null) {
            return false;
        }
        if (nodeToBeRemove.leftBranch == null && nodeToBeRemove.rightBranch == null) {
            if (bstoComparator.compare(nodeToBeRemove.item, nodeToBeRemove.parent.item) < 0) {
                nodeToBeRemove.parent.leftBranch = null;
            } else {
                nodeToBeRemove.parent.rightBranch = null;
            }
            size--;
            return true;
        }
        if (nodeToBeRemove.leftBranch == null) {
            if (bstoComparator.compare(nodeToBeRemove.item, nodeToBeRemove.parent.item) < 0) {
                nodeToBeRemove.parent.leftBranch = nodeToBeRemove.rightBranch;
                nodeToBeRemove.rightBranch.parent = nodeToBeRemove.parent;
            } else {
                nodeToBeRemove.parent.rightBranch = nodeToBeRemove.rightBranch;
                nodeToBeRemove.rightBranch.parent = nodeToBeRemove.parent;
            }
            size--;
            return true;
        }
        if (nodeToBeRemove.rightBranch == null) {
            if (bstoComparator.compare(nodeToBeRemove.item, nodeToBeRemove.parent.item) < 0) {
                nodeToBeRemove.parent.leftBranch = nodeToBeRemove.leftBranch;
                nodeToBeRemove.leftBranch.parent = nodeToBeRemove.parent;
            } else {
                nodeToBeRemove.parent.rightBranch = nodeToBeRemove.leftBranch;
                nodeToBeRemove.leftBranch.parent = nodeToBeRemove.parent;
            }
            size--;
            return true;
        }
        Node<E> replacementNode = getLeftmostNode(nodeToBeRemove.rightBranch);
        nodeToBeRemove.item = replacementNode.item;
        remove(replacementNode);
        return true;
    }

    private Node<E> getLeftmostNode(Node<E> node) {
        node = node.leftBranch == null ? node : getLeftmostNode(node.leftBranch);
        return node;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int index = 0;
        for (E elem : this) {
            result[index++] = elem;
        }
        return result;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        root = null;
        return;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {

        return new Object[0];
    }

    private class MyIterator implements Iterator {

        private int indexOfNode = 0;
        private Node<E> currentNode = root != null ? getLeftmostNode(root) : null;

        private MyIterator() {
        }

        private Node<E> getFirstBiggerParent(Node<E> node) {
            return bstoComparator.compare(node.parent.item, currentNode.item) > 0 ? node.parent : getFirstBiggerParent(node.parent);
        }

        public boolean hasNext() {
            return size > indexOfNode;
        }

        public E next() {
            if (indexOfNode == 0) {
                indexOfNode++;
                return currentNode.item;
            } else if (currentNode.rightBranch != null) {
                currentNode = getLeftmostNode(currentNode.rightBranch);
                indexOfNode++;
                return currentNode.item;
            } else {
                if (bstoComparator.compare(currentNode.item, currentNode.parent.item) < 0) {
                    currentNode = currentNode.parent;
                    indexOfNode++;
                    return currentNode.item;
                } else {
                    currentNode = getFirstBiggerParent(currentNode);
                    indexOfNode++;
                    return currentNode.item;
                }
            }
        }
    }

    public Iterator<E> iterator() {
        return new MyIterator();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (E elem : this) {
            result.append(result.length() == 0 ? "" : ", ");
            result.append(elem.toString());
        }
        return "[" + result.toString() + "]";
    }

    protected static class Node<E> {
        private Node<E> parent;
        private E item;
        private Node<E> rightBranch;
        private Node<E> leftBranch;
    }
}

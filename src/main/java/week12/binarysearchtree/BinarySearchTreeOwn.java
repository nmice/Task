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
        if (contains(o)) {
            return false;
        }
        E e = (E) o;
        if (size == 0) {
            root = new Node<>();
            root.item = e;
            size++;
            return true;
        }
        addChild(e, root);
        return true;
    }

    private void addChild(E e, Node<E> node) {
        if (bstoComparator.compare(e, node.item) < 0) {
            if (node.leftBranch != null) {
                addChild(e, node.leftBranch);
                return;
            } else {
                Node<E> leftChild = new Node<>();
                node.leftBranch = leftChild;
                leftChild.item = e;
                leftChild.parrent = node;
            }
        } else {
            if (node.rightBranch != null) {
                addChild(e, node.rightBranch);
                return;
            } else {
                Node<E> rightChild = new Node<>();
                node.rightBranch = rightChild;
                rightChild.item = e;
                rightChild.parrent = node;
            }
        }
        size++;
        return;
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
        if (size == 1 && bstoComparator.compare(e, root.item) == 0) {
            root = null;
            size--;
            return true;
        }
        Node<E> nodeToBeRemove = getMatchingNode(e, root);
        if (nodeToBeRemove == null) {
            return false;
        }
        if (nodeToBeRemove.leftBranch == null && nodeToBeRemove.rightBranch == null) {
            if (bstoComparator.compare(nodeToBeRemove.item, nodeToBeRemove.parrent.item) < 0) {
                nodeToBeRemove.parrent.leftBranch = null;
            } else {
                nodeToBeRemove.parrent.rightBranch = null;
            }
            nodeToBeRemove = null;
            return true;
        }
        if (nodeToBeRemove.leftBranch == null) {
            if (bstoComparator.compare(nodeToBeRemove.item, nodeToBeRemove.parrent.item) < 0) {
                nodeToBeRemove.parrent.leftBranch = nodeToBeRemove.rightBranch;
                nodeToBeRemove.rightBranch.parrent = nodeToBeRemove.parrent;
            } else {
                nodeToBeRemove.parrent.rightBranch = nodeToBeRemove.rightBranch;
                nodeToBeRemove.rightBranch.parrent = nodeToBeRemove.parrent;
            }
            nodeToBeRemove = null;
            return true;
        }
        if (nodeToBeRemove.rightBranch == null) {
            if (bstoComparator.compare(nodeToBeRemove.item, nodeToBeRemove.parrent.item) < 0) {
                nodeToBeRemove.parrent.leftBranch = nodeToBeRemove.leftBranch;
                nodeToBeRemove.leftBranch.parrent = nodeToBeRemove.parrent;
            } else {
                nodeToBeRemove.parrent.rightBranch = nodeToBeRemove.leftBranch;
                nodeToBeRemove.leftBranch.parrent = nodeToBeRemove.parrent;
            }
            nodeToBeRemove = null;
            return true;
        }



        //if (bstoComparator.compare(e, root.item) == 0)
/*        if (bstoComparator.compare(e, node.item) == 0) {
            return true;
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
        }*/

        return true;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        root = null;
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
        private Node<E> currentNode = root;

        private MyIterator() {
        }

        private boolean checkLeftBranch(Node<E> node) {
            if (node.leftBranch != null) {
                checkLeftBranch(node.leftBranch);
            } else {
                currentNode = node;
                indexOfNode++;
                return true;
            }
            return false;
        }

        public boolean hasNext() {
            if (currentNode == null) {
                return false;
            }
            if (indexOfNode == size() - 1) {
                return false;
            }

            if (currentNode.leftBranch != null) {
                currentNode = currentNode.leftBranch;
                indexOfNode++;
                return true;
            }

/*            if (bstoComparator.compare(e, node.item) == 0) {
                return true;
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
            return false;*/

/*            if (currentNode.leftBranch != null) {
                currentNode = currentNode.leftBranch;
                indexOfNode++;
                return true;
            }
            if (currentNode.parrent != null) {
                currentNode = currentNode.parrent;
                indexOfNode++;
                return true;
            }
            if (currentNode.rightBranch != null) {
                currentNode = currentNode.rightBranch;
                indexOfNode++;
                return true;
            }*/
            return false;
        }

        public E next() {
            indexOfNode++;
            if (currentNode.leftBranch != null) {
                return currentNode.leftBranch.item;
            }
            if (currentNode.rightBranch != null) {
                return currentNode.rightBranch.item;
            }
            return null;
        }
    }

    public Iterator<E> iterator() {
        return new MyIterator();
    }

    protected static class Node<E> {
        private Node<E> parrent;
        private E item;
        private Node<E> rightBranch;
        private Node<E> leftBranch;
    }
}

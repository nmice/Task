package week04.TaskG01_06_CustomListImpl_part1;

    public interface CustomBeautyList<E> {
        int add(E e);
        void add(int i, E e);
        E get(int i);
        E remove(int i);
        int remove(E e);
        int size();
        int indexOf(E e);
        boolean contains(E e);
        void set(int i, E e);
    }


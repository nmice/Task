package week04.TaskG01_06_CustomListImpl_part1;

public class CustomList implements CustomBeautyList{
    int add(E e);
    void add(int i, E e);

    @Override
    public int add(Object o) {
        return 0;
    }

    @Override
    public void add(int i, Object o) {

    }

    E get(int i);
    E remove(int i);

    @Override
    public int remove(Object o) {
        return 0;
    }

    int remove(E e);
    int size();

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void set(int i, Object o) {

    }

    int indexOf(E e);
    boolean contains(E e);
    void set(int i, E e);


}

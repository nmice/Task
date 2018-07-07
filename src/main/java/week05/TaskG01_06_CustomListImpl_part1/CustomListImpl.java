package week05.TaskG01_06_CustomListImpl_part1;

import java.util.ArrayList;
import java.util.List;

public class CustomListImpl implements CustomBeautyList {

    private List list = new ArrayList();

    @Override
    public boolean add(Object o) {
        return list.add(o);
    }

    @Override
    public void add(int i, Object o) {
        return;
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }

    @Override
    public Object remove(int i) {
        throw new UnsupportedOperationException("The operation is not supported yet");
    }

    @Override
    public int remove(Object o) {
        throw new UnsupportedOperationException("The operation is not supported yet");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("The operation is not supported yet");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("The operation is not supported yet");
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("The operation is not supported yet");
    }

    @Override
    public void set(int i, Object o) {
        throw new UnsupportedOperationException("The operation is not supported yet");
    }
}
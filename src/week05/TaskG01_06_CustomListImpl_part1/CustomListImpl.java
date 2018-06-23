package week05.TaskG01_06_CustomListImpl_part1;

public class CustomListImpl implements CustomBeautyList {

    public static void main(String[] args) {
        CustomBeautyList customList = new CustomListImpl();
        try {
            customList.add(null);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("The error is handled");
        }
    }

    @Override
    public int add(Object o) {
        throw new UnsupportedOperationException("The operation is not supported yet");
    }

    @Override
    public void add(int i, Object o) {
        throw new UnsupportedOperationException("The operation is not supported yet");
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("The operation is not supported yet");
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
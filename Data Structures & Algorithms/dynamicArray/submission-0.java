class DynamicArray {
    int[] array;
    int i;

    public DynamicArray(int capacity) {
        array = new int[capacity];
        i = 0;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (i + 1 == array.length + 1) {
            resize();
        }
        array[i] = n;
        i++;
    }

    public int popback() {
        return array[--i];
    }

    private void resize() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, i);
        array = newArray;
    }

    public int getSize() {
        return i;
    }

    public int getCapacity() {
        return array.length;
    }
}

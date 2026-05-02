class DynamicArray {

    int[] newArray;
    int capacity;
    int size=0;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        newArray = new int[capacity];
    }

    public int get(int i) {
        return newArray[i];
    }

    public void set(int i, int n) {
        newArray[i] = n;
    }

    public void pushback(int n) {
        if (size == newArray.length) {
            resize();
        }
            newArray[size] = n;
            size++;
        
    }

    public int popback() {
        int popValue = newArray[size-1];
        size--;
        return popValue;
    }

    private void resize() {
        capacity = capacity*2;
        int[] doubleArray = new int[capacity];

        for (int i=0; i<newArray.length; i++) {
            doubleArray[i] = newArray[i];
        }
        newArray = doubleArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}

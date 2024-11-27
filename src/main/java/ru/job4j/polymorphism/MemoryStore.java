package ru.job4j.polymorphism;

public class MemoryStore implements Store {
    private String[] memotyStore = new String[100];
    private int size = 0;

    @Override
    public void save(String data) {
        memotyStore[size++] = data;
    }

    @Override
    public String read() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < size; i++) {
            buffer.append(memotyStore[i]);
        }
        return buffer.toString();
    }
}

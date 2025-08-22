package Practice;

import java.util.LinkedList;

class Entry {
    String key;
    int value;

    Entry(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

class SimpleHashMap {
    private LinkedList<Entry>[] buckets;
    private static final int SIZE = 5; // Small size to force collisions

    @SuppressWarnings("unchecked")
    public SimpleHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Simple hash function by modulo bucket size
    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(String key, int value) {
        int index = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing key
                return;
            }
        }

        // Not found, add new entry (collision handled by chaining in the linked list)
        bucket.add(new Entry(key, value));
    }

    public Integer get(String key) {
        int index = getBucketIndex(key);
        LinkedList<Entry> bucket = buckets[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        SimpleHashMap map = new SimpleHashMap();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Elppa", 50); // Likely to cause collision with "Apple"

        System.out.println("Value for Apple: " + map.get("Apple"));
        System.out.println("Value for Banana: " + map.get("Banana"));
        System.out.println("Value for Elppa: " + map.get("Elppa"));
    }
}


import java.util.LinkedList;
/*
 * @lc app=leetcode.cn id=706 lang=java
 *
 * [706] 设计哈希映射
 */

// @lc code=start
class MyHashMap {
    private static final int BSIZE = 997;
    private LinkedList<Pair>[] buckets;

    /** Initialize your data structure here. */
    public MyHashMap() {
        buckets = new LinkedList[BSIZE];
        for (int i = 0; i < BSIZE; ++i) {
            buckets[i] = new LinkedList<Pair>();
        }
    }

    private int hashing(int key) {
        int hash = key % BSIZE;
        if (hash < 0) {
            hash += BSIZE;
        }
        return hash;
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hash = hashing(key);
        for (Pair i : buckets[hash]) {
            if (i.getKey() == key) {
                i.setValue(value);
                return;
            }
        }
        buckets[hash].offerLast(new Pair(key, value));
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map
     * contains no mapping for the key
     */
    public int get(int key) {
        int hash = hashing(key);
        for (Pair i : buckets[hash]) {
            if (i.getKey() == key) {
                return i.getValue();
            }
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping
     * for the key
     */
    public void remove(int key) {
        int hash = hashing(key);
        for (Pair i : buckets[hash]) {
            if (i.getKey() == key) {
                buckets[hash].remove(i);
                return;
            }
        }
    }

    private class Pair {
        private int key;
        private int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such: MyHashMap obj
 * = new MyHashMap(); obj.put(key,value); int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end

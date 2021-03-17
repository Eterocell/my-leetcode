import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=705 lang=java
 *
 * [705] 设计哈希集合
 */

// @lc code=start

/*
 * <strike>直接一个大 bool 数组搞定</strike>
 */
// class MyHashSet {
// private static boolean[] arr;

// /** Initialize your data structure here. */
// public MyHashSet() {
// arr = new boolean[1000001];
// }

// public void add(int key) {
// arr[key] = true;
// }

// public void remove(int key) {
// arr[key] = false;
// }

// /** Returns true if this set contains the specified element */
// public boolean contains(int key) {
// return arr[key];
// }
// }

class MyHashSet {
    private static final int BSIZE = 997;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[BSIZE];

        for (int i = 0; i < BSIZE; ++i) {
            buckets[i] = new LinkedList<Integer>();
        }
    }

    private int hashing(int key) {
        int hash = key % BSIZE;
        if (hash < 0) {
            hash += BSIZE;
        }
        return hash;
    }

    public void add(int key) {
        int hash = hashing(key);
        for (Integer i : buckets[hash]) {
            if (i == key) {
                return;
            }
        }
        buckets[hash].offerLast(key);
    }

    public void remove(int key) {
        int hash = hashing(key);
        for (Integer i : buckets[hash]) {
            if (i == key) {
                buckets[hash].remove(i);
                return;
            }
        }
    }

    public boolean contains(int key) {
        int hash = hashing(key);
        for (Integer i : buckets[hash]) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj
 * = new MyHashSet(); obj.add(key); obj.remove(key); boolean param_3 =
 * obj.contains(key);
 */
// @lc code=end

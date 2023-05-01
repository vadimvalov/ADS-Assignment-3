public class MyHashTable<K, V> {
    private class HashNode<K, V> {
        private K key;
        private V value;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }

        private HashNode<K, V>[] chainArray; // or Object[]
        private int M = 11; // default number of chains
        private int size;

public MyHashTable() { 
    this.chainArray = new HashNode<K,V>(key, value);
    //
 }

public MyHashTable(int M) { 
    this.chainArray = new.HashNode<K,V>(key,value);
    //
 }

        private int hash(K key) {
            int hash = 0;
            String s = key.toString();
            for (int i = 0; i < s.length(); i++) {
                hash = s[i] + (31 * hash);
            }
            return Math.abs(hash) % M;
        }

        public void put(K key, V value) {

        }

        public V get(K key) {

        }

        public V remote(K key) {

        }

        public boolean contains(V value) {

        }

        public K getKey(V value) {

        }
    }
}
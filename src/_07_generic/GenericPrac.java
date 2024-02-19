package _07_generic;


class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
public class GenericPrac {
    public static void main(String[] args) {
        Pair pair1 = new Pair<>("One", 1);
        System.out.println("Key: " + pair1.getKey()+" , Value: " + pair1.getValue());


        Pair pair2 = new Pair<>(2,"Two");
        System.out.println("Key: " + pair2.getKey()+" , Value: " + pair2.getValue());

    }




}

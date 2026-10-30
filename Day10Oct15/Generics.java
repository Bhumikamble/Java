package Day10Oct15;
//Methods can declare their own independent type parameters, which are placed right before the return type
//without generics we cant detect compile time error
//No manual casting
//reusable code
//generics doent support primitive data types we need to use wrapper
//autoboxing Integer to int like from wrapper to int value
//unboxing means int to Integer


// class Box<T>{
//     private T item;
//     public void set(T item){
//         this.item=item;

//     }
//     public T get(){
//         return item;
//     }
// }

// class Generics{
//     public static void main(String[] args){
//         Box<String> box = new Box<>();
//         box.set("Bhumi");
//         String s = box.get();
//         System.out.println(s);
//     }
// }


//Multitype parameter

// class Pair<K,V>{
//     private K key;
//     private V value;

//     Pair(K key,V value){
//         this.key=key;
//         this.value=value;
//     }

//     K getKey(){
//         return key;
//     }
//     V getValue(){
//         return value;
//     }
// }

// class Generics{
//     public static void main(String[] args) {
//         Pair<String, Integer> p=new Pair<>("Age",25);
//         String k=p.getKey();
//         Integer v=p.getValue();
//         System.out.println(k + ":" + v);
//     }
// }



//same code without using generics we have to mention separately the data type for getting the value

// class Pair {
//     private Object key;
//     private Object value;

//     Pair(Object key, Object value) {
//         this.key = key;
//         this.value = value;
//     }

//     Object getKey() {
//         return key;
//     }

//     Object getValue() {
//         return value;
//     }
// }

// class Generics {
//     public static void main(String[] args) {
//         Pair p = new Pair("age", "test");

//         String K = (String) p.getKey();
//         String V = (String) p.getValue();

//         System.out.println(K + ":" + V);
//     }
// }


//Generic method printTwice() and firstOf()
//<T> means any data type is accepted
// static — we can call the method using the class name without creating an object.
// <T> — tells Java that this is a generic method. T is a placeholder for a data type.
// class Util{
//     static <T> void printTwice(T value){
//         System.out.println(value);
//         System.out.println(value);
//     }

//     static <T> T firstOf(T a,T b){  //T before firstOf — the method returns a value of type T.
//         return b;
//     }
// }

// class Generics{
//     public static void main(String[] args) {
//         Util.printTwice(100);
//         System.out.println(Util.firstOf("Hii","Soniya"));
//     }
// }



// Level 1: The Locker
// Problem Statement
// A school has lockers. One locker can hold one item. Students keep different things in them: a
// book (String), a locker code (Integer), or a lunch price (Double).
// Without generics, you’d write StringLocker, IntegerLocker, DoubleLocker, and so on.
// Your task: Write one Locker<T> class that can hold any type of item.
// Requirements:
// 1. put(item) stores an item.
// 2. get() returns the item.
// 3. Test it with a String and an Integer.
// Expected output:
// Locker has: Java Book
// Locker has: 1234

class Locker<T>{
    private T item;
    void put(T item){
        this.item=item;
    }

    T get(){
        return item;
    }
}

class Generics{
    public static void main(String[] args) {
        Locker<String> locker1=new Locker<>();
        locker1.put("Java book");
        System.out.println("The locker has: " + locker1.get());

        Locker<Integer> intlocker=new Locker<>();
        intlocker.put(2205);
        

        System.out.println("intlocker has: " + intlocker.get());
    }
}

package Day11Oct16;

import java.util.List;
import java.util.stream.Collectors;

//lambda is a function which is used to reduce the lines of code
//.test is to test a condition is an abstract method used for function interface
//Function<T,R> here T is input and R is output .apply takes two inputs and returns a result is used for Predicate
//.get takes no input and returns a result
//Consumer<T> :T -> "hello"  .accept takes input and returns nothing 


// Function<T,R> here T is input and R is output .apply takes two inputs and returns a result is used for Predicate
// @FunctionalInterface
// interface Greeter{
//     void greet(String name);
// }
// public class lambda {
//     public static void main(String[] args){
//         Greeter g=name -> {System.out.println("Hello, " +name);
//             System.out.println("Welcome home");
//         };

//         g.greet("Bhumi");
//     }
// }



//predicting age greter than 18
// import java.util.*; //for .test
// import java.util.function.Predicate;
// public class lambda{
//     public static void main(String[] args) {
//         Predicate<Integer> isAdult = age -> age>=18;

//         System.out.println(isAdult.test(20));
//         System.out.println(isAdult.test(13));
//     }
// }



//String length
// import java.util.function.*;
// class lambda{
//     public static void main(String[] args){
//         Function<String,Integer> getLength = name -> name.length();
//         System.out.println(getLength.apply("java"));
//     }
// }



//calculate the square of a number
// import java.util.function.*;
// class lambda{
//     public static void main(String[] args){
//         Function<Integer,Integer> getSquare = n -> n*n;
//         System.out.println(getSquare.apply(5));
//         System.out.println(getSquare.apply(2));
//     }
// }



//Consumer
// Consumer<T> :T -> "hello"  .accept takes input and returns nothing
// import java.util.function.*;
// class lambda{
//     public static void main(String[] args) {
//         Consumer<String> pr = message -> System.out.println(message);

//         pr.accept("Hello Bhumii!");
//     }
// }






//here consumer returns nothing
//Mobno is reading a string text
//Smsnotifier is a variable name
// import java.util.function.*;
// class lambda{
//     public static void main(String[] args) {
//         Consumer<String> Smsnotifier = Mobno -> {
//             System.out.println("Sending OTP to the phone number: " + Mobno);
//         };

//         Smsnotifier.accept("+91 675443577");
//     }
// }



//Supplier
// import java.util.function.*;
// class lambda{
//     public static void main(String[] args) {
//         Supplier<String> message= () -> "Hellooo";

//         System.out.println(message.get());
//     }
// }



// import java.util.*;
// import java.util.function.*;
// // import java.util.Random;
// class lambda{
//     public static void main(String[] args) {
//         Supplier<String> otpGen = () -> {
//             Random random = new Random();
//             int number = 100000 + random.nextInt(9000000);
//             return String.valueOf(number);
//         };

//         String userOtp = otpGen.get();
//         System.out.println("The otp is: " +userOtp);
//     }
// }



//without using Stream api
// import java.util.*;
// class lambda{
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(
//             1,2,3,4);
    

//     List<Integer> result = new ArrayList<>();

//     for(int n : nums){
//         if(n%2 == 0){
//             result.add(n*n);
//         }
//     } 
//         System.out.println(result);
//     }
// }



//using stream API
// import java.util.*;
// import java.util.stream.*;

// class lambda{
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1,2,3,4,5);

//         List<Integer> res = nums.stream()
//         .filter(n -> n%2 == 0)
//         .map(n-> n*n)
//         .collect(Collectors.toList());

//         System.out.println("OG List : " + nums);
//         System.out.println("ResultP: " + res);
//     }
// }


// import java.util.*;
// import java.util.stream.*;

// class lambda{
//     public static void main(String[] args) {
//         List<String> list = List.of("a","b","c");
//         System.out.println("Stream from a list: ");
//         list.stream().forEach(System.out::println);

//         int[] arr = {1,2,3};

//         Arrays.stream(arr).forEach(System.out::println);

//         Stream.of("x","y","z").forEach(System.out::println);

//         IntStream.range(1,5).forEach(System.out::println);
//     }
// }


// import java.util.stream.*;

// import java.util.*;
// class lambda{
//     public static void main(String[] args) {
        
//         List<Integer> nums = List.of(5,12,8,3,20,7);
//         List<Integer> result = nums.stream()
//         .filter(n -> n>=7)
//         .collect(Collectors.toList());
//         System.out.println(result);
//     }
//} 


// import java.util.stream.*;

// import java.util.*;
// class lambda{
//     public static void main(String[] args) {
//         List<Integer> nums = List.of(5,12,10,23);
//         List<Integer> res = nums.stream()
//         .map(n->n*2)
//         .collect(Collectors.toList());
//         System.out.println(res);
//     }
// }


import java.util.stream.*;

import java.util.*;

class lambda{
    public static void main(String[] args) {
        
        
        List<Integer> nums = List.of(5,3,4,2,1);
        List<String> words = List.of("banana","fig","apple");
        List<String> byLength = words.stream()

        .sorted((a,b) -> a.length() - b.length())
        .collect(Collectors.toList());

        List<Integer> res = nums.stream()
        .sorted().collect(Collectors.toList());

        System.out.println(res);
        System.out.println(byLength);
 
    }
}





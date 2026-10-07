
// print 
// ****
// ****
// ****
// ****


// import java.util.*;

// class Test{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// print 
// *
// **
// ***
// ****

// import java.util.*;

// class Test{
//     public static void main(String[] args){

       
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// print
// *****
// *   *
// *   *
// *****

// class Test {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 4; i++) {   //i is for rows 

//             for (int j = 1; j <= 5; j++) {

//                 if (i == 1 || i == 4 || j == 1 || j == 5) {  //j is for column
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }




// print
// ****
// ***
// **
// *

// import java.util.*;

// class Test{
//     public static void main(String[] args){

       
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>i;j--){
//                System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//     *
//    **
//   ***
//  ****
// *****

// import java.util.*;

// class Test{
//     public static void main(String[] args){

       
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// print
// 1
// 12
// 123
// 1234
// 12345



// class Test {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }

//             System.out.println();
//         }
//     }
// }

// print 
// 12345
// 1234
// 123
// 12
// 1



// class Test {
//     public static void main(String[] args) {

//         for (int i = 5; i >= 1; i--) {       //i is for rows will compare 5 with j which is strarting from 1

//             for (int j = 1; j <= i; j++) {   //we will compare j with i till it becomes less than or equal to i
//                 System.out.print(j);     
//             }

//             System.out.println();
//         }
//     }
// }



// print
// 1
// 23
// 456
// 78910

// class Test {
//     public static void main(String[] args) {

//         int count= 1;

//         for (int i = 1; i <= 4; i++) {  //i is for rows

//             for (int j = 1; j <= i; j++) {  //j is for columns
//                 System.out.print(count);
//                 count++;
//             }

//             System.out.println("  ");
//         }
//     }
// }


// print 
// 1
// 01
// 101
// 0101


// class Test {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 4; i++) {   //i is for rows 

//             for (int j = 1; j <= i; j++) {

//                 if ((i+j) % 2 == 0) {    //j is for column
//                     System.out.print("1");
//                 } 
//                 else {
//                     System.out.print("0");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }


import java.util.*;

class Test{

    public static void main(String[] args){
       
        System.out.println("1.Square");
        System.out.println("2.Traingle");
        System.out.println("3.Rectangle");

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your choice");
         int choice = sc.nextInt();
    
    switch(choice){

        case 1:
            System.out.println("Square");
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter side of square: ");
            int side=sc.nextInt();
            int Area=side*side;
            System.out.println("Area of Square: " +Area);
            break;

        case 2:
            System.out.println("Triangle");
            Scanner sc2=new Scanner(System.in);

            System.out.println("Enter base of triangle: ");
            int base=sc.nextInt();

            System.out.println("Enter height of triangle: ");
            int height=sc.nextInt();

            int Area1=(base*height)/2;
            System.out.println("Area of Triangle: " +Area1);
            break;

        case 3:
            System.out.println("Rectangle");
            Scanner sc3=new Scanner(System.in);

            System.out.println("Enter length of rectangle: ");
            int length=sc.nextInt();

            System.out.println("Enter width of rectangle: ");
            int Breadth=sc.nextInt();
            
            int Area2=length*Breadth;
            System.out.println("Area of Rectangle: " +Area2);
            break;

        default:
            System.out.println("Invalid choice");
            
            

    }
}
}
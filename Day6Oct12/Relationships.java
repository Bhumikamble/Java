package Day6Oct12;

// class Engine{
//     void start(){
//         System.out.println("Engine is starting..");
//     }
// }

// class Car{
//     private Engine engine; //Engine is the datatype and engine is the variable which is accessed privately

//     Car(){  //constructor
//         this.engine=new Engine();
//     }

//     void drive(){
//         engine.start();  //this will call the void start method and print "Engine is starting"
//         System.out.println("Car is moving...");
//     }
// }


//to print the address
// class Address{
//     String city;
//     String state;
//     int pincode;

//     Address(String city,String state,int pincode){
//         this.city=city;
//         this.state=state;
//         this.pincode=pincode;
//     }
//     void displayAddress(){
//         System.out.println(city +","+ state + "," + pincode);
//     }

// }


// //to print the student info
// class Student{
//     String name;
//     int rollNumber;
//     Address address;
  

//     Student(String name,int rollNumber,Address address){
//         this.name=name;    //this refers to the current object,this.name is the current instance variable of the current object Student,name is the constructor parameter,= assigns the parameter value to the instance variable
//         this.rollNumber=rollNumber;
//         this.address=address;
//     }
//     void displayProfile(){
//         System.out.println("Student: "+name + "\nRoll NO: "+rollNumber);
//         System.out.println("Lives in: ");
//         address.displayAddress();
//     }
// }


// class Battery{
    
//     int capacityMaH;
//     Battery(int capacityMaH){
//         this.capacityMaH=capacityMaH;
//     }

//     void drain(){
//         System.out.println("Battery used. \nCapacity Remaining: " + (capacityMaH-100)+ " mAh");
//     }
// }

// class Camera{
//     int pix;

//     Camera(int pix){
//         this.pix=pix;
//     }
//     void takePhoto(){
//         System.out.println("Click...... captured a photo with" + pix +" sensor");
//     }
// }

// class Phone{
//     String brand;
//     Battery battery;
//     Camera camera;

//     Phone(String brand,Battery battery,Camera camera){
//         this.brand=brand;
//         this.battery=battery;
//         this.camera=camera;

//     }

//     void snapPicture(){
//         System.out.println("[" + brand + " ]" + "is active");
//         camera.takePhoto();
//         battery.drain();
//     }
// }
package Day6Oct12;

// class Student {
//     String name;
//     static String collegeName="Vidyavardhini College of Engineering and Technology";

//     Student(String name){
//         this.name=name;
//     }

//     void stuCol(){
//         System.out.println(name + " studies in " + collegeName);
//     }
// }


class UserAccount{
    private String username;
    private static int totalUsers = 0;

    public UserAccount(String username){
        this.username=username;
        totalUsers++;
    }

    public String getUsername(){
        return username;
    }

    public static int gettotalUsers(){
        return totalUsers ;
        
        
    }


}

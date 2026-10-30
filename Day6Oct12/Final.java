package Day6Oct12;

class Bank {
    final void claculateInterest(){
        System.out.println("Base interest calculation");
    }
}

class Branch extends Bank{

    void calculateInterest(){
        System.out.println("Custom interest");
    }
}
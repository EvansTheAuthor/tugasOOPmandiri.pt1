package Azzam;

class calcu {
    int result;
    int num1, num2;
    
    void sum(){
        result=num1+num2;
    }

    void min(){
        result=num1-num2;
    }

    void multi(){
        result=num1*num2;
    }

    void divide(){
        result=num1/num2;
    }

    void showRes(){
        System.out.println("Result: "+result);
    }
}

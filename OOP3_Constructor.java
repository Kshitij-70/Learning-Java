// Constructor is called as soon as the object is created
// Constructor doesn't have any return type 
// Constructor's name should be same as Class name
// Whenever a object is created first it goes through constructor
// 1) Default Constructor : It sets the default values 
// 2) Parameterised Constructor : It gets the parameters from the object and sets the values
// Constructor can't be static/abstract/final

class Add{
    int a,b;
    public Add(){                          // Default
        a=10;
        b=10;
    }

    public Add(int fir,int sec){          // Parameterized
        a=fir;
        b=sec;
    }

    void print(){
      System.out.println(a+b);
    }
}

public class Mainclass {
    public static void main(String[] args) {
      Add num=new Add();                   // object of default constructor
      Add num2=new Add(10,29);    // object of parameterized constructor
      num.print();
      num2.print();
    }
  
}

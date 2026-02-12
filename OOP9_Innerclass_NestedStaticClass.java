// Inner class are the classes which are given inside the class
public class Mainclass {
  class Innerclass {
    int price;
  }
  public static void main(String[] args) {
    Innerclass mc=new Mainclass().new Innerclass();
    mc.price=10;
    System.out.println(mc.price);
  }
}

// A static nested class cannot access the member variables of the outer class. It is because the static nested class doesn't require you to create an instance of the outer class
public class Mainclass {
  
  static class Playstation {
   int price;
  }
  public static void main(String[] args) {
    Playstation PS=new Mainclass.Playstation();
  }
}

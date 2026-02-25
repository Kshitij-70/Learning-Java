// Recersion is nothing but when a method calls itself again and again

public class Main {

    public static void num(int no){
        if (no>100) {
            return;
        }
        System.out.println(no);
        num(no+1);
    }
    public static void main(String[] args) {
    num(1);
    
    }
}

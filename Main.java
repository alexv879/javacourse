public class Main {
    //list all attributes
    int x;
    //constructor method
    public Main(){ //default constructor
        //assign value of x
    x = 5;
    }
    public Main(int x){
        this.x = x;
    }
    //create the main method
    public static void main(String[] args) {
        //create object
        Main  obj1 = new Main();
        System.out.println(obj1.x);

        Main obj2 = new Main( 100);
        System.out.println(obj2.x);
    }
}

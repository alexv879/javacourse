public class NestedLoop {
    public static void main(String[] args) {
        //nested loop a outer loop and a inner loop
        //different counter i and j for example
        //each time the outer loop is executed, the inner loop is executed again until it is false
        // print number 10, 11, 12 up to 19 or 11 to 39
        for(int i=1; i<3; i++){
            for(int j=0; j<10; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}

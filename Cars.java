public class Cars {
    String name = "Jaguar";
    int year = 2011;
    String type = "Coupe";

    public static void main(String[] args) {
       Cars obj1 = new Cars();
        System.out.println("Cars :" + obj1.name +" " + obj1.year + " " + obj1.type);
        Cars obj2 = new Cars();
        System.out.println("Cars :" + obj2.name +" " + obj2.year + " " + obj2.type);
    }

}

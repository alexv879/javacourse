public class OnedimensionArrays {
    public static void main(String[] args) {
        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] age = {8, 4, 6, 9};
        System.out.println(car.length); //output is the lenght of array car
        System.out.println(age.length);
        System.out.println(car[0]);

        //call element in array
        System.out.println(car[0]);
        System.out.println(car[1]);
        System.out.println(car[2]);
        System.out.println(car[3]);

        //call all the elements we use forloops
        for (int i = 0; i < car.length; i++)
            System.out.println(car[i]);
    //for each, to call all the elements
        for (String x : car){
            System.out.println(x);
        }
    }
}
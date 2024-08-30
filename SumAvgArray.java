public class SumAvgArray {
    public static void main(String[] args) {
        //create integer variable called sum, set to 0
        int sum = 0;
        //create int array of size 10 , put ten numbers inside array
        int[] numbers = {11, 12, 13, 14, 15, 16 ,17 ,18 ,19 ,20};
        //use for loop or for each loop to call the array and add them together, save it inside sum variable
        for (int x: numbers){
            sum = x + sum;
            //print the sum
        }
        //method 2 //for(int i=0; i<numbers.length;i++)
        //    sum+=numbers[i];//
            System.out.println(sum);
        //calculate the average in double variable
        double average = (double)sum/numbers.length;
        System.out.println("Average is " + average);
        // Print all the array elements

        }



    }


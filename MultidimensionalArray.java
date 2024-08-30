public class MultidimensionalArray {
    public static void main(String[] args) {
        //declare and assign the 2d arrays of 2 rows and 3 columns
        int[][] numbers = {
                {90, 75, 80},  //first row of data
                {70, 56, 75}
        };
//print all data
        for (int i = 0; i < numbers.length; i++) // to access row index
            for (int j = 0; j < numbers[i].length; j++) { //access the index of the column
                System.out.print(numbers[i][j] + " ");
            }
        System.out.println(" ");
    }
}

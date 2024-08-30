public class MultidimensionalArray2 {
    public static void main(String[] args) {
        //declare and assign the 2d arrays of 2 rows and 3 columns
        String[][] names = {
                {"Ameena", "Bobby", "Dylan"},  //first row of data
                {"Charles", "Hari"}
        };

//print all data
        for (int i = 0; i < names.length; i++) // to access row index
            for (int j = 0; j < names[i].length; j++) { //access the index of the column
                System.out.print(names[i][j] + " ");
            }
        System.out.println(" ");
    }
}

public class Example2D {
    public static void main(String[] args) {
        int [][] integers = new int [2][3];//int[row][col]

        integers[0][0] = 90;
        integers[0][1] = 75;
        integers[0][2] = 80;
        integers[1][0] = 70;
        integers[1][1] = 56;
        integers[1][2] = 75;

        for(int i=0; i< integers.length; i++) // to access row index
            for(int j=0; j<integers[i].length; j++) //to access the column index
                System.out.println((integers[i][j]));

    }
}

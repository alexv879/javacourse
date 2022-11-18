    public class ThreeDigitCodes {
        public static void main(String[] args) {
            int total = 0; //counter that counts how many numbers there are
            for(int i = 1; i <= 4; i++)
            {
                for(int j = 1; j <= 4; j++)
                {
                    for(int k = 1; k <= 4; k++)
                    {
                        // Statements
                        if((j != i) && (k != i) && (k != j)){
                            System.out.println(i + "" + j + "" + k);
                            total += 1;
                        }
                    }
                }
            }
            System.out.println("There were " + total + " unique combinations.");
        }
    }
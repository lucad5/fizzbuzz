public class fizzbuzz {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++)
        {
            System.out.print(i);
            System.out.print(" ");

            if (i % 3 == 0)
            {
                System.out.print("fizz");
            }

            if (i % 5 == 0)
            {
                System.out.print("buzz");
            }

            System.out.print("\n");
        }

    }
}
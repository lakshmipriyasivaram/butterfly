public class Primenumber {
    public static void main(String[] args) {
        boolean isPrime=true;

            for(int i=2;i<=20;i++)
            {
                for(int j=2;j<=20;j++)
                {
                    if(i!=j && i%j==0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                    if (isPrime)
                    {
                        System.out.println("prime number" + i);
                    }
                    isPrime=true;
                }
            }

}



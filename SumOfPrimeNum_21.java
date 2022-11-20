public class SumOfPrimeNum_21 {
    public static void main(String[] args) {
        int i, num, sum=0;
        String primeNumbers = "";
        for (i=1; i<=100; i++) {
            int counter=0;
            for(num=i;num>=1; num--) {
                if(i%num == 0) {
                    counter ++;
                    //break;
                }
            }
            if (counter == 2) {
               // primeNumbers = primeNumbers + i + " ";
                sum += i;
            }
        }
        //sum += num;
         System.out.println("The sum of prime numbers between 1 to 100 is " + sum);
        //System.out.println(sum);
    }
}

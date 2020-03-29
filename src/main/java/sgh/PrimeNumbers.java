package sgh;

public class PrimeNumbers {

    public static void primes(int n) {
        int i=0;
        int num = 0;
        String primeNumbers = "";

        for (i=2; i<10; i++){
            int counter = 0;
            for (num=2; num>=2; num--){
                if (i%num==0){
                    counter=counter+1;
                }
            }
            if (counter ==2){
                primeNumbers= primeNumbers + i +" ";
            }

        }
        System.out.println(primeNumbers);
    }


    public static void main(String[] args) {
        primes(4);
    }
}

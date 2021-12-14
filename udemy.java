public class udemy {
    //1 den 1000 e kadar olan sayılardan asal olanı bulma
    public static boolean isPrime(int sayı) {
        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {
                return false;


            }

        }
        return true;


    }

    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }
    }
}





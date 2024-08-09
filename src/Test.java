public class Test {


        public int solve(int A) {
            if(A == 1) {
                return 0;
            }
            if(A == 2) {
                return 1;
            }
            boolean[] sieve = new boolean[A + 1];
            for(int index = 2; index <= A; index++) {
                sieve[index] = true;
            }
            for(int num = 2; num <= A; num++) {
                if(sieve[num]) {
                    for(int start = num + num ; start <= A; start += num) {
                        sieve[start] = false;
                    }
                }
            }
            int totalPrimeNumbers = 0;
            for(int index = 2; index <= A; index++) {
                if(sieve[index]) {
                    totalPrimeNumbers++;
                }
            }
            return totalPrimeNumbers;
        }

        private boolean isPrimeNumber(int number) {
            if(number == 1) {
                return false;
            }
            if(number == 2) {
                return true;
            }

            boolean flag = true;
            for(int i = 2; i * i <= number; i++) {
                if(number % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }


        public static void main(String[] args) {
            System.out.println(new Test().solve(10));
        }

}

public class LazyNumberDetails {
    private int number;
    private boolean wasTestedForPrimeNumber;
    private boolean primeNumberTestResult;
    private boolean wasTestedForPerfectNumber;
    private boolean perfectNumberTestResult;
    private boolean wasTestedForMagicNumber;
    private boolean magicNumberTestResult;

    public LazyNumberDetails(int number) {
        this.number = number ;

    }

    public void updateNumber(int number) {
        this.number = number;
        this.wasTestedForPrimeNumber = false;
        this.wasTestedForPerfectNumber = false;
        this.wasTestedForMagicNumber = false;

        System.out.println("Update number to " + this.number +  " ->> **none (lazy eval.)** -> no user action");

    }


    public boolean isPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void isPrime() {
        if(!wasTestedForPrimeNumber){
            primeNumberTestResult = isPrimeNumber(this.number);
            System.out.println("Is prime " + this.number + " : intensiveComputation!! -> prime algorithm for: "
                    + this.number + " -> " + primeNumberTestResult );
            wasTestedForPrimeNumber = true;
        }
        else {
            System.out.println("Is prime " + this.number + " : cached result -> " + this.primeNumberTestResult );
        }

    }

    public boolean isPerfectNumber(int number) {
        int sumDiv =1;

        for(int i =2; i<= number/2 ; i++) {
            if(number % i ==0) {
                sumDiv += i;
            }
        }
        return sumDiv == number;
    }

    public void isPerfect() {
        if(!wasTestedForPerfectNumber) {
            perfectNumberTestResult = isPerfectNumber(this.number);
            System.out.println("Is perfect " + this.number + " !!intensiveComputation!! -> perfect algorithm for: "
                    + this.number + " -> "  + perfectNumberTestResult );
            wasTestedForPerfectNumber = true;
        }
        else {
            System.out.println("Is perfect " + this.number + " **cached result -> " + this.perfectNumberTestResult );
        }
    }

    private static int sumDigit(int number) {
        int sum = 0;
        while(number>0) {
            sum += number%10;
            number /= 10;
        }
        return sum;
    }

    public boolean isMagicNumber(int number) {
        while (number>9) {
            number = sumDigit(number);
        }
        return(number == 3) || (number ==7) || (number ==9);
    }

    public void isMagic() {
        if(!wasTestedForMagicNumber) {
            magicNumberTestResult = isMagicNumber(this.number);
            System.out.println("Is magic " + this.number + " !!intensiveComputation!! -> magic algorithm for: "
                    + this.number + " -> " + isMagicNumber(this.number) );
            wasTestedForMagicNumber = true;
        }
        else {
            System.out.println("Is magic " + this.number + " **cached result -> " + this.magicNumberTestResult );
        }
    }
}

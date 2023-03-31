public class Main {
    public static void main(String[] args) {

        LazyNumberDetails lazyNumber = new LazyNumberDetails(8);

        lazyNumber.isPrime();
        lazyNumber.isPerfect();
        lazyNumber.isMagic();
        lazyNumber.updateNumber(17);
        lazyNumber.updateNumber(10);
        lazyNumber.isPrime();
        lazyNumber.isPrime();
        lazyNumber.updateNumber(28);
        lazyNumber.isPerfect();
        lazyNumber.isPrime();
        lazyNumber.isPerfect();
        lazyNumber.isMagic();
        lazyNumber.isPrime();
        lazyNumber.updateNumber(12);
        lazyNumber.isMagic();
        lazyNumber.isMagic();
    }
}

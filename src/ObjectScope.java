public class ObjectScope {

    public  void getFibonachi(int n){
        int a =0, b = 1, c;

        if(n < 0){
            System.out.println("Invalid input: n must be a non-negative integer.");
            return;
        }

        System.out.println("Fibonacci series up to " + n + ": ");

        for(int i = 0; i < n; i++){
            if(i == 0){
                System.out.println(a + " ");
            } else if (i == 1) {
                System.out.println(b + " ");
            } else {
                c = a + b;
                System.out.println(c + " ");
                a = b;
                b = c;

            }
        }
    }

}


class SubclassScope extends ObjectScope {

  public void getPrime(int n) {
    if (n < 2) {
        System.out.println("No prime numbers less than " + n);
        return;
    }

    System.out.println("Prime numbers up to " + n + ": ");
    for (int i = 2; i < n; i++) {
        boolean isPrime = true;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(i + " ");
        }
    }
  }


}


class Main extends SubclassScope{

    public void getAllNumbers(int n) {
        getFibonachi(n);
        getPrime(n);
    }

    public static void main(String[] args) {
        ObjectScope objectScope = new ObjectScope();
        objectScope.getFibonachi(10);

        SubclassScope subclassScope = new SubclassScope();
        subclassScope.getPrime(20);









    }
}
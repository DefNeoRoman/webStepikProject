public class Main {
    public static void main(String[] args) {
        A aB = new B();

        A aC = new C();

        B bB = new B();

        B bC= new C();

        C cC = new C();

        System.out.println(bB.diff(1,2) ==1);//false
        System.out.println(bC.diff(1, 2) == 1);
        System.out.println(aC.sum(1, 1) == 2);

    }

}

public class MainClass {
    public static void main(String[] args) {
        int a = 17;
        int b = 8;
        int c = 20;
        int d = 9;

        int firstSum = a + b;
        int secondSum = c + d;

        compareFirstAmountWithSecondAndDisplayMessage(firstSum, secondSum);

        firstSum++;
        System.out.println("Fist sum after increment = " + firstSum);

        secondSum -= 2;
        System.out.println("Second sum after increasing by 2 = " + secondSum);

        compareFirstAmountWithSecondAndDisplayMessage(firstSum, secondSum);
        checkingMultiplicityOfNumbersByTwo(firstSum, secondSum);
    }

    private static void compareFirstAmountWithSecondAndDisplayMessage(int firstSum, int secondSum){
        if (firstSum > secondSum){
            System.out.println(String.format("%d is greater than %d", firstSum, secondSum));
        }
        else {
            System.out.println(String.format("%d is greater than %d", secondSum, firstSum));
        }
    }
    private static void checkingMultiplicityOfNumbersByTwo(int firstSum, int secondSum){
        System.out.println("The sum is a multiple of 2 = " + (firstSum % 2 == 0 || secondSum % 2 == 0));
    }
}
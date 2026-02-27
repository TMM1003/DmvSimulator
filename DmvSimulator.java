public class DmvSimulator {
    public static void main(String[] args) {
        int maxNumber = 100;
        int userNumber = (int) (Math.random() * maxNumber) + 1;

        System.out.println("Welcome to the DMV.");
        System.out.println("Your number is " + userNumber + ". Please wait until your number is called.");

        for (int offset = 1; offset < maxNumber; offset++) {
            int calledNumber = ((userNumber - 1 + offset) % maxNumber) + 1;
            System.out.println("Now serving number " + calledNumber + ".");
            System.out.println("Now serving number " + userNumber + ".");

            if (Math.random() < 0.99) {
                System.out.println("You don't have the required paperwork you literal nasty little piece of human garbage scum MWAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHA.");
            } else {
                System.out.println("You have all of the required paperwork and you are all set.");
                
            }
        }
    }
}
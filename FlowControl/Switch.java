package FlowControl;

public class Switch {

    public static void main(String[] arg) {

        int age = 9402340;

        switch (age) {
            case 18:
                System.out.println("You now apply for nid card");
                break;
            case 21:
                System.out.println("You now apply for passport");
                break;
            case 25:
                System.out.println("You can now apply for job ");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

    }
}

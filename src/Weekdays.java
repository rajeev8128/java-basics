import java.util.Scanner;

public class Weekdays {

    // Create a class which shows weekday on user inputs by using arrays

    public static void main(String[] args) {

        String[] Weekdays_name = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number : ");
        int Userinput = in.nextInt();
        for (int i = 0; i < 7; i++) {
            if (i + 1 == Userinput) {
                System.out.println("Coresponding day name is : "+Weekdays_name[i]);
            }

        }
    }
}




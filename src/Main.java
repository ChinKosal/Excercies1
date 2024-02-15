import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNumber = new int[200];
        int index = 0;
        String choice = "";
        do {
            System.out.println("1. Input number");
            System.out.println("2. Show the numbers");
            System.out.println("3. Exit your application!");
            System.out.print("Please Enter your choice (1-3) : ");
            choice = sc.nextLine();

            if (!choice.matches("[0-9]{1}")) {
                System.out.println("Invalid input, please try again!");
                continue;
            }
            switch (choice) {
                case "1": {
                    String num = "";
                    System.out.println("==========Input Number===========");
                    do {
                        System.out.print("Input number : ");
                        num = sc.nextLine();
                        if (!num.matches("[0-9]+")) {
                            System.out.println("Invalid input, please try again!");
                        }
                    } while (!num.matches("[0-9]+"));

                    arrNumber[index] = Integer.parseInt(num);
                    index++;
                    break;
                }
                case "2": {
                    System.out.println("==========Output Numbers===========");
                    for (int i = 0; i < index; i++) {
                        System.out.println(arrNumber[i]);
                    }
                    System.out.println("\n\n");
                    break;
                }
            }
        } while (Integer.parseInt(choice) != 3);
        sc.close();
    }
}
import java.util.Scanner;

public class BodyguardAtZoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dzień dobry, prosze o podanie imienia?");
        String name = scanner.nextLine();
        String[] guestList = {"Anna", "Krzysztof", "Jan", "Zygmunt", "Kacper", "Paulina", "Tomek", "Ilona"};

        boolean nameOnTheList = false;
        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].equals(name)) {
                nameOnTheList = true;
                break;
            }
        }

        if (nameOnTheList) {
            System.out.println("Zapraszam, jestes na liscie Gosci, mozesz wejsc.");
        } else {
            System.out.println("Nie ma cie na liscie gosci, prosimy o wplacenie 10zl.");
            int pay = scanner.nextInt();
            if (pay >= 10) {
                System.out.println("Zapraszam, miłego zwiedzania!");

            } else {
                System.out.println("Niestety nie mogę Cię wpuścić, nie zapłaciłeś 10zł");
            }
        }
    }
}

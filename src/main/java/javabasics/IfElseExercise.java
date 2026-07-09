package javabasics;

public class IfElseExercise {

    static void main() {
        //Level 1 – Easy
        //1
        int age = 20;
        if (age >= 18) {
            System.out.println("Volljährig");
        }

        //2
        boolean isRaining = false;
        if (isRaining) {
            System.out.println("Nimm einen Regenschirm");
        } else {
            System.out.println("Kein Regenschirm nötig");
        }

        //3
        String city = "Berlin";
        if (city.equals("Berlin")) {
            System.out.println("Hauptstadt");
        }

        //Level 2 – Medium
        //1
        int score = 51;
        boolean hasTicket = true;
        if (score >= 50 && hasTicket) {
            System.out.println("Eintritt ist frei");
        }

        //2 (Kategorisierung)
        int temperature = 22;
        if (temperature >= 30) {
            System.out.println("Heiß");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else if (temperature >= 10) {
            System.out.println("Kühl");
        } else {
            System.out.println("Kalt");
        }

        //3 (Ternary-Operator)
        int number = 7;
        String parity = (number % 2 == 0) ? "Gerade" : "Ungerade";
        System.out.println(parity);

        //Level 3 – Bonus
        //1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter name: ");
//        String name = scanner.nextLine();
//
//        if (name == null || name.isBlank()) {
//            System.out.println("Ungültiger Name");
//        } else {
//            System.out.println("Hallo, " + name);
//        }

        //2
        double x = 0.1 + 0.2;
        double eps = 1e-9;
        if (Math.abs(x - 0.3) < eps) {
            System.out.println("Fast 0.3");
        } else {
            System.out.println("Nicht gleich 0.3");
        }

        //3
        register("Max", 32);

    }

    //3
    public static void register(String username, int age) {
        if (username == null || username.isBlank()) {
            return;
        }
        if (age < 18) {
            return;
        }
        System.out.println("Registrierung erfolgreich");
    }


}

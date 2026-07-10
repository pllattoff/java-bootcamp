package oop.chapter02.staticandfinal;

public class Main {

    static void main() {

        System.out.println("==========================================");
        // Aufgabe 1

        InstanceCounter instanceCounter1 = new InstanceCounter();
        InstanceCounter instanceCounter2 = new InstanceCounter();
        InstanceCounter instanceCounter3 = new InstanceCounter();

        InstanceCounter.incrementTotalCount();
        InstanceCounter.incrementTotalCount();
        InstanceCounter.incrementTotalCount();
        InstanceCounter.incrementTotalCount();
        InstanceCounter.incrementTotalCount();
        InstanceCounter.incrementTotalCount();

        instanceCounter1.incrementInstanceCount();

        instanceCounter2.incrementInstanceCount();
        instanceCounter2.incrementInstanceCount();

        instanceCounter3.incrementInstanceCount();
        instanceCounter3.incrementInstanceCount();
        instanceCounter3.incrementInstanceCount();

        System.out.println("InstanceCounter.totalCount: " + InstanceCounter.totalCount);
        System.out.println(instanceCounter1);
        System.out.println(instanceCounter2);
        System.out.println(instanceCounter3);

        System.out.println("==========================================");
        // Aufgabe 2 (Bonus)

        System.out.println("Calculator.add: " + Calculator.add(5,4));
        System.out.println("Calculator.diff: " + Calculator.diff(5,4));
        System.out.println("Calculator.prod: " + Calculator.prod(5,4));
        System.out.println("Calculator.quotient: " + Calculator.quotient(5,4));

        //Calculator calculator = new Calculator();   <---  'Calculator()' has private access



    }
}

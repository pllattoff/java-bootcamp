package oop.chapter02.staticandfinal;

public class InstanceCounter {

    public static int totalCount = 0;
    public int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void  incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "InstanceCounter{" +
                "instanceCount=" + instanceCount +
                ", totalCount=" + totalCount +
                '}';
    }
}

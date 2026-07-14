package oop.chapter05.records;

import java.util.List;

public record Zoo(List<Animal> animals) {

    public Integer getTotalFoodAmount(){
        Integer totalFoodAmount = 0;

        for (Animal animal : animals) {
            totalFoodAmount += animal.species().dailyFoodAmount();
        }

        return totalFoodAmount;
    }

}

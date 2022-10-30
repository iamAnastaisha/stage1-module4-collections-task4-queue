package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfDishes; i++) {
            list.add(i + 1);
        }
        List<Integer> resultList = new ArrayList<>();
        int i = everyDishNumberToEat - 1;
        while (!list.isEmpty()) {
            if (list.size() == 1) {
                resultList.add(list.get(0));
                break;
            }
            if (i >= list.size()) {
                i = i - list.size();
            }
            resultList.add(list.get(i));
            list.remove(i);
            i += everyDishNumberToEat - 1;
        }
        return resultList;
    }
}

package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultDeque = new ArrayDeque<>();
        resultDeque.add(firstQueue.poll());
        resultDeque.add(firstQueue.poll());
        resultDeque.add(secondQueue.poll());
        resultDeque.add(secondQueue.poll());

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            if (!firstQueue.isEmpty()) {
                firstQueue.add(resultDeque.pollLast());
                resultDeque.add(firstQueue.poll());
                resultDeque.add(firstQueue.poll());
            }

            if (!secondQueue.isEmpty()) {
                secondQueue.add(resultDeque.pollLast());
                resultDeque.add(secondQueue.poll());
                resultDeque.add(secondQueue.poll());
            }
        }
        return resultDeque;
    }
}

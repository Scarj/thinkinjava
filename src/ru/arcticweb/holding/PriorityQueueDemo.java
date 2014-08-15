package ru.arcticweb.holding;

import java.util.*;

/**
 * Created by evgeniy on 27.05.14.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i+10));
        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
        priorityQueue = new PriorityQueue<Integer>(ints);
        QueueDemo.printQ(priorityQueue);

        priorityQueue = new PriorityQueue<Integer>(
                ints.size(), Collections.reverseOrder()
        );
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> characters = new HashSet<Character>();
        for (Character c: fact.toCharArray()) {
            characters.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(characters);
        QueueDemo.printQ(characterPQ);
    }
}
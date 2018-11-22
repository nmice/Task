package week10.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOwnTestDrive {
    public static void main(String[] args) {
        System.out.println("Queue test:");
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.peek()); //возвращает 1й элемент. если эта очередь пуста, возвращает null
        System.out.println(queue.poll()); //возвращает 1й элемент. если эта очередь пуста, возвращает null
        System.out.println(queue.add(1001));//добавляет эл-т, если ок, возвращает true, если нет - Exception
        System.out.println(queue.offer(1002));//добавляет эл-т, если ок, возвращает true, если нет - false
        System.out.println(queue.add(1003));//добавляет эл-т, если ок, возвращает true
        System.out.println(queue.offer(1004));//добавляет эл-т, если ок, возвращает true
        System.out.println(queue.offer(null));//добавляет эл-т, если ок, возвращает true
        System.out.println(queue);
        System.out.println(queue.remove());//удаляет 1й элемент (раньше всех добавленный), возвращает его значение,  генерирует исключение, если эта очередь пуста.
        System.out.println(queue);
        System.out.println(queue.poll());//удаляет 1й элемент (раньше всех добавленный), возвращает его значение, возвращает null, если эта очередь пуста
        System.out.println(queue);
        System.out.println(queue.element()); //возвращает 1й элемент. генерирует исключение, если эта очередь пуста.
        System.out.println(queue.peek()); //возвращает 1й элемент. если эта очередь пуста, возвращает null
        System.out.println();

        System.out.println("QueueCustom test:");
        Queue<Integer> queueLLO = new QueueCustom<>();//May be new CustomLinkedList<>();
        System.out.println(queueLLO.peek()); //возвращает 1й элемент. если эта очередь пуста, возвращает null
        System.out.println(queueLLO.poll()); //возвращает 1й элемент. если эта очередь пуста, возвращает null
        System.out.println(queueLLO.add(1001));//добавляет эл-т, если ок, возвращает true, если нет - Exception
        System.out.println(queueLLO.offer(1002));//добавляет эл-т, если ок, возвращает true, если нет - false
        System.out.println(queueLLO.add(1003));//добавляет эл-т, если ок, возвращает true
        System.out.println(queueLLO.offer(1004));//добавляет эл-т, если ок, возвращает true
        System.out.println(queueLLO.offer(null));//добавляет эл-т, если ок, возвращает true
        System.out.println(queueLLO);
        System.out.println(queueLLO.remove());//удаляет 1й элемент (раньше всех добавленный), возвращает его значение,  генерирует исключение, если эта очередь пуста.
        System.out.println(queueLLO);
        System.out.println(queueLLO.poll());//удаляет 1й элемент (раньше всех добавленный), возвращает его значение, возвращает null, если эта очередь пуста
        System.out.println(queueLLO);
        System.out.println(queueLLO.element()); //возвращает 1й элемент. генерирует исключение, если эта очередь пуста.
        System.out.println(queueLLO.peek()); //возвращает 1й элемент. если эта очередь пуста, возвращает null
        System.out.println();
    }
}

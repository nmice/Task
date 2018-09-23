package week11.priorityQueue;

import week10.queue.QueueOwn;
import week10.quickSort.Book;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorQueueTestDrive {

    public static void main(String[] args) {
        System.out.println("Priority Queue - Integer test:");
        Queue<Integer> intQueue = new PriorQueueOwn<>();
        intQueue.offer(27);
        intQueue.offer(367);
        intQueue.offer(124);
        intQueue.offer(13);
        intQueue.offer(39);
        intQueue.offer(95);
        intQueue.offer(225);
        intQueue.offer(112);
        intQueue.offer(992);
        intQueue.offer(26);
        System.out.println(intQueue);
        System.out.println(intQueue.remove());
        System.out.println(intQueue);
        System.out.println(intQueue.remove());
        System.out.println(intQueue);
        System.out.println(intQueue.poll());
        System.out.println(intQueue);
        System.out.println(intQueue.poll());
        System.out.println(intQueue);
        System.out.println(intQueue.poll());
        System.out.println(intQueue);
        System.out.println(intQueue.poll());
        System.out.println(intQueue);
        System.out.println(intQueue.poll());
        System.out.println(intQueue);
        System.out.println(intQueue.poll());
        System.out.println(intQueue);
        System.out.println(intQueue.poll());
        System.out.println(intQueue);
        System.out.println(intQueue.poll());
        System.out.println(intQueue);
        System.out.println(intQueue.poll());

        System.out.println("Priority Queue - String test:");
        Queue<String> strQueue = new PriorQueueOwn<>();
        strQueue.add("as");
        strQueue.add("come");
        strQueue.add("of");
        strQueue.add("you");
        strQueue.add("are");
        strQueue.add("song");
        strQueue.add("nirvana");
        strQueue.add("curt");
        strQueue.add("cobayn");
        strQueue.add("by");
        System.out.println(strQueue.peek());

        System.out.println("Priority Queue - Book test wo comparator:");
        PriorQueueOwn<Book> bookQueue = new PriorQueueOwn<>();
        Book book0 = new Book("Pushkin", "Eugene Onegin");
        Book book1 = new Book("Pushkin", "The Tale about Tsar Saltan");
        Book book2 = new Book("Gogol", "Viy");
        Book book3 = new Book("Gogol", "Evenings on a farm near Dikanka");
        Book book4 = new Book("Lermontov", "Sail");
        Book book5 = new Book("Tolstoy", "War & Peace");
        Book book6 = new Book("Dostoevskiy", "Idiot");
        Book book7 = new Book("Gogol", "Nose");
        Book book8 = new Book("Ray Bradbury", "451 Fahrenheit");
        Book book9 = new Book("Pelevin", "Generation P");
        bookQueue.add(book0);
        bookQueue.add(book1);
        bookQueue.add(book2);
        bookQueue.add(book3);
        bookQueue.add(book4);
        bookQueue.add(book5);
        bookQueue.add(book6);
        bookQueue.add(book7);
        bookQueue.add(book8);
        bookQueue.add(book9);
        System.out.println(bookQueue.peek());
        System.out.println(bookQueue.remove());
        System.out.println(bookQueue.remove());
        System.out.println(bookQueue.remove());
        System.out.println(bookQueue.remove());
        System.out.println(bookQueue.remove());
        System.out.println(bookQueue.remove());
        System.out.println(bookQueue.remove());
        System.out.println(bookQueue.remove());
        System.out.println(bookQueue.remove());
        System.out.println(bookQueue);
        System.out.println("Comparator is " + bookQueue.comparator());

        System.out.println("Priority Queue - Book test with comparator:");
        Comparator<Book> bookComparator = new BookTitleComparator();
        PriorQueueOwn<Book> bookQueueWComp = new PriorQueueOwn<>(bookComparator);
        bookQueueWComp.add(book0);
        bookQueueWComp.add(book1);
        bookQueueWComp.add(book2);
        bookQueueWComp.add(book3);
        bookQueueWComp.add(book4);
        bookQueueWComp.add(book5);
        bookQueueWComp.add(book6);
        bookQueueWComp.add(book7);
        bookQueueWComp.add(book8);
        bookQueueWComp.add(book9);
        System.out.println(bookQueueWComp.peek());
        System.out.println(bookQueueWComp.contains(book0));
        System.out.println("Comparator is " + bookQueueWComp.comparator());
    }

    static class BookTitleComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}

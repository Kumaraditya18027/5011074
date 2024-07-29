package Sorting_Customer_Orders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.00),
            new Order("O002", "Bob", 100.00),
            new Order("O003", "Charlie", 150.00),
            new Order("O004", "Dave", 200.00),
            new Order("O005", "Eve", 50.00)
        };

   
        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
        BubbleSort.bubbleSort(orders);
        System.out.println("After Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

       
        Order[] orders2 = {
            new Order("O001", "Alice", 250.00),
            new Order("O002", "Bob", 100.00),
            new Order("O003", "Charlie", 150.00),
            new Order("O004", "Dave", 200.00),
            new Order("O005", "Eve", 50.00)
        };

        System.out.println("Before Quick Sort:");
        for (Order order : orders2) {
            System.out.println(order);
        }
        QuickSort.quickSort(orders2, 0, orders2.length - 1);
        System.out.println("After Quick Sort:");
        for (Order order : orders2) {
            System.out.println(order);
        }
    }
}

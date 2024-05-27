public class Task { 
    public static void main(String[] args) { 
    // Create and start two threads 
    Thread thread1 = new Thread(new Table(2)); 
    Thread thread2 = new Thread(new Table(5)); 
    thread1.start(); 
    thread2.start(); 
    } 
    static class Table extends Thread { 
    private final int n; 
    public Table(int n) { 
    this.n = n; 
    } 
    @Override 
    public void run() { 
    System.out.println("Table of "+n+"started."); 
    // Run a loop 
    for (int i = 1; i <= 10; i++) { 
    System.out.println(n+"x"+i+"="+(n*i)); 
    try { 
    // Introducing a small delay to simulate some work 
    Thread.sleep(1); 
    } catch (InterruptedException e) { 
    e.printStackTrace(); 
    } 
    } 
    System.out.println(n + "Table completed."); 
    } 
    } 
    }
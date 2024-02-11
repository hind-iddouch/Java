import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Task [] tasks  = new Task[]{
                        new Task(1, "A", 3000),
                        new Task(2, "B", 1000),
                        new Task(3, "C", 2000)};

        Task [] tasks1 = new Task[]{
                new Task(1, "X", 1000),
                new Task(2, "y", 4000),
                new Task(3, "Z", 6000)};


        // Synchronous Task Execution
        Task.taskSync(tasks);
        // Asynchronous Task Execution
        Task.taskAsyn(List.of(tasks1));
       // Concurrency Task Execution
        System.out.println("Concurrent Task Execution: ");
        ExecutorService executorService = Executors.newFixedThreadPool(tasks.length);
        for (Task t:tasks){
            executorService.submit(t);

        }
        executorService.shutdown();








    }

}
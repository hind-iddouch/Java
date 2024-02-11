import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Task implements Runnable {

    private final int taskId;
    private String taskNasme;
    private long duration;

    public Task(int taskId, String taskName, long duration) {
        this.taskId = taskId;
        this.taskNasme = taskName;
        this.duration = duration;
    }

    public int getTaskId() {
        return taskId;
    }
    public String getTaskName() {
        return taskNasme;
    }
    public long getDuration() {
        return duration;
    }

    public static void taskSync (Task[]tasks){
        System.out.println("Synchronous Task Execution: ");
        for(Task task:tasks){
          task.run();

        }
    }
    @Override
    public void run() {
        try {
            Thread.sleep(duration);
            System.out.print("Executing Task "+taskNasme+"... ");
            System.out.println("Completed! (Duration: "+duration+" ms)");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void taskAsyn(List<Task>tasks){
        System.out.println("Asynchronous Task Execution:");
        List<CompletableFuture>futures = new ArrayList<>();
        for (Task task:tasks){
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                System.out.print("\n Task "+task.getTaskName() +" started asynchronously.");
                try {
                    Thread.sleep(task.getDuration());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("\n Task "+task.getTaskName() +" completed asynchronously! (Duration: "+task.getDuration() +" ms)");
            });
            futures.add(future);
        }
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

    }




}


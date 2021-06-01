package GeekBrains.Multithreading.LectureTwo.Executors;

import java.util.concurrent.*;

public class ServiceApp {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService fixedService = Executors.newFixedThreadPool(10);
        ExecutorService singleService = Executors.newSingleThreadExecutor();
        ExecutorService cachedService = Executors.newCachedThreadPool();

        /*
        // Возвращает Future
        submit(Runnable runnable);
        submit(Callable callable);
        invokeAny(...);
        invokeAll(...);
         */

//        asyncOneThread();
//        futureFinishedOrNot();
//        submitCallable();
        getException();
    }

    public static void asyncOneThread() {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        // мы не можем сделать return из execute()
        executorService.execute(() -> {
            System.out.println("Async task...");
        });
        executorService.shutdown();
    }

    public static void futureFinishedOrNot() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future future;
        future = executorService.submit(() -> {
            System.out.println("Async task...");
        });
        System.out.println(future.get());  // null если задача завершилась
        executorService.shutdown();
    }

    public static void submitCallable() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Async call...");
                Thread.sleep(2000);
                return "Result from thread";
            }
        });
        // Запускаем поток:
        System.out.println("future.get(): " + future.get());
        executorService.shutdown();
    }

    public static void getException() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(() -> {
            System.out.println("Async call...");
            int x = 10 / 0;
            return "Result from thread";
        });
        try {
            System.out.println("future.get(): " + future.get());
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

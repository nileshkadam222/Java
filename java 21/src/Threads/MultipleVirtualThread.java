import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

private void task() {
    System.out.println(STR."Start task : \{Thread.currentThread()}");
    try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println(STR."end task : \{Thread.currentThread()}");
}
void main() throws InterruptedException {
    int noOfThread = 5000;
    List<Thread> virtualThreads = new ArrayList<>();
    for (int i=0; i<= noOfThread; i++){
        Thread virtualThread = Thread.ofVirtual().unstarted(this::task);
        virtualThreads.add(virtualThread);
    }

    virtualThreads.forEach(Thread::start);
    for (Thread virtualThread : virtualThreads) {
        virtualThread.join();
    }
}

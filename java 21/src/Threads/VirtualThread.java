private void task(){
    System.out.println(STR."Start task : \{Thread.currentThread()}");
}
void main() throws InterruptedException {
    Thread virtualThread = Thread.ofVirtual().unstarted(this::task);
    virtualThread.start();
    virtualThread.join();  // needed this because main thread need to wait until VT completes
}


private void task(){
    System.out.println(STR."Start task : \{Thread.currentThread()}");
}
void main(){
    Thread platformThread = Thread.ofPlatform().unstarted(this::task);
    platformThread.start();
}

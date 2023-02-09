package lesson15;

public class Factory {
    public static void main(String[] args) throws WorkerIsNotReadyException {

        Worker worker = new Worker("Alex");
        worker.readyToWork();

        worker.goToWork();

        worker.onVacation();
        worker.goToWork();
    }
}

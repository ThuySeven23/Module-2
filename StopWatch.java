package xay_dung_lop_stop_watch;

public class StopWatch {
    private long startTime , endTime;

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.setStartTime(System.currentTimeMillis());
    }

    public void stop() {
        this.setEndTime(System.currentTimeMillis());
    }

    public long getElapsedTime() {
        return this.getEndTime() - this.getStartTime();
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        watch.stop();
        System.out.println("The Elapsed time is: " + watch.getElapsedTime() + " milisec");
    }
}


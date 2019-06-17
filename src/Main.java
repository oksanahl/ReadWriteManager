public class Main {

    public static void main(String[] args) {

        ReadWriteManager RD = new ReadWriteManager("testfolder\\test_log1.log");
        long startTime = System.currentTimeMillis();
        RD.cacheFile();
        RD.writeRead();

        long stopTime = System.currentTimeMillis();
        long elapsedTime = (stopTime - startTime);
        System.out.println(elapsedTime + " " + "milliseconds");

    }
}

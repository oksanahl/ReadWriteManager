public class Main {

    public static void main(String[] args) {

        ReadWriteManager RD = new ReadWriteManager("C:\\Users\\okshl\\Downloads\\raw.en\\englishText_0_10000.txt");
        long startTime = System.currentTimeMillis();
        //RD.cacheFile();

        RD.writeFile("testfolder\\test.txt\\",RD.cacheFile());

        long stopTime = System.currentTimeMillis();
        long elapsedTime = (stopTime - startTime);
        System.out.println(elapsedTime + " " + "milliseconds");

    }
}

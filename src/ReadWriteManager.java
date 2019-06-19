import java.io.*;
import java.util.ArrayList;

public class ReadWriteManager {

    private String fileName;
    private File dir = new File ("testfolder");

    public ReadWriteManager (String fileName) {

        this.fileName = fileName;
        dir.mkdir();
    }

    public ArrayList <String> cacheFile () {

        BufferedReader bw = null;
        ArrayList<String> linelist = new ArrayList <String>();

        try {
            bw = new BufferedReader(new FileReader(fileName));
            String line = bw.readLine();
            while(line != null)
            {
                //System.out.println(line);
                linelist.add(line);
                line = bw.readLine();

            }

            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return linelist;
    }

    public void writeFile (String fileName, ArrayList <String> phrase) {

        try {
            FileWriter writer = new FileWriter (fileName,false);
            for (String str:phrase){
            writer.write(str);}
            writer.close();
        }

        catch (IOException e) {
            e.printStackTrace(); }
    }

}

import java.io.*;
import java.util.Vector;

public class ReadWriteManager {

    private String fileName;
    private File dir = new File ("testfolder");

    public ReadWriteManager (String fileName) {

        this.fileName = fileName;
        dir.mkdir();
    }
    
    public void clearFolder () {

        for(File file: dir.listFiles())
            if (!file.isDirectory())
                file.delete();
    }

    public Vector <String> cacheFile () {

        BufferedReader bw = null;
        Vector <String> linelist = new Vector <String>();

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

    public void writeFile (String fileName, String phrase) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter (fileName, true));
            bw.write(phrase + System.lineSeparator());
            bw.close();
        }

        catch (IOException e) {
            e.printStackTrace(); }
    }

    public void writeRead() {

        for (int i=0; i < cacheFile().size(); i++)
        {
            String response = cacheFile().elementAt(i);
            //System.out.println(response);
            writeFile("testfolder\\test.txt", response);
        }
    }
}

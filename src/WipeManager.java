import java.io.File;

public class WipeManager {

    public File dir = new File ("/");

    public WipeManager () {

        this.dir = dir;

    }

    public void clearFolder () {

        for(File file: dir.listFiles())
            if (!file.isDirectory())
                file.delete();
    }

}



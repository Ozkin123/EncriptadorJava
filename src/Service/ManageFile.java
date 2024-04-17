package Service;

import java.io.*;

public class ManageFile {

    public static void SelectFile(String document) {
        File file = new File(document);
        try(InputStream inputStream = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(inputStream)) {
            char[]buffer = new char[1024];
            while (reader.ready())
            reader.read(buffer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

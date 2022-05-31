package projava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;


public class ReadFile {
    public static void main(String[] args) throws IOException {
        var p = Path.of("text.txt");
        String s;
        try {
            s = Files.readString(p);
        } catch (NoSuchFileException e) {
            System.out.println("ファイルがみつかりません:" + e.getFile());
            return;
        }
        System.out.println(s);
    }
}

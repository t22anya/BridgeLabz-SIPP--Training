import java.io.*;
public class FileReaderWordCount {
    public static int countWord(String fileName, String word) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\s+");
            for (String w : words) {
                if (w.equals(word)) count++;
            }
        }
        br.close();
        return count;
    }
}
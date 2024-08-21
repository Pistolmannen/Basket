import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {

    private String path;

    public ReadFile(String file_path){
        path = file_path;
    }

    public String[] openFile() throws  IOException {

        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];

        for (int i=0; i < numberOfLines; i++){
            textData[i] = textReader.readLine();
        }

        textReader.close();
        return textData;

    }

    private int readLines() throws IOException{

        FileReader fileToRead = new FileReader(path);
        BufferedReader bf = new BufferedReader(fileToRead);

        String aLine;
        int numberOfLines = 0;

        while (( aLine = bf.readLine()) != null){
            numberOfLines++;
        }
        bf.close();

        return numberOfLines;

    }

}

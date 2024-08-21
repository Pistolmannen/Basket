import java.io.IOException;

public class MainTest {

    public static void main(String[] args) throws IOException{

        String fileName = "C:\\Users\\ErikGustafsson\\IdeaProjects\\Basket/Testnamn.txt"; // vägen till filen

        try {
            ReadFile file = new ReadFile(fileName);
            String[] aryLines = file.openFile();

            for(int i = 0; i < aryLines.length; i++){
                System.out.println(aryLines[i]);
            }
        }
        catch (IOException e) {
            System.out.println( e.getMessage() );
        }
    }
}

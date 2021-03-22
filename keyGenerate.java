import java.io.FileWriter;
import java.io.IOException;

public class keyGenerate {
    private String str = "";
    public String keyGenerate() throws IOException {
        // set array of items (only letters and numbers)
        char[] source;
        source = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        // get array length
        int arrayLen = source.length;

        int keyLen = 64;


        FileWriter writer = new FileWriter("keyGen.txt", false);

        try {
            int i = 0;
            while (i < keyLen) {
                // get random number for item's index
                int index = (int) (Math.random() * (arrayLen - 1 + 1) + 1);
                System.out.print("");
                // write item with random index to string
                writer.write(source[index - 1]);
                str += source[index - 1];
                i++;
            }
            writer.close();
            System.out.println("Write successfully!");
            System.out.println(str);
        } catch (IOException ex) {
            System.out.println("Writing Error");
        }
        return str;
    }

    public String getStr(){
        return str;
    }
}

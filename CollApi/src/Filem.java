import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Filem{
    public static void main(String[] args) {
        var file= "C:\\Users\\shreyama\\sample.txt";
        try{
            Files.writeString(Path.of(file), "how are you", StandardOpenOption.APPEND);

        String data=  Files.readString(Path.of(file));
        System.out.println(data);}
        catch(IOException e){
            e.printStackTrace();}
        }


    }


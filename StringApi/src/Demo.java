import java.util.List;
import java.util.stream.Collectors;

public class Demo{
    public static void main(String[] args){
        String dem= "  ";
        System.out.println(dem.isBlank());
        System.out.println(dem.isEmpty());
       String str="   hello   \n"
               + " world  \n"
               + "bye";
       str.lines().forEach(System.out::println);
        List<String> list= str.lines().collect(Collectors.toList());
        System.out.println(list);
    }
}

import java.util.Arrays;
public class sort{
   public static void main(String[] args){
    String[] names={"Virat","Jadeja","Messi","Anderson","Zakka"};
    Arrays.sort(names);

    System.err.println("Sorted Strings:");
    for (String name : names){
        System.out.println(name+",");
    }
   }
}

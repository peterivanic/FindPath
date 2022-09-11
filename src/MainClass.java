import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

       char[][] r =  FindPathUtils.convertFileToCharArray(
               FindPathUtils.readFileLineByLine("C:\\JAVA projects\\Find path app\\src\\maze.txt")
       );

        System.out.println(Arrays.toString(FindPathUtils.findStartOrEnd(r, 'X')));

    }
}

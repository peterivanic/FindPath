
public class MainClass {
    public static void main(String[] args) {

       char[][] maze =  FindPathUtils.convertFileToCharArray(
               FindPathUtils.readFileLineByLine("C:\\JAVA projects\\Find path app\\src\\maze.txt"));

       AbstractFindPathInputReader findPathInputReaderStdIn = new FindPathInputReaderStdIn();
        AbstractFindPathInputReader findPathInputReaderFile = new FindPathInputReaderFile();

        System.out.println(findPathInputReaderStdIn.findPath(maze,null));
        System.out.println(findPathInputReaderFile.findPath(null,"C:\\JAVA projects\\Find path app\\src\\maze.txt"));
    }
}

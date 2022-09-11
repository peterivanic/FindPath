public class FindPathInputReaderFile extends AbstractFindPathInputReader{

    FindPathInputReaderStdIn findPathInputReaderStdIn = new FindPathInputReaderStdIn();

    @Override
    public String findPath(char[][]maze,String file) {
        char[][] m = FindPathUtils.convertFileToCharArray(FindPathUtils.readFileLineByLine(file));
        return findPathInputReaderStdIn.findPath(m,null);
    }

}

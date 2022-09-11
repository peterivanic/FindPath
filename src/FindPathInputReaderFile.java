public class FindPathInputReaderFile extends AbstractFindPathInputReader{

    FindPathInputReaderStdIn findPathInputReaderStdIn = new FindPathInputReaderStdIn();

    @Override
    public String findPath(char[][] maze) {
        return null;
    }

    @Override
    public String findPath(String file) {
        char[][] maze = FindPathUtils.convertFileToCharArray(FindPathUtils.readFileLineByLine(file));
        return findPathInputReaderStdIn.findPath(maze);
    }

}

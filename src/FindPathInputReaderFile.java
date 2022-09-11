public class FindPathInputReaderFile extends AbstractFindPathInputReader{

    public String findPath(String file) {
        char[][] maze = FindPathUtils.convertFileToCharArray(FindPathUtils.readFileLineByLine(file));
        return super.findPath(maze);
    }
}

public class FindPathInputReaderStdIn extends AbstractFindPathInputReader {

    @Override
    public String findPath(char[][] maze, String file) {
        int[] start = FindPathUtils.findStartOrEnd(maze, 'S');
        int[] end = FindPathUtils.findStartOrEnd(maze, 'X');
        StringBuilder sb = new StringBuilder();
        int actualColumn = start[1];
        int actualRow = start[0] + 1;
        int horizontalDifference = findDifference(start[1], end[1]);
        int verticalDifference = findDifference(start[0], end[0]);
        int verticalCarry = 0;

        //find horizontal path
        for (int i = 0; i < horizontalDifference; i++) {
            if (actualColumn < end[1]) {
                if (maze[actualRow][actualColumn + 1] != '#') {
                    actualColumn++;
                    sb.append('r');
                } else {
                    if (actualRow > end[0]) {
                        actualRow++;
                        i--;
                        sb.append('u');
                        verticalCarry++;
                    } else {
                        actualRow--;
                        sb.append('d');
                        i--;
                        verticalCarry--;
                    }
                }
            } else {
                if (maze[actualRow][actualColumn + 1] != '#') {
                    actualColumn--;
                    sb.append('l');
                } else {
                    if (actualRow < end[0]) {
                        actualRow++;
                        i--;
                        sb.append('u');
                    } else {
                        actualRow--;
                        sb.append('d');
                        i--;
                    }
                }
            }
        }

        //find vertical path
        for (int i = 0; i < verticalDifference + verticalCarry; i++) {
            if (actualRow < end[0]) {
                if (maze[actualRow + 1][actualColumn] != '#') {
                    actualRow++;
                    sb.append('d');
                } else {
                    actualColumn--;
                    sb.append('l');
                    i--;
                }
            } else {
                if (maze[actualRow - 1][actualColumn] != '#') {
                    actualRow--;
                    sb.append('u');
                } else {
                    actualColumn--;
                    sb.append('l');
                    i--;
                }
            }
        }
        return sb.toString();
    }

    public static int findDifference(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }
}

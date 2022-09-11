import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FindPathUtils {

    public static int[] findStartOrEnd(char[][] mazeIn2D, char character) {
        int count = 0;
        int[] result = new int[2];
        for (int i = 0; i < mazeIn2D.length; i++) {
            for (int j = 0; j < mazeIn2D[i].length; j++) {
                if (mazeIn2D[i][j] == character) {
                    result[0] = i;
                    result[1] = j;
                    count++;
                }
            }
        }
        if (count > 0) {
            return result;
        } else {
            return null;
        }
    }

    public static char[][] convertFileToCharArray(List<String> listOfLines) {

        char[][] result = new char[listOfLines.size()][];

        for (int i = 0; i < listOfLines.size(); i++) {
            result[i] = listOfLines.get(i).toCharArray();
        }
        return result;
    }

    public static List<String> readFileLineByLine(String file) {
        Path filepath = Paths.get(file);
        try {
            return Files.readAllLines(filepath);
        } catch (IOException e) {
            System.err.println("Unable to read file: " + file);
            return new ArrayList<>();
        }
    }
}

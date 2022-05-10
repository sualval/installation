import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String PATH = "D:/Games/";
        File src = new File(PATH, "src");
        File res = new File(PATH, "res");
        File saveGames = new File(PATH, "savegames");
        File temp = new File(PATH, "temp");
        File main = new File(src, "main");
        File test = new File(src, "test");
        File mainJava = new File(main, "Main.java");
        File utilJava = new File(main, "Utils.java");
        File drawables = new File(res, "drawables");
        File vectors = new File(res, "vectors");
        File icons = new File(res, "icons");
        File temptxt = new File(temp, "temp.txt");
        stringBuilder.append(temp(src.mkdir(), src.getName()));
        stringBuilder.append(temp(res.mkdir(), res.getName()));
        stringBuilder.append(temp(saveGames.mkdir(), saveGames.getName()));
        stringBuilder.append(temp(temp.mkdir(), temp.getName()));
        stringBuilder.append(temp(main.mkdir(), main.getName()));
        stringBuilder.append(temp(test.mkdir(), test.getName()));
        stringBuilder.append(temp(drawables.mkdir(), drawables.getName()));
        stringBuilder.append(temp(vectors.mkdir(), vectors.getName()));
        stringBuilder.append(temp(icons.mkdir(), icons.getName()));
        try {
            stringBuilder.append(temp(temptxt.createNewFile(), temptxt.getName()));
            stringBuilder.append(temp(mainJava.createNewFile(), mainJava.getName()));
            stringBuilder.append(temp(utilJava.createNewFile(), utilJava.getName()));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        try (FileWriter fileWriter = new FileWriter(temptxt)) {
            fileWriter.write(stringBuilder.toString());
        } catch (IOException exception) {
            exception.getMessage();
        }
    }

    public static String temp(boolean result, String name) {
        return result ? name + " успешно создан\n" : name + " не создан\n";
    }

}


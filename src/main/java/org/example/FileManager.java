package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileManager {

    private final File file;
    FileManager(String fileName) {
        ClassLoader classLoader = FileManager.class.getClassLoader();
        file = new File(classLoader.getResource("text.txt").getFile());
    }

    public String getFileContent() throws FileNotFoundException {
        Scanner sc = new Scanner(file);

        String all = "";
        while (sc.hasNextLine())
            all = all.concat(sc.nextLine() + "\n");
        return all;
    }

    public String getRandomWord() throws FileNotFoundException {
        List<String> s = Arrays.asList(getFileContent().split(" "));
        Random rand = new Random();
        int randomIndex = rand.nextInt(s.size());

        return s.get(1);
    }
}

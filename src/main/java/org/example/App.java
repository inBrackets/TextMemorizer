package org.example;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    static File file;
    static FileManager fileManager;
    public static void main(String[] args) throws Exception
    {
        fileManager = new FileManager("text.txt");

        String all = fileManager.getFileContent();

        StringProcessor stringProcessor = new StringProcessor(fileManager.getRandomWord());
        stringProcessor.removeNonAlphabeticalCharacters();
        String secretWord = stringProcessor.getContent();


        System.out.println(secretWord);
        System.out.println(all.replace(secretWord, stringProcessor.getSecretPlaceholder()));
    }
}

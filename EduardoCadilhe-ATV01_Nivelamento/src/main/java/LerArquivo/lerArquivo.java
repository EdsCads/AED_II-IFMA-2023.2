/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LerArquivo;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;

/**
 *
 * @author Cadilhe
 */
public class lerArquivo {
public static List<String> readFileInList(String fileName) {

	List<String> lines = Collections.emptyList();
	try {
            lines =
            Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
	}
	catch (IOException e) {
            // do something
            e.printStackTrace();
	}
        return lines;
    }
}

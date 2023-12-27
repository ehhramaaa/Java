/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.latihan.uas;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author ehhramaa
 */
public class DatabaseStudent {
    private static boolean fileExists(String filename) {
        File file = new File(filename);
        return file.exists();
    }
    
    private static void createFile(String filename) {
        try {
            File file = new File(filename);
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
    
    private static JsonObject readJson(String filename) {
        // Membaca data dari file JSON
        try (FileReader fileReader = new FileReader(filename)) {
            return JsonParser.parseReader(fileReader).getAsJsonObject();
        } catch (IOException e) {
            return null;
        }
    }
    
    public void save(Student mahasiswa) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(mahasiswa);
        
        String filename;
        
        JsonObject data = JsonParser.parseString(json).getAsJsonObject();
        String newData = data.get("npm").getAsString();

        
        
        if (data.has("major")) {
            filename = "GraduatedStudent.json";
        } else {
            filename = "UngraduatedStudent.json";
        }
        
        FileWriter fileWriter = new FileWriter(filename, true);
        

        if (!fileExists(filename)) {
            createFile(filename);
        }
        
        JsonObject existingData = readJson(filename);
        String exitsData = existingData.get("npm").getAsString();
        
        if (!newData.equals(exitsData)) {
            try {
                fileWriter.write(json);
            } catch (IOException e) {
                System.out.println("Terjadi error: " + e.getMessage());
            }
        } else {
            System.out.println("Data sudah ada di dalam file. Silahkan ke menu Show Information Mahasiswa Untuk melihat informasinya");
        }
    }
}

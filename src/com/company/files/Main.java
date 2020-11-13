package com.company.files;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("src/com/company/files/text1.txt")){
            int character = fileReader.read();
            while(character != -1){
                System.out.print((char) character);
                character = fileReader.read();
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        try (
                FileWriter fileWriter = new FileWriter("src/com/company/files/text2.txt");
                ){
            String myString = "Goodbye!";
            fileWriter.write(myString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

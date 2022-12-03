package edu.eci.cvds.persistence;

import java.io.FileWriter;

public class Report {
    public static void loadReport(String error)  {
        try {
            FileWriter data = new FileWriter("Errores.txt");
            data.write(error+"\r\n");
            data.close();
        }catch (Exception e){
            System.out.println("Error interno");
        }

    }

}
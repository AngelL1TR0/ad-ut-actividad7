package app;

import Service.FileService;

public class Actividad8 {

    private final static String PATH = "/home/angel/Documentos/prueba.txt";

    public static void main(String[] args) {
        FileService fileService = new FileService();
        fileService.separaFicheros(PATH);
    }
}

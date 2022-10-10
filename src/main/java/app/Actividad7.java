package app;

import Service.FileService;

public class Actividad7 {

    private static final String NOMBRE_FICHERO_RESULTADO="/home/angel/Documentos/prueba.txt";

    public static void main(String[] args) {
        String folderName = args[0];
        FileService fileService = new FileService();
        fileService.createFIleWithFileList(NOMBRE_FICHERO_RESULTADO, folderName);
    }
}

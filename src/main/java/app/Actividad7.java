package app;

import service.FileService;

public class Actividad7 {

    private static final String PATH = "/home/angel/Descargas";

    public static void main(String[] args) {
        String folderName = args[0];
        FileService fileService = new FileService();
        fileService.createFileWithFileList();
    }
}

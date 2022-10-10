package service;

import dao.FileDAO;
import dao.FileDAOImpl;
import entity.FileInfoEntity;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileService{

    FileDAO fileDAO = new FileDAOImpl();
    public void createFileWithFileList(String nombreFicheroResultado, String folderName) {
        File folder = new File(folderName);
        if(folder.exists() && folder.isDirectory()) {
            List<FileInfoEntity> fileInfoEntityList = fileDAO.createInfoFile(folder);
            try {
                fileDAO.crearListado(FileInfoEntity, nombreFicheroResultado);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
            else {
                System.out.println("La carpeta no existe");
                throw new RuntimeException();

        }
    }
}

package Service;

import dao.FileDAO;
import dao.FileDAOImpl;
import entity.FileInfoEntity;

import java.io.File;
import java.util.List;

public class FileService {
    FileDAO fileDAO = new FileDAOImpl();
    public void createFIleWithFileList(String nombreFicheroResultado, String folderName) {
        File folder = new File(folderName);
        if (folder.exists() && folder.isDirectory()){
            List<FileInfoEntity> fileInfoEmptities = fileDAO.createInfoFile(folder);
            fileDAO.crearListado(fileInfoEmptities, nombreFicheroResultado);
        } else {
            System.out.println("La carpeta pasada por parametro no existe o no es una carpeta");
            throw new RuntimeException();
        }
    }

}

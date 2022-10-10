package dao;

import entity.FileInfoEntity;

import java.io.File;
import java.util.List;

public interface FileDAO {
    List<FileInfoEntity> createInfoFile(File folderName);

    void crearListado(List<FileInfoEntity> fileInfoEmptities, String nombreFicheroResultado);
}

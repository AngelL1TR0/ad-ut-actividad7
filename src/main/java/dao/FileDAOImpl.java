package dao;

import entity.FileInfoEntity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileDAOImpl implements FileDAO {
    @Override
    public List<FileInfoEntity> createInfoFile(File folder) {
        List<FileInfoEntity> fileInfoEntitiList = new ArrayList<>();
        for (File file: folder.listFiles()) {
            FileInfoEntity fileInfoEntity = new FileInfoEntity();
            fileInfoEntity.setFilename(file.getName());
            fileInfoEntity.setType(file.isDirectory() ? "D" : "F");
            if (file.canExecute()){
                fileInfoEntity.getPermissions().add()
            }
        }
        return null;
    }
}

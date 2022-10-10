package dao;

import entity.FileInfoEntity;

import java.io.File;
import java.util.List;

public interface FileDAO {
    List<FileInfoEntity> createInfoFile(File folder);
}

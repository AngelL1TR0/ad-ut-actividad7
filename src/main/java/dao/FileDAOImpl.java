package dao;

import entity.FileInfoEntity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDAOImpl implements FileDAO{

    @Override
    public List<FileInfoEntity> createInfoFile(File folderName) {
        List<FileInfoEntity> fileInfoEmptities = new ArrayList<>();
        for(File f : folderName.listFiles()){
            FileInfoEntity fileInfoEntity = new FileInfoEntity();
            fileInfoEntity.setName(f.getName());
            fileInfoEntity.setType(f.isDirectory() ? "D" : "F");
            if (f.canExecute()){
                fileInfoEntity.getPermissions().add("X");
            }
            if (f.canRead()){
                fileInfoEntity.getPermissions().add("R");
            }
            if (f.canWrite()){
                fileInfoEntity.getPermissions().add("W");
            }
            fileInfoEmptities.add(fileInfoEntity);
        }
        return fileInfoEmptities;
    }

    @Override
    public void crearListado(List<FileInfoEntity> fileInfoEmptities, String nombreFicheroResultado) {
        File ficheroResultado = new File(nombreFicheroResultado);
        try(PrintWriter pw = new PrintWriter(ficheroResultado)) {
            if(!ficheroResultado.exists()){
                ficheroResultado.createNewFile();
            }

            for (FileInfoEntity f : fileInfoEmptities){
                System.out.println(f.toPrint());
                pw.println(f.toPrint());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

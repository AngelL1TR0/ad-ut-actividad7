package entity;

import java.util.ArrayList;
import java.util.List;

public class FileInfoEntity {

    public static final String SEPARATOR = ";";

    private String filename;
    private String type;
    private List<String> permissions;
    private long size;

    public FileInfoEntity(String filename, String type, List<String> permissions, long size) {
        this.filename = filename;
        this.type = type;
        this.permissions = permissions;
        this.size = size;
    }

    public FileInfoEntity() {
        super();
        this.permissions = new ArrayList<>();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}

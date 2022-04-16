package ar.edu.unlp.info.oo2.ej2_file_manager;

import java.time.LocalDateTime;

public abstract class FileOO2 {
    String name;
    String extension;
    String permissions;
    int size;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;



    public void modify() {
        this.modifiedAt = LocalDateTime.now();
    }

    public abstract String prettyPrint();

    public int getSize() {
        return size;
    }

    public abstract String getName();

    public String getPermissions() {
        return permissions;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public String getExtension() {
        return extension;
    }
}

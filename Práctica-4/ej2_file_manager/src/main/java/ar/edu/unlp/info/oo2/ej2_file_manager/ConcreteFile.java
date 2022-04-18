package ar.edu.unlp.info.oo2.ej2_file_manager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class ConcreteFile implements FileOO2 {
    String name;
    String extension;
    int size;
    String permissions;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");

    public ConcreteFile(String name,int size,String extension, String permissions){
        this.name = name;
        this.size = size;
        this.extension = extension;
        this.permissions = permissions;
        this.createdAt = LocalDateTime.now();
        this.modifiedAt = LocalDateTime.now();
    }

    public void modify() {
        this.modifiedAt = LocalDateTime.now();
    }

    @Override
    public String prettyPrint() {
        return "";
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPermissions() {
        return this.permissions;
    }

    @Override
    public String getCreatedAt() {
        return this.createdAt.format(formatter);
    }

    @Override
    public String getModifiedAt() {
        return this.modifiedAt.format(formatter);
    }

    @Override
    public String getExtension() {
        return this.extension;
    }
}

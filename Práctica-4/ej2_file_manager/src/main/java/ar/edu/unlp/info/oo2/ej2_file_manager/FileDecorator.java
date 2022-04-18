package ar.edu.unlp.info.oo2.ej2_file_manager;

import java.time.LocalDateTime;

public class FileDecorator implements FileOO2 {
    FileOO2 component;
    public FileDecorator(FileOO2 component) {
        this.component = component;
    }

    @Override
    public int getSize() {
        return this.component.getSize();
    }

    @Override
    public String getName() {
        return this.component.getName();
    }

    @Override
    public String getPermissions() {
        return this.component.getPermissions();
    }

    @Override
    public String getCreatedAt() {
        return this.component.getCreatedAt();
    }

    @Override
    public String getModifiedAt() {
        return this.component.getModifiedAt();
    }

    @Override
    public String getExtension() {
        return this.component.getExtension();
    }

    @Override
    public void modify() {
        this.component.modify();
    }

    @Override
    public String prettyPrint() {
        return this.component.prettyPrint();
    }
}

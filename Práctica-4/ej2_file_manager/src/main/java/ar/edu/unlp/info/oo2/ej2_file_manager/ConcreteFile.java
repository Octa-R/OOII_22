package ar.edu.unlp.info.oo2.ej2_file_manager;

import java.time.LocalDateTime;

public class ConcreteFile extends FileOO2 {

    public ConcreteFile(String name,int size,String ext, String per){
        this.name = name;
        this.size = size;
        this.extension = ext;
        this.permissions = per;
        this.createdAt = LocalDateTime.now();
        this.modifiedAt = LocalDateTime.now();
    }

    @Override
    public String prettyPrint() {
        return "";
    }

    @Override
    public String getName() {
        return this.name;
    }
}

package ar.edu.unlp.info.oo2.ej2_file_manager;

import java.time.LocalDateTime;

public interface FileOO2 {
    public void modify();
    public String prettyPrint();
    public int getSize();
    public String getName();
    public String getPermissions();
    public String getCreatedAt();
    public String getModifiedAt();
    public String getExtension();
}

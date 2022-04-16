package ar.edu.unlp.info.oo2.ej2_file_manager;

public class FileDecorator extends FileOO2 {
    FileOO2 component;
    public FileDecorator(FileOO2 component) {
        this.component = component;
    }

    @Override
    public int getSize() {
        return this.component.size;
    }

    @Override
    public String getName() {
        return this.component.getName();
    }

    @Override
    public String prettyPrint() {
        return this.component.prettyPrint();
    }
}

package ar.edu.unlp.info.oo2.ej2_file_manager;

public class ExtensionDecorator extends FileDecorator{
    public ExtensionDecorator(FileOO2 component) {
        super(component);
    }
    @Override
    public String prettyPrint() {
        return this.component.getExtension() + " " + super.prettyPrint();
    }
}

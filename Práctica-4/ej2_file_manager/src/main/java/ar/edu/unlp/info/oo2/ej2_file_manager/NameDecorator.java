package ar.edu.unlp.info.oo2.ej2_file_manager;

public class NameDecorator extends FileDecorator{
    public NameDecorator(FileOO2 component) {
        super(component);
    }
    @Override
    public String prettyPrint() {
        return this.component.getName() + " " + super.prettyPrint();
    }
}

package ar.edu.unlp.info.oo2.ej2_file_manager;

public class SizeDecorator extends FileDecorator {
    public SizeDecorator(FileOO2 component) {
        super(component);
    }
    @Override
    public String prettyPrint() {
        return this.component.getSize() + "Kb " + super.prettyPrint();
    }
}

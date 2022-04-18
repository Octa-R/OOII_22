package ar.edu.unlp.info.oo2.ej2_file_manager;

public class PermissionsDecorator extends FileDecorator {
    public PermissionsDecorator(FileOO2 component) {
        super(component);
    }
    @Override
    public String prettyPrint() {
        return this.component.getPermissions() + " " + super.prettyPrint();
    }
}

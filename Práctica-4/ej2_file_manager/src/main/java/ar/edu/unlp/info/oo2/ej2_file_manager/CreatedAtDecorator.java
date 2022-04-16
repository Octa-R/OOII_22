package ar.edu.unlp.info.oo2.ej2_file_manager;

public class CreatedAtDecorator extends FileDecorator{
    public CreatedAtDecorator(FileOO2 component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return super.prettyPrint() + this.createdAt;
    }


}

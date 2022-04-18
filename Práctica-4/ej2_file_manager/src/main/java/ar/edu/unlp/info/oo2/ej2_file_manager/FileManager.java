package ar.edu.unlp.info.oo2.ej2_file_manager;

public class FileManager {
    public static void main(String[] args) {
        FileOO2 file = new ConcreteFile("uwu",19,"bat","rwe");
        NameDecorator name = new NameDecorator(file);
        ExtensionDecorator ext = new ExtensionDecorator(name);

        System.out.println(ext.prettyPrint());

        PermissionsDecorator per = new PermissionsDecorator(ext);
        SizeDecorator size = new SizeDecorator(per);
        CreatedAtDecorator cre = new CreatedAtDecorator(size);
        ModifiedDecorator mod = new ModifiedDecorator(cre);

        System.out.println(mod.prettyPrint());
        file.modify();
        System.out.println(mod.prettyPrint());
    }
}

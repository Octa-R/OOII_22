package ar.edu.unlp.info.oo2.ej2_file_manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

public class FileOO2Test {
    FileOO2 file1;

    @BeforeEach
    void setup() {
        file1 = new ConcreteFile("xd",19,"bat","rwe");
    }

    void testFileDecorators() {

        System.out.println();

    }
}

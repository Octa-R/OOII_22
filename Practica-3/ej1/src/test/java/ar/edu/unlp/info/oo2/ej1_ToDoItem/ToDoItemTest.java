/**
 * 
 */
package ar.edu.unlp.info.oo2.ej1_ToDoItem;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {

	ToDoItem todo1,todo2,todo3;

	@BeforeEach
	void setUp() throws Exception {
		todo1 = new ToDoItem("comprar alimento para el gato");
		todo2 = new ToDoItem("sacar a pasear el perro");
		todo3 = new ToDoItem("comprar 5kg de papa");
	}
	
	@Test
	public void testTogglePause() {
		try {
			todo2.togglePause();
		} catch (Exception e) {
			assertEquals(new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress"), e);
		}
	}
	
	
	
	@Test
	public void testFinish() {}
	
	@Test
	public void testWorkedTime() {}
	
	@Test
	public void testAddComment() {
		String commentA = "compra excelent porque el otro le hace mal",
				commentB = "no compres en el chino";
		todo1.addComment(commentA);
		todo1.start();
		todo1.finish();
		todo1.addComment(commentB);
		List<String> list = new ArrayList<>();
		list.add(commentA);
		assertEquals(list,todo1.getComments());
	}
}

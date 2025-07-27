public class TestEditor {
	public static void main(String[] args) {
		DocumentInvoker myDocument = new DocumentInvoker("callmemaybe");
		
		// Test case 1: Undo(0) - should remove the first command
		System.out.println("=== Test Case 1: Undo(0) ===");
		myDocument.Write("Hey I just met you");
		myDocument.Write("And this is crazy");
		myDocument.Write("But here's my number");
		myDocument.Undo(0);
		System.out.println(myDocument.Read());
		
		// Test case 2: Undo(2) - should remove the third command
		System.out.println("\n=== Test Case 2: Undo(2) ===");
		myDocument = new DocumentInvoker("callmemaybe");
		myDocument.Write("Hey I just met you");
		myDocument.Write("And this is crazy");
		myDocument.Write("But here's my number");
		myDocument.Undo(2);
		System.out.println(myDocument.Read());
		
		// Test case 3: Demonstrate redo functionality
		System.out.println("\n=== Test Case 3: Redo functionality ===");
		myDocument = new DocumentInvoker("callmemaybe");
		myDocument.Write("Hey I just met you");
		myDocument.Write("And this is crazy");
		myDocument.Write("But here's my number");
		System.out.println("After writing 3 lines:");
		System.out.println(myDocument.Read());
		
		myDocument.Undo(); // Undo last command
		System.out.println("After Undo():");
		System.out.println(myDocument.Read());
		
		myDocument.Redo(); // Redo last undone command
		System.out.println("After Redo():");
		System.out.println(myDocument.Read());
		
		// Test case 4: Show command buffer with redo stack
		System.out.println("\n=== Test Case 4: Command Buffer ===");
		myDocument.printCommandBuffer();
	}
}

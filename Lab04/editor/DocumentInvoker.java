import java.util.ArrayList;
import java.util.Stack;

public class DocumentInvoker {
	private ArrayList<Command> commands = new ArrayList<Command>();
	private Stack<Command> redoStack = new Stack<Command>();
	private Document currentdoc;

	public DocumentInvoker(String name) {
		currentdoc = new Document(name);
	}

	// undo the last command
	public void Undo() {
		if (!commands.isEmpty()) {
			Command cmd = commands.remove(commands.size() - 1);
			cmd.undo();
			redoStack.push(cmd);
		}
	}

	// redo the last undone command
	public void Redo() {
		if (!redoStack.isEmpty()) {
			Command cmd = redoStack.pop();
			cmd.redo();
			commands.add(cmd);
		}
	}

	// undo the command at the specified level (0-indexed)
	public void Undo(int level) {
		System.out.println("---- Undo level " + level);
		if (level >= 0 && level < commands.size()) {
			Command cmd = commands.remove(level);
			cmd.undo();
			redoStack.push(cmd);
		}
	}

	// redo the command at the specified level
	public void Redo(int level) {
		System.out.println("---- Redo level " + level);
		if (level >= 0 && level < redoStack.size()) {
			// Get the command at the specified level from redo stack
			Stack<Command> tempStack = new Stack<Command>();
			Command targetCmd = null;
			
			// Pop commands until we reach the target level
			for (int i = 0; i <= level && !redoStack.isEmpty(); i++) {
				if (i == level) {
					targetCmd = redoStack.pop();
				} else {
					tempStack.push(redoStack.pop());
				}
			}
			
			// Push back the commands that were above the target
			while (!tempStack.isEmpty()) {
				redoStack.push(tempStack.pop());
			}
			
			// Execute the target command
			if (targetCmd != null) {
				targetCmd.redo();
				commands.add(targetCmd);
			}
		}
	}

	public void Write(String text) {
		DocumentWriteCommand cmd = new DocumentWriteCommand(currentdoc, text);
		commands.add(cmd);
		// Clear redo stack when new command is executed
		redoStack.clear();
	}

	public void Erase(String text) {
		DocumentEraseCommand cmd = new DocumentEraseCommand(currentdoc, text);
		commands.add(cmd);
		// Clear redo stack when new command is executed
		redoStack.clear();
	}

	// public void Erase(int line)
	// {
	// DocumentEraseCommand cmd = new
	// DocumentEraseCommand(currentdoc,line);
	// commands.add(cmd);
	// }

	public void Bold(int line) {
		DocumentBoldCommand cmd = new DocumentBoldCommand(currentdoc, line);
		commands.add(cmd);
		// Clear redo stack when new command is executed
		redoStack.clear();
	}

	public void RemoveBold(int line) {
		DocumentRemoveBoldCommand cmd = new DocumentRemoveBoldCommand(
				currentdoc, line);
		commands.add(cmd);
		// Clear redo stack when new command is executed
		redoStack.clear();
	}

	public String Read() {
		return currentdoc.Read();
	}

	public void printCommandBuffer() {
		StringBuffer txt = new StringBuffer();
		txt.append("---- Commands issued----\n");
		for (int i = 0; i < commands.size(); i++) {
			txt.append(i + ":" + commands.get(i) + "\n");
		}
		txt.append("---- Redo Stack----\n");
		for (int i = 0; i < redoStack.size(); i++) {
			txt.append(i + ":" + redoStack.get(i) + "\n");
		}
		System.out.println(txt.toString());
	}
}

package ru.itstep.studyshell;

public class ChangeDirectoryCommandFactory implements CommandFactory {
	@Override
	public Command create(String command) {
		if (command.startsWith("cd")) {
			return new ChangeDirectoryCommand(command.split(" ")[1]);
		}
		return null;

	}

}

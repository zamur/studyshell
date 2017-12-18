package ru.itstep.studyshell;

public class EchoDirectoryCommand implements Command {
	private String command;
	private String field;

	public EchoDirectoryCommand(String field) {
		this.field = field;
	}

	public Command create(String command) {

		if (command.startsWith("echo"))
			return new EchoDirectoryCommand(command.split(" ")[1]);
		return null;
	}

	public void execute() {

		System.out.println(field);

	}

}

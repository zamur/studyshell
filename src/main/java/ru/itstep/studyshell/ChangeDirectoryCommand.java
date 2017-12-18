package ru.itstep.studyshell;

import java.io.File;

public class ChangeDirectoryCommand implements Command {
	private String directory;

	public static class Factory implements CommandFactory {

		private static final Object COMMAND = "cd";

		@Override
		public Command create(String command) {
			// TODO Auto-generated method stub
			// cd/home/user/blala
			String[] split = command.split(" ");
			// {"cd", "/home/user/blala"}
			if (split.length > 0 && split[0].equals(COMMAND)) {
				return new ChangeDirectoryCommand(split[1]);
			}
			return null;
		}

	}

	public static CommandFactory createFactory() {
		return new Factory();
	}

	public ChangeDirectoryCommand(String directory) {

		this.directory = directory;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		App.getInstance().setCurrentDirectory(new File(directory));

	}

}

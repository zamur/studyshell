package ru.itstep.studyshell;

import java.util.ArrayList;

import java.util.*;

public class CommandRepository implements CommandFactory {

	private static CommandRepository instance;
	private List<CommandFactory> factories = new ArrayList<CommandFactory>();

	private CommandRepository() {
		factories.add(new ListDirectoryCommandFactory());
		factories.add(new ChangeDirectoryCommandFactory());

	}

	public static CommandRepository getInstance() {
		if (instance == null)
			instance = new CommandRepository();

		return instance;
	}

	public Command create(String command) {

		for (CommandFactory factory : factories) {
			Command result = factory.create(command);
			if (result != null)
				return result;

		}
		return null;
	}
}

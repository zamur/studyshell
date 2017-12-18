package ru.itstep.studyshell;

import java.io.File;
import java.util.Arrays;

public class ListDirectoryCommand implements Command {

	private FilesOutputStrategy outputStrategy;

	public void execute() {
		// TODO Auto-generated method stub

		File file = App.getInstance().getCurrentDirectory();
		File[] listOfFiles = file.listFiles();

		outputStrategy.output(Arrays.asList(listOfFiles));

	}

	public ListDirectoryCommand(FilesOutputStrategy outputStrategy) {

		this.outputStrategy = outputStrategy;
	}

}

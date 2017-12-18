package ru.itstep.studyshell;

import java.io.File;
import java.util.Scanner;

public class App {

	private static boolean exit = false;
	private static App instance;
	private File currentDirectory = new File("./");

	private App() {
	}

	public static void main(String[] args) {
		while (!exit) {

			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			Command command = CommandRepository.getInstance().create(line);
			if (command != null)
				command.execute();
			System.out.println(App.getInstance().getCurrentDirectory().getAbsolutePath());

		}
	}

	public static void setExit() {
		exit = true;
	}

	public static App getInstance() {
		// TODO Auto-generated method stub
		if (instance == null)
			instance = new App();

		return instance;
	}

	public File getCurrentDirectory() {
		// TODO Auto-generated method stub
		return currentDirectory;
	}

	public void setCurrentDirectory(File currentDirectory) {
		this.currentDirectory = currentDirectory;
	}

}

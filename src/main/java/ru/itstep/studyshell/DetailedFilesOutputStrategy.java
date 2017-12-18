package ru.itstep.studyshell;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

public class DetailedFilesOutputStrategy implements FilesOutputStrategy {
	

	private Object list;
	Date dateNow = new Date();

	public void output(List<File> files) {
		for (File f : files) {

			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			Long space = f.length();
			final double kilobytes = space / 1024.0;

			System.out.print("Последний Формат : " + sdf.format(dateNow) + "  ");
			System.out.print("Файл: " + f.isFile() + "  ");
			System.out.print("Каталог: " + f.isDirectory() + "  ");
			System.out.printf("Размер файла в килобайтах: %.2f", kilobytes);
			System.out.print("Имя " + f.getName() + "  \n");

		}
		System.out.println();
	}

}

package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStreamEx {

	public static void main(String[] args)throws IOException {
		Files.list(Paths.get("."))
		.map(Path::getFileName)
		.map(Path::toString)
		.map(String::toUpperCase).filter(name->name.endsWith("TXT")).skip(2).sorted().limit(5)
				
		.forEach(System.out::println);
		
		
		
		
		System.out.println();
	}

}

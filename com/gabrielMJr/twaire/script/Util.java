package com.gabrielMJr.twaire.script;

import java.io.IOException;
import java.io.File;


public class Util
{
	private static final String HOME = File.separator + "home" + File.separator + "runner" + File.separator + "work" + File.separator + "gabrielmjr" + File.separator + "gabrielmjr";

	private static File oldReadmeFile;
	private static File newReadmeFile;


	public static void main(String[] args)
	{
		System.out.println("Renamer started");
		oldReadmeFile = new File(HOME + File.separator + README.html");
		newReadmeFile = new File(HOME + File.separator + "README.md");

		if (newReadmeFile.exists())
		{
			System.out.println("Skipping, file already exists...");
			System.exit(0);
			return;
		}
		else if (!renameReadmeFile())
		{
			System.out.println("File not renamed");
			System.exit(1);
		}
	}

	private static Boolean renameReadmeFile()
	{
		return oldReadmeFile.renameTo(newReadmeFile);
	}
}

package com.collectionFramework;
import java.io.File;
public class FileExist 
{

	public boolean checkFileExist(String string) 
	{
		File file = new File(string);
		return file.exists();
	}
	

}

package common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write
{
	
	public void writeData(String filepath,String content) throws IOException 
	{
		File file=new File(filepath);
		
		if(file.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("Hi i am hear");
			System.out.println("file already exists");
		}
		
		FileWriter writer=new FileWriter(file);
		
		writer.write(content);
		
		writer.close();
				
	}


}

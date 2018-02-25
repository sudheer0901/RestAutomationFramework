package common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read 
{
	public String readData(String fileName)
	{
		BufferedReader reader;
		
		String data="";
		
		try
		{
			
			reader=new BufferedReader(new FileReader(fileName));
			
			data=reader.readLine();
			
			/*while(data!=null)
			{
				System.out.println(data);
				
				data=reader.readLine();
			}*/
			
			reader.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("data "+data);
		
		return data;
	}


}

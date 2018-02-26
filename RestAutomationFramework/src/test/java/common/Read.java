package common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read 
{
	public String readData(String fileName,String key)
	{
		BufferedReader reader;
		
		String data="";
		
		String[] output;
		
		try
		{
			
			reader=new BufferedReader(new FileReader(fileName));
			
			data=reader.readLine();
			
			while(data!=null)
			{
				if(data.contains(key))
				{
					String[] output= data.split(":")
				}
				data=reader.readLine();
			}
			
			reader.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("data "+data);
		
		return output[1];
	}


}

package File_Handling;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_created_current_directory {

	public static void main(String[] args) throws IOException 
	{
		//this is for making folders
       File f = new File("C:\\File created");
       f.mkdir();
       System.out.println("folder created");
       
     //this is for making files
        f = new File("C:\\File created\\Demo.txt");
       f.createNewFile();
       System.out.println("file created");
       
    //this is used for writing in a Text file   
    FileOutputStream fo = new FileOutputStream(f);
    String data = "Sare Jha Se Accha hum bulbule h iski";
	 byte[] array = data.getBytes();
	 fo.write(array);
     fo.close();  
	 
	 //Bufferreader for wrinting in files
	 BufferedWriter bw = new BufferedWriter(new FileWriter(f));
	 bw.append("Hello guys");
	 bw.close();
	 
	 //BufferReader for reading the files
	 BufferedReader br = new BufferedReader(new FileReader(f));
	 String line;
	 System.out.println("***********");
     while((line = br.readLine()) != null)
     {
    	 System.out.println(line);
     }
	 br.close();
	
	 
	 
	 
	 
	 
	 
	 
	}

}

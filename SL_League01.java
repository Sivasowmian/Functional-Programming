
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;





public class SL_League01 {
	
	public static void main(String[] args) throws FileNotFoundException 
    {
		ArrayList<SL_Club> table = new ArrayList();
		
		String line = "";  
		String splitBy = ",";  
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\OneDrive\\Desktop\\SL_Rugby.csv"));  
		
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{  
		String[] club = line.split(splitBy); 
		SL_Club clubNew=new SL_Club(Integer.parseInt(club[0].replaceAll("\\s+","")),club[1].replaceAll("\\s+",""),Integer.parseInt(club[2].replaceAll("\\s+","")),Integer.parseInt(club[3].replaceAll("\\s+","")),Integer.parseInt(club[4].replaceAll("\\s+","")),Integer.parseInt(club[5].replaceAll("\\s+","")),Integer.parseInt(club[6].replaceAll("\\s+","")),Integer.parseInt(club[7].replaceAll("\\s+","")),Integer.parseInt(club[8].replaceAll("\\s+","")),Integer.parseInt(club[9].replaceAll("\\s+","")),Integer.parseInt(club[10].replaceAll("\\s+","")),Integer.parseInt(club[11].replaceAll("\\s+","")),Integer.parseInt(club[12].replaceAll("\\s+","")),Integer.parseInt(club[13].replaceAll("\\s+","")));
		
		table.add(clubNew);
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		} 
		
		table.forEach(x -> System.out.println(x));
		  
    }
}

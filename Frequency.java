package labass6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Frequency 
{
	public static void main(String[] args) 
	{
		
		Map<String, Integer> lMap = new HashMap<String, Integer>();
		BufferedReader br = null;
		try 
		{
			br = new BufferedReader(new FileReader("story.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		String line = null;
		try 
		{
			while((line = br.readLine()) != null) 
			{
				String[] tokens = line.split(" ");
				for(String token: tokens) 
				{
					if(lMap.containsKey(token)) 
					{
						int value =lMap.get(token);
						lMap.put(token, ++value);
						
					} else {
						lMap.put(token, 1);
					}
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<Entry<String, Integer>> entrySet = lMap.entrySet();
		for(Entry<String, Integer> setItem : entrySet) 
		{
			System.out.println(setItem.getKey() + " appeared " + setItem.getValue() + " times ");
		}
	}

}




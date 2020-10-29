package practice3;

import java.util.HashMap;

public class countletters {

	//aaabbbccdddeee
	//count number of letters and store it
	//output= a3b3c2d3e3
	public static void main(String[] args)
	{
		String input= "aaabbbccde";
		HashMap<Character,Integer> ans = new HashMap<Character, Integer>();
		//covert string to char
		//use for loop to check number of char and map it
		char[] c2 = input.toCharArray();
		for(char c : c2)
		{
			if(ans.containsKey(c))
			{
				ans.put(c, ans.get(c)+1);
			}
			else
			{
				ans.put(c, 1);
			}
		}
		System.out.println(ans);
	}
}

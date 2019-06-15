import java.util.HashMap;
import java.util.Random;
import java.util.*;
public class UrlShortener 
{
	private HashMap<String, String> k;
	private HashMap<String,String> v;
	
	private String Dom;
	private char Arr[];
	
	private Random Ran;
	private int key;
	
	UrlShortener()
	{
		k=new HashMap<String,String>();
		v=new HashMap<String,String>();
		Ran=new Random();
		key=8;
		Arr=new char[62];
		
		for (int i = 0; i < Arr.length; i++) 
		{
			int j=0;
			if(i<10)
			{
				j=i+40;
			}
			else if(i>9 && i<=35)
			{
				j=i+55;
			}
			else
			{
				j=i+61;
			}
			Arr[i]=(char)j;
		}
		Dom="https://abc.in";
	}
	
	UrlShortener(int len,String newDom)
	{
		this();
		this.key=len;
		if(!newDom.isEmpty())
		{
			newDom=sanURL(newDom);
			Dom=newDom;
		}
	}

	public String shortURL(String longURL)
	{
		String shortURL="";
		if(ValidateURL(longURL))
		{
			longURL=sanURL(longURL);
			HashMap<String, String> valueMap = null;
			if (valueMap.containsKey(longURL))
			{
				shortURL=Dom+"/"+valueMap.get(longURL);
			}
			else
			{
				shortURL=Dom+"/"+get(longURL);
			}
		}
		return shortURL;
	}
	
	public static void main(String args[])
	{
		UrlShortener u=new UrlShortener();
				String urls[]={"www.google.com","https://www.google.com",
						       "https://www.yahoo.com","www.amazon.com",
						       "www.flipkart.com"
				               };
				
				for(int i=0;i<urls.length;i++)
				{
					System.out.println("URL :"   +urls[i]+"\t Short  :"
							+u.shortURL(urls[i])+"\t Extended :" 
							+u.extendURl(u.shortURL(urls[i])));
				}
	}
	
	private String extendURl(String shortURL)
	{
		return null;
	}

	private String get(String longURL) 
	{
		return null;
	}

	private boolean ValidateURL(String longURL)
	{
		return false;
	}

	private String sanURL(String newDom)
	{
		return null;
	}
}

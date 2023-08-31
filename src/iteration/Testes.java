package iteration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> uniqueColors=new HashSet<String>();
List<String> colors=new ArrayList<String>();

uniqueColors.add("Red");
colors.add("Red");
uniqueColors.add("Green");
colors.add("Green");
uniqueColors.add("Blue");
colors.add("Blue");
uniqueColors.add("Red");
colors.add("Red");
System.out.println("parcours de HashSet");
for(String color: uniqueColors)
{
	System.out.println(color);	

}
System.out.println("parcours de ArrayList");
for(String cl: colors)
{
	System.out.println(cl);	

}


	}

}

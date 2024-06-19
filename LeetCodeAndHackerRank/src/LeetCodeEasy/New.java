package LeetCodeEasy;


import java.util.ArrayList;
import java.util.List;

public class New {

	// return type  List<List<String>> changed to void
	public static void getmatching(List<List<String>> products, List<List<String>> queries) {
		
		List<String> numList = new ArrayList<>(); //  contains 2089,4139,510,1947,1970,2097
		
		for(int i=0; i<queries.size(); i++) {
			List<String> stringword = queries.get(i);
			
			for(String string : stringword) {
				String[] reStrings = string.split(" ");
				numList.add(reStrings[1]);
			}
		}
	}

	public static void main(String[] args) {

		List<List<String>> productList = new ArrayList<>();
		List<String> singleAddress = new ArrayList<String>();
		singleAddress.add("item2 510 1947");
		singleAddress.add("item3 2089 2097");
		singleAddress.add("item1 4139 1970");

		productList.add(singleAddress);

		List<List<String>> querList = new ArrayList<>();
		List<String> query = new ArrayList<String>();
		query.add("Type3 2089");  //type1 -> man.yr
		query.add("Type2 4139"); //type2 -> <500
		query.add("Type2 510");	 //type3 -> >500
		query.add("Type1 1947");
		query.add("Type1 1970");
		query.add("Type1 2097");

		querList.add(query);

		getmatching(productList, querList);
	}
}
 
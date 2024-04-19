package assignments;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");

        colors.add("Green");

        colors.add("Blue");

        colors.add("Yellow");

        colors.add("Purple");

        
        ArrayList<String> portion = new ArrayList<>(colors.subList(1, 4));

        System.out.println(portion);
        
        ArrayList<Integer> arr = new ArrayList<Integer>(9); 
        
        // using add(), add 5 values 
        arr.add(2); 
        arr.add(4); 
        arr.add(5); 
        arr.add(6); 
        arr.add(11); 
        
        System.out.println(arr);
  
        // trims the size to the number of elements 
        //arr.trimToSize(); 
  
        System.out.println("The List elements are:"); 
  
        // prints all the elements 
        for (Integer number : arr) { 
            System.out.println("Number = " + number); 
        } 

	}

}

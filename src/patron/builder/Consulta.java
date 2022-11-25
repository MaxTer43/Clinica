package patron.builder;

import java.util.ArrayList;
import patron.builder.consulta.Item;

public class Consulta {
	   private ArrayList<Item> items =
		   new ArrayList<Item>();	

	   public void addItem(Item item){
	      items.add(item);
	   }
	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (Item item : items) {
	         cost += item.price();
	      }		
	      return cost;
	   }
	   public void showItems(){
	   
	      for (Item item : items) {
	         System.out.print("Item : " + item.name());
	         System.out.print(", Consulta : " + item.packing().pack());
	         System.out.println(", Precio : " + item.price());
	      }		
	   }	
	}
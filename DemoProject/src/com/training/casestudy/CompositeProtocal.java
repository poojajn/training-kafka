package com.training.casestudy;

public class CompositeProtocal  {
	Component component;
	
  public CompositeProtocal(Component component) {
	  this.component=component;
  }
	

 static class Component {
	 Leaf leaf;
	 
	 public Component(Leaf leaf) {
		  this.leaf=leaf;
	  }
		
		public interface Leaf {
            
			public String ObectType();
			public void shape();
			public void draw();
			
		}
		public interface Composite {
			
			   public void addObject(Leaf leaf);
			   public void removeObject(Leaf leaf);
			}
	     }//component
	
	 

	
}

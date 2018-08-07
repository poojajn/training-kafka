package casestudyaop;

public abstract aspect CompositeProtocol {
	
	declare parents : Line implements Component.Leaf;
	
   
	public interface Component{
		
		public interface Leaf extends Component{
			
//			public void shape();
//			public void draw();
//			
			
		}
		
		
		
		
		
		public interface Composite extends Component{}
	}
	
}

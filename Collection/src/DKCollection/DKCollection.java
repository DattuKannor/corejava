package DKCollection;

public class DKCollection {
	
	Object[] arra;
	int index;
	DKCollection()
	{
		arra=new Object[10];
		index=0;
		
	}
	
	
	void largesize()
	{
		Object[] arra1=new Object[arra.length*2];
		
		
		
	}
	
	int cap()
	{
//		if(size()==arra.length)
//		{
//			return =
//		}
		
		return arra.length;
	}
	public void add(Object obj)
	{
		arra[index]=obj;
		index++;
		
	}
	
	public int size()
	{
		return index;
	}
	
	
	@Override
	public String toString() {
		int i;
		StringBuffer s=new StringBuffer();
		for (i = 0; i <size(); i++) {
			//s.concat(arra[i]);
			s.append(arra[i]+",");
			
			
		}
		
		
		return s.toString();
	}
	
	//Object[] delete(Object obj)
	boolean delete(Object obj)
	{
		//System.out.println(obj);
		int cnt=0;
		for (int i = 0; i < size(); i++) {
			
		
		if(obj==arra[i])
		{
			int j;
			for (j = i; j <size()-1; j++) 
			{
				arra[j]=arra[j+1];
				//break;
				
				
			}
			cnt++;
			arra[j]=" ";
			
			return true;
			//break;
			
			
		}
		
		
	}
		if(cnt!=0)
		{
			for (int i = 0; i <size()-1; i++) {
				
				System.out.println(arra[i]);
				
			}
			
		}
		
		
		return false;
} //delete
	
}

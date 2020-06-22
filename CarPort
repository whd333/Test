import org.junit.Test;

public class Car{
	private int positionx=0;
	private int positiony=0;
	private int angle =0;
	
	@Test
	public void move (int up ,int down,int left,int right) throws BussnessException{
		if(angle==270 && positionx==1 && positiony==1){
			throw new BussnessException("西向异常");
		}
		positiony= positiony +up;
		positiony = positiony -down;
		positionx= positionx +right;
		positionx = positionx -left;
	}
	@Test
	public void turn(int angle){
		angle+= angle;
	}
	public int getangel(){
		return angle;
	}
	public int[] getposition(){
		return new Integer[2]{positionx, positiony};
	}
}

 class BussnessException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public BussnessException (){}
	public BussnessException (String str){ super(str); }
}	


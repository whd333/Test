import org.junit.Test;

public class Person {


		public float speed =0;
		public double distance =0;
		public int waittime=0;
		public int restcount=0;
		
		//public Person(){}
//		public Person(long speed){
//			this.speed=speed;
//		}
		private void gorun(){
			if(waittime>0){
				waittime--;
			}else{
				distance+= speed/60;
				if(distance/200>restcount){
					waittime=2*60;
					restcount++;
				}
			}
		}

		@Test
		public void test(){
			double time=0d;
			Person a =new Person();
			a.speed=40l;
			Person b =new Person();
			b.speed=60l;
			while(b.distance-a.distance<800){
				a.gorun();
				b.gorun();
				time++;
				System.out.println(b.distance+"==="+a.distance+"=="+(b.distance-a.distance));
				System.out.println(time/60);
			}
			System.out.println(b.distance+"==="+a.distance);
			System.out.print(time/60);
		}

}

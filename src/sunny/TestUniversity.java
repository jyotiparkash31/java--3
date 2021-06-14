package sunny;

public class TestUniversity {

	public static void main(String[] args) {
		
      Stanford S=new Stanford();
      S.regularClasses();
      S.eveningClasses();
      S.playGround();
      
      MIT M=new MIT();
      M.regularClasses();
      M.eveningClasses();
      
      NYU N=new NYU();
      N.eveningClasses();
      N.regularClasses();
      
      university u = new Stanford();
      u.playGround();
      
	}

}

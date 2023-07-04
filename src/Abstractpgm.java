

		abstract class Ca
		{
			abstract void speedlimit();
			public void carengine()
			{
				System.out.println("car engine");
				
			}
		}
		class Maruti extends Ca
		{

			@Override
			void speedlimit() {
				System.out.println("maruti speedlimit");
				
			}
		
			
		}
		class Toyota extends Ca
		
		{
			@Override
			void speedlimit() {
				System.out.println("maruti speedlimit");
				
				class Abstractpgm {

					public static void main(String[] args) {
						Maruti m=new Maruti();
						m.carengine();
						m.speedlimit();
					}
				}
					}
		
	}



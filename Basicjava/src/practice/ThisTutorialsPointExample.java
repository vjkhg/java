package practice;

 class ThisTutorialsPointExample {

		   private String message;
		   //constructor
		   public ThisTutorialsPointExample(String message){
		      this.message = message;
		   }
		   public void printMessage(){
		      System.out.println(message);
		   }
		   public static void main(String args[]) {
			   ThisTutorialsPointExample tester = new ThisTutorialsPointExample("Hello World");
		      tester.printMessage();
		   }
		}


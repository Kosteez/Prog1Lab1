public class StringPractice{
		public static void main (String[] args){

			System.out.println("****** String Prcatice *****");

			//String hello = "Hello";
			String hello = new String("hello");

			System.out.println(hello);

			String upHello = hello.toUpperCase();

			System.out.println(upHello);
			System.out.println(upHello.toLowerCase());

			String myBigString = "\nHello everybody, today is Thursday, "
								+ "and we are having fun!";

			System.out.println(myBigString);
			System.out.println("The first index of 'o' is "+myBigString.indexOf("o"));

			System.out.println("The last index of 'l' is "+myBigString.lastIndexOf("l"));
		}
}

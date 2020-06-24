package Encapsulation_Inheritence;

public class BooksTest {

	public static void main(String[] args) {
	Author a=new Author("radha","rk123@mail.com",'M');
	Book b=new Book("Wtn");
	
b.setPrice();
b.setQuant();
b.getAuthor();
System.out.println("The name of the book is : "+b.getNme());
System.out.println("The Price of the book is : "+b.getPrice());
System.out.println("The Quantity of the book is : "+b.getQuant());
	}

}

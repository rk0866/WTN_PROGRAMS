package Encapsulation_Inheritence;
public class Book {
String nme,author;
double price;
int quant;
Book(String n1)
{
	nme=n1;
}
public String getNme() {
	return nme;
}

public void getAuthor() {
	System.out.println("Authers name is : "+Author.name);
	System.out.println("Authers email is : "+Author.email);
	System.out.println("Authers gender is : "+Author.gender);
}
public double getPrice() {
	return price;
}
public void setPrice() {
	price = 500;
}
public int getQuant() {
	return quant;
}
public void setQuant() {
	quant = 30;
}

}

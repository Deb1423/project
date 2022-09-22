/*
Program: Declaring a class and its objects
*/
//declaring a Libary class
class Libary
{
//declearing properties
private String bookName;
private int bookSerialNumber;
private String bookAuthor;
private double bookPrice;

//method to insert book
/*void insertBook(String bookName, int bookSerialNumber, Sring bookAuthor, double bookPrice)
{
	this.bookName=movieName;
	this.bookSerialNumber=bookSerialNumber;
	this.bookAuthor=bookAuthor;
	this.bookPrice=bookPrice;
  } */
Libary(String bookName, int bookSerialNumber, String bookAuthor, double bookPrice)
{
	this.bookName=bookName;
	this.bookSerialNumber=bookSerialNumber;
	this.bookAuthor=bookAuthor;
	this.bookPrice=bookPrice;
  } 
  void displayBook()
  {
	  System.out.println("BOOK NAME: "+ this.bookName+"   "+ "BOOK SERIAL NO.: " + this.bookSerialNumber+"   " + "AUTHOR NAME: " +this.bookAuthor+"   "+ "PRICE: "+this.bookPrice );
  }
}
//end class.

// Declaring class BOOK
class Book
{
	public static void main(String[] args)
	{
	
	// creating BOOK objects
		Libary book1= new Libary("BYOMKESH BAKSHI",4409,"SHARABINDU CHAKROBARTY",1500);
		
		//book1.insertBook("BYOMKESH BAKSHI","4409","SHARABINDU CHAKROBARTY",1500);
		
		Libary book2= new Libary("FELUDA SAMOGRA",4406,"SATYAJIT RAY",1200);
		//book2.insertBook("FELUDA SAMOGRA","4406","SATYAJIT RAY",1200);
		
		Libary book3= new Libary("PROFESSOR SHANKU",4403,"SATYAJIT RAY",650);
		//book3.insertBook("PROFESSOR SHANKU","4403","SATYAJIT RAY",650);
		
		//display all the movie
		book1.displayBook();
		book2.displayBook();
		book3.displayBook();
		
	}
	
}
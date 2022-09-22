/*
Program: Declaring a class and its objects
*/
//declaring a theatre class

import java.util.*;
class LibaryInput
{
  // declaring properties
  private String bookName;
private int bookSerialNumber;
private String bookAuthor;
private double bookPrice;
  
  //method to insert Movie
  void insertBook()
  {
	  Scanner sc= new Scanner(System.in);
	  
	   System.out.println("Enter the details of Book:");
	   
	   System.out.println("Book's Name:");
	   this.bookName= sc.next();
	   
		System.out.println("Books Serial No.:");
		this.bookSerialNumber= sc.nextInt();
		
		System.out.println("Author Name:");
		this.bookAuthor= sc.next();
		
		System.out.println("Book's Price:");
		this.bookPrice= sc.nextDouble();
    
  }
  
  //method to display movie
  void displayBook()
  {
    System.out.println("BOOK NAME: "+ this.bookName+"   "+ "BOOK SERIAL NO.: " + this.bookSerialNumber+"   " + "AUTHOR NAME: " +this.bookAuthor+"   "+ "PRICE: "+this.bookPrice );
  }
  
}
// end class 

//declaring class Theatre
class BookInput
{
	
   //main method
	public static void main(String[] args)
	{		
		LibaryInput book1;
		book1= new LibaryInput();
		book1.insertBook(); // explicit
		
		LibaryInput book2;
		book2= new LibaryInput();
		book2.insertBook(); // explicit
		
		LibaryInput book3;
		book3= new LibaryInput();
		book3.insertBook(); // explicit
		
		System.out.println();
		System.out.println("---------------------My Libary----------------------");
		//display all the movie
		book1.displayBook();
		book2.displayBook();
		book3.displayBook();
		System.out.println("---------------------------------------------------");
	}
	
}
package lab5;

public class Book extends Item{
	private int ISBN;
	private String author;
	public int getISBN()
	{
		return this.ISBN;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public Book()
	{
		ISBN = 0000000000000;
		author = "";
	}
	public Book(String z,String y,int x)
	{
		super(z);
		ISBN = x;
		author = y;
	}
	public String getListing()
	{
		return "Book Name - " + this.getTitle() + "\nAuthor - " + this.getAuthor() + "\nISBN # - " + this.getISBN() + "\n";
	}
	

}

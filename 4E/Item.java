package lab5;

public abstract class Item {
	private String title;
	public String getTitle()
	{
		return this.title;
	}
	public void setTitle(String s)
	{
		this.title = s;
	}
	public Item()
	{
		title = "";
	}
	public Item(String s)
	{
		title = s;
	}
	public abstract String getListing();
	public String toString()
	{
		return "Title: " + this.title;
	}
}

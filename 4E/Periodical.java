package lab5;

public class Periodical extends Item{
	private int issueNum;
	public int getIssueNum()
	{
		return this.issueNum;
	}
	public void setIssueNum(int n)
	{
		this.issueNum = n;
	}
	public Periodical()
	{
		issueNum = 0;
	}
	public Periodical(String y, int x)
	{
		super(y);
		issueNum = x;
	}
	public String getListing()
	{
		return "Periodical Title - " + this.getTitle() + "\nIssue # - " + this.getIssueNum() + "\n";
	}

}

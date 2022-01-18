//Name:			Nolan Jaeger 
//Class:		1322L
//Instructor:	Jorge
//Term:			Spring 2021
//Lab:			3
package lab3;
import java.util.*;
@SuppressWarnings("unused")
public class Question {
	private String question;
	private String answer;
	private int difficulty;
	public Question()
	{
		question = "";
		answer = "";
		difficulty = 1;
	}
	public Question(String q,String a,int d)
	{
		question = q;
		answer = a;
		if(d < 1)
		{
			d = 1;
		}
		else if(d > 3)
		{
			d = 3;
		}
		difficulty = d;
	}
	public String getQuestion()
	{
		return question;
	}
	public String getAnswer()
	{
		return answer;
	}
	public int getDifficulty()
	{
		return difficulty;
	}
	public void setQuestion(String x)
	{
		this.question = x;
	}
	public void setAnswer(String y)
	{
		this.answer = y;
	}
	public void setDiff(int z)
	{
		this.difficulty = z;
	}
	public String toString()
	{
		return "Question: " + this.question + " Answer: " + this.answer + " Difficulty: " + this.difficulty;
	}
}

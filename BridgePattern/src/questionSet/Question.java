package questionSet;

import java.util.ArrayList;
import java.util.List;

public interface Question {
public void nextQuestion();
public void previousQuestion();
public void newQuestion(String q);
public void deleteQuestion(String q);
public void displayQuestion();
public void displayAllQuestions();
}


class JavaQuestion implements Question{
private List<String> questions=new ArrayList<String>();
private int current=0;
public JavaQuestion(){  
    questions.add("What is class? ");  
    questions.add("What is interface? ");  
    questions.add("What is abstraction? ");  
    questions.add("How multiple polymorphism is achieved in java? ");  
    questions.add("How many types of exception  handling are there in java? ");  
    questions.add("Define the keyword final for  variable, method, and class in java? ");  
    questions.add("What is abstract class? ");  
    questions.add("What is multi-threading? ");  
 }
	@Override
	public void nextQuestion() {
		 if( current <= questions.size()-1 ) current++;  
		 System.out.print("Next Question No: "+current);  	
		
	}

	@Override
	public void previousQuestion() {
		if( current > 0 )  current--;  
		System.out.print("Previous Question No: "+current); 
		
	}

	@Override
	public void newQuestion(String q) {
		questions.add(q); 
		System.out.println("Question [ "+q+" ] added.");
		
	}

	@Override
	public void deleteQuestion(String q) {
		questions.remove(q);
		System.out.println("Question [ "+q+" ] removed.");
	}

	@Override
	public void displayQuestion() {
		 System.out.println( questions.get(current) );  
		
	}

	@Override
	public void displayAllQuestions() {
		for(String quest: questions)
			System.out.println(quest);
		
	}
	
}

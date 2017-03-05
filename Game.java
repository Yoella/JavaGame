// importerar Scanner för att kunna läsa in vad en användare skriver.
//importera arralist så att vi kan göra en lista med objekt(questions)
//importera så vi kan använda toUpperCase metoden
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
//Klassen med main metoden som kör programmet.
public class Game
{
  //lite publica variablar
  public static Question question1;
  public static Question question2;
  public static Question question3;
  public static Question question4;
  public static Question question5;
  public static Scanner in;
  public static String answer;
  public static int points;
  public static ArrayList<Question> questionList;
  //main metoden som får programmet att köra.
  public static void main(String[] args)
  {
    //ArrayList där frågepobjekten ska in
    questionList = new ArrayList<Question> ();

    // skapar ett objekt av klassen question (en fråga)
    question1 = new Question("Question 1: A druid can change form and become an animal when can you change to travelform?", "1: level 30", "X: level 20", "2: level 15", "1");
    //lägg till frågan i arralisten
    questionList.add(question1);
    //skapar en ny fråga
    question2 = new Question("Question 2: Between what levels should you go the instance Shadowfang Keep?", "1: 13-18", "X: 40-47", "2: 22-30", "2");
    //lägg till fråga i arraylisten
    questionList.add(question2);
    //skapar en ny fråga
    question3 = new Question("Question 3: What is the name of the capital city of the human race?", "1: Dalaran", "X: Stormwind city", "2: Lorderon", "X");
    //lägg till i listan
    questionList.add(question3);
    //skapa ny fråga
    question4 = new Question("Question 4: What is the season outside the greate walls of iron forge?", "1: Autumn", "X: Spring", "2: Winter", "2");
    //lägg till i listan
    questionList.add(question4);
    //Skapa ny fråga
    question5 = new Question("Question 5: In witch region do you find the mighty onyxia?", "1: Dustwallow Marsh", "X: Desolace", "2: Alterac mountains", "1");
    //lägg till i listan
    questionList.add(question5);
    //en variabel som kollar storleken på arraylistan så vi kan loopa igenom den
    int antal = questionList.size();
    //variabel som vi kan använda för att skriva ut frågorna istället för att skriva dem en för en.
    Question obj = null;
    //loop som loopar igenom alla objekt i listan
    for(int i = 0; i < antal; i++)
    {
      //variabeln hämtar alla objekt i listan
      obj = questionList.get(i);
      //och sedan skriver ut dem
      obj.printQuestion();
      //skriver ut linjer mellan varje fråga
      lines();
      //användarens inmatning sker här och det hen skriver in hamnar i variabeln answer.
      in = new Scanner(System.in);
      answer = in.nextLine();
      //användarens val blir till upperCase ifall man skriver litet x så blir det ingen skillnad
      answer = answer.toUpperCase();
      //while loop som kollar om checkAnswer returnerar false
      while(checkAnswer(answer) == false)
      {
        //om checkAnswer returnerar false så skrivs ett meddelande ut och man får ny chans att svara
        //skriver ut linjer före och efter man har svarat med ett inkorrekt värde
        lines();
        System.out.println(answer + " Incorrect value try again");
        lines();
        in = new Scanner(System.in);
        answer = in.nextLine();
      }
      //om checkAnswer är true så går vi in i denna if-sats
      if(checkAnswer(answer) == true)
      {
        //om answercorrect skickar tillbaka true så får man poäng
        if(obj.answerCorrect(answer) == true)
        {
          points++;
          System.out.println("Right answer!");
        }
        else
        {
          System.out.println("wrong answer!");
        }
        //poängen skrivs ut
        //skriver ut linjer före och efter poängen man får
        lines();
        System.out.println("your points: " + points);
        lines();
      }
    }
  }
  //metod som skriver ut streck
  public static void lines()
  {
    System.out.println("----------------------");
  }
  //metod som kollar svaret så att det är 1, x eller 2
  public static boolean checkAnswer(String answer)
  {
    //variabel som är satt till false som standard
    boolean good = false;
    //om answer är 1, x eller 2 så ändras variabeln till true
    if(answer.equals("1") || answer.equals("X") || answer.equals("2"))
    {
      good = true;
    }
    //returnerar variabeln som är då false eller true
    return good;
  }
}

//kvar att göra
//skriva något dokument som beskriver koden lite vad den gör kanske behövs

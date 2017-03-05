public class Question
{
  //Instans variblar
  private String question;
  private String answer1;
  private String answerX;
  private String answer2;
  private String correct;
  //Konstruktor
  public Question(String question, String answer1, String answerX, String answer2, String correct)
  {
    this.question = question;
    this.answer1 = answer1;
    this.answerX = answerX;
    this.answer2 = answer2;
    this.correct = correct;
  }
  //printmetod
  public void printQuestion()
  {
    System.out.println(question);
    System.out.println(answer1);
    System.out.println(answerX);
    System.out.println(answer2);
  }
  //kollar om svaret är rätt
  public boolean answerCorrect(String answer)
  {
    //variabel som håller poängen
    int points = 0;
    //variabel som är false som standard
    boolean good = false;
    //om answer är lika med correct (en del som skickas in när man skapar objektet)
    //så blir variabeln good == true
    if(answer.equals(correct))
    {
      good = true;
    }
    //returnerar good som är då true eller false
    return good;
  }
}

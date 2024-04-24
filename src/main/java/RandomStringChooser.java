import java.util.;
public class RandomStringChooser
{
  private ArrayList <String> string;
  public RandomStringChooser(String[] word){
    string = new ArrayList <String>();
    for (String w: word)
      string.add(w);
  }

  public String getNext(){
    if (string.size()==0)
      return "NONE";
    int i = (int)(Math.random()string.size());
    return string.remove(i); 
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}

public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String word;

    public CodeWordChecker (int min, int max, String word)
    {
        this.max = max;
        this.min = max;
        this.word = word;
    }
     public boolean isValid(String test)
     {
         if((test.length())>=min&&(test.length()<=max)&&(test.contains(word)))
         {
             return false;
         }
         return true;
     }
}

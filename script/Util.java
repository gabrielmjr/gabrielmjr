import java.io.IOException;
import java.io.File;


public class Util
{
  private static final String HOME = "/home/runne/work/gabrielmjr/gabrielmjr";
  
  private static File old_readme_file;
  private static File new_readme_file;
  
  
  public static void main(String[] args)
  {
    old_readme_file = new File(HOME + "/README.html");
    
    if (old_readme_file.exists())
      System.out.println("File already exists...");
      System.exit(1);
    
    new_readme_file = new File(HOME + "/README.md");
    
    if (!renameReadmeFile())
      System.out.println("File not renamed");
      System.exit(0);
  }
  
  private static Boolean renameReadmeFile()
  {
    return old_readme_file.renameTo(new_readme_file);
  }
}

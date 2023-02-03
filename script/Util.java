import java.io.IOException;
import java.io.File;


public class Util
{
  private static File old_readme_file;
  private static File new_readme_file;
  
  
  public static void main(String[] args)
  {
    old_readme_file = new File("/home/runner/work/gabrielmjr/gabrielmjr/README.html");
    
    if (old_readme_file.exists())
      System.out.println("File already exists...");
      System.exit(1);
    
    new_readme_file = new File("/home/runner/work/gabrielmjr/gabrielmjr/README.md");
    
    if (!renameReadmeFile())
      throw new IOException("File not renamed");
  }
  
  private static Boolean renameReadmeFile()
  {
    return old_readme_file.renameTo(new_readme_file);
  }
}

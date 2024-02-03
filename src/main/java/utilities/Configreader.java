package utilities;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

    private Properties prop;

  public Properties initbrowser() throws IOException {

      Properties prop= new Properties();
      FileInputStream ip= new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\CVLibrary\\src\\test\\java\\dataset\\Config.properties");
      prop.load(ip);
      return prop;



  }
}

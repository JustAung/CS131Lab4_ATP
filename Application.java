import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileProcessor FP = new FileProcessor("BadFileName.txt", 0);
		//try {
		FP.processFile();
		
		}
}

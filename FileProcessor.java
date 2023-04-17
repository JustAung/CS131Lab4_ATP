import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor extends StringTooLongException{

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) throws FileNotFoundException{
		
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		return stringLength;
		
	}//end getArrayListSize
	
	public void processFile() {
		StringTooLongException STLE = new StringTooLongException();		
		try {
			Scanner scan = new Scanner(new File(""));

			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
				
			if(stringLength > 20)
				throw new StringIndexOutOfBoundsException("String is too long");
			}
			scan.close();
		
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String too long");
		}
		catch (FileNotFoundException e ) {
			System.out.println("File not found");
		}
		
	}//end processFile

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the stringLength
	 */
	public int getStringLength() {
	    ArrayList<String> StringLength = new ArrayList<>();
	    int size = StringLength.size();
	    return size;
	}

	/**
	 * @param stringLength the stringLength to set
	 */
	public void setStringLength(int stringLength) {
		if(this.stringLength < 5)
			this.stringLength = 5;
		else {
			stringLength=this.stringLength;
		}
	}
	
}//end class

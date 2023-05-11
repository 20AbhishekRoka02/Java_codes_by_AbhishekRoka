import java.io.*;


class RWBytestream{
	public static void main(String [] args) throws IOException{
		FileInputStream myfile = new FileInputStream("E:\\Serious_Projects\\Java_Tutorials\\JavaAcademics\\HomeWork\\file.txt");
		FileOutputStream writefile = new FileOutputStream("E:\\Serious_Projects\\Java_Tutorials\\JavaAcademics\\HomeWork\\newfile.txt");

		int val;
		while((val=myfile.read())!=-1){
			writefile.write(val);
		}
		myfile.close();
		writefile.close();
		
	}

}
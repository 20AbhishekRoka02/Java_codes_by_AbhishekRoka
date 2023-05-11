import java.io.*;


class RWCharStream{
	public static void main(String [] args) throws IOException{
		FileReader myfile = new FileReader("file.txt");
		FileWriter writefile = new FileWriter("newfile.txt",true);

		int val;
		while((val=myfile.read())!=-1){
			writefile.write(val);
		}
		myfile.close();
		writefile.close();
		
	}

}
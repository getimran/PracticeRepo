package imran.explore.questions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HtmlRetrieve {

	public static void main(String[] args) {
		
		String getUrl,input;
		BufferedReader br;
		BufferedWriter bw;
		Scanner in= new Scanner(System.in);
		getUrl= in.next();
		System.out.println("data: "+getUrl);
		try{
			URL url=new URL(getUrl);
			URLConnection conn= url.openConnection();
			br= new BufferedReader(new InputStreamReader(conn.getInputStream()));
			File file= new File("data.html");
			if(!file.exists()){
				file.createNewFile();
			}
			bw= new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
			while((input=br.readLine())!=null){
				System.out.println(input);
				bw.write(input);
			}
			br.close();
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		} 
		in.close();
		
	}

}

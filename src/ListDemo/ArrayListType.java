package ListDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListType {
	
	

	static void writeToFile(String fileName, ArrayList<Student> al) throws IOException {
		try(BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName),"UTF-8"))){
			bf.write(al.toString());
			bf.append("\n");
			System.out.println("Wrote successfully...");
		}
	}
	
	public static String[]  ordersArray(ArrayList<Student> al) {
		String[] ordersArray=new String[al.size()];
        int i=0;
        for(Student currentOrder: al){
            ordersArray[i]=currentOrder.toString();
            i++;
        }
        return ordersArray;
	}
	
	static  void read(String[] data,String filename) {
		 
		int count = 0;
		try {
			try(BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream(filename),"UTF-8"))){
				
				String line;
				while((line=bf.readLine())!=null){
					data[count]=line;
					System.out.println("hhhhhhh"+data[count]);
					count++;	
				}
				System.out.println("readsuccessfully");
			}
			//System.out.println(pr1.toString());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(new Student(3, "jjj", "female"));
		//al.add(new Student(3, "jjj", "female"));
		al.add(new Student(5,"kkk","fff"));

		// for(Student s1:al) {
		// System.out.println(s1);
		// }

		try {
			writeToFile("studentDetails", al);
			read(ordersArray(al),"studentDetails");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

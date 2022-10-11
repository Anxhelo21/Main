package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.CD;

public class CDcontroller {
	private ArrayList<CD> CDs;
	private File file;
	
	public CDcontroller(){
		CDs= new ArrayList<>();
		file= new File("CDs.bin");
		if(file.exists()){
			readCDs();
		}
	}

	private void readCDs() {
		try{
			FileInputStream fis= new FileInputStream(file);
			ObjectInputStream ois= new ObjectInputStream(fis);
			CDs=(ArrayList<CD>) ois.readObject();
			fis.close();
			ois.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	private void writeCDs(){
		try{
			FileOutputStream fos= new FileOutputStream(file);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(CDs);
			oos.close();
			fos.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void addCD(CD u){
		this.CDs.add(u);
	}
	
	public boolean AddCD(String fullName, String email, String CDname, String CDcode,String verifyCDcode, String type, String description){
		if(CDcode.equals(verifyCDcode)){
			CD u = new CD(fullName, email, CDname, CDcode, type, description);
			this.addCD(u);
			writeCDs();
			return true;
		}
		return false;
	}
	
	public CD search(String CDcode){
		System.out.println("CD Information: "+ this.CDs);
		for(CD CD: CDs){
			if(CD.getCDcode().equals(CDcode)){
				return CD;
			}
		}
		return null;
	}
}

package PA07;

//add the class template

import java.io.Serializable;
import java.sql.Date;


public class Message implements Serializable {
	
	private int tag, ownerSSN, opType;
	private String petName, species, firstName, lastName;
	
	
	public Message(int tag, int ownerSSN, int opType, String petName, String species, String firstName,
			String lastName) {
		this.tag = tag;
		this.ownerSSN = ownerSSN;
		this.opType = opType;
		this.petName = petName;
		this.species = species;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int getTag() {
		return tag;
	}


	public void setTag(int tag) {
		this.tag = tag;
	}


	public int getOwnerSSN() {
		return ownerSSN;
	}


	public void setOwnerSSN(int ownerSSN) {
		this.ownerSSN = ownerSSN;
	}


	public int getOpType() {
		return opType;
	}


	public void setOpType(int opType) {
		this.opType = opType;
	}


	public String getPetName() {
		return petName;
	}


	public void setPetName(String petName) {
		this.petName = petName;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
		
}

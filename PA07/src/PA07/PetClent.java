package PA07;

//add the class template

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

class PetClent extends JFrame implements ActionListener{


	private String hostname;
	private int port;
	private Message msg;

// declare UI component objects
	private JLabel tagLabel;
	private JLabel petNameLabel;
	private JLabel speciesLabel;
	private JLabel ownerSSNLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	
	private JTextField tagField;
	private JTextField petNameField;
	private JTextField speciesField;
	private JTextField ownerSSNField;
	private JTextField firstNameField;
	private JTextField lastNameField;
	
	private JButton insertButton;
	private JButton viewButton;
	private JButton updateButton;
	private JButton deleteButton;
	private JButton clearButton;
	private JButton closeButton;
	
	
public PetClent(String hostname, int port) {
	
	this.port = port;
	this.hostname = hostname;
	
	// Create a connection with the PetServer server on port number 8000
	
	// call these two methods to create user GUI
	initComponenet();
	doTheLayout();
	
	insertButton.addActionListener(this);
	viewButton.addActionListener(this);
	updateButton.addActionListener(this);
	deleteButton.addActionListener(this);
	clearButton.addActionListener(this);
	closeButton.addActionListener(this);
}

private void initComponenet(){
	// Initialize the GUI components
	tagLabel = new JLabel("Tag: ");
	petNameLabel = new JLabel("Pet Name:    ");
	speciesLabel = new JLabel("Species:     ");
	ownerSSNLabel = new JLabel("Owner SSN: ");
	firstNameLabel = new JLabel("First Name:  ");
	lastNameLabel = new JLabel("Last Name: ");
	
	tagField = new JTextField("", 3);
	petNameField = new JTextField("", 15);
	speciesField = new JTextField("", 15);
	ownerSSNField = new JTextField("", 9);
	firstNameField = new JTextField("", 15);
	lastNameField = new JTextField("", 15);
	
	insertButton = new JButton("Insert");
	viewButton = new JButton("View");
	updateButton = new JButton("Update");
	deleteButton = new JButton("Delete");
	clearButton = new JButton("Clear");
	closeButton = new JButton("Close");
}

private void doTheLayout(){
	// Arrange the UI components into GUI window
	JPanel main = new JPanel();
	JPanel top = new JPanel();
	JPanel middle = new JPanel();
	JPanel bottom = new JPanel();
	JPanel t1 = new JPanel();
	JPanel t2 = new JPanel();
	JPanel m1 = new JPanel();
	JPanel m2 = new JPanel();
	JPanel l1 = new JPanel();
	JPanel l2 = new JPanel();
	JPanel l3 = new JPanel();
	JPanel l4 = new JPanel();
	
	l1.add(tagLabel);
	l1.add(tagField);
	l2.add(petNameLabel);
	l2.add(petNameField);
	l2.add(speciesLabel);
	l2.add(speciesField);
	
	top.setLayout(new BorderLayout());
	top.add(t1, BorderLayout.NORTH);
	top.add(t2, BorderLayout.SOUTH);
	t1.setLayout(new BorderLayout());
	t1.add(l1, BorderLayout.LINE_START);
	t2.setLayout(new BorderLayout());
	t2.add(l2, BorderLayout.LINE_START);
	
	//middle.setLayout(new FlowLayout());
	l3.add(ownerSSNLabel);
	l3.add(ownerSSNField);
	l4.add(firstNameLabel);
	l4.add(firstNameField);
	l4.add(lastNameLabel);
	l4.add(lastNameField);
	
	middle.setLayout(new BorderLayout());
	middle.add(m1, BorderLayout.NORTH);
	middle.add(m2, BorderLayout.SOUTH);
	m1.setLayout(new BorderLayout());
	m1.add(l3, BorderLayout.LINE_START);
	m2.setLayout(new BorderLayout());
	m2.add(l4, BorderLayout.LINE_START);
	
	bottom.setLayout(new FlowLayout());
	bottom.add(insertButton);
	bottom.add(viewButton);
	bottom.add(updateButton);
	bottom.add(deleteButton);
	bottom.add(clearButton);
	bottom.add(closeButton);
	
	main.setLayout(new BorderLayout());
	main.add(top, BorderLayout.NORTH);
	main.add(middle, BorderLayout.CENTER);
	main.add(bottom, BorderLayout.SOUTH);
	
	this.add(main);
}	
	
 
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == insertButton) {
		insertButtonClicked(); 
	}
	else if (e.getSource() == viewButton) {
		viewButtonClicked();
		}
	else if (e.getSource() == updateButton) {
		updateButtonClicked();
	}
	else if (e.getSource() == deleteButton) {
		deleteButtonClicked();
	}
	else if (e.getSource() == clearButton) {
		clearButtonClicked();
	}
	else {
		closeButtonClicked();
	}
	
}

private void viewButtonClicked() {
	  
	  // handle view button clicked event 
	
  }

private void insertButtonClicked(){
	  
	  // handle insert button clicked event 
	//check that tag is 3 characters long
	if( tagField.getText().length() < 3) {
		JOptionPane.showMessageDialog(null, "Invalid input for tag! \nTags are all 3 digits.","Error!", JOptionPane.ERROR_MESSAGE);
		return;
	}
	// validate tag is able to convert to an int
	int tag = 0;
	try {
		tag = Integer.parseInt(tagField.getText());
	}
	catch(NumberFormatException nfe) {
		JOptionPane.showMessageDialog(null, "Invalid input for tag! \nOnly numbers are allowed.", "Error!", JOptionPane.ERROR_MESSAGE);
		return;
	}
	if( ownerSSNField.getText().length() < 9) {
		JOptionPane.showMessageDialog(null, "Invalid input for Owner Social Security Number! \nA SSN should be 9 digits long.","Error!", JOptionPane.ERROR_MESSAGE);
		return;
	}
	// validate ownerSSN is able to convert to an int
	int ownerSSN = 0;
	try {
		ownerSSN = Integer.parseInt(ownerSSNField.getText());
	}
	catch(NumberFormatException nfe) {
		JOptionPane.showMessageDialog(null, "Invalid input for Owner Social Security Number! \nOnly numbers are allowed.", "Error!", JOptionPane.ERROR_MESSAGE);
		return;
	}
	
	int opType = 1;
	String petName = petNameField.getText();
	String species = speciesField.getText();
	String firstName = firstNameField.getText();
	String lastName = lastNameField.getText();
	
	// create a message for the server
	Message message = new Message(tag, ownerSSN, opType, petName, species, firstName, lastName);
	
  }


private void updateButtonClicked(){
	
	// handle update button clicked event
	
  }

private void deleteButtonClicked(){
	  
	// handle delete button clicked event
  }
  
  
private void clearButtonClicked(){
	// handle clear button clicked event
	tagField.setText("");
	petNameField.setText("");
	speciesField.setText("");
	ownerSSNField.setText("");
	firstNameField.setText("");
	lastNameField.setText("");  
  }
  

private  void closeButtonClicked(){
	// handle close button clicked event  
	System.exit(0);
  }

  /**Main method*/
  public static void main(String[] args) {
	  
	  // create the user GUI
	  PetClent frame = new PetClent("JDP", 8000);
	  	frame.setTitle("Pet and Owner Application");
	    frame.pack();
	    frame.setSize(600, 200);
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	  
  }
}
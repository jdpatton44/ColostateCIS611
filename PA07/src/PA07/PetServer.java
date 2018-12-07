package PA07;

// add the class template 

import java.awt.*;
import java.awt.event.*;
import java.net.Socket;
import java.applet.*;
import javax.swing.*;

import java.sql.*;
import javax.swing.border.*;

public class PetServer {
 
  private Statement stmt;
  private int port;
  private Message msg;
  
  public PetServer (int port){
	  
	  this.port = port;
	  initializeDB();
  }

  
  private void initializeDB() {
    
      // create the server
	  
	  // Connect to your database using your credentials
      
      // Create a statement object
	  
	  // loops for ever waiting for the client connection requests
	  	     // create a thread for each client connection request using Runnable class HandleAClient 
  }

 

  /**View record by ID*/
  private void view() {
   // Build a SQL SELECT statement
    
  }

  
  /**Insert a new record*/
  private void insert() {
    // Build a SQL INSERT statement
   }

  /**Update a record*/
  private void update() {
  // Build a SQL UPDATE statement
  }

  /**Clear text fields*/
  private void delete() {
	// Build a SQL DELETE statement
  }

    // inner Runnable class handle a client connection
	class HandleAClient implements Runnable {
	    private Socket socket; // A connected socket

	    /** Construct a thread */
	    public HandleAClient(Socket socket) {
	      this.socket = socket;
	    }

	    /** Run a thread */
	    public void run() {
	    	
	    	// write the code to call a proper method to process the client request
	    }
	   }// end of class Runnable 
  
  public static void main(String[] args) {
    PetServer server = new PetServer(8000);
    
  }
}

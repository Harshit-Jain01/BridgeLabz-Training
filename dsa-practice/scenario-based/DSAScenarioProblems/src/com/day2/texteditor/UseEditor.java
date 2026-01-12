package com.day2.texteditor;


public class UseEditor {
	

	    
		 public static void main(String[] args) {

		        TextEditor editor = new TextEditor();

		        editor.insert("I am fine ");
		        editor.insert("Thankyou");
		        editor.showContent();

		        editor.delete(5);
		        editor.showContent();

		        editor.undo();
		        editor.showContent();

		        editor.redo();
		        editor.showContent();
		    
	}
	}



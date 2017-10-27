package com.mmaier96180.twitchirc.java;

import com.mmaier96180.twitchirc.java.irc.IRCThread;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainWindow {


	private Stage primaryStage;
	private static MainWindow instance;

	@FXML
	public void initialize() {
		Task task = new Task<Void>() {
		    @Override public Void call() {
		    	IRCThread ircThread = new IRCThread();
				ircThread.run();
		        return null;
		    }
		};
		new Thread(task).start();
	}

	public MainWindow(Stage primaryStage) {
		this.primaryStage = primaryStage;
		if (instance == null) {
			instance = this;
		}
	}

	public static MainWindow getInstance() {
		return instance;
	}

}

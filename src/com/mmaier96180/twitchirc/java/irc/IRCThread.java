package com.mmaier96180.twitchirc.java.irc;

import com.cavariux.twitchirc.Chat.Channel;

public class IRCThread implements Runnable{

	@Override
	public void run() {
		IRCBot ircBot = new IRCBot();
		ircBot.connect();
		Channel channel = ircBot.joinChannel("#gertowelie");
		ircBot.sendMessage("Hi, Im connected!", channel);
		ircBot.start();		
	}

}

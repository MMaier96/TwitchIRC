package com.mmaier96180.twitchirc.java.irc;

import com.cavariux.twitchirc.Chat.Channel;
import com.cavariux.twitchirc.Chat.User;
import com.cavariux.twitchirc.Core.TwitchBot;

public class IRCBot extends TwitchBot{

	public IRCBot() {
		setUsername("TowelieBOT");
		setOauth_Key("oauth:nym79um52tql2tac3cqdgvroz3n35x");
	}



	@Override
	protected void onCommand(User user, Channel channel, String command) {
		super.onCommand(user, channel, command);
	}

	@Override
	protected void onMessage(User user, Channel channel, String message) {
		super.onMessage(user, channel, message);
	}

	@Override
	protected void onSub(User user, Channel channel, String message) {
		super.onSub(user, channel, message);
	}

	@Override
	protected void onWhisper(User user, String message) {
		super.onWhisper(user, message);
	}

	@Override
	public void sendMessage(Object message, Channel channel) {
		super.sendMessage(message, channel);
	}

	@Override
	public void sendRawMessage(Object message) {
		super.sendRawMessage(message);
	}

	@Override
	public void setCommandTrigger(String trigger) {
		super.setCommandTrigger(trigger);
	}


	@Override
	protected void userJoins(User user, Channel channel) {
		super.userJoins(user, channel);
	}

	@Override
	protected void userParts(User user, Channel channel) {
		super.userParts(user, channel);
	}

	@Override
	public void whisper(User user, String message) {
		super.whisper(user, message);
	}
}

package co.magetech;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;


public class cmd implements ICommand {

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "myfirstcommand";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return "stuff-n-things";
	}

	@Override
	public List getCommandAliases() {
		List<String> commandAliases = new ArrayList();
		commandAliases.add("mfc");
		commandAliases.add("myfirst");
		// TODO Auto-generated method stub
		return commandAliases;
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] strings) {
		if(icommandsender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) icommandsender;
			player.addChatMessage(new ChatComponentTranslation(configHandler.helloWorld));
			
		}

	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender icommandsender, String[] strings) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] strings, int i) {
		// TODO Auto-generated method stub
		return false;
	}

}


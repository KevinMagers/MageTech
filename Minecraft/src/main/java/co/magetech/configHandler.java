package co.magetech;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class configHandler {
	public static Configuration configuration;
	public static String CATEGORY_UPDATECHECK = "Update Check";
	public static boolean updateCheck = true;
	public static String helloWorld = "Hello World!";
	public static void init(String configDir) 
	{
		if (configuration == null) {
			File path = new File("MageTech.cfg");
			configuration = new Configuration(path);
			loadConfiguration();		}
	}
	private static void loadConfiguration() 
	{
		updateCheck = configuration.getBoolean("Check for Updates", CATEGORY_UPDATECHECK, true, "Allow this mod to check for updates");
		helloWorld = configuration.getString("testString", "testCategory", "Hello World!", "test");
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}
	@SubscribeEvent
	public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event) 
	{
		if(event.modID.equalsIgnoreCase("MageTech")) 
		{	
			loadConfiguration();
		}
	}
	public static Configuration getConfiguration()
	{
		return configuration;
	}
}




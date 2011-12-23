package me.hammale.pig;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class pig extends JavaPlugin {
	static Server server;
	static Plugin plugin;
	
	private final PigEntityListener entityListener = new PigEntityListener(this);
	
	
	@Override
	public void onEnable()
    {	 
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println("[Pig] Version " + pdfFile.getVersion() + " Enabled!");

		registerEvents();
		
		server = this.getServer();
		plugin = this;
    }
	public void onDisable()
    {
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println("[Pig] Version " + pdfFile.getVersion() + " Disabled!");
    }
	
	private void registerEvents()
    {
		//getServer().getPluginManager().registerEvent(Event.Type.BLOCK_BREAK, entityListener, Event.Priority.Normal, this);
    }
	
	@Override
	  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	  {
		  if(cmd.getName().equalsIgnoreCase("pig")){
			  if(sender instanceof Player){
			  Player p = (Player) sender;
			  
			  Vector dir = p.getLocation().getDirection();
		      Vector v = new Vector(dir.getX() * 4D, 2D, dir.getZ() * 4D);
			  
			  LivingEntity e = p.getWorld().spawnCreature(p.getLocation(), CreatureType.PIG);
			  e.setVelocity(v);
			  
			  return true;
			  }
			  return false;
		  }
		  return false;
	  }	  
}
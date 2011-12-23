package me.hammale.pig;

import org.bukkit.event.entity.EntityListener;

public class PigEntityListener extends EntityListener {

	  public pig plugin;
	
	  public PigEntityListener(pig plugin)
	  {
	    this.plugin = plugin;
	  }
	
//	public void onBlockBreak(BlockBreakEvent e) {
//		Block b = e.getBlock();
//		if(b.getType() == Material.WOOD){
//			Block d1 = b.getRelative(BlockFace.DOWN, 1);
//			if(d1.getType() == Material.DIRT){
//				
//			}
//		}
//	}
}	
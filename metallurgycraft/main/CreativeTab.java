package metallurgycraft.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import metallurgycraft.main.items.Items;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {

	private String name;
	public static CreativeTabs tabMetallurgy = new CreativeTab(CreativeTabs.getNextID(), "MetallurgyCraft");

	public CreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@Override
	public String toString() {
		return super.getTabLabel();
	}
	
	@SideOnly(Side.CLIENT) 
	public ItemStack getIconItemStack() {
		if(this.name == tabMetallurgy.getTabLabel()) {
			return new ItemStack(Item.appleGold);
		}
		return null;
	}
	
	
	@Override
	public String getTranslatedTabLabel() {
		return this.name;
	}

}

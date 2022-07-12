package metallurgycraft.main.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import metallurgycraft.main.CreativeTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemIngot extends Item {

	private String tipText;
	
	public ItemIngot(int id, int textureId, String itemName, int maxStackSize, String tipText) {
		super(id-256);
		/**
		 * Registra un lingotto
		 * @param id ID dell'oggetto
		 * @param textureId ID della texture
		 * @param itemName nome oggetto
		 * @param maxStackSize Max stack size
		 * @return Item.
		 */
		this.setTextureFile("/oilgasoverhaul/textures/Ingots.png");
		this.setIconIndex(textureId);
		this.setCreativeTab(CreativeTab.tabMetallurgy);
		this.setItemName(itemName);
		this.setMaxStackSize(maxStackSize);
		this.tipText = tipText;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List toolTip, boolean par4)
	{
		super.addInformation(par1ItemStack, par2EntityPlayer, toolTip, par4);
		toolTip.add("\247e" + tipText);
	}
}

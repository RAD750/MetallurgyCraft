package metallurgycraft.main.items;

import metallurgycraft.main.CreativeTab;
import net.minecraft.item.Item;

public class ItemGeneric extends Item {

	public ItemGeneric(int id, int textureId, String itemName, int maxStackSize) {
		super(id-256);
		/**
		 * Registra un oggetto generico
		 * @param id ID dell'oggetto
		 * @param textureId ID della texture
		 * @param itemName nome oggetto
		 * @param maxStackSize Max stack size
		 * @return Item.
		 */
		this.setTextureFile("/oilgasoverhaul/textures/Items.png");
		this.setIconIndex(textureId);
		this.setCreativeTab(CreativeTab.tabMetallurgy);
		this.setItemName(itemName);
		this.setMaxStackSize(maxStackSize);
	}

}

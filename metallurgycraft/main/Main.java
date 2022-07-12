package metallurgycraft.main;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import metallurgycraft.main.handlers.CraftingHandler;
import metallurgycraft.main.handlers.OreDictionaryHandler;
import metallurgycraft.main.items.Items;
import metallurgycraft.main.proxies.CommonProxy;
import net.minecraft.src.BaseMod;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;

@Mod(name="Metallurgy and Advanced Engineering", version="1.0", modid="metallurgyaa", dependencies="required-after:IC2; after:factorization; after:Railcraft; after:ThermalExpansion; after:ThermalExpansion|Transport; after:ThermalExpansion|Energy; after:ThermalExpansion|Factory; after:XyCraft; after:MetallurgyCore; after:MetallurgyBase; after:MetallurgyEnder; after:MetallurgyFantasy; after:MetallurgyNether; after:MetallurgyPrecious; after:MetallurgyUtility; after:BuildCraft|Silicon; after:BuildCraft|Core; after:BuildCraft|Transport; after:BuildCraft|Factory; after:BuildCraft|Energy; after:BuildCraft|Builders; after:enhancedgeology; after:railcraft;")
public class Main extends BaseMod{
	
	public static Logger metallurgyLog = Logger.getLogger("MetallurgyCraft");
	
	@SidedProxy(clientSide="metallurgycraft.main.proxies.ClientProxy", serverSide="metallurgycraft.main.proxies.ServerProxy")
	public static CommonProxy proxy;
	
	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void load() {
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
	metallurgyLog.info("Veneriamo il Sacro Dio Henry Bessemer");			
	}
	
	
	@Init
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		Items.initItems();
		Items.initLanguageRegistry();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		CraftingHandler.initCrafting();
		OreDictionaryHandler.initOreDictionary();
	    proxy.postInit(event);
	}
}

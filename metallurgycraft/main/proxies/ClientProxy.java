package metallurgycraft.main.proxies;

import cpw.mods.fml.client.TextureFXManager;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import metallurgycraft.main.Main;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	public ClientProxy() {
		

		
	}

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		
	}

	@Init
	public void init(FMLInitializationEvent event) {
		super.init(event);
		//MinecraftForgeClient.preloadTexture("/oilgasoverhaul/textures/cells.png");

	}

	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}

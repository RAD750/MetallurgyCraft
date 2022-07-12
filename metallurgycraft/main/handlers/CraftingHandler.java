package metallurgycraft.main.handlers;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cpw.mods.fml.common.registry.GameRegistry;
import ljdp.minechem.api.core.Chemical;
import ljdp.minechem.api.core.Element;
import ljdp.minechem.api.core.EnumElement;
import ljdp.minechem.api.recipe.DecomposerRecipe;
import ljdp.minechem.api.recipe.SynthesisRecipe;
import metallurgycraft.main.Main;
import metallurgycraft.main.items.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import railcraft.common.api.core.items.ItemRegistry;
import railcraft.common.api.crafting.IRollingMachineCraftingManager;
import railcraft.common.api.crafting.RailcraftCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class CraftingHandler {

	public static void initCrafting() {
		
		/*
		 * GREGTECH SINTASSI
		 * 
		 * getGregTechItem(TIPO, QTA, META)
		 * 
		 * TIPO: 0. Lingotti 1. Polveri 2. Celle
		 */
		
		// METALLURGIA PRIMARIA
		
		GregtechCompat.addAlloySmelterRecipe(GregtechCompat.getGregTechItem(2, 1, 33), null, new ItemStack(Items.burntLimeCell, 1), 200, 120);
		GregtechCompat.addElectrolyzerRecipe(GregtechCompat.getGregTechItem(1, 64, 241), 0, new ItemStack(Items.mixedIronOxides, 16), null, null, null, 200, 120);
		
		ItemStack magnetite = CraftingHelpers.getOreDict("gemMagnetite");
		ItemStack hematite = CraftingHelpers.getOreDict("gemEmatite");
		ItemStack goethite = CraftingHelpers.getOreDict("gemGoetite");
		ItemStack siderite = CraftingHelpers.getOreDict("gemSiderite");
		ItemStack cellOxygen = CraftingHelpers.getOreDict("cellOxygen");
		ItemStack waterCell = ic2.api.Items.getItem("waterCell").copy();

	
		if (magnetite != null && hematite != null && goethite != null && siderite != null && cellOxygen != null) {
			magnetite.stackSize = 8;
			hematite.stackSize = 8;
			goethite.stackSize = 6;
			siderite.stackSize = 6;
			GregtechCompat.addElectrolyzerRecipe(new ItemStack(Items.mixedIronOxides, 64), 0, magnetite, hematite, goethite, siderite, 600, 400);
			
			magnetite.stackSize = 1;
			cellOxygen.stackSize = 4;
			GregtechCompat.addElectrolyzerRecipe(magnetite, 4, new ItemStack(Items.purifiedIronOre, 3), cellOxygen, null, null, 400, 90);
			
			hematite.stackSize = 1;
			cellOxygen.stackSize = 3;
			GregtechCompat.addElectrolyzerRecipe(hematite, 3, new ItemStack(Items.purifiedIronOre, 2), cellOxygen, null, null, 400, 90);
			
			goethite.stackSize = 1;
			cellOxygen.stackSize = 3;
			waterCell.stackSize = 2;
			GregtechCompat.addElectrolyzerRecipe(goethite, 3, new ItemStack(Items.purifiedIronOre, 1), cellOxygen, waterCell, null, 400, 90);
			
			hematite.stackSize = 1;
			cellOxygen.stackSize = 3;
			GregtechCompat.addElectrolyzerRecipe(siderite, 4, new ItemStack(Items.purifiedIronOre, 1), cellOxygen, GregtechCompat.getGregTechItem(2, 1, 8), null, 400, 90);
			
		} else {
			Main.metallurgyLog.severe("Cannot register recipes, EnhancedGeology missing");
		}
		
		GregtechCompat.addChemicalRecipe(new ItemStack(Items.purifiedIronOre), new ItemStack(Items.burntLimeCell), new ItemStack(Items.limedIronOre), 500);
		RailcraftCraftingManager.blastFurnace.addRecipe(Items.limedIronOre.itemID, 600, new ItemStack(Items.ingotPigIron));
		
		ItemStack cellLiquidOxygen = CraftingHelpers.getOreDict("cellLiquidOxygen");

		if (cellLiquidOxygen != null) {
			GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotPigIron), cellLiquidOxygen, new ItemStack(Items.ingotImpureMildSteel), null, 800, 1100, 1900);
		}
		
		
		// METALLURGIA SECONDARIA
		
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotImpureMildSteel), GregtechCompat.getGregTechItem(2, 1, 15), new ItemStack(Items.ingotDegassedMildSteel), null, 800, 400, 1300);
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotDegassedMildSteel), null, new ItemStack(Items.ingotDesulfuredSteel), null, 800, 400, 1300);
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotDesulfuredSteel), null, new ItemStack(Items.ingotMildSteel), null, 800, 400, 1300);
		
		GregtechCompat.addChemicalRecipe(GregtechCompat.getGregTechItem(1, 4, 20), GregtechCompat.getGregTechItem(1, 4, 28), new ItemStack(Items.dust17NiCrMoMix), 800);
		GregtechCompat.addChemicalRecipe(GregtechCompat.getGregTechItem(1, 8, 22), GregtechCompat.getGregTechItem(1, 4, 20), new ItemStack(Items.dustHSS18Mix), 800);
		GregtechCompat.addChemicalRecipe(GregtechCompat.getGregTechItem(1, 2, 22), GregtechCompat.getGregTechItem(1, 8, 28), new ItemStack(Items.dustAISI316Mix), 800);
		GregtechCompat.addChemicalRecipe(GregtechCompat.getGregTechItem(1, 8, 240), GregtechCompat.getGregTechItem(1, 8, 12), new ItemStack(Items.dustC45Mix), 800);
		
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotMildSteel), new ItemStack(Items.dust17NiCrMoMix, 1), new ItemStack(Items.ingot17NiCrMo, 1), null, 1600, 400, 1770);
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotMildSteel), new ItemStack(Items.dustHSS18Mix, 1), new ItemStack(Items.ingotHSS18, 1), null, 1600, 400, 1770);
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotMildSteel), new ItemStack(Items.dustAISI316Mix, 1), new ItemStack(Items.ingotAISI316, 1), null, 1600, 400, 1770);


		// METALLURGIA TERZIARIA
		
		ItemStack paraffinCell = CraftingHelpers.getOreDict("Paraffin Cell");
		ItemStack condensateCell = CraftingHelpers.getOreDict("Condensate Cell");
		ItemStack gasolineCell = CraftingHelpers.getOreDict("Gasoline Cell");
		ItemStack methaneCell = GregtechCompat.getGregTechItem(2, 1, 9);
		ItemStack naphthaCell = CraftingHelpers.getOreDict("Naphtha Cell");
		ItemStack lpgCell = CraftingHelpers.getOreDict("LPG Cell");
		ItemStack e85GasCell = CraftingHelpers.getOreDict("E85 Gasoline Cell");
		ItemStack hfoCell = CraftingHelpers.getOreDict("Heavy Fuel Oil Cell");
		
		if (paraffinCell != null && condensateCell != null && gasolineCell != null && naphthaCell != null && lpgCell != null && e85GasCell != null && hfoCell != null) {
			ItemStack emptyFuelCan = ic2.api.Items.getItem("fuelCan").copy();
			emptyFuelCan.stackSize = 64;
			paraffinCell.stackSize = 64;
			GregtechCompat.addAssemblerRecipe(emptyFuelCan, paraffinCell, new ItemStack(Items.fuelKit), 1200, 25);
			GregtechCompat.addAssemblerRecipe(emptyFuelCan, condensateCell, new ItemStack(Items.fuelKit), 1200, 25);
			GregtechCompat.addAssemblerRecipe(emptyFuelCan, gasolineCell, new ItemStack(Items.fuelKit), 1200, 25);
			GregtechCompat.addAssemblerRecipe(emptyFuelCan, methaneCell, new ItemStack(Items.fuelKit), 1200, 25);
			GregtechCompat.addAssemblerRecipe(emptyFuelCan, naphthaCell, new ItemStack(Items.fuelKit, 2), 1200, 25);
			GregtechCompat.addAssemblerRecipe(emptyFuelCan, lpgCell, new ItemStack(Items.fuelKit, 3), 1200, 25);
			GregtechCompat.addAssemblerRecipe(emptyFuelCan, e85GasCell, new ItemStack(Items.fuelKit, 3), 1200, 25);
			GregtechCompat.addAssemblerRecipe(emptyFuelCan, hfoCell, new ItemStack(Items.fuelKit, 4), 1200, 25);
		} else {
			Main.metallurgyLog.severe("Cannot register recipes, Oil & Gas Overhaul missing");
		}
		
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingot17NiCrMo), new ItemStack(Items.fuelKit, 64), new ItemStack(Items.billet17NiCrMo), null, 900, 256, 1770);
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotAISI316), new ItemStack(Items.fuelKit, 64), new ItemStack(Items.billetAISI316), null, 900, 256, 1770);
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotHSS18), new ItemStack(Items.fuelKit, 64), new ItemStack(Items.billetHSS18), null, 900, 256, 1770);
		GregtechCompat.addBlastRecipe(new ItemStack(Items.ingotC45), new ItemStack(Items.fuelKit, 64), new ItemStack(Items.billetC45), null, 900, 256, 1770);
		
		GregtechCompat.addBenderRecipe(new ItemStack(Items.billet17NiCrMo), new ItemStack(Items.plate17NiCrMo), 1000, 128);
		GregtechCompat.addBenderRecipe(new ItemStack(Items.billetAISI316), new ItemStack(Items.plateAISI316), 1000, 128);
		GregtechCompat.addBenderRecipe(new ItemStack(Items.billetHSS18), new ItemStack(Items.plateHSS18), 1000, 128);
		GregtechCompat.addBenderRecipe(new ItemStack(Items.billetC45), new ItemStack(Items.plateC45), 1000, 128);
		
		GregtechCompat.addWiremillRecipe(new ItemStack(Items.billet17NiCrMo), new ItemStack(Items.bar17NiCrMo), 1000, 128);
		GregtechCompat.addWiremillRecipe(new ItemStack(Items.billetAISI316), new ItemStack(Items.barAISI316), 1000, 128);
		GregtechCompat.addWiremillRecipe(new ItemStack(Items.billetHSS18), new ItemStack(Items.barHSS18), 1000, 128);
		GregtechCompat.addWiremillRecipe(new ItemStack(Items.billetC45), new ItemStack(Items.barC45), 1000, 128);

		GregtechCompat.addWiremillRecipe(new ItemStack(Items.bar17NiCrMo), new ItemStack(Items.tube17NiCrMo), 600, 60);
		GregtechCompat.addWiremillRecipe(new ItemStack(Items.barAISI316), new ItemStack(Items.tubeAISI316), 600, 60);
		GregtechCompat.addWiremillRecipe(new ItemStack(Items.barHSS18), new ItemStack(Items.tubeHSS18), 600, 60);
		GregtechCompat.addWiremillRecipe(new ItemStack(Items.barC45), new ItemStack(Items.tubeC45), 600, 60);
		
		
		// CARPENTERIA
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.screwM20in109, 4), new Object[] {
				new ItemStack(Items.barHSS18)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.nutM20in109, 4), new Object[] {
				new ItemStack(Items.tubeHSS18)
		});
		
		ItemStack mineralOilCell = CraftingHelpers.getOreDict("Mineral Oil Cell");
		ItemStack acetyleneCell = CraftingHelpers.getOreDict("cellAcetylene");
		
		if (mineralOilCell != null && acetyleneCell != null) {
			mineralOilCell.stackSize = 64;
			acetyleneCell.stackSize = 64;
			ItemStack rubber = ic2.api.Items.getItem("rubber").copy();
			rubber.stackSize = 4;
			GregtechCompat.addAssemblerRecipe(new ItemStack(Items.plateHSS18, 8), mineralOilCell, new ItemStack(Items.hssMachiningTool), 2400, 400);
			GregtechCompat.addAssemblerRecipe(new ItemStack(Items.plateHSS18, 8), acetyleneCell, new ItemStack(Items.oxyFuelWeldingKit), 2400, 400);
			GregtechCompat.addWiremillRecipe(rubber, new ItemStack(Items.oRing), 200, 32);
		}
		
		GregtechCompat.addAssemblerRecipe(new ItemStack(Block.sandStone, 64), new ItemStack(Items.fuelKit, 64), new ItemStack(Items.sandCastingKit), 120, 128);
		GameRegistry.addShapedRecipe(new ItemStack(Items.plateReinforcedAISI316), new Object[] {
				"###", "###", "###", '#', Items.plateAISI316
		});
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.plateReinforcedAISI316, 16), new ItemStack(Items.fuelKit, 64), new ItemStack(Items.forgingKit), 120, 128);			
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.plateAISI316, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.holedPlateAISI316, 4), 120, 6);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.plateC45, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.holedPlateC45, 4), 120, 6);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.plateC45, 4), new ItemStack(Items.oxyFuelWeldingKit), new ItemStack(Items.weldedCasingC45, 4), 120, 6);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.bar17NiCrMo, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.turnedBar17NiCrMo, 4), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.tube17NiCrMo, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.toleratedTube17NiCrMo, 4), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.holedPlateAISI316), new ItemStack(Items.screwM20in109, 4), new ItemStack(Items.trackShoes), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.tubeC45, 4), new ItemStack(Items.sandCastingKit), new ItemStack(Items.chainBody, 4), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.tubeC45, 8), new ItemStack(Items.oxyFuelWeldingKit), new ItemStack(Items.structuralBeamC45, 4), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.barC45, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.pistonHead, 4), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.barC45, 4), new ItemStack(Items.forgingKit), new ItemStack(Items.forgedRod), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.holedPlateC45, 4), new ItemStack(Items.screwM20in109, 24), new ItemStack(Items.threadedLinkedPlateC45, 4), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.plate17NiCrMo, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.gear17NiCrMo), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.plate17NiCrMo), new ItemStack(Items.ingot17NiCrMo, 4), new ItemStack(Items.wheel17NiCrMo), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.wheel17NiCrMo), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.idler17NiCrMo), 120, 12);
		ItemStack bronze = ic2.api.Items.getItem("bronzeIngot"); 
		bronze.stackSize = 4;
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.toleratedTube17NiCrMo), bronze, new ItemStack(Items.bronzeBushing), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.turnedBar17NiCrMo), GregtechCompat.getGregTechItem(0, 4, 22), new ItemStack(Items.pin), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.tubeAISI316, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.pipingAISI316), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.tubeAISI316, 4), new ItemStack(Items.screwM20in109, 24), new ItemStack(Items.tankFrameStainlessSteel), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.tubeAISI316, 4), new ItemStack(Items.oxyFuelWeldingKit), new ItemStack(Items.tankWallStainlessSteel), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.barAISI316, 4), new ItemStack(Items.forgingKit), new ItemStack(Items.casingTurboCompressor), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.barAISI316, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.bladesTurboCompressor), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.barAISI316, 4), new ItemStack(Items.sandCastingKit), new ItemStack(Items.casingDieselPump), 120, 12);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.weldedCasingC45), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.casingFeedwaterPump), 120, 12);
		//GregtechCompat.addAssemblerRecipe(new ItemStack(Items.ingotPigIron, 64), new ItemStack(Items.sandCastingKit), new ItemStack(Items.engineBlock), 120, 12);
		
		//manufacturing plant
		
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.structuralBeamC45, 4), new ItemStack(Items.threadedLinkedPlateC45, 4), new ItemStack(Items.frameKitC45, 4), 400, 60);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.frameKitC45, 4), new ItemStack(Items.oxyFuelWeldingKit), new ItemStack(Items.weldedFrameC45), 400, 60);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.turnedBar17NiCrMo, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.shaft17NiCrMo, 4), 400, 60);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.turnedBar17NiCrMo, 4), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.shaft17NiCrMo, 4), 400, 60);

		GameRegistry.addShapedRecipe(new ItemStack(Items.trackRoller), new Object[] {
				" S ", "W W", "B B", 'B', Items.bronzeBushing, 'S', Items.shaft17NiCrMo, 'W', Items.wheel17NiCrMo 
		});
		
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.tankWallStainlessSteel, 6), new ItemStack(Items.screwM20in109, 24), new ItemStack(Items.tankShellStainlessSteel), 400, 60);
		GregtechCompat.addBlastRecipe(new ItemStack(Items.gear17NiCrMo), GregtechCompat.getGregTechItem(2, 1, 15), new ItemStack(Items.quenched17NiCrMnoGear), null, 4000, 600, 1373);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.forgedRod), new ItemStack(Items.hssMachiningTool), new ItemStack(Items.rod), 400, 60);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.casingTurboCompressor), new ItemStack(Items.bladesTurboCompressor), ItemRegistry.getItem("part.turbocompressor", 1), 400, 60);

		GameRegistry.addShapedRecipe(new ItemStack(Items.frame), new Object[] {
				"SFI", "RRR", "RRR", 'R', Items.trackRoller, 'I', Items.idler17NiCrMo, 'S', Items.sprocket, 'F', Items.frame
		});
		
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.chain, 64), new ItemStack(Items.trackShoes, 64), new ItemStack(Items.chainAssembly), 0, 0);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.frame), new ItemStack(Items.chainAssembly), new ItemStack(Items.trackedCrawler), 0, 0);
		
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.pistonHead), new ItemStack(Items.oRing, 3), new ItemStack(Items.completePistonHead), 0, 0);
		GameRegistry.addShapedRecipe(ItemRegistry.getItem("part.piston", 1), new Object[] {
				" H ", "RPB", "   ", 'H', Items.completePistonHead, 'R', Items.rod, 'P', Items.pin, 'B', Items.bronzeBushing
		});

		GregtechCompat.addAssemblerRecipe(ItemRegistry.getItem("part.piston", 4), new ItemStack(Items.casingFeedwaterPump), ItemRegistry.getItem("part.feedwaterpump", 1), 0, 0);
		GregtechCompat.addAssemblerRecipe(ItemRegistry.getItem("part.piston", 4), new ItemStack(Items.casingDieselPump), ItemRegistry.getItem("part.dieselpump", 1), 0, 0);
		
		GameRegistry.addShapedRecipe(ItemRegistry.getItem("part.dieselEngine", 1), new Object[] {
				"PPP", "SSS", "BDO", 'P', ItemRegistry.getItem("part.piston", 1), 'S', Items.shaft17NiCrMo, 'B', ItemRegistry.getItem("part.engineBlock", 1), 'D', ItemRegistry.getItem("part.dieselpump", 1),'O', Items.oRing 
		});
		
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.quenched17NiCrMnoGear, 6), new ItemStack(Items.shaft17NiCrMo, 5), new ItemStack(Items.planetaryGearbox), 0, 0);
		GregtechCompat.addAssemblerRecipe(new ItemStack(Items.tankFrameStainlessSteel), new ItemStack(Items.tankShellStainlessSteel), new ItemStack(Items.stainlessSteelTank), 0, 0);

		
	}
}

package metallurgycraft.main.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	//ITEMS
	public static Item burntLimeCell;
	public static Item mixedIronOxides, purifiedIronOre, limedIronOre;
	public static Item ingotPigIron, ingotImpureMildSteel, ingotDegassedMildSteel, ingotDesulfuredSteel, ingotMildSteel, ingot17NiCrMo, ingotHSS18, ingotAISI316, ingotC45;
	public static Item billetPigIron, billetImpureMildSteel, billetDegassedMildSteel, billetDesulfuredSteel, billetMildSteel, billet17NiCrMo, billetHSS18, billetAISI316, billetC45;
	public static Item dust17NiCrMoMix, dustHSS18Mix, dustAISI316Mix, dustC45Mix;
	public static Item fuelKit, plate17NiCrMo, plateHSS18, plateAISI316, plateC45;
	public static Item bar17NiCrMo, barHSS18, barAISI316, barC45; 
	public static Item tube17NiCrMo, tubeHSS18, tubeAISI316, tubeC45;
	public static Item holedPlate17NiCrMo, holedPlateHSS18, holedPlateAISI316, holedPlateC45;
	public static Item beam17NiCrMo, beamHSS18, beamAISI316, beamC45; 
	public static Item screwM20in109, nutM20in109;
	public static Item hssMachiningTool, oxyFuelWeldingKit, oRing, sandCastingKit, forgingKit;
	public static Item weldedCasingC45, turnedBar17NiCrMo, toleratedTube17NiCrMo, trackShoes, chainBody, structuralBeamC45,
						pistonHead, forgedRod, threadedLinkedPlateC45, gear17NiCrMo, wheel17NiCrMo, idler17NiCrMo, bronzeBushing, pin,
						pipingAISI316, tankFrameStainlessSteel, tankWallStainlessSteel, casingTurboCompressor, bladesTurboCompressor,
						casingDieselPump, casingFeedwaterPump, engineBlock, frameKitC45, shaft17NiCrMo, trackRoller, tankShellStainlessSteel,
						quenched17NiCrMnoGear, sprocket, rod, frame, chain, chainAssembly, trackedCrawler, completePistonHead, planetaryGearbox,
						stainlessSteelTank, plateReinforcedAISI316, weldedFrameC45;
	
	
	public static void initItems() {
		burntLimeCell = new ItemCell(16500, 0, "burntLimeCell", 64, "CaO");
		
		mixedIronOxides = new ItemOreChunks(16510, 0, "mixedIronOxides", 64, null);
		purifiedIronOre = new ItemOreChunks(16511,1 , "purifiedIronOre", 64, null);
		limedIronOre = new ItemOreChunks(16511, 2, "limedIronOre", 64, null);
		
		ingotPigIron = new ItemIngot(16520, 0, "ingotPigIron", 64, null);
		ingotImpureMildSteel = new ItemIngot(16521, 1, "ingotImpureMildSteel", 64, null);
		ingotDegassedMildSteel = new ItemIngot(16522, 2, "ingotDegassedMildSteel", 64, null);
		ingotDesulfuredSteel = new ItemIngot(16523, 3, "ingotDesulfuredSteel", 64, null);
		ingotMildSteel = new ItemIngot(16524, 4, "ingotMildSteel", 64, null);
		ingot17NiCrMo = new ItemIngot(16525, 5, "ingot17NiCrMo", 64, null);
		ingotHSS18 = new ItemIngot(16526, 6, "ingotHSS18", 64, "High Speed Steel");
		ingotAISI316 = new ItemIngot(16527, 7, "ingotAISI316", 64, "Stainless Steel"); 
		ingotC45 = new ItemIngot(16528, 8, "ingotC45", 64, null);
		
		billetPigIron = new ItemIngot(16536, 16, "billetPigIron", 64, null);
		billetImpureMildSteel = new ItemIngot(16537, 17, "billetImpureMildSteel", 64, null);
		billetDegassedMildSteel = new ItemIngot(16538, 18, "billetDegassedMildSteel", 64, null);
		billetDesulfuredSteel = new ItemIngot(16539, 19, "billetDesulfuredSteel", 64, null);
		billetMildSteel = new ItemIngot(16540, 20, "billetMildSteel", 64, null);
		billet17NiCrMo = new ItemIngot(16541, 21, "billet17NiCrMo", 64, null);
		billetHSS18 = new ItemIngot(16542, 22, "billetHSS18", 64, "High Speed Steel");
		billetAISI316 = new ItemIngot(16543, 23, "billetAISI316", 64, "Stainless Steel"); 
		billetC45 = new ItemIngot(16544, 24, "billetC45", 64, null);
		
		dust17NiCrMoMix = new ItemDust(16550, 0, "dust17NiCrMoMix", 64, null);
		dustHSS18Mix = new ItemDust(16551, 1, "dustHSS18Mix", 64, null);
		dustAISI316Mix = new ItemDust(16552, 2, "dustAISI316Mix", 64, null);
		dustC45Mix = new ItemDust(16553, 3, "dustC45Mix", 64, null);
		
		fuelKit = new ItemGeneric(16600, 0, "fuelKit", 64);
		plate17NiCrMo = new ItemGeneric(16601, 1, "plate17NiCrMo", 64);
		plateHSS18 = new ItemGeneric(16602, 2, "plateHSS18", 64);
		plateAISI316 = new ItemGeneric(16603, 3, "plateAISI316", 64);
		plateC45 = new ItemGeneric(16604, 4, "plateC45", 64);
		bar17NiCrMo = new ItemGeneric(16605, 5, "bar17NiCrMo", 64);
		barHSS18 = new ItemGeneric(16606, 6, "barHSS18", 64);
		barAISI316 = new ItemGeneric(16607, 7, "barAISI316", 64);
		barC45 = new ItemGeneric(16608, 8, "barC45", 64);
		tube17NiCrMo = new ItemGeneric(16609, 9, "tube17NiCrMo", 64);
		tubeHSS18 = new ItemGeneric(16610, 10, "tubeHSS18", 64);
		tubeAISI316 = new ItemGeneric(16611, 11, "tubeAISI316", 64);
		tubeC45 = new ItemGeneric(16612, 12, "tubeC45", 64);
		holedPlate17NiCrMo = new ItemGeneric(16613, 13, "holedPlate17NiCrMo", 64);
		holedPlateHSS18 = new ItemGeneric(16614, 14, "holedPlateHSS18", 64);
		holedPlateAISI316 = new ItemGeneric(16615, 15, "holedPlateAISI316", 64);
		holedPlateC45 = new ItemGeneric(16616, 16, "holedPlateC45", 64);
		beam17NiCrMo = new ItemGeneric(16617, 17, "beam17NiCrMo", 64);
		beamHSS18 = new ItemGeneric(16618, 18, "beamHSS18", 64);
		beamAISI316 = new ItemGeneric(16619, 19, "beamAISI316", 64);
		beamC45 = new ItemGeneric(16620, 20, "beamC45", 64);
		screwM20in109 = new ItemGeneric(16623, 23, "screwM20in109", 64);
		nutM20in109 = new ItemGeneric(16624, 24, "nutM20in109", 64);
		hssMachiningTool = new ItemGeneric(16625, 25, "hssMachiningTool", 64);
		oxyFuelWeldingKit = new ItemGeneric(16626, 26, "oxyFuelWeldingKit", 64);
		oRing = new ItemGeneric(16627, 27, "oRing", 64);
		sandCastingKit = new ItemGeneric(16628, 28, "sandCastingKit", 64);
		forgingKit = new ItemGeneric(16629, 29, "forgingKit", 64);
		weldedCasingC45 = new ItemGeneric(16630, 30, "weldedCasingC45", 64);
		turnedBar17NiCrMo = new ItemGeneric(16631, 31, "turnedBar17NiCrMo", 64);
		toleratedTube17NiCrMo = new ItemGeneric(16632, 32, "toleratedTube17NiCrMo", 64);
		trackShoes = new ItemGeneric(16633, 33, "trackShoes", 64);
		chainBody = new ItemGeneric(16634, 34, "chainBody", 64);
		structuralBeamC45 = new ItemGeneric(16635, 35, "structuralBeamC45", 64);
		turnedBar17NiCrMo = new ItemGeneric(16636, 36, "turnedBar17NiCrMo", 64);
		toleratedTube17NiCrMo = new ItemGeneric(16637, 37, "toleratedTube17NiCrMo", 64);
		trackShoes = new ItemGeneric(16638, 38, "trackShoes", 64);
		structuralBeamC45 = new ItemGeneric(16639, 39, "chainBody", 64);
		chainBody = new ItemGeneric(16643, 43, "chainBody", 64);
		pistonHead = new ItemGeneric(16645, 45, "pistonHead", 64);
		forgedRod = new ItemGeneric(16646, 46, "forgedRod", 64);
		threadedLinkedPlateC45 = new ItemGeneric(16647, 47, "threadedLinkedPlateC45", 64);
		gear17NiCrMo = new ItemGeneric(16648, 48, "gear17NiCrMo", 64);
		wheel17NiCrMo = new ItemGeneric(16649, 49, "wheel17NiCrMo", 64);
		idler17NiCrMo = new ItemGeneric(16650, 50, "idler17NiCrMo", 64);
		bronzeBushing = new ItemGeneric(16650, 50, "bronzeBushing", 64);
		pin = new ItemGeneric(16651, 51, "pin", 64);
		pipingAISI316 = new ItemGeneric(16652, 52, "pipingAISI316", 64);
		tankFrameStainlessSteel = new ItemGeneric(16653, 53, "tankFrameStainlessSteel", 64);
		tankWallStainlessSteel = new ItemGeneric(16654, 54, "tankWallStainlessSteel", 64);
		casingTurboCompressor = new ItemGeneric(16655, 55, "casingTurboCompressor", 64);
		bladesTurboCompressor = new ItemGeneric(16656, 56, "bladesTurboCompressor", 64);
		casingDieselPump = new ItemGeneric(16657, 57, "casingDieselPump", 64);
		casingFeedwaterPump = new ItemGeneric(16658, 58, "casingFeedwaterPump", 64);
		weldedFrameC45 = new ItemGeneric(16659, 59, "weldedFrameC45", 64);
		frameKitC45 = new ItemGeneric(16660, 60, "frameKitC45", 64);
		shaft17NiCrMo = new ItemGeneric(16661, 61, "shaft17NiCrMo", 64);
		trackRoller = new ItemGeneric(16662, 62, "trackRoller", 64);
		tankShellStainlessSteel = new ItemGeneric(16663, 63, "tankShellStainlessSteel", 64);
		quenched17NiCrMnoGear = new ItemGeneric(16664, 64, "quenched17NiCrMnoGear", 64);
		sprocket = new ItemGeneric(16665, 65, "sprocket", 64);
		rod = new ItemGeneric(16666, 66, "rod", 64);
		frame = new ItemGeneric(16667, 67, "frame", 64);
		chain = new ItemGeneric(16668, 68, "chain", 64);
		chainAssembly = new ItemGeneric(16669, 69, "chainAssembly", 64);
		trackedCrawler = new ItemGeneric(16670, 70, "trackedCrawler", 64);
		completePistonHead = new ItemGeneric(16671, 71, "completePistonHead", 64);
		planetaryGearbox = new ItemGeneric(16672, 72, "planetaryGearbox", 64);
		stainlessSteelTank = new ItemGeneric(16673, 73, "stainlessSteelTank", 64);
		plateReinforcedAISI316 = new ItemGeneric(16674, 74, "plateReinforcedAISI316", 64); //Da dire a Piccio per la texture

	}

	public static void initLanguageRegistry() {
		LanguageRegistry.addName(burntLimeCell, "Burnt Lime Cell");
		
		LanguageRegistry.addName(mixedIronOxides, "Mixed Iron Oxides");
		LanguageRegistry.addName(purifiedIronOre, "Purified Iron Ore");
		LanguageRegistry.addName(limedIronOre, "Limed Iron Ore");
		
		LanguageRegistry.addName(ingotPigIron, "Pig Iron Ingot");
		LanguageRegistry.addName(ingotImpureMildSteel, "Impure Mild Steel Ingot");
		LanguageRegistry.addName(ingotDegassedMildSteel, "Degassed Mild Steel Ingot");
		LanguageRegistry.addName(ingotDesulfuredSteel, "Desulfured Steel Ingot");
		LanguageRegistry.addName(ingotMildSteel, "Mild Steel Ingot");
		LanguageRegistry.addName(ingot17NiCrMo, "17NiCrMo Steel Ingot");
		LanguageRegistry.addName(ingotHSS18, "HSS18 Steel Ingot");
		LanguageRegistry.addName(ingotAISI316, "AISI316 Steel Ingot"); 
		LanguageRegistry.addName(ingotC45, "C45 Steel Ingot");
		
		LanguageRegistry.addName(billetPigIron, "Pig Iron Billet");
		LanguageRegistry.addName(billetImpureMildSteel, "Impure Mild Steel Billet");
		LanguageRegistry.addName(billetDegassedMildSteel, "Degassed Mild Steel Billet");
		LanguageRegistry.addName(billetDesulfuredSteel, "Desulfured Steel Billet");
		LanguageRegistry.addName(billetMildSteel, "Mild Steel Billet");
		LanguageRegistry.addName(billet17NiCrMo, "17NiCrMo Steel Billet");
		LanguageRegistry.addName(billetHSS18, "HSS18 Steel Billet");
		LanguageRegistry.addName(billetAISI316, "AISI316 Steel Billet"); 
		LanguageRegistry.addName(billetC45, "C45 Steel Billet");
		
		LanguageRegistry.addName(dust17NiCrMoMix, "17NiCrMo Mix Dust");
		LanguageRegistry.addName(dustHSS18Mix, "HSS18 Mix Dust");
		LanguageRegistry.addName(dustAISI316Mix, "AISI316 Mix Dust");
		LanguageRegistry.addName(dustC45Mix, "C45 Mix Dust");
		
		LanguageRegistry.addName(fuelKit, "Fuel Kit");
		LanguageRegistry.addName(plate17NiCrMo, "17NiCrMo Steel Plate");
		LanguageRegistry.addName(plateHSS18, "HSS18 Steel Plate");
		LanguageRegistry.addName(plateAISI316, "AISI316 Steel Plate");
		LanguageRegistry.addName(plateC45, "C45 Steel Plate");
		LanguageRegistry.addName(bar17NiCrMo, "17NiCrMo Steel Bar");
		LanguageRegistry.addName(barHSS18, "HSS18 Steel Bar");
		LanguageRegistry.addName(barAISI316, "AISI316 Steel Bar");
		LanguageRegistry.addName(barC45, "C45 Steel Bar");
		LanguageRegistry.addName(tube17NiCrMo, "17NiCrMo Steel Tube");
		LanguageRegistry.addName(tubeHSS18, "HSS18 Steel Tube");
		LanguageRegistry.addName(tubeAISI316, "AISI316 Steel Tube");
		LanguageRegistry.addName(tubeC45, "C45 Steel Tube");
		LanguageRegistry.addName(holedPlate17NiCrMo, "17NiCrMo Steel Holed Plate");
		LanguageRegistry.addName(holedPlateHSS18, "HSS18 Steel Holed Plate");
		LanguageRegistry.addName(holedPlateAISI316, "AISI316 Steel Holed Plate");
		LanguageRegistry.addName(holedPlateC45, "C45 Steel Holed Plate");
		LanguageRegistry.addName(beam17NiCrMo, "17NiCrMo Steel Beam");
		LanguageRegistry.addName(beamHSS18, "HSS18 Steel Beam");
		LanguageRegistry.addName(beamAISI316, "AISI316 Steel Beam");
		LanguageRegistry.addName(beamC45, "C45 Steel Beam");
		LanguageRegistry.addName(screwM20in109, "Screw M20, in 10.9");
		LanguageRegistry.addName(nutM20in109, "Nut M20, in 10.9");
		LanguageRegistry.addName(hssMachiningTool, "HSS Machining Tool");
		LanguageRegistry.addName(oxyFuelWeldingKit, "Oxy-fuel Welding Kit");
		LanguageRegistry.addName(oRing, "O-Ring");
		LanguageRegistry.addName(sandCastingKit, "Sandcasting Kit");
		LanguageRegistry.addName(forgingKit, "Forging Kit");
		LanguageRegistry.addName(weldedCasingC45, "C45 Steel Welded Casing");
		LanguageRegistry.addName(turnedBar17NiCrMo, "17NiCrMo Steel Turned Bar");
		LanguageRegistry.addName(toleratedTube17NiCrMo, "17NiCrMo Steel Tolerated Tube");
		LanguageRegistry.addName(trackShoes, "Track Shoes");
		LanguageRegistry.addName(chainBody, "Chain Body");
		LanguageRegistry.addName(structuralBeamC45, "C45 Steel Structural Beam");
		LanguageRegistry.addName(turnedBar17NiCrMo, "17NiCrMo Steel Turned Bar");
		LanguageRegistry.addName(toleratedTube17NiCrMo, "17NiCrMo Steel Tolerated Tube");
		LanguageRegistry.addName(trackShoes, "Track Shoes");
		LanguageRegistry.addName(structuralBeamC45, "C45 Steel Structural Beam");
		LanguageRegistry.addName(pistonHead, "Piston Head");
		LanguageRegistry.addName(forgedRod, "Forged Rod");
		LanguageRegistry.addName(threadedLinkedPlateC45, "C45 Steel Threaded Linked Plate");
		LanguageRegistry.addName(gear17NiCrMo, "17NiCrMo Steel Gear");
		LanguageRegistry.addName(wheel17NiCrMo, "17NiCrMo Steel Wheel");
		LanguageRegistry.addName(idler17NiCrMo, "17NiCrMo Steel Idler");
		LanguageRegistry.addName(bronzeBushing, "Bronze Bushing");
		LanguageRegistry.addName(pin, "Pin");
		LanguageRegistry.addName(pipingAISI316, "AISI316 Steel Piping");
		LanguageRegistry.addName(tankFrameStainlessSteel, "Stainless Steel Tank Frame");
		LanguageRegistry.addName(tankWallStainlessSteel, "Stainless Steel Tank Wall");
		LanguageRegistry.addName(casingTurboCompressor, "Turbocompressor Casing");
		LanguageRegistry.addName(bladesTurboCompressor, "Turbocompressor Blades");
		LanguageRegistry.addName(casingDieselPump, "Diesel Pump Casing");
		LanguageRegistry.addName(casingFeedwaterPump, "Feedwater Pump Casing");
		LanguageRegistry.addName(weldedFrameC45, "C45 Steel Welded Plate");
		LanguageRegistry.addName(frameKitC45, "C45 Steel Frame Kit");
		LanguageRegistry.addName(shaft17NiCrMo, "17NiCrMo Steel Shaft");
		LanguageRegistry.addName(trackRoller, "Track Roller");
		LanguageRegistry.addName(tankShellStainlessSteel, "Stainless Steel Tank Shell");
		LanguageRegistry.addName(quenched17NiCrMnoGear, "Quenched 17NiCrMo Steel Gear");
		LanguageRegistry.addName(sprocket, "Steel Sprocket");
		LanguageRegistry.addName(rod, "Steel Rod");
		LanguageRegistry.addName(frame, "Steel Frame");
		LanguageRegistry.addName(chain, "Steel Chain");
		LanguageRegistry.addName(chainAssembly, "Chain Assembly");
		LanguageRegistry.addName(trackedCrawler, "Tracked Crawler");
		LanguageRegistry.addName(completePistonHead, "Complete Piston Head");
		LanguageRegistry.addName(planetaryGearbox, "Planetary Gearbox");
		LanguageRegistry.addName(stainlessSteelTank, "Stainless Steel Tank");
		LanguageRegistry.addName(plateReinforcedAISI316, "Reinforced AISI316 Steel Plate"); 
	}
}





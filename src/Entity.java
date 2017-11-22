/*
 * 	Object entity
		int entity_number
		String name 
		int positionX
		int positionY
		boolean constOnOff
		Object Filter[] filtersignals
			String name
			int index
			int count
 * */
public class Entity {//one item in a blueprint, some regular blueprint-attributes are left out 
	int entity_number;
	itemname name;
    int positionX;
 	int positionY;
 	Boolean constOnOff;
 	Filter[] filtersignals = new Filter[18]; //Objekt für die CC-signale und ggf. RequesterChest-Filter 
 	       
    Entity (){}
    
    Entity(String filterName_, int stack_size_){
	name = filterName_;
	//stack_size = stack_size_;
}
    
	public void setEntityNumber(int entity_number_) {
		this.entity_number = entity_number_;}
    
	
	
    int numberofStacks (int quantity) {
	//wie groß ist die stacksize des items? 
	// https://www.reddit.com/r/factorio/comments/4huy05/where_are_item_stack_sizes_documented/	
	//wie viele stacks davon sind im blueprint? 
	//die anzahl der stacks wird später auf den trainwagon verteilt 

	int stack = 5;
	return stack;	
    	}
    


}//end Entity


/*start comment nirvana


	int i=0; //local index
//tab: logistics
	library[i++] = new Item (i,"wooden_chest",50);
	library[i++] = new Item (i,"iron_chest",50);
	library[i++] = new Item (i,"steel_chest",50);
	library[i++] = new Item (i,"storage_tank",50);

	library[i++] = new Item (i,"transport_belt",100);
	library[i++] = new Item (i,"fast_transport_belt",100);
	library[i++] = new Item (i,"express_transport_belt",100);
	library[i++] = new Item (i,"underground_belt",50);
	library[i++] = new Item (i,"fast_underground_belt",50);
	library[i++] = new Item (i,"express_underground_belt",50);
	library[i++] = new Item (i,"splitter",50);
	library[i++] = new Item (i,"fast_splitter",50);
	library[i++] = new Item (i,"express_splitter",50);

	library[i++] = new Item (i,"burner_inserter",50);
	library[i++] = new Item (i,"inserter",50);
	library[i++] = new Item (i,"long_handed_inserter",50);
	library[i++] = new Item (i,"fast_inserter",50);
	library[i++] = new Item (i,"filter_inserter",50);
	library[i++] = new Item (i,"stack_inserter",50);
	library[i++] = new Item (i,"stack_filter_inserter",50);

	library[i++] = new Item (i,"small_electric_pole",50);
	library[i++] = new Item (i,"medium_electric_pole",50);
	library[i++] = new Item (i,"big_electric_pole",50);
	library[i++] = new Item (i,"substation",50);
	library[i++] = new Item (i,"pipe",100);
	library[i++] = new Item (i,"pipe_to_ground",50);
	library[i++] = new Item (i,"pump",50);

	library[i++] = new Item (i,"straight_rail",100); 
	library[i++] = new Item (i,"curved_rail",100); //irgendwie umrechnen zu 4 straight rails
	//library[i++] = new Item (i,"rail",100); redundant
	library[i++] = new Item (i,"train_stop",10);
	library[i++] = new Item (i,"rail_signal",50);
	library[i++] = new Item (i,"rail_chain_signal",50);
	library[i++] = new Item (i,"locomotive",5);
	library[i++] = new Item (i,"cargo_wagon",5);
	library[i++] = new Item (i,"fluid_wagon",5);
	library[i++] = new Item (i,"car",1);
	library[i++] = new Item (i,"tank",50);

	library[i++] = new Item (i,"construction_robot",50);
	library[i++] = new Item (i,"logistic_robot",50);
	library[i++] = new Item (i,"logistic_chest_active_provider",50);
	library[i++] = new Item (i,"logistic_chest_passive_provider",50);
	library[i++] = new Item (i,"logistic_chest_requester",50);
	library[i++] = new Item (i,"logistic_chest_storage",50);
	library[i++] = new Item (i,"roboport",5);

	library[i++] = new Item (i,"small_lamp",50);
	library[i++] = new Item (i,"red_wire",200);
	library[i++] = new Item (i,"green_wire",200);
	library[i++] = new Item (i,"arithmetic_combinator",50);
	library[i++] = new Item (i,"decider_combinator",50);
	library[i++] = new Item (i,"constant_combinator",50);
	library[i++] = new Item (i,"power_switch",50);
	library[i++] = new Item (i,"programmable_speaker", 50);

	library[i++] = new Item (i,"stone_brick",100);
	library[i++] = new Item (i,"concrete",100);
	library[i++] = new Item (i,"hazard_concrete",100);
	library[i++] = new Item (i,"landfill",100);
//tab: production
	library[i++] = new Item (i,"iron_axe",20);
	library[i++] = new Item (i,"steel_axe",20);
	library[i++] = new Item (i,"repair_pack",100);
	library[i++] = new Item (i,"blueprint",1);
	library[i++] = new Item (i,"deconstruction_planner",1);
	library[i++] = new Item (i,"blueprint-book",1);

	library[i++] = new Item (i,"boiler",50);
	library[i++] = new Item (i,"steam_engine",10);
	library[i++] = new Item (i,"steam_turbine",10);
	library[i++] = new Item (i,"solar_panel",50);
	library[i++] = new Item (i,"accumulator",50);
	library[i++] = new Item (i,"nuclear_reactor",50);
	library[i++] = new Item (i,"heat_exchanger",50);
	library[i++] = new Item (i,"heat_pipe",50);

	library[i++] = new Item (i,"burner_mining_drill",50);
	library[i++] = new Item (i,"electric_mining_drill",50);
	library[i++] = new Item (i,"offshore_pump",20);
	library[i++] = new Item (i,"pumpjack",20);

	library[i++] = new Item (i,"stone_furnace",50);
	library[i++] = new Item (i,"steel_furnace",50);
	library[i++] = new Item (i,"electric_furnace",50);

	library[i++] = new Item (i,"assembling_machine_1",50);
	library[i++] = new Item (i,"assembling_machine_2",50);
	library[i++] = new Item (i,"assembling_machine_3",50);
	library[i++] = new Item (i,"oil_refinery",10);
	library[i++] = new Item (i,"chemical_plant",10);
	library[i++] = new Item (i,"centrifuge",50);
	library[i++] = new Item (i,"lab",10);

	library[i++] = new Item (i,"beacon",10);
	library[i++] = new Item (i,"productivity_module",50);
	library[i++] = new Item (i,"productivity_module_2",50);
	library[i++] = new Item (i,"productivity_module_3",50);
	library[i++] = new Item (i,"effectivity_module",50);
	library[i++] = new Item (i,"effectivity_module_2",50);
	library[i++] = new Item (i,"effectivity_module_3",50);
	library[i++] = new Item (i,"speed_module",50);
	library[i++] = new Item (i,"speed_module_2",50);
	library[i++] = new Item (i,"speed_module_3",50);

//tab: intermediate products
	library[i++] = new Item (i,"raw-wood",100);
	library[i++] = new Item (i,"iron_ore",50);
	library[i++] = new Item (i,"copper_ore",50);
	library[i++] = new Item (i,"coal",50);
	library[i++] = new Item (i,"uranium_ore",50);
	library[i++] = new Item (i,"raw-fish",

	library[i++] = new Item (i,"wood",50);
	library[i++] = new Item (i,"iron_plate",100);
	library[i++] = new Item (i,"copper_plate",100);
	library[i++] = new Item (i,"steel_plate",100);
	library[i++] = new Item (i,"plastic-bar",100);
	library[i++] = new Item (i,"sulfur",50);

	library[i++] = new Item (i,"crude-oil-barrel",10);
	library[i++] = new Item (i,"heavy-oil-barrel",10);
	library[i++] = new Item (i,"light-oil-barrel",10);
	library[i++] = new Item (i,"lubricant-barrel",10);
	library[i++] = new Item (i,"petroleum-gas-barrel",10);
	library[i++] = new Item (i,"sulfuric-acid-barrel",10);
	library[i++] = new Item (i,"water-barrel",10);

	library[i++] = new Item (i,"copper_cable",200);
	library[i++] = new Item (i,"iron_stick",200);
	library[i++] = new Item (i,"iron_gear_wheel",100);
	library[i++] = new Item (i,"empty-barrel",10);
	library[i++] = new Item (i,"electronic_circuit",200);
	library[i++] = new Item (i,"advanced_circuit",200);
	library[i++] = new Item (i,"processing-unit",100);
	library[i++] = new Item (i,"engine-unit",50);
	library[i++] = new Item (i,"electric-engine-unit",50);
	library[i++] = new Item (i,"battery",200);

	library[i++] = new Item (i,"explosives",50);
	library[i++] = new Item (i,"flying-robot-frame",50);
	library[i++] = new Item (i,"low-density-structure",10);
	library[i++] = new Item (i,"rocket-fuel",10);
	library[i++] = new Item (i,"rocket-control-unit",10);
	library[i++] = new Item (i,"satellite",1);
	library[i++] = new Item (i,"uranium-235",100);
	library[i++] = new Item (i,"uranium-238",100);
	library[i++] = new Item (i,"uranium-fuel-cell",50);
	library[i++] = new Item (i,"used-up-uranium-fuel-cell",50);

	library[i++] = new Item (i,"science-pack-1",200);
	library[i++] = new Item (i,"science-pack-2",200);
	library[i++] = new Item (i,"science-pack-3",200);
	library[i++] = new Item (i,"military-science-pack",200);
	library[i++] = new Item (i,"production-science-pack",200);
	library[i++] = new Item (i,"high-tech-science-pack",200);
	library[i++] = new Item (i,"space-science-pack",2000);

//tab: combat
	library[i++] = new Item (i,"pistol",5);
	library[i++] = new Item (i,"submachine_gun",5);
	library[i++] = new Item (i,"shotgun",5);
	library[i++] = new Item (i,"combat_shotgun",5);
	library[i++] = new Item (i,"rocket_launcher",5);
	library[i++] = new Item (i,"flamethrower",5);
	library[i++] = new Item (i,"land_mine",100);

	library[i++] = new Item (i,"firearm_magazine",200);
	library[i++] = new Item (i,"piercing_rounds_magazine",200);
	library[i++] = new Item (i,"uranium-rounds-magazine",200);
	library[i++] = new Item (i,"shotgun_shell",200);
	library[i++] = new Item (i,"piercing_shotgun_shell",200);
	library[i++] = new Item (i,"cannon_shell",200);
	library[i++] = new Item (i,"explosive_cannon_shell",200);
	library[i++] = new Item (i,"uranium-cannon-shell",200);
	library[i++] = new Item (i,"explosive-uranium-cannon-shell",200);

	library[i++] = new Item (i,"rocket",200);
	library[i++] = new Item (i,"explosive_rocket",200);
	library[i++] = new Item (i,"atomic-bomb",10);
	library[i++] = new Item (i,"flamethrower_ammo",100);

	library[i++] = new Item (i,"grenade",100);
	library[i++] = new Item (i,"cluster-grenade",100);
	library[i++] = new Item (i,"poison_capsule",100);
	library[i++] = new Item (i,"slowdown_capsule",100);
	library[i++] = new Item (i,"defender_capsule",100);
	library[i++] = new Item (i,"distractor_capsule",100);
	library[i++] = new Item (i,"destroyer_capsule",100);
	library[i++] = new Item (i,"discharge-defense-remote",1	

	library[i++] = new Item (i,"light_armor",10);
	library[i++] = new Item (i,"heavy_armor",10);
	library[i++] = new Item (i,"modular_armor",1);
	library[i++] = new Item (i,"power_armor",1);
	library[i++] = new Item (i,"power-armor-mk2",1);

	library[i++] = new Item (i,"solar_panel_equipment",20);
	library[i++] = new Item (i,"fusion_reactor_equipment",10);
	library[i++] = new Item (i,"energy_shield_equipment",20);
	library[i++] = new Item (i,"energy_shield_mk2_equipment",20);
	library[i++] = new Item (i,"battery-equipment",50);
	library[i++] = new Item (i,"battery-mk2-equipment",50);
	library[i++] = new Item (i,"personal-laser-defense-equipment",20);
	library[i++] = new Item (i,"discharge-defense-equipment",20);
	library[i++] = new Item (i,"exoskeleton-equipment",10);
	library[i++] = new Item (i,"personal-roboport-equipment",5);
	library[i++] = new Item (i,"personal-roboport-mk2-equipment",5);
	library[i++] = new Item (i,"night-vision-equipment",20);

	library[i++] = new Item (i,"stone_wall",100);
	library[i++] = new Item (i,"gate",50);
	library[i++] = new Item (i,"gun_turret",50);
	library[i++] = new Item (i,"laser_turret",50);
	library[i++] = new Item (i,"flamethrower-turret",50);
	library[i++] = new Item (i,"radar",50);
	library[i++] = new Item (i,"rocket_silo",1);

//fluids
	library[i++] = new Item (i,"water",0);
	library[i++] = new Item (i,"crude_oil",0);
	library[i++] = new Item (i,"steam",0);
	library[i++] = new Item (i,"heavy_oil",0);
	library[i++] = new Item (i,"light_oil",0);
	library[i++] = new Item (i,"petroleum_gas",0);
	library[i++] = new Item (i,"sulfuric_acid",0);
	library[i++] = new Item (i,"lubricant",0);

//not sure what to do with those
	library[i++] = new Item (i,"advanced_oil_processing",0);
	library[i++] = new Item (i,"hazard_concrete_left",200);
	library[i++] = new Item (i,"hazard_concrete_right",200);

//signals
	library[i++] = new Item (i,"signal_anything",0);
	library[i++] = new Item (i,"signal_each",0);
	library[i++] = new Item (i,"signal_everything",0);
	library[i++] = new Item (i,"signal_0",0);
	library[i++] = new Item (i,"signal_1",0);
	library[i++] = new Item (i,"signal_2",0);
	library[i++] = new Item (i,"signal_3",0);
	library[i++] = new Item (i,"signal_4",0);
	library[i++] = new Item (i,"signal_5",0);
	library[i++] = new Item (i,"signal_6",0);
	library[i++] = new Item (i,"signal_7",0);
	library[i++] = new Item (i,"signal_8",0);
	library[i++] = new Item (i,"signal_9",0);
	library[i++] = new Item (i,"signal_A",0);
	library[i++] = new Item (i,"signal_B",0);
	library[i++] = new Item (i,"signal_C",0);
	library[i++] = new Item (i,"signal_D",0);
	library[i++] = new Item (i,"signal_E",0);
	library[i++] = new Item (i,"signal_F",0);
	library[i++] = new Item (i,"signal_G",0);
	library[i++] = new Item (i,"signal_H",0);
	library[i++] = new Item (i,"signal_I",0);
	library[i++] = new Item (i,"signal_J",0);
	library[i++] = new Item (i,"signal_K",0);
	library[i++] = new Item (i,"signal_L",0);
	library[i++] = new Item (i,"signal_M",0);
	library[i++] = new Item (i,"signal_N",0);
	library[i++] = new Item (i,"signal_O",0);
	library[i++] = new Item (i,"signal_P",0);
	library[i++] = new Item (i,"signal_Q",0);
	library[i++] = new Item (i,"signal_R",0);
	library[i++] = new Item (i,"signal_S",0);
	library[i++] = new Item (i,"signal_T",0);
	library[i++] = new Item (i,"signal_U",0);
	library[i++] = new Item (i,"signal_V",0);
	library[i++] = new Item (i,"signal_W",0);
	library[i++] = new Item (i,"signal_X",0);
	library[i++] = new Item (i,"signal_Y",0);
	library[i++] = new Item (i,"signal_Z",0);
	library[i++] = new Item (i,"signal_red",0);
	library[i++] = new Item (i,"signal_green",0);
	library[i++] = new Item (i,"signal_blue",0);
	library[i++] = new Item (i,"signal_yellow",0);
	library[i++] = new Item (i,"signal_pink",0);
	library[i++] = new Item (i,"signal_cyan",0);
	library[i++] = new Item (i,"signal_white",0);
	library[i++] = new Item (i,"signal_grey",0);
	library[i++] = new Item (i,"signal_black",0);
	}//end constructr
}//end Library
*/
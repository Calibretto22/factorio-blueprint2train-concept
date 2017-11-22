//legt mögliche werte von itemname fest 
//übergeben werden enums NICHT wie ein string: setType("wooden_chest");
//sondern als objekt ihres jeweiligen types:   setType(type.item);

//kann ich eine ganze Enum_Klasse erzeugen, wo verschiedene enums drin sind? 
//	nicht praktikabel 

//zB auch die Anzahl der der möglichen Filter und signale für 

	public enum itemname {
		wooden_chest,
		iron_chest,
		steel_chest,
		storage_tank,
		transport_belt,
		fast_transport_belt,
		express_transport_belt,
		underground_belt,
		fast_underground_belt,
		express_underground_belt,
		splitter,
		fast_splitter,
		express_splitter,
		burner_inserter,
		inserter,
		long_handed_inserter,
		fast_inserter,
		filter_inserter,
		stack_inserter,
		stack_filter_inserter,
		small_electric_pole,
		medium_electric_pole,
		big_electric_pole,
		substation,
		pipe,
		pipe_to_ground,
		pump,
		straight_rail,
		curved_rail,
		rail,
		train_stop,
		rail_signal,
		rail_chain_signal,
		locomotive,
		cargo_wagon,
		fluid_wagon,
		car,
		tank,
		construction_robot,
		logistic_robot,
		logistic_chest_active_provider,
		logistic_chest_passive_provider,
		logistic_chest_requester,
		logistic_chest_storage,
		roboport,
		small_lamp,
		red_wire,
		green_wire,
		arithmetic_combinator,
		decider_combinator,
		constant_combinator,
		power_switch,
		programmable_speaker,
		stone_brick,
		concrete,
		hazard_concrete,
		landfill,
		iron_axe,
		steel_axe,
		repair_pack,
		blueprint,
		deconstruction_planner,
		blueprint_book,
		boiler,
		steam_engine,
		steam_turbine,
		solar_panel,
		accumulator,
		nuclear_reactor,
		heat_exchanger,
		heat_pipe,
		burner_mining_drill,
		electric_mining_drill,
		offshore_pump,
		pumpjack,
		stone_furnace,
		steel_furnace,
		electric_furnace,
		assembling_machine_1,
		assembling_machine_2,
		assembling_machine_3,
		oil_refinery,
		chemical_plant,
		centrifuge,
		lab,
		beacon,
		productivity_module,
		productivity_module_2,
		productivity_module_3,
		effectivity_module,
		effectivity_module_2,
		effectivity_module_3,
		speed_module,
		speed_module_2,
		speed_module_3,
		raw_wood,
		iron_ore,
		copper_ore,
		coal,
		uranium_ore,
		raw_fish,
		wood,
		iron_plate,
		copper_plate,
		steel_plate,
		plastic_bar,
		sulfur,
		crude_oil_barrel,
		heavy_oil_barrel,
		light_oil_barrel,
		lubricant_barrel,
		petroleum_gas_barrel,
		sulfuric_acid_barrel,
		water_barrel,
		copper_cable,
		iron_stick,
		iron_gear_wheel,
		empty_barrel,
		electronic_circuit,
		advanced_circuit,
		processing_unit,
		engine_unit,
		electric_engine_unit,
		battery,
		explosives,
		flying_robot_frame,
		low_density_structure,
		rocket_fuel,
		rocket_control_unit,
		satellite,
		uranium_235,
		uranium_238,
		uranium_fuel_cell,
		used_up_uranium_fuel_cell,
		science_pack_1,
		science_pack_2,
		science_pack_3,
		military_science_pack,
		production_science_pack,
		high_tech_science_pack,
		space_science_pack,
		pistol,
		submachine_gun,
		shotgun,
		combat_shotgun,
		rocket_launcher,
		flamethrower,
		land_mine,
		firearm_magazine,
		piercing_rounds_magazine,
		uranium_rounds_magazine,
		shotgun_shell,
		piercing_shotgun_shell,
		cannon_shell,
		explosive_cannon_shell,
		uranium_cannon_shell,
		explosive_uranium_cannon_shell,
		rocket,
		explosive_rocket,
		atomic_bomb,
		flamethrower_ammo,
		grenade,
		cluster_grenade,
		poison_capsule,
		slowdown_capsule,
		defender_capsule,
		distractor_capsule,
		destroyer_capsule,
		discharge_defense_remote,
		light_armor,
		heavy_armor,
		modular_armor,
		power_armor,
		power_armor_mk2,
		solar_panel_equipment,
		fusion_reactor_equipment,
		energy_shield_equipment,
		energy_shield_mk2_equipment,
		battery_equipment,
		battery_mk2_equipment,
		personal_laser_defense_equipment,
		discharge_defense_equipment,
		exoskeleton_equipment,
		personal_roboport_equipment,
		personal_roboport_mk2_equipment,
		night_vision_equipment,
		stone_wall,
		gate,
		gun_turret,
		laser_turret,
		flamethrower_turret,
		radar,
		rocket_silo,
		water,
		crude_oil,
		steam,
		heavy_oil,
		light_oil,
		petroleum_gas,
		sulfuric_acid,
		lubricant,
		advanced_oil_processing,
		hazard_concrete_left,
		hazard_concrete_right,
		signal_anything,
		signal_each,
		signal_everything,
		signal_0,
		signal_1,
		signal_2,
		signal_3,
		signal_4,
		signal_5,
		signal_6,
		signal_7,
		signal_8,
		signal_9,
		signal_A,
		signal_B,
		signal_C,
		signal_D,
		signal_E,
		signal_F,
		signal_G,
		signal_H,
		signal_I,
		signal_J,
		signal_K,
		signal_L,
		signal_M,
		signal_N,
		signal_O,
		signal_P,
		signal_Q,
		signal_R,
		signal_S,
		signal_T,
		signal_U,
		signal_V,
		signal_W,
		signal_X,
		signal_Y,
		signal_Z,
		signal_red,
		signal_green,
		signal_blue,
		signal_yellow,
		signal_pink,
		signal_cyan,
		signal_white,
		signal_grey,
		signal_black;
	public String toString() {
		switch (this) {
		case wooden_chest: return "wooden_chest";
		case iron_chest: return "iron_chest";
		case steel_chest: return "steel_chest";
		case storage_tank: return "storage_tank";
		case transport_belt: return "transport_belt";
		case fast_transport_belt: return "fast_transport_belt";
		case express_transport_belt: return "express_transport_belt";
		case underground_belt: return "underground_belt";
		case fast_underground_belt: return "fast_underground_belt";
		case express_underground_belt: return "express_underground_belt";
		case splitter: return "splitter";
		case fast_splitter: return "fast_splitter";
		case express_splitter: return "express_splitter";
		case burner_inserter: return "burner_inserter";
		case inserter: return "inserter";
		case long_handed_inserter: return "long_handed_inserter";
		case fast_inserter: return "fast_inserter";
		case filter_inserter: return "filter_inserter";
		case stack_inserter: return "stack_inserter";
		case stack_filter_inserter: return "stack_filter_inserter";
		case small_electric_pole: return "small_electric_pole";
		case medium_electric_pole: return "medium_electric_pole";
		case big_electric_pole: return "big_electric_pole";
		case substation: return "substation";
		case pipe: return "pipe";
		case pipe_to_ground: return "pipe_to_ground";
		case pump: return "pump";
		case straight_rail: return "straight_rail";
		case curved_rail: return "curved_rail";
		case rail: return "rail";
		case train_stop: return "train_stop";
		case rail_signal: return "rail_signal";
		case rail_chain_signal: return "rail_chain_signal";
		case locomotive: return "locomotive";
		case cargo_wagon: return "cargo_wagon";
		case fluid_wagon: return "fluid_wagon";
		case car: return "car";
		case tank: return "tank";
		case construction_robot: return "construction_robot";
		case logistic_robot: return "logistic_robot";
		case logistic_chest_active_provider: return "logistic_chest_active_provider";
		case logistic_chest_passive_provider: return "logistic_chest_passive_provider";
		case logistic_chest_requester: return "logistic_chest_requester";
		case logistic_chest_storage: return "logistic_chest_storage";
		case roboport: return "roboport";
		case small_lamp: return "small_lamp";
		case red_wire: return "red_wire";
		case green_wire: return "green_wire";
		case arithmetic_combinator: return "arithmetic_combinator";
		case decider_combinator: return "decider_combinator";
		case constant_combinator: return "constant_combinator";
		case power_switch: return "power_switch";
		case programmable_speaker: return "programmable_speaker";
		case stone_brick: return "stone_brick";
		case concrete: return "concrete";
		case hazard_concrete: return "hazard_concrete";
		case landfill: return "landfill";
		case iron_axe: return "iron_axe";
		case steel_axe: return "steel_axe";
		case repair_pack: return "repair_pack";
		case blueprint: return "blueprint";
		case deconstruction_planner: return "deconstruction_planner";
		case blueprint_book: return "blueprint-book";
		case boiler: return "boiler";
		case steam_engine: return "steam_engine";
		case steam_turbine: return "steam_turbine";
		case solar_panel: return "solar_panel";
		case accumulator: return "accumulator";
		case nuclear_reactor: return "nuclear_reactor";
		case heat_exchanger: return "heat_exchanger";
		case heat_pipe: return "heat_pipe";
		case burner_mining_drill: return "burner_mining_drill";
		case electric_mining_drill: return "electric_mining_drill";
		case offshore_pump: return "offshore_pump";
		case pumpjack: return "pumpjack";
		case stone_furnace: return "stone_furnace";
		case steel_furnace: return "steel_furnace";
		case electric_furnace: return "electric_furnace";
		case assembling_machine_1: return "assembling_machine_1";
		case assembling_machine_2: return "assembling_machine_2";
		case assembling_machine_3: return "assembling_machine_3";
		case oil_refinery: return "oil_refinery";
		case chemical_plant: return "chemical_plant";
		case centrifuge: return "centrifuge";
		case lab: return "lab";
		case beacon: return "beacon";
		case productivity_module: return "productivity_module";
		case productivity_module_2: return "productivity_module_2";
		case productivity_module_3: return "productivity_module_3";
		case effectivity_module: return "effectivity_module";
		case effectivity_module_2: return "effectivity_module_2";
		case effectivity_module_3: return "effectivity_module_3";
		case speed_module: return "speed_module";
		case speed_module_2: return "speed_module_2";
		case speed_module_3: return "speed_module_3";
		case raw_wood: return "raw-wood";
		case iron_ore: return "iron_ore";
		case copper_ore: return "copper_ore";
		case coal: return "coal";
		case uranium_ore: return "uranium_ore";
		case raw_fish: return "raw-fish";
		case wood: return "wood";
		case iron_plate: return "iron_plate";
		case copper_plate: return "copper_plate";
		case steel_plate: return "steel_plate";
		case plastic_bar: return "plastic-bar";
		case sulfur: return "sulfur";
		case crude_oil_barrel: return "crude-oil-barrel";
		case heavy_oil_barrel: return "heavy-oil-barrel";
		case light_oil_barrel: return "light-oil-barrel";
		case lubricant_barrel: return "lubricant-barrel";
		case petroleum_gas_barrel: return "petroleum-gas-barrel";
		case sulfuric_acid_barrel: return "sulfuric-acid-barrel";
		case water_barrel: return "water-barrel";
		case copper_cable: return "copper_cable";
		case iron_stick: return "iron_stick";
		case iron_gear_wheel: return "iron_gear_wheel";
		case empty_barrel: return "empty-barrel";
		case electronic_circuit: return "electronic_circuit";
		case advanced_circuit: return "advanced_circuit";
		case processing_unit: return "processing-unit";
		case engine_unit: return "engine-unit";
		case electric_engine_unit: return "electric-engine-unit";
		case battery: return "battery";
		case explosives: return "explosives";
		case flying_robot_frame: return "flying-robot-frame";
		case low_density_structure: return "low-density-structure";
		case rocket_fuel: return "rocket-fuel";
		case rocket_control_unit: return "rocket-control-unit";
		case satellite: return "satellite";
		case uranium_235: return "uranium-235";
		case uranium_238: return "uranium-238";
		case uranium_fuel_cell: return "uranium-fuel-cell";
		case used_up_uranium_fuel_cell: return "used-up-uranium-fuel-cell";
		case science_pack_1: return "science-pack-1";
		case science_pack_2: return "science-pack-2";
		case science_pack_3: return "science-pack-3";
		case military_science_pack: return "military-science-pack";
		case production_science_pack: return "production-science-pack";
		case high_tech_science_pack: return "high-tech-science-pack";
		case space_science_pack: return "space-science-pack";
		case pistol: return "pistol";
		case submachine_gun: return "submachine_gun";
		case shotgun: return "shotgun";
		case combat_shotgun: return "combat_shotgun";
		case rocket_launcher: return "rocket_launcher";
		case flamethrower: return "flamethrower";
		case land_mine: return "land_mine";
		case firearm_magazine: return "firearm_magazine";
		case piercing_rounds_magazine: return "piercing_rounds_magazine";
		case uranium_rounds_magazine: return "uranium-rounds-magazine";
		case shotgun_shell: return "shotgun_shell";
		case piercing_shotgun_shell: return "piercing_shotgun_shell";
		case cannon_shell: return "cannon_shell";
		case explosive_cannon_shell: return "explosive_cannon_shell";
		case uranium_cannon_shell: return "uranium-cannon-shell";
		case explosive_uranium_cannon_shell: return "explosive-uranium-cannon-shell";
		case rocket: return "rocket";
		case explosive_rocket: return "explosive_rocket";
		case atomic_bomb: return "atomic-bomb";
		case flamethrower_ammo: return "flamethrower_ammo";
		case grenade: return "grenade";
		case cluster_grenade: return "cluster-grenade";
		case poison_capsule: return "poison_capsule";
		case slowdown_capsule: return "slowdown_capsule";
		case defender_capsule: return "defender_capsule";
		case distractor_capsule: return "distractor_capsule";
		case destroyer_capsule: return "destroyer_capsule";
		case discharge_defense_remote: return "discharge-defense-remote";
		case light_armor: return "light_armor";
		case heavy_armor: return "heavy_armor";
		case modular_armor: return "modular_armor";
		case power_armor: return "power_armor";
		case power_armor_mk2: return "power-armor-mk2";
		case solar_panel_equipment: return "solar_panel_equipment";
		case fusion_reactor_equipment: return "fusion_reactor_equipment";
		case energy_shield_equipment: return "energy_shield_equipment";
		case energy_shield_mk2_equipment: return "energy_shield_mk2_equipment";
		case battery_equipment: return "battery-equipment";
		case battery_mk2_equipment: return "battery-mk2-equipment";
		case personal_laser_defense_equipment: return "personal-laser-defense-equipment";
		case discharge_defense_equipment: return "discharge-defense-equipment";
		case exoskeleton_equipment: return "exoskeleton-equipment";
		case personal_roboport_equipment: return "personal-roboport-equipment";
		case personal_roboport_mk2_equipment: return "personal-roboport-mk2-equipment";
		case night_vision_equipment: return "night-vision-equipment";
		case stone_wall: return "stone_wall";
		case gate: return "gate";
		case gun_turret: return "gun_turret";
		case laser_turret: return "laser_turret";
		case flamethrower_turret: return "flamethrower-turret";
		case radar: return "radar";
		case rocket_silo: return "rocket_silo";
		case water: return "water";
		case crude_oil: return "crude_oil";
		case steam: return "steam";
		case heavy_oil: return "heavy_oil";
		case light_oil: return "light_oil";
		case petroleum_gas: return "petroleum_gas";
		case sulfuric_acid: return "sulfuric_acid";
		case lubricant: return "lubricant";
		case advanced_oil_processing: return "advanced_oil_processing";
		case hazard_concrete_left: return "hazard_concrete_left";
		case hazard_concrete_right: return "hazard_concrete_right";
		case signal_anything: return "signal_anything";
		case signal_each: return "signal_each";
		case signal_everything: return "signal_everything";
		case signal_0: return "signal_0";
		case signal_1: return "signal_1";
		case signal_2: return "signal_2";
		case signal_3: return "signal_3";
		case signal_4: return "signal_4";
		case signal_5: return "signal_5";
		case signal_6: return "signal_6";
		case signal_7: return "signal_7";
		case signal_8: return "signal_8";
		case signal_9: return "signal_9";
		case signal_A: return "signal_A";
		case signal_B: return "signal_B";
		case signal_C: return "signal_C";
		case signal_D: return "signal_D";
		case signal_E: return "signal_E";
		case signal_F: return "signal_F";
		case signal_G: return "signal_G";
		case signal_H: return "signal_H";
		case signal_I: return "signal_I";
		case signal_J: return "signal_J";
		case signal_K: return "signal_K";
		case signal_L: return "signal_L";
		case signal_M: return "signal_M";
		case signal_N: return "signal_N";
		case signal_O: return "signal_O";
		case signal_P: return "signal_P";
		case signal_Q: return "signal_Q";
		case signal_R: return "signal_R";
		case signal_S: return "signal_S";
		case signal_T: return "signal_T";
		case signal_U: return "signal_U";
		case signal_V: return "signal_V";
		case signal_W: return "signal_W";
		case signal_X: return "signal_X";
		case signal_Y: return "signal_Y";
		case signal_Z: return "signal_Z";
		case signal_red: return "signal_red";
		case signal_green: return "signal_green";
		case signal_blue: return "signal_blue";
		case signal_yellow: return "signal_yellow";
		case signal_pink: return "signal_pink";
		case signal_cyan: return "signal_cyan";
		case signal_white: return "signal_white";
		case signal_grey: return "signal_grey";
		case signal_black: return "signal_black";

		default: return "holeriedudoedeldei"; //if you see this, you did something wrong
		}}}

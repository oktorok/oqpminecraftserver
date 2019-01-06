package net.minecraft.server;

public class SoundEffect {

    private final MinecraftKey a;

    public SoundEffect(MinecraftKey minecraftkey) {
        this.a = minecraftkey;
    }

    public static void b() {
        a("ambient.cave");
        a("ambient.underwater.enter");
        a("ambient.underwater.exit");
        a("ambient.underwater.loop");
        a("ambient.underwater.loop.additions");
        a("ambient.underwater.loop.additions.rare");
        a("ambient.underwater.loop.additions.ultra_rare");
        a("block.anvil.break");
        a("block.anvil.destroy");
        a("block.anvil.fall");
        a("block.anvil.hit");
        a("block.anvil.land");
        a("block.anvil.place");
        a("block.anvil.step");
        a("block.anvil.use");
        a("block.beacon.activate");
        a("block.beacon.ambient");
        a("block.beacon.deactivate");
        a("block.beacon.power_select");
        a("block.brewing_stand.brew");
        a("block.bubble_column.bubble_pop");
        a("block.bubble_column.upwards_ambient");
        a("block.bubble_column.upwards_inside");
        a("block.bubble_column.whirlpool_ambient");
        a("block.bubble_column.whirlpool_inside");
        a("block.chest.close");
        a("block.chest.locked");
        a("block.chest.open");
        a("block.chorus_flower.death");
        a("block.chorus_flower.grow");
        a("block.wool.break");
        a("block.wool.fall");
        a("block.wool.hit");
        a("block.wool.place");
        a("block.wool.step");
        a("block.comparator.click");
        a("block.conduit.activate");
        a("block.conduit.ambient");
        a("block.conduit.ambient.short");
        a("block.conduit.attack.target");
        a("block.conduit.deactivate");
        a("block.dispenser.dispense");
        a("block.dispenser.fail");
        a("block.dispenser.launch");
        a("block.enchantment_table.use");
        a("block.end_gateway.spawn");
        a("block.end_portal.spawn");
        a("block.end_portal_frame.fill");
        a("block.ender_chest.close");
        a("block.ender_chest.open");
        a("block.fence_gate.close");
        a("block.fence_gate.open");
        a("block.fire.ambient");
        a("block.fire.extinguish");
        a("block.furnace.fire_crackle");
        a("block.glass.break");
        a("block.glass.fall");
        a("block.glass.hit");
        a("block.glass.place");
        a("block.glass.step");
        a("block.grass.break");
        a("block.grass.fall");
        a("block.grass.hit");
        a("block.grass.place");
        a("block.grass.step");
        a("block.wet_grass.break");
        a("block.wet_grass.fall");
        a("block.wet_grass.hit");
        a("block.wet_grass.place");
        a("block.wet_grass.step");
        a("block.coral_block.break");
        a("block.coral_block.fall");
        a("block.coral_block.hit");
        a("block.coral_block.place");
        a("block.coral_block.step");
        a("block.gravel.break");
        a("block.gravel.fall");
        a("block.gravel.hit");
        a("block.gravel.place");
        a("block.gravel.step");
        a("block.iron_door.close");
        a("block.iron_door.open");
        a("block.iron_trapdoor.close");
        a("block.iron_trapdoor.open");
        a("block.ladder.break");
        a("block.ladder.fall");
        a("block.ladder.hit");
        a("block.ladder.place");
        a("block.ladder.step");
        a("block.lava.ambient");
        a("block.lava.extinguish");
        a("block.lava.pop");
        a("block.lever.click");
        a("block.metal.break");
        a("block.metal.fall");
        a("block.metal.hit");
        a("block.metal.place");
        a("block.metal.step");
        a("block.metal_pressure_plate.click_off");
        a("block.metal_pressure_plate.click_on");
        a("block.note_block.basedrum");
        a("block.note_block.bass");
        a("block.note_block.bell");
        a("block.note_block.chime");
        a("block.note_block.flute");
        a("block.note_block.guitar");
        a("block.note_block.harp");
        a("block.note_block.hat");
        a("block.note_block.pling");
        a("block.note_block.snare");
        a("block.note_block.xylophone");
        a("block.piston.contract");
        a("block.piston.extend");
        a("block.portal.ambient");
        a("block.portal.travel");
        a("block.portal.trigger");
        a("block.pumpkin.carve");
        a("block.redstone_torch.burnout");
        a("block.sand.break");
        a("block.sand.fall");
        a("block.sand.hit");
        a("block.sand.place");
        a("block.sand.step");
        a("block.shulker_box.close");
        a("block.shulker_box.open");
        a("block.slime_block.break");
        a("block.slime_block.fall");
        a("block.slime_block.hit");
        a("block.slime_block.place");
        a("block.slime_block.step");
        a("block.snow.break");
        a("block.snow.fall");
        a("block.snow.hit");
        a("block.snow.place");
        a("block.snow.step");
        a("block.stone.break");
        a("block.stone.fall");
        a("block.stone.hit");
        a("block.stone.place");
        a("block.stone.step");
        a("block.stone_button.click_off");
        a("block.stone_button.click_on");
        a("block.stone_pressure_plate.click_off");
        a("block.stone_pressure_plate.click_on");
        a("block.tripwire.attach");
        a("block.tripwire.click_off");
        a("block.tripwire.click_on");
        a("block.tripwire.detach");
        a("block.water.ambient");
        a("block.lily_pad.place");
        a("block.wood.break");
        a("block.wood.fall");
        a("block.wood.hit");
        a("block.wood.place");
        a("block.wood.step");
        a("block.wooden_button.click_off");
        a("block.wooden_button.click_on");
        a("block.wooden_pressure_plate.click_off");
        a("block.wooden_pressure_plate.click_on");
        a("block.wooden_door.close");
        a("block.wooden_door.open");
        a("block.wooden_trapdoor.close");
        a("block.wooden_trapdoor.open");
        a("enchant.thorns.hit");
        a("entity.armor_stand.break");
        a("entity.armor_stand.fall");
        a("entity.armor_stand.hit");
        a("entity.armor_stand.place");
        a("entity.arrow.hit");
        a("entity.arrow.hit_player");
        a("entity.arrow.shoot");
        a("entity.bat.ambient");
        a("entity.bat.death");
        a("entity.bat.hurt");
        a("entity.bat.loop");
        a("entity.bat.takeoff");
        a("entity.blaze.ambient");
        a("entity.blaze.burn");
        a("entity.blaze.death");
        a("entity.blaze.hurt");
        a("entity.blaze.shoot");
        a("entity.boat.paddle_land");
        a("entity.boat.paddle_water");
        a("entity.fishing_bobber.retrieve");
        a("entity.fishing_bobber.splash");
        a("entity.fishing_bobber.throw");
        a("entity.cat.ambient");
        a("entity.cat.death");
        a("entity.cat.hiss");
        a("entity.cat.hurt");
        a("entity.cat.purr");
        a("entity.cat.purreow");
        a("entity.chicken.ambient");
        a("entity.chicken.death");
        a("entity.chicken.egg");
        a("entity.chicken.hurt");
        a("entity.chicken.step");
        a("entity.cod.ambient");
        a("entity.cod.death");
        a("entity.cod.flop");
        a("entity.cod.hurt");
        a("entity.cow.ambient");
        a("entity.cow.death");
        a("entity.cow.hurt");
        a("entity.cow.milk");
        a("entity.cow.step");
        a("entity.creeper.death");
        a("entity.creeper.hurt");
        a("entity.creeper.primed");
        a("entity.dolphin.ambient");
        a("entity.dolphin.ambient_water");
        a("entity.dolphin.attack");
        a("entity.dolphin.death");
        a("entity.dolphin.eat");
        a("entity.dolphin.hurt");
        a("entity.dolphin.jump");
        a("entity.dolphin.play");
        a("entity.dolphin.splash");
        a("entity.dolphin.swim");
        a("entity.donkey.ambient");
        a("entity.donkey.angry");
        a("entity.donkey.chest");
        a("entity.donkey.death");
        a("entity.donkey.hurt");
        a("entity.drowned.ambient");
        a("entity.drowned.ambient_water");
        a("entity.drowned.death");
        a("entity.drowned.death_water");
        a("entity.drowned.hurt");
        a("entity.drowned.hurt_water");
        a("entity.drowned.shoot");
        a("entity.drowned.step");
        a("entity.drowned.swim");
        a("entity.egg.throw");
        a("entity.elder_guardian.ambient");
        a("entity.elder_guardian.ambient_land");
        a("entity.elder_guardian.curse");
        a("entity.elder_guardian.death");
        a("entity.elder_guardian.death_land");
        a("entity.elder_guardian.flop");
        a("entity.elder_guardian.hurt");
        a("entity.elder_guardian.hurt_land");
        a("entity.ender_dragon.ambient");
        a("entity.ender_dragon.death");
        a("entity.ender_dragon.flap");
        a("entity.ender_dragon.growl");
        a("entity.ender_dragon.hurt");
        a("entity.ender_dragon.shoot");
        a("entity.dragon_fireball.explode");
        a("entity.ender_eye.death");
        a("entity.ender_eye.launch");
        a("entity.enderman.ambient");
        a("entity.enderman.death");
        a("entity.enderman.hurt");
        a("entity.enderman.scream");
        a("entity.enderman.stare");
        a("entity.enderman.teleport");
        a("entity.endermite.ambient");
        a("entity.endermite.death");
        a("entity.endermite.hurt");
        a("entity.endermite.step");
        a("entity.ender_pearl.throw");
        a("entity.evoker.ambient");
        a("entity.evoker.cast_spell");
        a("entity.evoker.death");
        a("entity.evoker.hurt");
        a("entity.evoker.prepare_attack");
        a("entity.evoker.prepare_summon");
        a("entity.evoker.prepare_wololo");
        a("entity.evoker_fangs.attack");
        a("entity.experience_bottle.throw");
        a("entity.experience_orb.pickup");
        a("entity.firework_rocket.blast");
        a("entity.firework_rocket.blast_far");
        a("entity.firework_rocket.large_blast");
        a("entity.firework_rocket.large_blast_far");
        a("entity.firework_rocket.launch");
        a("entity.firework_rocket.shoot");
        a("entity.firework_rocket.twinkle");
        a("entity.firework_rocket.twinkle_far");
        a("entity.fish.swim");
        a("entity.generic.big_fall");
        a("entity.generic.burn");
        a("entity.generic.death");
        a("entity.generic.drink");
        a("entity.generic.eat");
        a("entity.generic.explode");
        a("entity.generic.extinguish_fire");
        a("entity.generic.hurt");
        a("entity.generic.small_fall");
        a("entity.generic.splash");
        a("entity.generic.swim");
        a("entity.ghast.ambient");
        a("entity.ghast.death");
        a("entity.ghast.hurt");
        a("entity.ghast.scream");
        a("entity.ghast.shoot");
        a("entity.ghast.warn");
        a("entity.guardian.ambient");
        a("entity.guardian.ambient_land");
        a("entity.guardian.attack");
        a("entity.guardian.death");
        a("entity.guardian.death_land");
        a("entity.guardian.flop");
        a("entity.guardian.hurt");
        a("entity.guardian.hurt_land");
        a("entity.horse.ambient");
        a("entity.horse.angry");
        a("entity.horse.armor");
        a("entity.horse.breathe");
        a("entity.horse.death");
        a("entity.horse.eat");
        a("entity.horse.gallop");
        a("entity.horse.hurt");
        a("entity.horse.jump");
        a("entity.horse.land");
        a("entity.horse.saddle");
        a("entity.horse.step");
        a("entity.horse.step_wood");
        a("entity.hostile.big_fall");
        a("entity.hostile.death");
        a("entity.hostile.hurt");
        a("entity.hostile.small_fall");
        a("entity.hostile.splash");
        a("entity.hostile.swim");
        a("entity.husk.ambient");
        a("entity.husk.converted_to_zombie");
        a("entity.husk.death");
        a("entity.husk.hurt");
        a("entity.husk.step");
        a("entity.illusioner.ambient");
        a("entity.illusioner.cast_spell");
        a("entity.illusioner.death");
        a("entity.illusioner.hurt");
        a("entity.illusioner.mirror_move");
        a("entity.illusioner.prepare_blindness");
        a("entity.illusioner.prepare_mirror");
        a("entity.iron_golem.attack");
        a("entity.iron_golem.death");
        a("entity.iron_golem.hurt");
        a("entity.iron_golem.step");
        a("entity.item.break");
        a("entity.item.pickup");
        a("entity.item_frame.add_item");
        a("entity.item_frame.break");
        a("entity.item_frame.place");
        a("entity.item_frame.remove_item");
        a("entity.item_frame.rotate_item");
        a("entity.leash_knot.break");
        a("entity.leash_knot.place");
        a("entity.lightning_bolt.impact");
        a("entity.lightning_bolt.thunder");
        a("entity.lingering_potion.throw");
        a("entity.llama.ambient");
        a("entity.llama.angry");
        a("entity.llama.chest");
        a("entity.llama.death");
        a("entity.llama.eat");
        a("entity.llama.hurt");
        a("entity.llama.spit");
        a("entity.llama.step");
        a("entity.llama.swag");
        a("entity.magma_cube.death");
        a("entity.magma_cube.hurt");
        a("entity.magma_cube.jump");
        a("entity.magma_cube.squish");
        a("entity.minecart.inside");
        a("entity.minecart.riding");
        a("entity.mooshroom.shear");
        a("entity.mule.ambient");
        a("entity.mule.chest");
        a("entity.mule.death");
        a("entity.mule.hurt");
        a("entity.painting.break");
        a("entity.painting.place");
        a("entity.parrot.ambient");
        a("entity.parrot.death");
        a("entity.parrot.eat");
        a("entity.parrot.fly");
        a("entity.parrot.hurt");
        a("entity.parrot.imitate.blaze");
        a("entity.parrot.imitate.creeper");
        a("entity.parrot.imitate.drowned");
        a("entity.parrot.imitate.elder_guardian");
        a("entity.parrot.imitate.ender_dragon");
        a("entity.parrot.imitate.enderman");
        a("entity.parrot.imitate.endermite");
        a("entity.parrot.imitate.evoker");
        a("entity.parrot.imitate.ghast");
        a("entity.parrot.imitate.husk");
        a("entity.parrot.imitate.illusioner");
        a("entity.parrot.imitate.magma_cube");
        a("entity.parrot.imitate.phantom");
        a("entity.parrot.imitate.polar_bear");
        a("entity.parrot.imitate.shulker");
        a("entity.parrot.imitate.silverfish");
        a("entity.parrot.imitate.skeleton");
        a("entity.parrot.imitate.slime");
        a("entity.parrot.imitate.spider");
        a("entity.parrot.imitate.stray");
        a("entity.parrot.imitate.vex");
        a("entity.parrot.imitate.vindicator");
        a("entity.parrot.imitate.witch");
        a("entity.parrot.imitate.wither");
        a("entity.parrot.imitate.wither_skeleton");
        a("entity.parrot.imitate.wolf");
        a("entity.parrot.imitate.zombie");
        a("entity.parrot.imitate.zombie_pigman");
        a("entity.parrot.imitate.zombie_villager");
        a("entity.parrot.step");
        a("entity.phantom.ambient");
        a("entity.phantom.bite");
        a("entity.phantom.death");
        a("entity.phantom.flap");
        a("entity.phantom.hurt");
        a("entity.phantom.swoop");
        a("entity.pig.ambient");
        a("entity.pig.death");
        a("entity.pig.hurt");
        a("entity.pig.saddle");
        a("entity.pig.step");
        a("entity.player.attack.crit");
        a("entity.player.attack.knockback");
        a("entity.player.attack.nodamage");
        a("entity.player.attack.strong");
        a("entity.player.attack.sweep");
        a("entity.player.attack.weak");
        a("entity.player.big_fall");
        a("entity.player.breath");
        a("entity.player.burp");
        a("entity.player.death");
        a("entity.player.hurt");
        a("entity.player.hurt_drown");
        a("entity.player.hurt_on_fire");
        a("entity.player.levelup");
        a("entity.player.small_fall");
        a("entity.player.splash");
        a("entity.player.splash.high_speed");
        a("entity.player.swim");
        a("entity.polar_bear.ambient");
        a("entity.polar_bear.ambient_baby");
        a("entity.polar_bear.death");
        a("entity.polar_bear.hurt");
        a("entity.polar_bear.step");
        a("entity.polar_bear.warning");
        a("entity.puffer_fish.ambient");
        a("entity.puffer_fish.blow_out");
        a("entity.puffer_fish.blow_up");
        a("entity.puffer_fish.death");
        a("entity.puffer_fish.flop");
        a("entity.puffer_fish.hurt");
        a("entity.puffer_fish.sting");
        a("entity.rabbit.ambient");
        a("entity.rabbit.attack");
        a("entity.rabbit.death");
        a("entity.rabbit.hurt");
        a("entity.rabbit.jump");
        a("entity.salmon.ambient");
        a("entity.salmon.death");
        a("entity.salmon.flop");
        a("entity.salmon.hurt");
        a("entity.sheep.ambient");
        a("entity.sheep.death");
        a("entity.sheep.hurt");
        a("entity.sheep.shear");
        a("entity.sheep.step");
        a("entity.shulker.ambient");
        a("entity.shulker.close");
        a("entity.shulker.death");
        a("entity.shulker.hurt");
        a("entity.shulker.hurt_closed");
        a("entity.shulker.open");
        a("entity.shulker.shoot");
        a("entity.shulker.teleport");
        a("entity.shulker_bullet.hit");
        a("entity.shulker_bullet.hurt");
        a("entity.silverfish.ambient");
        a("entity.silverfish.death");
        a("entity.silverfish.hurt");
        a("entity.silverfish.step");
        a("entity.skeleton.ambient");
        a("entity.skeleton.death");
        a("entity.skeleton.hurt");
        a("entity.skeleton.shoot");
        a("entity.skeleton.step");
        a("entity.skeleton_horse.ambient");
        a("entity.skeleton_horse.death");
        a("entity.skeleton_horse.hurt");
        a("entity.skeleton_horse.swim");
        a("entity.skeleton_horse.ambient_water");
        a("entity.skeleton_horse.gallop_water");
        a("entity.skeleton_horse.jump_water");
        a("entity.skeleton_horse.step_water");
        a("entity.slime.attack");
        a("entity.slime.death");
        a("entity.slime.hurt");
        a("entity.slime.jump");
        a("entity.slime.squish");
        a("entity.magma_cube.death_small");
        a("entity.magma_cube.hurt_small");
        a("entity.magma_cube.squish_small");
        a("entity.slime.death_small");
        a("entity.slime.hurt_small");
        a("entity.slime.jump_small");
        a("entity.slime.squish_small");
        a("entity.snow_golem.ambient");
        a("entity.snow_golem.death");
        a("entity.snow_golem.hurt");
        a("entity.snow_golem.shoot");
        a("entity.snowball.throw");
        a("entity.spider.ambient");
        a("entity.spider.death");
        a("entity.spider.hurt");
        a("entity.spider.step");
        a("entity.splash_potion.break");
        a("entity.splash_potion.throw");
        a("entity.squid.ambient");
        a("entity.squid.death");
        a("entity.squid.hurt");
        a("entity.squid.squirt");
        a("entity.stray.ambient");
        a("entity.stray.death");
        a("entity.stray.hurt");
        a("entity.stray.step");
        a("entity.tnt.primed");
        a("entity.tropical_fish.ambient");
        a("entity.tropical_fish.death");
        a("entity.tropical_fish.flop");
        a("entity.tropical_fish.hurt");
        a("entity.turtle.ambient_land");
        a("entity.turtle.death");
        a("entity.turtle.death_baby");
        a("entity.turtle.egg_break");
        a("entity.turtle.egg_crack");
        a("entity.turtle.egg_hatch");
        a("entity.turtle.hurt");
        a("entity.turtle.hurt_baby");
        a("entity.turtle.lay_egg");
        a("entity.turtle.shamble");
        a("entity.turtle.shamble_baby");
        a("entity.turtle.swim");
        a("entity.vex.ambient");
        a("entity.vex.charge");
        a("entity.vex.death");
        a("entity.vex.hurt");
        a("entity.villager.ambient");
        a("entity.villager.death");
        a("entity.villager.hurt");
        a("entity.villager.no");
        a("entity.villager.trade");
        a("entity.villager.yes");
        a("entity.vindicator.ambient");
        a("entity.vindicator.death");
        a("entity.vindicator.hurt");
        a("entity.witch.ambient");
        a("entity.witch.death");
        a("entity.witch.drink");
        a("entity.witch.hurt");
        a("entity.witch.throw");
        a("entity.wither.ambient");
        a("entity.wither.break_block");
        a("entity.wither.death");
        a("entity.wither.hurt");
        a("entity.wither.shoot");
        a("entity.wither.spawn");
        a("entity.wither_skeleton.ambient");
        a("entity.wither_skeleton.death");
        a("entity.wither_skeleton.hurt");
        a("entity.wither_skeleton.step");
        a("entity.wolf.ambient");
        a("entity.wolf.death");
        a("entity.wolf.growl");
        a("entity.wolf.howl");
        a("entity.wolf.hurt");
        a("entity.wolf.pant");
        a("entity.wolf.shake");
        a("entity.wolf.step");
        a("entity.wolf.whine");
        a("entity.zombie.ambient");
        a("entity.zombie.attack_wooden_door");
        a("entity.zombie.attack_iron_door");
        a("entity.zombie.break_wooden_door");
        a("entity.zombie.converted_to_drowned");
        a("entity.zombie.death");
        a("entity.zombie.destroy_egg");
        a("entity.zombie.hurt");
        a("entity.zombie.infect");
        a("entity.zombie.step");
        a("entity.zombie_horse.ambient");
        a("entity.zombie_horse.death");
        a("entity.zombie_horse.hurt");
        a("entity.zombie_pigman.ambient");
        a("entity.zombie_pigman.angry");
        a("entity.zombie_pigman.death");
        a("entity.zombie_pigman.hurt");
        a("entity.zombie_villager.ambient");
        a("entity.zombie_villager.converted");
        a("entity.zombie_villager.cure");
        a("entity.zombie_villager.death");
        a("entity.zombie_villager.hurt");
        a("entity.zombie_villager.step");
        a("item.armor.equip_chain");
        a("item.armor.equip_diamond");
        a("item.armor.equip_elytra");
        a("item.armor.equip_generic");
        a("item.armor.equip_gold");
        a("item.armor.equip_iron");
        a("item.armor.equip_leather");
        a("item.armor.equip_turtle");
        a("item.axe.strip");
        a("item.bottle.empty");
        a("item.bottle.fill");
        a("item.bottle.fill_dragonbreath");
        a("item.bucket.empty");
        a("item.bucket.empty_fish");
        a("item.bucket.empty_lava");
        a("item.bucket.fill");
        a("item.bucket.fill_fish");
        a("item.bucket.fill_lava");
        a("item.chorus_fruit.teleport");
        a("item.elytra.flying");
        a("item.firecharge.use");
        a("item.flintandsteel.use");
        a("item.hoe.till");
        a("item.shield.block");
        a("item.shield.break");
        a("item.shovel.flatten");
        a("item.totem.use");
        a("item.trident.hit");
        a("item.trident.hit_ground");
        a("item.trident.return");
        a("item.trident.riptide_1");
        a("item.trident.riptide_2");
        a("item.trident.riptide_3");
        a("item.trident.throw");
        a("item.trident.thunder");
        a("music.creative");
        a("music.credits");
        a("music.dragon");
        a("music.end");
        a("music.game");
        a("music.menu");
        a("music.nether");
        a("music.under_water");
        a("music_disc.11");
        a("music_disc.13");
        a("music_disc.blocks");
        a("music_disc.cat");
        a("music_disc.chirp");
        a("music_disc.far");
        a("music_disc.mall");
        a("music_disc.mellohi");
        a("music_disc.stal");
        a("music_disc.strad");
        a("music_disc.wait");
        a("music_disc.ward");
        a("ui.button.click");
        a("ui.toast.challenge_complete");
        a("ui.toast.in");
        a("ui.toast.out");
        a("weather.rain");
        a("weather.rain.above");
    }

    private static void a(String s) {
        MinecraftKey minecraftkey = new MinecraftKey(s);

        IRegistry.SOUND_EVENT.a(minecraftkey, (Object) (new SoundEffect(minecraftkey)));
    }
}

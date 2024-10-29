package derg.projectivemagistry.common.block;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.block.crystal.budding_crystal_block;
import derg.projectivemagistry.common.block.crystal.crystal_block;
import derg.projectivemagistry.common.block.entity.Pedestal.AncientPedestalBlock;
import derg.projectivemagistry.common.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LEYLINE_CRYSTAL_BLOCK =registerBlock("leyline_crystal_block",
            new crystal_block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TEAL)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block BUDDING_LEYLINE_CRYSTAL =registerBlock("budding_leyline_crystal",
            new budding_crystal_block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TEAL)
                    .strength(1.5f)
                    .ticksRandomly()
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block ANCIENT_PEDESTAL =registerBlock("ancient_pedestal",
            new AncientPedestalBlock(AbstractBlock.Settings.create()
                    .strength(1f)
                    .requiresTool()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block KILN_BLOCK =registerBlock("kiln_block",
            new AncientPedestalBlock(AbstractBlock.Settings.create()
                    .strength(1f)
                    .requiresTool()
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SILVER_BLOCK =registerBlock("silver_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_SILVER_BLOCK =registerBlock("raw_silver_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SILVER_ORE =registerBlock("silver_ore",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_SILVER_ORE =registerBlock("silver_ore_deepslate",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    //trees and leaves
    public static final Block ASH_WOOD =registerBlock("ash_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block ASH_LOG =registerBlock("ash_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block ASH_LEAVES =registerBlock("ash_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block ASH_SAPLING =registerBlock("ash_sapling",
            new SaplingBlock(ModSaplingGenerators.ASH, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block ASH_PLANKS = registerBlock("ash_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));

    public static final Block HAZEL_WOOD =registerBlock("hazel_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block HAZEL_LOG =registerBlock("hazel_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block HAZEL_LEAVES =registerBlock("hazel_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block HAZEL_SAPLING =registerBlock("hazel_sapling",
            new SaplingBlock(ModSaplingGenerators.HAZEL, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block HAZEL_PLANKS = registerBlock("hazel_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));

    public static final Block HOLLY_WOOD =registerBlock("holly_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block HOLLY_LOG =registerBlock("holly_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block HOLLY_LEAVES =registerBlock("holly_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block HOLLY_SAPLING =registerBlock("holly_sapling",
            new SaplingBlock(ModSaplingGenerators.HOLLY, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block HOLLY_PLANKS = registerBlock("holly_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));

    public static final Block YEW_WOOD =registerBlock("yew_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block YEW_LOG =registerBlock("yew_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block YEW_LEAVES =registerBlock("yew_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block YEW_SAPLING =registerBlock("yew_sapling",
            new SaplingBlock(ModSaplingGenerators.YEW, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block YEW_PLANKS = registerBlock("yew_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));
//
    public static final Block ASH_STAIRS =registerBlock("ash_stairs",
        new StairsBlock(ModBlocks.ASH_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f)));

//    public static final Block ASH_SLAB =registerBlock("ash_slab"
//    , new SlabBlock(AbstractBloc
//
//    public static final Block ASH_FENCE =registerBlock("ash_fence")
//
//    public static final Block ASH_FENCE_GATE =registerBlock("ash_fence_gate")
//
//    public static final Block ASH_WALL =registerBlock("ash_wall")
//
//    public static final Block ASH_BUTTON =registerBlock("ash_button")
//
//    public static final Block ASH_PRESSURE_PLATE =registerBlock("ash_pressure_plate")
//
//    public static final Block ASH_TRAPDOOR =registerBlock("ash_trapdoor")
//
//    public static final Block ASH_DOOR =registerBlock("ash_door")
//
//
//
//    public static final Block HAZEL_STAIRS =registerBlock("hazel_stairs")
//
//    public static final Block HAZEL_SLAB =registerBlock("hazel_slab")
//
//    public static final Block HAZEL_FENCE =registerBlock("hazel_fence")
//
//    public static final Block HAZEL_FENCE_GATE =registerBlock("hazel_fence_gate")
//
//    public static final Block HAZEL_WALL =registerBlock("hazel_wall")
//
//    public static final Block HAZEL_BUTTON =registerBlock("hazel_button")
//
//    public static final Block HAZEL_PRESSURE_PLATE =registerBlock("hazel_pressure_plate")
//
//    public static final Block HAZEL_TRAPDOOR =registerBlock("hazel_trapdoor")
//
//    public static final Block HAZEL_DOOR =registerBlock("hazel_door")
//
//
//    public static final Block HOLLY_STAIRS =registerBlock("holly_stairs")
//
//    public static final Block HOLLY_SLAB =registerBlock("holly_slab")
//
//    public static final Block HOLLY_FENCE =registerBlock("holly_fence")
//
//    public static final Block HOLLY_FENCE_GATE =registerBlock("holly_fence_gate")
//
//    public static final Block HOLLY_WALL =registerBlock("holly_wall")
//
//    public static final Block HOLLY_BUTTON =registerBlock("holly_button")
//
//    public static final Block HOLLY_PRESSURE_PLATE =registerBlock("holly_pressure_plate")
//
//    public static final Block HOLLY_TRAPDOOR =registerBlock("holly_trapdoor")
//
//    public static final Block HOLLY_DOOR =registerBlock("holly_door")
//
//
//    public static final Block YEW_STAIRS =registerBlock("yew_stairs")
//
//    public static final Block YEW_SLAB =registerBlock("yew_slab")
//
//    public static final Block YEW_FENCE =registerBlock("yew_fence")
//
//    public static final Block YEW_FENCE_GATE =registerBlock("yew_fence_gate")
//
//    public static final Block YEW_WALL =registerBlock("yew_wall")
//
//    public static final Block YEW_BUTTON =registerBlock("yew_button")
//
//    public static final Block YEW_PRESSURE_PLATE =registerBlock("yew_pressure_plate")
//
//    public static final Block YEW_TRAPDOOR =registerBlock("yew_trapdoor")
//
//    public static final Block YEW_DOOR =registerBlock("hazel_door")
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ProjectiveMagistry.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(ProjectiveMagistry.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ProjectiveMagistry.LOGGER.info("Registering Mod Blocks For " + ProjectiveMagistry.MOD_ID);
    }

    //datagen shit

}

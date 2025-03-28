package info.preva1l.showman.models

import info.preva1l.showman.models.block.data.*

/**
 * Created on 21/02/2025
 *
 * @author Preva1l
 */
enum class Material(
    val id: Int,
    val maxStackSize: Int = 64,
    val durability: Short = 0,
    val data: Class<out BlockData> = BlockData::class.java,
) {
    AIR(9648, 64), // Paper - air stacks to 64
    STONE(22948),
    GRANITE(21091),
    POLISHED_GRANITE(5477),
    DIORITE(24688),
    POLISHED_DIORITE(31615),
    ANDESITE(25975),
    POLISHED_ANDESITE(8335),

    /**
     * BlockData: {@link Orientable}
     */
    DEEPSLATE(26842, data = Orientable::class.java),
    COBBLED_DEEPSLATE(8021),
    POLISHED_DEEPSLATE(31772),
    CALCITE(20311),
    TUFF(24364),

    /**
     * BlockData: {@link Slab}
     */
    TUFF_SLAB(19305, data = Slab::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    TUFF_STAIRS(11268, data = Stairs::class.java),

    /**
     * BlockData: {@link Wall}
     */
    TUFF_WALL(24395, data = Wall::class.java),
    CHISELED_TUFF(15831),
    POLISHED_TUFF(17801),

    /**
     * BlockData: {@link Slab}
     */
    POLISHED_TUFF_SLAB(31096, data = Slab::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_TUFF_STAIRS(7964, data = Stairs::class.java),

    /**
     * BlockData: {@link Wall}
     */
    POLISHED_TUFF_WALL(28886, data = Wall::class.java),
    TUFF_BRICKS(26276),

    /**
     * BlockData: {@link Slab}
     */
    TUFF_BRICK_SLAB(11843, data = Slab::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    TUFF_BRICK_STAIRS(30753, data = Stairs::class.java),

    /**
     * BlockData: {@link Wall}
     */
    TUFF_BRICK_WALL(11761, data = Wall::class.java),
    CHISELED_TUFF_BRICKS(8601),
    DRIPSTONE_BLOCK(26227),

    /**
     * BlockData: {@link Snowable}
     */
    GRASS_BLOCK(28346, data = Snowable::class.java),
    DIRT(10580),
    COARSE_DIRT(15411),

    /**
     * BlockData: {@link Snowable}
     */
    PODZOL(24068, data = Snowable::class.java),
    ROOTED_DIRT(11410),
    MUD(32418),
    CRIMSON_NYLIUM(18139),
    WARPED_NYLIUM(26396),
    COBBLESTONE(32147),
    OAK_PLANKS(14905),
    SPRUCE_PLANKS(14593),
    BIRCH_PLANKS(29322),
    JUNGLE_PLANKS(26445),
    ACACIA_PLANKS(31312),
    CHERRY_PLANKS(8354),
    DARK_OAK_PLANKS(20869),
    PALE_OAK_PLANKS(21660),
    MANGROVE_PLANKS(7078),
    BAMBOO_PLANKS(8520),
    CRIMSON_PLANKS(18812),
    WARPED_PLANKS(16045),
    BAMBOO_MOSAIC(10715),

    /**
     * BlockData: {@link Sapling}
     */
    OAK_SAPLING(9636, data = Sapling::class.java),

    /**
     * BlockData: {@link Sapling}
     */
    SPRUCE_SAPLING(19874, data = Sapling::class.java),

    /**
     * BlockData: {@link Sapling}
     */
    BIRCH_SAPLING(31533, data = Sapling::class.java),

    /**
     * BlockData: {@link Sapling}
     */
    JUNGLE_SAPLING(17951, data = Sapling::class.java),

    /**
     * BlockData: {@link Sapling}
     */
    ACACIA_SAPLING(20806, data = Sapling::class.java),

    /**
     * BlockData: {@link Sapling}
     */
    CHERRY_SAPLING(25204, data = Sapling::class.java),

    /**
     * BlockData: {@link Sapling}
     */
    DARK_OAK_SAPLING(14933, data = Sapling::class.java),

    /**
     * BlockData: {@link Sapling}
     */
    PALE_OAK_SAPLING(15508, data = Sapling::class.java),

    /**
     * BlockData: {@link MangrovePropagule}
     */
    MANGROVE_PROPAGULE(18688, data = MangrovePropagule::class.java),
    BEDROCK(23130),
    SAND(11542),

    /**
     * BlockData: {@link Brushable}
     */
    SUSPICIOUS_SAND(18410, data = Brushable::class.java),

    /**
     * BlockData: {@link Brushable}
     */
    SUSPICIOUS_GRAVEL(7353, data = Brushable::class.java),
    RED_SAND(16279),
    GRAVEL(7804),
    COAL_ORE(30965),
    DEEPSLATE_COAL_ORE(16823),
    IRON_ORE(19834),
    DEEPSLATE_IRON_ORE(26021),
    COPPER_ORE(32666),
    DEEPSLATE_COPPER_ORE(6588),
    GOLD_ORE(32625),
    DEEPSLATE_GOLD_ORE(13582),

    /**
     * BlockData: {@link Lightable}
     */
    REDSTONE_ORE(10887, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    DEEPSLATE_REDSTONE_ORE(6331, data = Lightable::class.java),
    EMERALD_ORE(16630),
    DEEPSLATE_EMERALD_ORE(5299),
    LAPIS_ORE(22934),
    DEEPSLATE_LAPIS_ORE(13598),
    DIAMOND_ORE(9292),
    DEEPSLATE_DIAMOND_ORE(17792),
    NETHER_GOLD_ORE(4185),
    NETHER_QUARTZ_ORE(4807),
    ANCIENT_DEBRIS(18198),
    COAL_BLOCK(27968),
    RAW_IRON_BLOCK(32210),
    RAW_COPPER_BLOCK(17504),
    RAW_GOLD_BLOCK(23246),

    /**
     * BlockData: {@link Waterlogged}
     */
    HEAVY_CORE(15788, data = Waterlogged::class.java),
    AMETHYST_BLOCK(18919),
    BUDDING_AMETHYST(13963),
    IRON_BLOCK(24754),
    COPPER_BLOCK(12880),
    GOLD_BLOCK(27392),
    DIAMOND_BLOCK(5944),
    NETHERITE_BLOCK(6527),
    EXPOSED_COPPER(28488),
    WEATHERED_COPPER(19699),
    OXIDIZED_COPPER(19490),
    CHISELED_COPPER(12143),
    EXPOSED_CHISELED_COPPER(4570),
    WEATHERED_CHISELED_COPPER(30876),
    OXIDIZED_CHISELED_COPPER(27719),
    CUT_COPPER(32519),
    EXPOSED_CUT_COPPER(18000),
    WEATHERED_CUT_COPPER(21158),
    OXIDIZED_CUT_COPPER(5382),

    /**
     * BlockData: {@link Stairs}
     */
    CUT_COPPER_STAIRS(25925, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    EXPOSED_CUT_COPPER_STAIRS(31621, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    WEATHERED_CUT_COPPER_STAIRS(5851, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    OXIDIZED_CUT_COPPER_STAIRS(25379, data = Stairs::class.java),

    /**
     * BlockData: {@link Slab}
     */
    CUT_COPPER_SLAB(28988, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    EXPOSED_CUT_COPPER_SLAB(26694, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    WEATHERED_CUT_COPPER_SLAB(4602, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    OXIDIZED_CUT_COPPER_SLAB(29642, data = Slab::class.java),
    WAXED_COPPER_BLOCK(14638),
    WAXED_EXPOSED_COPPER(27989),
    WAXED_WEATHERED_COPPER(5960),
    WAXED_OXIDIZED_COPPER(25626),
    WAXED_CHISELED_COPPER(7500),
    WAXED_EXPOSED_CHISELED_COPPER(30658),
    WAXED_WEATHERED_CHISELED_COPPER(5970),
    WAXED_OXIDIZED_CHISELED_COPPER(7735),
    WAXED_CUT_COPPER(11030),
    WAXED_EXPOSED_CUT_COPPER(30043),
    WAXED_WEATHERED_CUT_COPPER(13823),
    WAXED_OXIDIZED_CUT_COPPER(22582),

    /**
     * BlockData: {@link Stairs}
     */
    WAXED_CUT_COPPER_STAIRS(23125, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    WAXED_EXPOSED_CUT_COPPER_STAIRS(15532, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    WAXED_WEATHERED_CUT_COPPER_STAIRS(29701, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    WAXED_OXIDIZED_CUT_COPPER_STAIRS(9842, data = Stairs::class.java),

    /**
     * BlockData: {@link Slab}
     */
    WAXED_CUT_COPPER_SLAB(6271, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    WAXED_EXPOSED_CUT_COPPER_SLAB(22091, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    WAXED_WEATHERED_CUT_COPPER_SLAB(20035, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    WAXED_OXIDIZED_CUT_COPPER_SLAB(11202, data = Slab::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    OAK_LOG(26723, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    SPRUCE_LOG(9726, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    BIRCH_LOG(26727, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    JUNGLE_LOG(20721, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    ACACIA_LOG(8385, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    CHERRY_LOG(20847, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    PALE_OAK_LOG(13346, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    DARK_OAK_LOG(14831, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    MANGROVE_LOG(23890, data = Orientable::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    MANGROVE_ROOTS(22124, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    MUDDY_MANGROVE_ROOTS(23244, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    CRIMSON_STEM(27920, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    WARPED_STEM(28920, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    BAMBOO_BLOCK(20770, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_OAK_LOG(20523, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_SPRUCE_LOG(6140, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_BIRCH_LOG(8838, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_JUNGLE_LOG(15476, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_ACACIA_LOG(18167, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_CHERRY_LOG(18061, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_DARK_OAK_LOG(6492, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_PALE_OAK_LOG(25375, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_MANGROVE_LOG(15197, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_CRIMSON_STEM(16882, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_WARPED_STEM(15627, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_OAK_WOOD(31455, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_SPRUCE_WOOD(6467, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_BIRCH_WOOD(22350, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_JUNGLE_WOOD(30315, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_ACACIA_WOOD(27193, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_CHERRY_WOOD(19647, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_DARK_OAK_WOOD(16000, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_PALE_OAK_WOOD(20330, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_MANGROVE_WOOD(4828, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_CRIMSON_HYPHAE(27488, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_WARPED_HYPHAE(7422, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_BAMBOO_BLOCK(14799, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    OAK_WOOD(7378, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    SPRUCE_WOOD(32328, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    BIRCH_WOOD(20913, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    JUNGLE_WOOD(10341, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    ACACIA_WOOD(9541, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    CHERRY_WOOD(9826, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    PALE_OAK_WOOD(29429, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    DARK_OAK_WOOD(16995, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    MANGROVE_WOOD(25484, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    CRIMSON_HYPHAE(6550, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    WARPED_HYPHAE(18439, data = Orientable::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    OAK_LEAVES(4385, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    SPRUCE_LEAVES(20039, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    BIRCH_LEAVES(12601, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    JUNGLE_LEAVES(5133, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    ACACIA_LEAVES(16606, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    CHERRY_LEAVES(20856, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    DARK_OAK_LEAVES(22254, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    PALE_OAK_LEAVES(6408, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    MANGROVE_LEAVES(15310, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    AZALEA_LEAVES(23001, data = Leaves::class.java),

    /**
     * BlockData: {@link Leaves}
     */
    FLOWERING_AZALEA_LEAVES(7139, data = Leaves::class.java),
    SPONGE(15860),
    WET_SPONGE(9043),
    GLASS(6195),
    TINTED_GLASS(19154),
    LAPIS_BLOCK(14485),
    SANDSTONE(13141),
    CHISELED_SANDSTONE(31763),
    CUT_SANDSTONE(6118),
    COBWEB(9469),
    SHORT_GRASS(16335),
    FERN(15794),
    AZALEA(29386),
    FLOWERING_AZALEA(28270),
    DEAD_BUSH(22888),
    SEAGRASS(23942),

    /**
     * BlockData: {@link SeaPickle}
     */
    SEA_PICKLE(19562, data = SeaPickle::class.java),
    WHITE_WOOL(8624),
    ORANGE_WOOL(23957),
    MAGENTA_WOOL(11853),
    LIGHT_BLUE_WOOL(21073),
    YELLOW_WOOL(29507),
    LIME_WOOL(10443),
    PINK_WOOL(7611),
    GRAY_WOOL(27209),
    LIGHT_GRAY_WOOL(22936),
    CYAN_WOOL(12221),
    PURPLE_WOOL(11922),
    BLUE_WOOL(15738),
    BROWN_WOOL(32638),
    GREEN_WOOL(25085),
    RED_WOOL(11621),
    BLACK_WOOL(16693),
    DANDELION(30558),
    OPEN_EYEBLOSSOM(31238),
    CLOSED_EYEBLOSSOM(29262),
    POPPY(12851),
    BLUE_ORCHID(13432),
    ALLIUM(6871),
    AZURE_BLUET(17608),
    RED_TULIP(16781),
    ORANGE_TULIP(26038),
    WHITE_TULIP(31495),
    PINK_TULIP(27319),
    OXEYE_DAISY(11709),
    CORNFLOWER(15405),
    LILY_OF_THE_VALLEY(7185),
    WITHER_ROSE(8619),
    TORCHFLOWER(4501),

    /**
     * BlockData: {@link Bisected}
     */
    PITCHER_PLANT(28172, data = Bisected::class.java),
    SPORE_BLOSSOM(20627),
    BROWN_MUSHROOM(9665),
    RED_MUSHROOM(19728),
    CRIMSON_FUNGUS(26268),
    WARPED_FUNGUS(19799),
    CRIMSON_ROOTS(14064),
    WARPED_ROOTS(13932),
    NETHER_SPROUTS(10431),

    /**
     * BlockData: {@link Ageable}
     */
    WEEPING_VINES(29267, data = Ageable::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    TWISTING_VINES(27283, data = Ageable::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    SUGAR_CANE(7726, data = Ageable::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    KELP(21916, data = Ageable::class.java),

    /**
     * BlockData: {@link PinkPetals}
     */
    PINK_PETALS(10420, data = PinkPetals::class.java),
    MOSS_CARPET(8221),
    MOSS_BLOCK(9175),

    /**
     * BlockData: {@link MossyCarpet}
     */
    PALE_MOSS_CARPET(24824, data = MossyCarpet::class.java),

    /**
     * BlockData: {@link HangingMoss}
     */
    PALE_HANGING_MOSS(13108, data = HangingMoss::class.java),
    PALE_MOSS_BLOCK(5318),

    /**
     * BlockData: {@link Waterlogged}
     */
    HANGING_ROOTS(15498, data = Waterlogged::class.java),

    /**
     * BlockData: {@link BigDripleaf}
     */
    BIG_DRIPLEAF(26173, data = BigDripleaf::class.java),

    /**
     * BlockData: {@link SmallDripleaf}
     */
    SMALL_DRIPLEAF(17540, data = SmallDripleaf::class.java),

    /**
     * BlockData: {@link Bamboo}
     */
    BAMBOO(18728, data = Bamboo::class.java),

    /**
     * BlockData: {@link Slab}
     */
    OAK_SLAB(12002, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    SPRUCE_SLAB(28798, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    BIRCH_SLAB(13807, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    JUNGLE_SLAB(19117, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    ACACIA_SLAB(23730, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    CHERRY_SLAB(16673, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    DARK_OAK_SLAB(28852, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    PALE_OAK_SLAB(22048, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    MANGROVE_SLAB(13704, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    BAMBOO_SLAB(17798, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    BAMBOO_MOSAIC_SLAB(22118, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    CRIMSON_SLAB(4691, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    WARPED_SLAB(27150, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    STONE_SLAB(19838, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_STONE_SLAB(24129, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    SANDSTONE_SLAB(29830, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    CUT_SANDSTONE_SLAB(30944, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    PETRIFIED_OAK_SLAB(18658, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    COBBLESTONE_SLAB(6340, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    BRICK_SLAB(26333, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    STONE_BRICK_SLAB(19676, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    MUD_BRICK_SLAB(10611, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    NETHER_BRICK_SLAB(26586, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    QUARTZ_SLAB(4423, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    RED_SANDSTONE_SLAB(17550, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    CUT_RED_SANDSTONE_SLAB(7220, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    PURPUR_SLAB(11487, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    PRISMARINE_SLAB(31323, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    PRISMARINE_BRICK_SLAB(25624, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    DARK_PRISMARINE_SLAB(7577, data = Slab::class.java),
    SMOOTH_QUARTZ(14415),
    SMOOTH_RED_SANDSTONE(25180),
    SMOOTH_SANDSTONE(30039),
    SMOOTH_STONE(21910),
    BRICKS(14165),
    BOOKSHELF(10069),

    /**
     * BlockData: {@link ChiseledBookshelf}
     */
    CHISELED_BOOKSHELF(8099, data = ChiseledBookshelf::class.java),

    /**
     * BlockData: {@link DecoratedPot}
     */
    DECORATED_POT(8720, data = DecoratedPot::class.java),
    MOSSY_COBBLESTONE(21900),
    OBSIDIAN(32723),
    TORCH(6063),

    /**
     * BlockData: {@link Directional}
     */
    END_ROD(24832, data = Directional::class.java),

    /**
     * BlockData: {@link MultipleFacing}
     */
    CHORUS_PLANT(28243, data = MultipleFacing::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    CHORUS_FLOWER(28542, data = Ageable::class.java),
    PURPUR_BLOCK(7538),

    /**
     * BlockData: {@link Orientable}
     */
    PURPUR_PILLAR(26718, data = Orientable::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    PURPUR_STAIRS(8921, data = Stairs::class.java),
    SPAWNER(7018),

    /**
     * BlockData: {@link CreakingHeart}
     */
    CREAKING_HEART(11442, data = CreakingHeart::class.java),

    /**
     * BlockData: {@link Chest}
     */
    CHEST(22969, data = Chest::class.java),
    CRAFTING_TABLE(20706),

    /**
     * BlockData: {@link Farmland}
     */
    FARMLAND(31166, data = Farmland::class.java),

    /**
     * BlockData: {@link Furnace}
     */
    FURNACE(8133, data = Furnace::class.java),

    /**
     * BlockData: {@link Ladder}
     */
    LADDER(23599, data = Ladder::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    COBBLESTONE_STAIRS(24715, data = Stairs::class.java),

    /**
     * BlockData: {@link Snow}
     */
    SNOW(14146, data = Snow::class.java),
    ICE(30428),
    SNOW_BLOCK(19913),

    /**
     * BlockData: {@link Ageable}
     */
    CACTUS(12191, data = Ageable::class.java),
    CLAY(27880),

    /**
     * BlockData: {@link Jukebox}
     */
    JUKEBOX(19264, data = Jukebox::class.java),

    /**
     * BlockData: {@link Fence}
     */
    OAK_FENCE(6442, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    SPRUCE_FENCE(25416, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    BIRCH_FENCE(17347, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    JUNGLE_FENCE(14358, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    ACACIA_FENCE(4569, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    CHERRY_FENCE(32047, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    DARK_OAK_FENCE(21767, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    PALE_OAK_FENCE(10547, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    MANGROVE_FENCE(15021, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    BAMBOO_FENCE(17207, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    CRIMSON_FENCE(21075, data = Fence::class.java),

    /**
     * BlockData: {@link Fence}
     */
    WARPED_FENCE(18438, data = Fence::class.java),
    PUMPKIN(19170),

    /**
     * BlockData: {@link Directional}
     */
    CARVED_PUMPKIN(25833, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    JACK_O_LANTERN(13758, data = Directional::class.java),
    NETHERRACK(23425),
    SOUL_SAND(16841),
    SOUL_SOIL(31140),

    /**
     * BlockData: {@link Orientable}
     */
    BASALT(28478, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    POLISHED_BASALT(11659, data = Orientable::class.java),
    SMOOTH_BASALT(13617),
    SOUL_TORCH(14292),
    GLOWSTONE(32713),
    INFESTED_STONE(18440),
    INFESTED_COBBLESTONE(4348),
    INFESTED_STONE_BRICKS(19749),
    INFESTED_MOSSY_STONE_BRICKS(9850),
    INFESTED_CRACKED_STONE_BRICKS(7476),
    INFESTED_CHISELED_STONE_BRICKS(4728),

    /**
     * BlockData: {@link Orientable}
     */
    INFESTED_DEEPSLATE(9472, data = Orientable::class.java),
    STONE_BRICKS(6962),
    MOSSY_STONE_BRICKS(16415),
    CRACKED_STONE_BRICKS(27869),
    CHISELED_STONE_BRICKS(9087),
    PACKED_MUD(7472),
    MUD_BRICKS(29168),
    DEEPSLATE_BRICKS(13193),
    CRACKED_DEEPSLATE_BRICKS(17105),
    DEEPSLATE_TILES(11250),
    CRACKED_DEEPSLATE_TILES(26249),
    CHISELED_DEEPSLATE(23825),
    REINFORCED_DEEPSLATE(10949),

    /**
     * BlockData: {@link MultipleFacing}
     */
    BROWN_MUSHROOM_BLOCK(6291, data = MultipleFacing::class.java),

    /**
     * BlockData: {@link MultipleFacing}
     */
    RED_MUSHROOM_BLOCK(20766, data = MultipleFacing::class.java),

    /**
     * BlockData: {@link MultipleFacing}
     */
    MUSHROOM_STEM(16543, data = MultipleFacing::class.java),

    /**
     * BlockData: {@link Fence}
     */
    IRON_BARS(9378, data = Fence::class.java),

    /**
     * BlockData: {@link Chain}
     */
    CHAIN(28265, data = Chain::class.java),

    /**
     * BlockData: {@link Fence}
     */
    GLASS_PANE(5709, data = Fence::class.java),
    MELON(25172),

    /**
     * BlockData: {@link MultipleFacing}
     */
    VINE(14564, data = MultipleFacing::class.java),

    /**
     * BlockData: {@link GlowLichen}
     */
    GLOW_LICHEN(19165, data = GlowLichen::class.java),

    /**
     * BlockData: {@link ResinClump}
     */
    RESIN_CLUMP(28662, data = ResinClump::class.java),
    RESIN_BLOCK(26344),
    RESIN_BRICKS(8331),

    /**
     * BlockData: {@link Stairs}
     */
    RESIN_BRICK_STAIRS(31170, data = Stairs::class.java),

    /**
     * BlockData: {@link Slab}
     */
    RESIN_BRICK_SLAB(25553, data = Slab::class.java),

    /**
     * BlockData: {@link Wall}
     */
    RESIN_BRICK_WALL(8538, data = Wall::class.java),
    CHISELED_RESIN_BRICKS(5529),

    /**
     * BlockData: {@link Stairs}
     */
    BRICK_STAIRS(21534, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    STONE_BRICK_STAIRS(27032, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    MUD_BRICK_STAIRS(13620, data = Stairs::class.java),

    /**
     * BlockData: {@link Snowable}
     */
    MYCELIUM(9913, data = Snowable::class.java),
    LILY_PAD(19271),
    NETHER_BRICKS(27802),
    CRACKED_NETHER_BRICKS(10888),
    CHISELED_NETHER_BRICKS(21613),

    /**
     * BlockData: {@link Fence}
     */
    NETHER_BRICK_FENCE(5286, data = Fence::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    NETHER_BRICK_STAIRS(12085, data = Stairs::class.java),
    SCULK(17870),

    /**
     * BlockData: {@link SculkVein}
     */
    SCULK_VEIN(11615, data = SculkVein::class.java),

    /**
     * BlockData: {@link SculkCatalyst}
     */
    SCULK_CATALYST(12017, data = SculkCatalyst::class.java),

    /**
     * BlockData: {@link SculkShrieker}
     */
    SCULK_SHRIEKER(20985, data = SculkShrieker::class.java),
    ENCHANTING_TABLE(16255),

    /**
     * BlockData: {@link EndPortalFrame}
     */
    END_PORTAL_FRAME(15480, data = EndPortalFrame::class.java),
    END_STONE(29686),
    END_STONE_BRICKS(20314),
    DRAGON_EGG(29946),

    /**
     * BlockData: {@link Stairs}
     */
    SANDSTONE_STAIRS(18474, data = Stairs::class.java),

    /**
     * BlockData: {@link EnderChest}
     */
    ENDER_CHEST(32349, data = EnderChest::class.java),
    EMERALD_BLOCK(9914),

    /**
     * BlockData: {@link Stairs}
     */
    OAK_STAIRS(5449, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    SPRUCE_STAIRS(11192, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    BIRCH_STAIRS(7657, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    JUNGLE_STAIRS(20636, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    ACACIA_STAIRS(17453, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    CHERRY_STAIRS(18380, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    DARK_OAK_STAIRS(22921, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    PALE_OAK_STAIRS(20755, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    MANGROVE_STAIRS(27641, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    BAMBOO_STAIRS(25674, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    BAMBOO_MOSAIC_STAIRS(20977, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    CRIMSON_STAIRS(32442, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    WARPED_STAIRS(17721, data = Stairs::class.java),

    /**
     * BlockData: {@link CommandBlock}
     */
    COMMAND_BLOCK(4355, data = CommandBlock::class.java),
    BEACON(6608),

    /**
     * BlockData: {@link Wall}
     */
    COBBLESTONE_WALL(12616, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    MOSSY_COBBLESTONE_WALL(11536, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    BRICK_WALL(18995, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    PRISMARINE_WALL(18184, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    RED_SANDSTONE_WALL(4753, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    MOSSY_STONE_BRICK_WALL(18259, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    GRANITE_WALL(23279, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    STONE_BRICK_WALL(29073, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    MUD_BRICK_WALL(18292, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    NETHER_BRICK_WALL(10398, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    ANDESITE_WALL(14938, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    RED_NETHER_BRICK_WALL(4580, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    SANDSTONE_WALL(18470, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    END_STONE_BRICK_WALL(27225, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    DIORITE_WALL(17412, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    BLACKSTONE_WALL(17327, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    POLISHED_BLACKSTONE_WALL(15119, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    POLISHED_BLACKSTONE_BRICK_WALL(9540, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    COBBLED_DEEPSLATE_WALL(21893, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    POLISHED_DEEPSLATE_WALL(6574, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    DEEPSLATE_BRICK_WALL(13304, data = Wall::class.java),

    /**
     * BlockData: {@link Wall}
     */
    DEEPSLATE_TILE_WALL(17077, data = Wall::class.java),

    /**
     * BlockData: {@link Directional}
     */
    ANVIL(18718, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    CHIPPED_ANVIL(10623, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    DAMAGED_ANVIL(10274, data = Directional::class.java),
    CHISELED_QUARTZ_BLOCK(30964),
    QUARTZ_BLOCK(11987),
    QUARTZ_BRICKS(23358),

    /**
     * BlockData: {@link Orientable}
     */
    QUARTZ_PILLAR(16452, data = Orientable::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    QUARTZ_STAIRS(24079, data = Stairs::class.java),
    WHITE_TERRACOTTA(20975),
    ORANGE_TERRACOTTA(18684),
    MAGENTA_TERRACOTTA(25900),
    LIGHT_BLUE_TERRACOTTA(31779),
    YELLOW_TERRACOTTA(32129),
    LIME_TERRACOTTA(24013),
    PINK_TERRACOTTA(23727),
    GRAY_TERRACOTTA(18004),
    LIGHT_GRAY_TERRACOTTA(26388),
    CYAN_TERRACOTTA(25940),
    PURPLE_TERRACOTTA(10387),
    BLUE_TERRACOTTA(5236),
    BROWN_TERRACOTTA(23664),
    GREEN_TERRACOTTA(4105),
    RED_TERRACOTTA(5086),
    BLACK_TERRACOTTA(26691),

    /**
     * BlockData: {@link Waterlogged}
     */
    BARRIER(26453, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Light}
     */
    LIGHT(17829, data = Light::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    HAY_BLOCK(17461, data = Orientable::class.java),
    WHITE_CARPET(15117),
    ORANGE_CARPET(24752),
    MAGENTA_CARPET(6180),
    LIGHT_BLUE_CARPET(21194),
    YELLOW_CARPET(18149),
    LIME_CARPET(15443),
    PINK_CARPET(27381),
    GRAY_CARPET(26991),
    LIGHT_GRAY_CARPET(11317),
    CYAN_CARPET(9742),
    PURPLE_CARPET(5574),
    BLUE_CARPET(13292),
    BROWN_CARPET(23352),
    GREEN_CARPET(7780),
    RED_CARPET(5424),
    BLACK_CARPET(6056),
    TERRACOTTA(16544),
    PACKED_ICE(28993),
    DIRT_PATH(10846),

    /**
     * BlockData: {@link Bisected}
     */
    SUNFLOWER(7408, data = Bisected::class.java),

    /**
     * BlockData: {@link Bisected}
     */
    LILAC(22837, data = Bisected::class.java),

    /**
     * BlockData: {@link Bisected}
     */
    ROSE_BUSH(6080, data = Bisected::class.java),

    /**
     * BlockData: {@link Bisected}
     */
    PEONY(21155, data = Bisected::class.java),

    /**
     * BlockData: {@link Bisected}
     */
    TALL_GRASS(21559, data = Bisected::class.java),

    /**
     * BlockData: {@link Bisected}
     */
    LARGE_FERN(30177, data = Bisected::class.java),
    WHITE_STAINED_GLASS(31190),
    ORANGE_STAINED_GLASS(25142),
    MAGENTA_STAINED_GLASS(26814),
    LIGHT_BLUE_STAINED_GLASS(17162),
    YELLOW_STAINED_GLASS(12182),
    LIME_STAINED_GLASS(24266),
    PINK_STAINED_GLASS(16164),
    GRAY_STAINED_GLASS(29979),
    LIGHT_GRAY_STAINED_GLASS(5843),
    CYAN_STAINED_GLASS(30604),
    PURPLE_STAINED_GLASS(21845),
    BLUE_STAINED_GLASS(7107),
    BROWN_STAINED_GLASS(20945),
    GREEN_STAINED_GLASS(22503),
    RED_STAINED_GLASS(9717),
    BLACK_STAINED_GLASS(13941),

    /**
     * BlockData: {@link GlassPane}
     */
    WHITE_STAINED_GLASS_PANE(10557, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    ORANGE_STAINED_GLASS_PANE(21089, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    MAGENTA_STAINED_GLASS_PANE(14082, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    LIGHT_BLUE_STAINED_GLASS_PANE(18721, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    YELLOW_STAINED_GLASS_PANE(20298, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    LIME_STAINED_GLASS_PANE(10610, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    PINK_STAINED_GLASS_PANE(24637, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    GRAY_STAINED_GLASS_PANE(25272, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    LIGHT_GRAY_STAINED_GLASS_PANE(19008, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    CYAN_STAINED_GLASS_PANE(11784, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    PURPLE_STAINED_GLASS_PANE(10948, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    BLUE_STAINED_GLASS_PANE(28484, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    BROWN_STAINED_GLASS_PANE(17557, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    GREEN_STAINED_GLASS_PANE(4767, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    RED_STAINED_GLASS_PANE(8630, data = GlassPane::class.java),

    /**
     * BlockData: {@link GlassPane}
     */
    BLACK_STAINED_GLASS_PANE(13201, data = GlassPane::class.java),
    PRISMARINE(7539),
    PRISMARINE_BRICKS(29118),
    DARK_PRISMARINE(19940),

    /**
     * BlockData: {@link Stairs}
     */
    PRISMARINE_STAIRS(19217, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    PRISMARINE_BRICK_STAIRS(15445, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    DARK_PRISMARINE_STAIRS(26511, data = Stairs::class.java),
    SEA_LANTERN(20780),
    RED_SANDSTONE(9092),
    CHISELED_RED_SANDSTONE(15529),
    CUT_RED_SANDSTONE(29108),

    /**
     * BlockData: {@link Stairs}
     */
    RED_SANDSTONE_STAIRS(25466, data = Stairs::class.java),

    /**
     * BlockData: {@link CommandBlock}
     */
    REPEATING_COMMAND_BLOCK(12405, data = CommandBlock::class.java),

    /**
     * BlockData: {@link CommandBlock}
     */
    CHAIN_COMMAND_BLOCK(26798, data = CommandBlock::class.java),
    MAGMA_BLOCK(25927),
    NETHER_WART_BLOCK(15486),
    WARPED_WART_BLOCK(15463),
    RED_NETHER_BRICKS(18056),

    /**
     * BlockData: {@link Orientable}
     */
    BONE_BLOCK(17312, data = Orientable::class.java),
    STRUCTURE_VOID(30806),

    /**
     * BlockData: {@link Directional}
     */
    SHULKER_BOX(7776, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    WHITE_SHULKER_BOX(31750, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    ORANGE_SHULKER_BOX(21673, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    MAGENTA_SHULKER_BOX(21566, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    LIGHT_BLUE_SHULKER_BOX(18226, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    YELLOW_SHULKER_BOX(28700, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    LIME_SHULKER_BOX(28360, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    PINK_SHULKER_BOX(24968, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    GRAY_SHULKER_BOX(12754, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    LIGHT_GRAY_SHULKER_BOX(21345, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    CYAN_SHULKER_BOX(28123, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    PURPLE_SHULKER_BOX(10373, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    BLUE_SHULKER_BOX(11476, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    BROWN_SHULKER_BOX(24230, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    GREEN_SHULKER_BOX(9377, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    RED_SHULKER_BOX(32448, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    BLACK_SHULKER_BOX(24076, 1, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    WHITE_GLAZED_TERRACOTTA(11326, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    ORANGE_GLAZED_TERRACOTTA(27451, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    MAGENTA_GLAZED_TERRACOTTA(8067, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    LIGHT_BLUE_GLAZED_TERRACOTTA(4336, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    YELLOW_GLAZED_TERRACOTTA(10914, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    LIME_GLAZED_TERRACOTTA(13861, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    PINK_GLAZED_TERRACOTTA(10260, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    GRAY_GLAZED_TERRACOTTA(6256, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    LIGHT_GRAY_GLAZED_TERRACOTTA(10707, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    CYAN_GLAZED_TERRACOTTA(9550, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    PURPLE_GLAZED_TERRACOTTA(4818, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    BLUE_GLAZED_TERRACOTTA(23823, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    BROWN_GLAZED_TERRACOTTA(5655, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    GREEN_GLAZED_TERRACOTTA(6958, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    RED_GLAZED_TERRACOTTA(24989, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    BLACK_GLAZED_TERRACOTTA(29678, data = Directional::class.java),
    WHITE_CONCRETE(6281),
    ORANGE_CONCRETE(19914),
    MAGENTA_CONCRETE(20591),
    LIGHT_BLUE_CONCRETE(29481),
    YELLOW_CONCRETE(15722),
    LIME_CONCRETE(5863),
    PINK_CONCRETE(5227),
    GRAY_CONCRETE(13959),
    LIGHT_GRAY_CONCRETE(14453),
    CYAN_CONCRETE(26522),
    PURPLE_CONCRETE(20623),
    BLUE_CONCRETE(18756),
    BROWN_CONCRETE(19006),
    GREEN_CONCRETE(17949),
    RED_CONCRETE(8032),
    BLACK_CONCRETE(13338),
    WHITE_CONCRETE_POWDER(10363),
    ORANGE_CONCRETE_POWDER(30159),
    MAGENTA_CONCRETE_POWDER(8272),
    LIGHT_BLUE_CONCRETE_POWDER(31206),
    YELLOW_CONCRETE_POWDER(10655),
    LIME_CONCRETE_POWDER(28859),
    PINK_CONCRETE_POWDER(6421),
    GRAY_CONCRETE_POWDER(13031),
    LIGHT_GRAY_CONCRETE_POWDER(21589),
    CYAN_CONCRETE_POWDER(15734),
    PURPLE_CONCRETE_POWDER(26808),
    BLUE_CONCRETE_POWDER(17773),
    BROWN_CONCRETE_POWDER(21485),
    GREEN_CONCRETE_POWDER(6904),
    RED_CONCRETE_POWDER(13286),
    BLACK_CONCRETE_POWDER(16150),

    /**
     * BlockData: {@link TurtleEgg}
     */
    TURTLE_EGG(32101, data = TurtleEgg::class.java),

    /**
     * BlockData: {@link Hatchable}
     */
    SNIFFER_EGG(12980, data = Hatchable::class.java),
    DEAD_TUBE_CORAL_BLOCK(28350),
    DEAD_BRAIN_CORAL_BLOCK(12979),
    DEAD_BUBBLE_CORAL_BLOCK(28220),
    DEAD_FIRE_CORAL_BLOCK(5307),
    DEAD_HORN_CORAL_BLOCK(15103),
    TUBE_CORAL_BLOCK(23723),
    BRAIN_CORAL_BLOCK(30618),
    BUBBLE_CORAL_BLOCK(15437),
    FIRE_CORAL_BLOCK(12119),
    HORN_CORAL_BLOCK(19958),

    /**
     * BlockData: {@link Waterlogged}
     */
    TUBE_CORAL(23048, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    BRAIN_CORAL(31316, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    BUBBLE_CORAL(12464, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    FIRE_CORAL(29151, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    HORN_CORAL(19511, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BRAIN_CORAL(9116, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BUBBLE_CORAL(30583, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_FIRE_CORAL(8365, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_HORN_CORAL(5755, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_TUBE_CORAL(18028, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    TUBE_CORAL_FAN(19929, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    BRAIN_CORAL_FAN(13849, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    BUBBLE_CORAL_FAN(10795, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    FIRE_CORAL_FAN(11112, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    HORN_CORAL_FAN(13610, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_TUBE_CORAL_FAN(17628, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BRAIN_CORAL_FAN(26150, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BUBBLE_CORAL_FAN(17322, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_FIRE_CORAL_FAN(27073, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_HORN_CORAL_FAN(11387, data = Waterlogged::class.java),
    BLUE_ICE(22449),

    /**
     * BlockData: {@link Waterlogged}
     */
    CONDUIT(5148, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_GRANITE_STAIRS(29588, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    SMOOTH_RED_SANDSTONE_STAIRS(17561, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    MOSSY_STONE_BRICK_STAIRS(27578, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_DIORITE_STAIRS(4625, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    MOSSY_COBBLESTONE_STAIRS(29210, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    END_STONE_BRICK_STAIRS(28831, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    STONE_STAIRS(23784, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    SMOOTH_SANDSTONE_STAIRS(21183, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    SMOOTH_QUARTZ_STAIRS(19560, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    GRANITE_STAIRS(21840, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    ANDESITE_STAIRS(17747, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    RED_NETHER_BRICK_STAIRS(26374, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_ANDESITE_STAIRS(7573, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    DIORITE_STAIRS(13134, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    COBBLED_DEEPSLATE_STAIRS(20699, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_DEEPSLATE_STAIRS(19513, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    DEEPSLATE_BRICK_STAIRS(29624, data = Stairs::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    DEEPSLATE_TILE_STAIRS(6361, data = Stairs::class.java),

    /**
     * BlockData: {@link Slab}
     */
    POLISHED_GRANITE_SLAB(4521, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_RED_SANDSTONE_SLAB(16304, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    MOSSY_STONE_BRICK_SLAB(14002, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    POLISHED_DIORITE_SLAB(18303, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    MOSSY_COBBLESTONE_SLAB(12139, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    END_STONE_BRICK_SLAB(23239, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_SANDSTONE_SLAB(9030, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_QUARTZ_SLAB(26543, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    GRANITE_SLAB(10901, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    ANDESITE_SLAB(32124, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    RED_NETHER_BRICK_SLAB(12462, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    POLISHED_ANDESITE_SLAB(24573, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    DIORITE_SLAB(25526, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    COBBLED_DEEPSLATE_SLAB(17388, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    POLISHED_DEEPSLATE_SLAB(32201, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    DEEPSLATE_BRICK_SLAB(23910, data = Slab::class.java),

    /**
     * BlockData: {@link Slab}
     */
    DEEPSLATE_TILE_SLAB(13315, data = Slab::class.java),

    /**
     * BlockData: {@link Scaffolding}
     */
    SCAFFOLDING(15757, data = Scaffolding::class.java),
    REDSTONE(11233),

    /**
     * BlockData: {@link Lightable}
     */
    REDSTONE_TORCH(22547, data = Lightable::class.java),
    REDSTONE_BLOCK(19496),

    /**
     * BlockData: {@link Repeater}
     */
    REPEATER(28823, data = Repeater::class.java),

    /**
     * BlockData: {@link Comparator}
     */
    COMPARATOR(18911, data = Comparator::class.java),

    /**
     * BlockData: {@link Piston}
     */
    PISTON(21130, data = Piston::class.java),

    /**
     * BlockData: {@link Piston}
     */
    STICKY_PISTON(18127, data = Piston::class.java),
    SLIME_BLOCK(31892),
    HONEY_BLOCK(30615),

    /**
     * BlockData: {@link Observer}
     */
    OBSERVER(10726, data = Observer::class.java),

    /**
     * BlockData: {@link Hopper}
     */
    HOPPER(31974, data = Hopper::class.java),

    /**
     * BlockData: {@link Dispenser}
     */
    DISPENSER(20871, data = Dispenser::class.java),

    /**
     * BlockData: {@link Dispenser}
     */
    DROPPER(31273, data = Dispenser::class.java),

    /**
     * BlockData: {@link Lectern}
     */
    LECTERN(23490, data = Lectern::class.java),

    /**
     * BlockData: {@link AnaloguePowerable}
     */
    TARGET(22637, data = AnaloguePowerable::class.java),

    /**
     * BlockData: {@link Switch}
     */
    LEVER(15319, data = Switch::class.java),

    /**
     * BlockData: {@link LightningRod}
     */
    LIGHTNING_ROD(30770, data = LightningRod::class.java),

    /**
     * BlockData: {@link DaylightDetector}
     */
    DAYLIGHT_DETECTOR(8864, data = DaylightDetector::class.java),

    /**
     * BlockData: {@link SculkSensor}
     */
    SCULK_SENSOR(5598, data = SculkSensor::class.java),

    /**
     * BlockData: {@link CalibratedSculkSensor}
     */
    CALIBRATED_SCULK_SENSOR(21034, data = CalibratedSculkSensor::class.java),

    /**
     * BlockData: {@link TripwireHook}
     */
    TRIPWIRE_HOOK(8130, data = TripwireHook::class.java),

    /**
     * BlockData: {@link Chest}
     */
    TRAPPED_CHEST(18970, data = Chest::class.java),

    /**
     * BlockData: {@link TNT}
     */
    TNT(7896, data = info.preva1l.showman.models.block.data.TNT::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    REDSTONE_LAMP(8217, data = Lightable::class.java),

    /**
     * BlockData: {@link NoteBlock}
     */
    NOTE_BLOCK(20979, data = NoteBlock::class.java),

    /**
     * BlockData: {@link Switch}
     */
    STONE_BUTTON(12279, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    POLISHED_BLACKSTONE_BUTTON(20760, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    OAK_BUTTON(13510, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    SPRUCE_BUTTON(23281, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    BIRCH_BUTTON(26934, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    JUNGLE_BUTTON(25317, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    ACACIA_BUTTON(13993, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    CHERRY_BUTTON(9058, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    DARK_OAK_BUTTON(6214, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    PALE_OAK_BUTTON(5238, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    MANGROVE_BUTTON(9838, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    BAMBOO_BUTTON(21810, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    CRIMSON_BUTTON(26799, data = Switch::class.java),

    /**
     * BlockData: {@link Switch}
     */
    WARPED_BUTTON(25264, data = Switch::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    STONE_PRESSURE_PLATE(22591, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    POLISHED_BLACKSTONE_PRESSURE_PLATE(32340, data = Powerable::class.java),

    /**
     * BlockData: {@link AnaloguePowerable}
     */
    LIGHT_WEIGHTED_PRESSURE_PLATE(14875, data = AnaloguePowerable::class.java),

    /**
     * BlockData: {@link AnaloguePowerable}
     */
    HEAVY_WEIGHTED_PRESSURE_PLATE(16970, data = AnaloguePowerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    OAK_PRESSURE_PLATE(20108, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    SPRUCE_PRESSURE_PLATE(15932, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    BIRCH_PRESSURE_PLATE(9664, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    JUNGLE_PRESSURE_PLATE(11376, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    ACACIA_PRESSURE_PLATE(17586, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    CHERRY_PRESSURE_PLATE(8651, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    DARK_OAK_PRESSURE_PLATE(31375, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    PALE_OAK_PRESSURE_PLATE(30527, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    MANGROVE_PRESSURE_PLATE(9748, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    BAMBOO_PRESSURE_PLATE(26740, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    CRIMSON_PRESSURE_PLATE(18316, data = Powerable::class.java),

    /**
     * BlockData: {@link Powerable}
     */
    WARPED_PRESSURE_PLATE(29516, data = Powerable::class.java),

    /**
     * BlockData: {@link Door}
     */
    IRON_DOOR(4788, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    OAK_DOOR(20341, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    SPRUCE_DOOR(10642, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    BIRCH_DOOR(14759, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    JUNGLE_DOOR(28163, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    ACACIA_DOOR(23797, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    CHERRY_DOOR(12684, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    DARK_OAK_DOOR(10669, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    PALE_OAK_DOOR(23817, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    MANGROVE_DOOR(18964, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    BAMBOO_DOOR(19971, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    CRIMSON_DOOR(19544, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    WARPED_DOOR(15062, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    COPPER_DOOR(26809, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    EXPOSED_COPPER_DOOR(13236, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    WEATHERED_COPPER_DOOR(10208, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    OXIDIZED_COPPER_DOOR(5348, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    WAXED_COPPER_DOOR(9954, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    WAXED_EXPOSED_COPPER_DOOR(20748, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    WAXED_WEATHERED_COPPER_DOOR(25073, data = Door::class.java),

    /**
     * BlockData: {@link Door}
     */
    WAXED_OXIDIZED_COPPER_DOOR(23888, data = Door::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    IRON_TRAPDOOR(17095, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    OAK_TRAPDOOR(16927, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    SPRUCE_TRAPDOOR(10289, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    BIRCH_TRAPDOOR(32585, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    JUNGLE_TRAPDOOR(8626, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    ACACIA_TRAPDOOR(18343, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    CHERRY_TRAPDOOR(6293, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    DARK_OAK_TRAPDOOR(10355, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    PALE_OAK_TRAPDOOR(20647, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    MANGROVE_TRAPDOOR(17066, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    BAMBOO_TRAPDOOR(9174, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    CRIMSON_TRAPDOOR(25056, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    WARPED_TRAPDOOR(7708, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    COPPER_TRAPDOOR(12110, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    EXPOSED_COPPER_TRAPDOOR(19219, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    WEATHERED_COPPER_TRAPDOOR(28254, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    OXIDIZED_COPPER_TRAPDOOR(26518, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    WAXED_COPPER_TRAPDOOR(12626, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    WAXED_EXPOSED_COPPER_TRAPDOOR(11010, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    WAXED_WEATHERED_COPPER_TRAPDOOR(30709, data = TrapDoor::class.java),

    /**
     * BlockData: {@link TrapDoor}
     */
    WAXED_OXIDIZED_COPPER_TRAPDOOR(21450, data = TrapDoor::class.java),

    /**
     * BlockData: {@link Gate}
     */
    OAK_FENCE_GATE(16689, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    SPRUCE_FENCE_GATE(26423, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    BIRCH_FENCE_GATE(6322, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    JUNGLE_FENCE_GATE(21360, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    ACACIA_FENCE_GATE(14145, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    CHERRY_FENCE_GATE(28222, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    DARK_OAK_FENCE_GATE(10679, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    PALE_OAK_FENCE_GATE(21221, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    MANGROVE_FENCE_GATE(28476, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    BAMBOO_FENCE_GATE(14290, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    CRIMSON_FENCE_GATE(15602, data = Gate::class.java),

    /**
     * BlockData: {@link Gate}
     */
    WARPED_FENCE_GATE(11115, data = Gate::class.java),

    /**
     * BlockData: {@link RedstoneRail}
     */
    POWERED_RAIL(11064, data = RedstoneRail::class.java),

    /**
     * BlockData: {@link RedstoneRail}
     */
    DETECTOR_RAIL(13475, data = RedstoneRail::class.java),

    /**
     * BlockData: {@link Rail}
     */
    RAIL(13285, data = Rail::class.java),

    /**
     * BlockData: {@link RedstoneRail}
     */
    ACTIVATOR_RAIL(5834, data = RedstoneRail::class.java),
    SADDLE(30206, 1),
    MINECART(14352, 1),
    CHEST_MINECART(4497, 1),
    FURNACE_MINECART(14196, 1),
    TNT_MINECART(4277, 1),
    HOPPER_MINECART(19024, 1),
    CARROT_ON_A_STICK(27809, 1, 25),
    WARPED_FUNGUS_ON_A_STICK(11706, 1, 100),
    PHANTOM_MEMBRANE(18398),
    ELYTRA(23829, 1, 432),
    OAK_BOAT(17570, 1),
    OAK_CHEST_BOAT(7765, 1),
    SPRUCE_BOAT(31427, 1),
    SPRUCE_CHEST_BOAT(30841, 1),
    BIRCH_BOAT(28104, 1),
    BIRCH_CHEST_BOAT(18546, 1),
    JUNGLE_BOAT(4495, 1),
    JUNGLE_CHEST_BOAT(20133, 1),
    ACACIA_BOAT(27326, 1),
    ACACIA_CHEST_BOAT(28455, 1),
    CHERRY_BOAT(13628, 1),
    CHERRY_CHEST_BOAT(7165, 1),
    DARK_OAK_BOAT(28618, 1),
    DARK_OAK_CHEST_BOAT(8733, 1),
    PALE_OAK_BOAT(18534, 1),
    PALE_OAK_CHEST_BOAT(26297, 1),
    MANGROVE_BOAT(20792, 1),
    MANGROVE_CHEST_BOAT(18572, 1),
    BAMBOO_RAFT(25901, 1),
    BAMBOO_CHEST_RAFT(20056, 1),

    /**
     * BlockData: {@link StructureBlock}
     */
    STRUCTURE_BLOCK(26831, data = StructureBlock::class.java),

    /**
     * BlockData: {@link Jigsaw}
     */
    JIGSAW(17398, data = Jigsaw::class.java),
    TURTLE_HELMET(30120, 1, 275),
    TURTLE_SCUTE(6766),
    ARMADILLO_SCUTE(11497),
    WOLF_ARMOR(17138, 1, 64),
    FLINT_AND_STEEL(28620, 1, 64),
    BOWL(32661),
    APPLE(7720),
    BOW(8745, 1, 384),
    ARROW(31091),
    COAL(29067),
    CHARCOAL(5390),
    DIAMOND(20865),
    EMERALD(5654),
    LAPIS_LAZULI(11075),
    QUARTZ(23608),
    AMETHYST_SHARD(7613),
    RAW_IRON(5329),
    IRON_INGOT(24895),
    RAW_COPPER(6162),
    COPPER_INGOT(12611),
    RAW_GOLD(19564),
    GOLD_INGOT(28927),
    NETHERITE_INGOT(32457),
    NETHERITE_SCRAP(29331),
    WOODEN_SWORD(7175, 1, 59),
    WOODEN_SHOVEL(28432, 1, 59),
    WOODEN_PICKAXE(12792, 1, 59),
    WOODEN_AXE(6292, 1, 59),
    WOODEN_HOE(16043, 1, 59),
    STONE_SWORD(25084, 1, 131),
    STONE_SHOVEL(9520, 1, 131),
    STONE_PICKAXE(14611, 1, 131),
    STONE_AXE(6338, 1, 131),
    STONE_HOE(22855, 1, 131),
    GOLDEN_SWORD(10505, 1, 32),
    GOLDEN_SHOVEL(15597, 1, 32),
    GOLDEN_PICKAXE(25898, 1, 32),
    GOLDEN_AXE(4878, 1, 32),
    GOLDEN_HOE(19337, 1, 32),
    IRON_SWORD(10904, 1, 250),
    IRON_SHOVEL(30045, 1, 250),
    IRON_PICKAXE(8842, 1, 250),
    IRON_AXE(15894, 1, 250),
    IRON_HOE(11339, 1, 250),
    DIAMOND_SWORD(27707, 1, 1561),
    DIAMOND_SHOVEL(25415, 1, 1561),
    DIAMOND_PICKAXE(24291, 1, 1561),
    DIAMOND_AXE(27277, 1, 1561),
    DIAMOND_HOE(24050, 1, 1561),
    NETHERITE_SWORD(23871, 1, 2031),
    NETHERITE_SHOVEL(29728, 1, 2031),
    NETHERITE_PICKAXE(9930, 1, 2031),
    NETHERITE_AXE(29533, 1, 2031),
    NETHERITE_HOE(27385, 1, 2031),
    STICK(9773),
    MUSHROOM_STEW(16336, 1),
    STRING(12806),
    FEATHER(30548),
    GUNPOWDER(29974),
    WHEAT_SEEDS(28742),

    /**
     * BlockData: {@link Ageable}
     */
    WHEAT(27709, data = Ageable::class.java),
    BREAD(32049),
    LEATHER_HELMET(11624, 1, 55),
    LEATHER_CHESTPLATE(29275, 1, 80),
    LEATHER_LEGGINGS(28210, 1, 75),
    LEATHER_BOOTS(15282, 1, 65),
    CHAINMAIL_HELMET(26114, 1, 165),
    CHAINMAIL_CHESTPLATE(23602, 1, 240),
    CHAINMAIL_LEGGINGS(19087, 1, 225),
    CHAINMAIL_BOOTS(17953, 1, 195),
    IRON_HELMET(12025, 1, 165),
    IRON_CHESTPLATE(28112, 1, 240),
    IRON_LEGGINGS(18951, 1, 225),
    IRON_BOOTS(8531, 1, 195),
    DIAMOND_HELMET(10755, 1, 363),
    DIAMOND_CHESTPLATE(32099, 1, 528),
    DIAMOND_LEGGINGS(26500, 1, 495),
    DIAMOND_BOOTS(16522, 1, 429),
    GOLDEN_HELMET(7945, 1, 77),
    GOLDEN_CHESTPLATE(4507, 1, 112),
    GOLDEN_LEGGINGS(21002, 1, 105),
    GOLDEN_BOOTS(7859, 1, 91),
    NETHERITE_HELMET(15907, 1, 407),
    NETHERITE_CHESTPLATE(6106, 1, 592),
    NETHERITE_LEGGINGS(25605, 1, 555),
    NETHERITE_BOOTS(8923, 1, 481),
    FLINT(23596),
    PORKCHOP(30896),
    COOKED_PORKCHOP(27231),
    PAINTING(23945),
    GOLDEN_APPLE(27732),
    ENCHANTED_GOLDEN_APPLE(8280),

    /**
     * BlockData: {@link Sign}
     */
    OAK_SIGN(8192, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    SPRUCE_SIGN(21502, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    BIRCH_SIGN(11351, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    JUNGLE_SIGN(24717, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    ACACIA_SIGN(29808, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    CHERRY_SIGN(16520, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    DARK_OAK_SIGN(15127, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    PALE_OAK_SIGN(12116, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    MANGROVE_SIGN(21975, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    BAMBOO_SIGN(26139, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    CRIMSON_SIGN(12162, 16, data = Sign::class.java),

    /**
     * BlockData: {@link Sign}
     */
    WARPED_SIGN(10407, 16, data = Sign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    OAK_HANGING_SIGN(20116, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    SPRUCE_HANGING_SIGN(24371, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    BIRCH_HANGING_SIGN(17938, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    JUNGLE_HANGING_SIGN(27671, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    ACACIA_HANGING_SIGN(30257, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    CHERRY_HANGING_SIGN(5088, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    DARK_OAK_HANGING_SIGN(23360, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    PALE_OAK_HANGING_SIGN(7097, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    MANGROVE_HANGING_SIGN(25106, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    BAMBOO_HANGING_SIGN(4726, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    CRIMSON_HANGING_SIGN(20696, 16, data = HangingSign::class.java),

    /**
     * BlockData: {@link HangingSign}
     */
    WARPED_HANGING_SIGN(8195, 16, data = HangingSign::class.java),
    BUCKET(15215, 16),
    WATER_BUCKET(8802, 1),
    LAVA_BUCKET(9228, 1),
    POWDER_SNOW_BUCKET(31101, 1),
    SNOWBALL(19487, 16),
    LEATHER(16414),
    MILK_BUCKET(9680, 1),
    PUFFERFISH_BUCKET(8861, 1),
    SALMON_BUCKET(9606, 1),
    COD_BUCKET(28601, 1),
    TROPICAL_FISH_BUCKET(29995, 1),
    AXOLOTL_BUCKET(20669, 1),
    TADPOLE_BUCKET(9731, 1),
    BRICK(6820),
    CLAY_BALL(24603),
    DRIED_KELP_BLOCK(12966),
    PAPER(9923),
    BOOK(23097),
    SLIME_BALL(5242),
    EGG(21603, 16),
    COMPASS(24139),
    RECOVERY_COMPASS(12710),
    BUNDLE(16835, 1),
    WHITE_BUNDLE(12072, 1),
    ORANGE_BUNDLE(18288, 1),
    MAGENTA_BUNDLE(15328, 1),
    LIGHT_BLUE_BUNDLE(18639, 1),
    YELLOW_BUNDLE(27749, 1),
    LIME_BUNDLE(30093, 1),
    PINK_BUNDLE(21400, 1),
    GRAY_BUNDLE(21262, 1),
    LIGHT_GRAY_BUNDLE(26338, 1),
    CYAN_BUNDLE(8942, 1),
    PURPLE_BUNDLE(10319, 1),
    BLUE_BUNDLE(31501, 1),
    BROWN_BUNDLE(15464, 1),
    GREEN_BUNDLE(4597, 1),
    RED_BUNDLE(19986, 1),
    BLACK_BUNDLE(22519, 1),
    FISHING_ROD(4167, 1, 64),
    CLOCK(14980),
    SPYGLASS(27490, 1),
    GLOWSTONE_DUST(6665),
    COD(24691),
    SALMON(18516),
    TROPICAL_FISH(24879),
    PUFFERFISH(8115),
    COOKED_COD(9681),
    COOKED_SALMON(5615),
    INK_SAC(7184),
    GLOW_INK_SAC(9686),
    COCOA_BEANS(30186),
    WHITE_DYE(10758),
    ORANGE_DYE(13866),
    MAGENTA_DYE(11788),
    LIGHT_BLUE_DYE(28738),
    YELLOW_DYE(5952),
    LIME_DYE(6147),
    PINK_DYE(31151),
    GRAY_DYE(9184),
    LIGHT_GRAY_DYE(27643),
    CYAN_DYE(8043),
    PURPLE_DYE(6347),
    BLUE_DYE(11588),
    BROWN_DYE(7648),
    GREEN_DYE(23215),
    RED_DYE(5728),
    BLACK_DYE(6202),
    BONE_MEAL(32458),
    BONE(5686),
    SUGAR(30638),

    /**
     * BlockData: {@link Cake}
     */
    CAKE(27048, 1, data = Cake::class.java),

    /**
     * BlockData: {@link Bed}
     */
    WHITE_BED(8185, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    ORANGE_BED(11194, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    MAGENTA_BED(20061, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    LIGHT_BLUE_BED(20957, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    YELLOW_BED(30410, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    LIME_BED(27860, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    PINK_BED(13795, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    GRAY_BED(15745, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    LIGHT_GRAY_BED(5090, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    CYAN_BED(16746, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    PURPLE_BED(29755, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    BLUE_BED(12714, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    BROWN_BED(26672, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    GREEN_BED(13797, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    RED_BED(30910, 1, data = Bed::class.java),

    /**
     * BlockData: {@link Bed}
     */
    BLACK_BED(20490, 1, data = Bed::class.java),
    COOKIE(27431),

    /**
     * BlockData: {@link Crafter}
     */
    CRAFTER(25243, data = Crafter::class.java),
    FILLED_MAP(23504),
    SHEARS(27971, 1, 238),
    MELON_SLICE(5347),
    DRIED_KELP(21042),
    PUMPKIN_SEEDS(28985),
    MELON_SEEDS(18340),
    BEEF(4803),
    COOKED_BEEF(21595),
    CHICKEN(17281),
    COOKED_CHICKEN(16984),
    ROTTEN_FLESH(21591),
    ENDER_PEARL(5259, 16),
    BLAZE_ROD(8289),
    GHAST_TEAR(18222),
    GOLD_NUGGET(28814),

    /**
     * BlockData: {@link Ageable}
     */
    NETHER_WART(29227, data = Ageable::class.java),
    GLASS_BOTTLE(6116),
    POTION(24020, 1),
    SPIDER_EYE(9318),
    FERMENTED_SPIDER_EYE(19386),
    BLAZE_POWDER(18941),
    MAGMA_CREAM(25097),

    /**
     * BlockData: {@link BrewingStand}
     */
    BREWING_STAND(14539, data = BrewingStand::class.java),
    CAULDRON(26531),
    ENDER_EYE(24860),
    GLISTERING_MELON_SLICE(20158),
    ARMADILLO_SPAWN_EGG(22098),
    ALLAY_SPAWN_EGG(7909),
    AXOLOTL_SPAWN_EGG(30381),
    BAT_SPAWN_EGG(14607),
    BEE_SPAWN_EGG(22924),
    BLAZE_SPAWN_EGG(4759),
    BOGGED_SPAWN_EGG(12042),
    BREEZE_SPAWN_EGG(7580),
    CAT_SPAWN_EGG(29583),
    CAMEL_SPAWN_EGG(14760),
    CAVE_SPIDER_SPAWN_EGG(23341),
    CHICKEN_SPAWN_EGG(5462),
    COD_SPAWN_EGG(27248),
    COW_SPAWN_EGG(14761),
    CREEPER_SPAWN_EGG(9653),
    DOLPHIN_SPAWN_EGG(20787),
    DONKEY_SPAWN_EGG(14513),
    DROWNED_SPAWN_EGG(19368),
    ELDER_GUARDIAN_SPAWN_EGG(11418),
    ENDER_DRAGON_SPAWN_EGG(28092),
    ENDERMAN_SPAWN_EGG(29488),
    ENDERMITE_SPAWN_EGG(16617),
    EVOKER_SPAWN_EGG(21271),
    FOX_SPAWN_EGG(22376),
    FROG_SPAWN_EGG(26682),
    GHAST_SPAWN_EGG(9970),
    GLOW_SQUID_SPAWN_EGG(31578),
    GOAT_SPAWN_EGG(30639),
    GUARDIAN_SPAWN_EGG(20113),
    HOGLIN_SPAWN_EGG(14088),
    HORSE_SPAWN_EGG(25981),
    HUSK_SPAWN_EGG(20178),
    IRON_GOLEM_SPAWN_EGG(12781),
    LLAMA_SPAWN_EGG(23640),
    MAGMA_CUBE_SPAWN_EGG(26638),
    MOOSHROOM_SPAWN_EGG(22125),
    MULE_SPAWN_EGG(11229),
    OCELOT_SPAWN_EGG(30080),
    PANDA_SPAWN_EGG(23759),
    PARROT_SPAWN_EGG(23614),
    PHANTOM_SPAWN_EGG(24648),
    PIG_SPAWN_EGG(22584),
    PIGLIN_SPAWN_EGG(16193),
    PIGLIN_BRUTE_SPAWN_EGG(30230),
    PILLAGER_SPAWN_EGG(28659),
    POLAR_BEAR_SPAWN_EGG(17015),
    PUFFERFISH_SPAWN_EGG(24570),
    RABBIT_SPAWN_EGG(26496),
    RAVAGER_SPAWN_EGG(8726),
    SALMON_SPAWN_EGG(18739),
    SHEEP_SPAWN_EGG(24488),
    SHULKER_SPAWN_EGG(31848),
    SILVERFISH_SPAWN_EGG(14537),
    SKELETON_SPAWN_EGG(15261),
    SKELETON_HORSE_SPAWN_EGG(21356),
    SLIME_SPAWN_EGG(17196),
    SNIFFER_SPAWN_EGG(27473),
    SNOW_GOLEM_SPAWN_EGG(24732),
    SPIDER_SPAWN_EGG(14984),
    SQUID_SPAWN_EGG(10682),
    STRAY_SPAWN_EGG(30153),
    STRIDER_SPAWN_EGG(6203),
    TADPOLE_SPAWN_EGG(32467),
    TRADER_LLAMA_SPAWN_EGG(8439),
    TROPICAL_FISH_SPAWN_EGG(19713),
    TURTLE_SPAWN_EGG(17324),
    VEX_SPAWN_EGG(27751),
    VILLAGER_SPAWN_EGG(30348),
    VINDICATOR_SPAWN_EGG(25324),
    WANDERING_TRADER_SPAWN_EGG(17904),
    WARDEN_SPAWN_EGG(27553),
    WITCH_SPAWN_EGG(11837),
    WITHER_SPAWN_EGG(8024),
    WITHER_SKELETON_SPAWN_EGG(10073),
    WOLF_SPAWN_EGG(21692),
    ZOGLIN_SPAWN_EGG(7442),
    CREAKING_SPAWN_EGG(9598),
    ZOMBIE_SPAWN_EGG(5814),
    ZOMBIE_HORSE_SPAWN_EGG(4275),
    ZOMBIE_VILLAGER_SPAWN_EGG(10311),
    ZOMBIFIED_PIGLIN_SPAWN_EGG(6626),
    EXPERIENCE_BOTTLE(12858),
    FIRE_CHARGE(4842),
    WIND_CHARGE(23928),
    WRITABLE_BOOK(13393, 1),
    WRITTEN_BOOK(24164, 16),
    BREEZE_ROD(14281),
    MACE(4771, 1, 500),
    ITEM_FRAME(27318),
    GLOW_ITEM_FRAME(26473),
    FLOWER_POT(30567),
    CARROT(22824),
    POTATO(21088),
    BAKED_POTATO(14624),
    POISONOUS_POTATO(32640),
    MAP(21655),
    GOLDEN_CARROT(5300),

    /**
     * BlockData: {@link Skull}
     */
    SKELETON_SKULL(13270, data = Skull::class.java),

    /**
     * BlockData: {@link Skull}
     */
    WITHER_SKELETON_SKULL(31487, data = Skull::class.java),

    /**
     * BlockData: {@link Skull}
     */
    PLAYER_HEAD(21174, data = Skull::class.java),

    /**
     * BlockData: {@link Skull}
     */
    ZOMBIE_HEAD(9304, data = Skull::class.java),

    /**
     * BlockData: {@link Skull}
     */
    CREEPER_HEAD(29146, data = Skull::class.java),

    /**
     * BlockData: {@link Skull}
     */
    DRAGON_HEAD(20084, data = Skull::class.java),

    /**
     * BlockData: {@link Skull}
     */
    PIGLIN_HEAD(5512, data = Skull::class.java),
    NETHER_STAR(12469),
    PUMPKIN_PIE(28725),
    FIREWORK_ROCKET(23841),
    FIREWORK_STAR(12190),
    ENCHANTED_BOOK(11741, 1),
    NETHER_BRICK(19996),
    RESIN_BRICK(19050),
    PRISMARINE_SHARD(10993),
    PRISMARINE_CRYSTALS(31546),
    RABBIT(23068),
    COOKED_RABBIT(4454),
    RABBIT_STEW(25318, 1),
    RABBIT_FOOT(13864),
    RABBIT_HIDE(12467),
    ARMOR_STAND(12852, 16),
    IRON_HORSE_ARMOR(30108, 1),
    GOLDEN_HORSE_ARMOR(7996, 1),
    DIAMOND_HORSE_ARMOR(10321, 1),
    LEATHER_HORSE_ARMOR(30667, 1),
    LEAD(29539),
    NAME_TAG(30731),
    COMMAND_BLOCK_MINECART(7992, 1),
    MUTTON(4792),
    COOKED_MUTTON(31447),

    /**
     * BlockData: {@link Rotatable}
     */
    WHITE_BANNER(17562, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    ORANGE_BANNER(4839, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    MAGENTA_BANNER(15591, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    LIGHT_BLUE_BANNER(18060, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    YELLOW_BANNER(30382, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    LIME_BANNER(18887, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    PINK_BANNER(19439, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    GRAY_BANNER(12053, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    LIGHT_GRAY_BANNER(11417, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    CYAN_BANNER(9839, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    PURPLE_BANNER(29027, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    BLUE_BANNER(18481, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    BROWN_BANNER(11481, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    GREEN_BANNER(10698, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    RED_BANNER(26961, 16, data = Rotatable::class.java),

    /**
     * BlockData: {@link Rotatable}
     */
    BLACK_BANNER(9365, 16, data = Rotatable::class.java),
    END_CRYSTAL(19090),
    CHORUS_FRUIT(7652),
    POPPED_CHORUS_FRUIT(27844),
    TORCHFLOWER_SEEDS(18153),
    PITCHER_POD(7977),
    BEETROOT(23305),
    BEETROOT_SEEDS(21282),
    BEETROOT_SOUP(16036, 1),
    DRAGON_BREATH(20154),
    SPLASH_POTION(30248, 1),
    SPECTRAL_ARROW(4568),
    TIPPED_ARROW(25164),
    LINGERING_POTION(25857, 1),
    SHIELD(29943, 1, 336),
    TOTEM_OF_UNDYING(10139, 1),
    SHULKER_SHELL(27848),
    IRON_NUGGET(13715),
    KNOWLEDGE_BOOK(12646, 1),
    DEBUG_STICK(24562, 1),
    MUSIC_DISC_13(16359, 1),
    MUSIC_DISC_CAT(16246, 1),
    MUSIC_DISC_BLOCKS(26667, 1),
    MUSIC_DISC_CHIRP(19436, 1),
    MUSIC_DISC_CREATOR(20345, 1),
    MUSIC_DISC_CREATOR_MUSIC_BOX(7202, 1),
    MUSIC_DISC_FAR(31742, 1),
    MUSIC_DISC_MALL(11517, 1),
    MUSIC_DISC_MELLOHI(26117, 1),
    MUSIC_DISC_STAL(14989, 1),
    MUSIC_DISC_STRAD(16785, 1),
    MUSIC_DISC_WARD(24026, 1),
    MUSIC_DISC_11(27426, 1),
    MUSIC_DISC_WAIT(26499, 1),
    MUSIC_DISC_OTHERSIDE(12974, 1),
    MUSIC_DISC_RELIC(8200, 1),
    MUSIC_DISC_5(9212, 1),
    MUSIC_DISC_PIGSTEP(21323, 1),
    MUSIC_DISC_PRECIPICE(28677, 1),
    DISC_FRAGMENT_5(29729),
    TRIDENT(7534, 1, 250),
    NAUTILUS_SHELL(19989),
    HEART_OF_THE_SEA(11807),
    CROSSBOW(4340, 1, 465),
    SUSPICIOUS_STEW(8173, 1),

    /**
     * BlockData: {@link Directional}
     */
    LOOM(14276, data = Directional::class.java),
    FLOWER_BANNER_PATTERN(5762, 1),
    CREEPER_BANNER_PATTERN(15774, 1),
    SKULL_BANNER_PATTERN(7680, 1),
    MOJANG_BANNER_PATTERN(11903, 1),
    GLOBE_BANNER_PATTERN(27753, 1),
    PIGLIN_BANNER_PATTERN(22028, 1),
    FLOW_BANNER_PATTERN(32683, 1),
    GUSTER_BANNER_PATTERN(27267, 1),
    FIELD_MASONED_BANNER_PATTERN(19157, 1),
    BORDURE_INDENTED_BANNER_PATTERN(25850, 1),
    GOAT_HORN(28237, 1),

    /**
     * BlockData: {@link Levelled}
     */
    COMPOSTER(31247, data = Levelled::class.java),

    /**
     * BlockData: {@link Barrel}
     */
    BARREL(22396, data = Barrel::class.java),

    /**
     * BlockData: {@link Furnace}
     */
    SMOKER(24781, data = Furnace::class.java),

    /**
     * BlockData: {@link Furnace}
     */
    BLAST_FURNACE(31157, data = Furnace::class.java),
    CARTOGRAPHY_TABLE(28529),
    FLETCHING_TABLE(30838),

    /**
     * BlockData: {@link Grindstone}
     */
    GRINDSTONE(26260, data = Grindstone::class.java),
    SMITHING_TABLE(9082),

    /**
     * BlockData: {@link Directional}
     */
    STONECUTTER(25170, data = Directional::class.java),

    /**
     * BlockData: {@link Bell}
     */
    BELL(20000, data = Bell::class.java),

    /**
     * BlockData: {@link Lantern}
     */
    LANTERN(5992, data = Lantern::class.java),

    /**
     * BlockData: {@link Lantern}
     */
    SOUL_LANTERN(27778, data = Lantern::class.java),
    SWEET_BERRIES(19747),
    GLOW_BERRIES(11584),

    /**
     * BlockData: {@link Campfire}
     */
    CAMPFIRE(8488, data = Campfire::class.java),

    /**
     * BlockData: {@link Campfire}
     */
    SOUL_CAMPFIRE(4238, data = Campfire::class.java),
    SHROOMLIGHT(20424),
    HONEYCOMB(9482),

    /**
     * BlockData: {@link Beehive}
     */
    BEE_NEST(8825, data = Beehive::class.java),

    /**
     * BlockData: {@link Beehive}
     */
    BEEHIVE(11830, data = Beehive::class.java),
    HONEY_BOTTLE(22927, 16),
    HONEYCOMB_BLOCK(28780),
    LODESTONE(23127),
    CRYING_OBSIDIAN(31545),
    BLACKSTONE(7354),

    /**
     * BlockData: {@link Slab}
     */
    BLACKSTONE_SLAB(11948, data = Slab::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    BLACKSTONE_STAIRS(14646, data = Stairs::class.java),
    GILDED_BLACKSTONE(8498),
    POLISHED_BLACKSTONE(18144),

    /**
     * BlockData: {@link Slab}
     */
    POLISHED_BLACKSTONE_SLAB(23430, data = Slab::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_BLACKSTONE_STAIRS(8653, data = Stairs::class.java),
    CHISELED_POLISHED_BLACKSTONE(21942),
    POLISHED_BLACKSTONE_BRICKS(19844),

    /**
     * BlockData: {@link Slab}
     */
    POLISHED_BLACKSTONE_BRICK_SLAB(12219, data = Slab::class.java),

    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_BLACKSTONE_BRICK_STAIRS(17983, data = Stairs::class.java),
    CRACKED_POLISHED_BLACKSTONE_BRICKS(16846),

    /**
     * BlockData: {@link RespawnAnchor}
     */
    RESPAWN_ANCHOR(4099, data = RespawnAnchor::class.java),

    /**
     * BlockData: {@link Candle}
     */
    CANDLE(16122, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    WHITE_CANDLE(26410, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    ORANGE_CANDLE(22668, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    MAGENTA_CANDLE(25467, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    LIGHT_BLUE_CANDLE(28681, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    YELLOW_CANDLE(14351, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    LIME_CANDLE(21778, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    PINK_CANDLE(28259, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    GRAY_CANDLE(10721, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    LIGHT_GRAY_CANDLE(10031, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    CYAN_CANDLE(24765, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    PURPLE_CANDLE(19606, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    BLUE_CANDLE(29047, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    BROWN_CANDLE(26145, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    GREEN_CANDLE(29756, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    RED_CANDLE(4214, data = Candle::class.java),

    /**
     * BlockData: {@link Candle}
     */
    BLACK_CANDLE(12617, data = Candle::class.java),

    /**
     * BlockData: {@link AmethystCluster}
     */
    SMALL_AMETHYST_BUD(14958, data = AmethystCluster::class.java),

    /**
     * BlockData: {@link AmethystCluster}
     */
    MEDIUM_AMETHYST_BUD(8429, data = AmethystCluster::class.java),

    /**
     * BlockData: {@link AmethystCluster}
     */
    LARGE_AMETHYST_BUD(7279, data = AmethystCluster::class.java),

    /**
     * BlockData: {@link AmethystCluster}
     */
    AMETHYST_CLUSTER(13142, data = AmethystCluster::class.java),

    /**
     * BlockData: {@link PointedDripstone}
     */
    POINTED_DRIPSTONE(18755, data = PointedDripstone::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    OCHRE_FROGLIGHT(25330, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    VERDANT_FROGLIGHT(22793, data = Orientable::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    PEARLESCENT_FROGLIGHT(21441, data = Orientable::class.java),
    FROGSPAWN(8350),
    ECHO_SHARD(12529),
    BRUSH(30569, 1, 64),
    NETHERITE_UPGRADE_SMITHING_TEMPLATE(7615),
    SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE(16124),
    DUNE_ARMOR_TRIM_SMITHING_TEMPLATE(30925),
    COAST_ARMOR_TRIM_SMITHING_TEMPLATE(25501),
    WILD_ARMOR_TRIM_SMITHING_TEMPLATE(5870),
    WARD_ARMOR_TRIM_SMITHING_TEMPLATE(24534),
    EYE_ARMOR_TRIM_SMITHING_TEMPLATE(14663),
    VEX_ARMOR_TRIM_SMITHING_TEMPLATE(25818),
    TIDE_ARMOR_TRIM_SMITHING_TEMPLATE(20420),
    SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE(14386),
    RIB_ARMOR_TRIM_SMITHING_TEMPLATE(6010),
    SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE(29143),
    WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE(4957),
    SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE(20537),
    SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE(7070),
    RAISER_ARMOR_TRIM_SMITHING_TEMPLATE(29116),
    HOST_ARMOR_TRIM_SMITHING_TEMPLATE(12165),
    FLOW_ARMOR_TRIM_SMITHING_TEMPLATE(29175),
    BOLT_ARMOR_TRIM_SMITHING_TEMPLATE(9698),
    ANGLER_POTTERY_SHERD(9952),
    ARCHER_POTTERY_SHERD(21629),
    ARMS_UP_POTTERY_SHERD(5484),
    BLADE_POTTERY_SHERD(25079),
    BREWER_POTTERY_SHERD(23429),
    BURN_POTTERY_SHERD(21259),
    DANGER_POTTERY_SHERD(30506),
    EXPLORER_POTTERY_SHERD(5124),
    FLOW_POTTERY_SHERD(4896),
    FRIEND_POTTERY_SHERD(18221),
    GUSTER_POTTERY_SHERD(28193),
    HEART_POTTERY_SHERD(17607),
    HEARTBREAK_POTTERY_SHERD(21108),
    HOWL_POTTERY_SHERD(24900),
    MINER_POTTERY_SHERD(30602),
    MOURNER_POTTERY_SHERD(23993),
    PLENTY_POTTERY_SHERD(28236),
    PRIZE_POTTERY_SHERD(4341),
    SCRAPE_POTTERY_SHERD(30034),
    SHEAF_POTTERY_SHERD(23652),
    SHELTER_POTTERY_SHERD(28390),
    SKULL_POTTERY_SHERD(16980),
    SNORT_POTTERY_SHERD(15921),

    /**
     * BlockData: {@link Waterlogged}
     */
    COPPER_GRATE(16221, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    EXPOSED_COPPER_GRATE(7783, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    WEATHERED_COPPER_GRATE(24954, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    OXIDIZED_COPPER_GRATE(14122, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    WAXED_COPPER_GRATE(11230, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    WAXED_EXPOSED_COPPER_GRATE(20520, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    WAXED_WEATHERED_COPPER_GRATE(16533, data = Waterlogged::class.java),

    /**
     * BlockData: {@link Waterlogged}
     */
    WAXED_OXIDIZED_COPPER_GRATE(32010, data = Waterlogged::class.java),

    /**
     * BlockData: {@link CopperBulb}
     */
    COPPER_BULB(21370, data = CopperBulb::class.java),

    /**
     * BlockData: {@link CopperBulb}
     */
    EXPOSED_COPPER_BULB(11944, data = CopperBulb::class.java),

    /**
     * BlockData: {@link CopperBulb}
     */
    WEATHERED_COPPER_BULB(10800, data = CopperBulb::class.java),

    /**
     * BlockData: {@link CopperBulb}
     */
    OXIDIZED_COPPER_BULB(22421, data = CopperBulb::class.java),

    /**
     * BlockData: {@link CopperBulb}
     */
    WAXED_COPPER_BULB(23756, data = CopperBulb::class.java),

    /**
     * BlockData: {@link CopperBulb}
     */
    WAXED_EXPOSED_COPPER_BULB(5530, data = CopperBulb::class.java),

    /**
     * BlockData: {@link CopperBulb}
     */
    WAXED_WEATHERED_COPPER_BULB(13239, data = CopperBulb::class.java),

    /**
     * BlockData: {@link CopperBulb}
     */
    WAXED_OXIDIZED_COPPER_BULB(26892, data = CopperBulb::class.java),

    /**
     * BlockData: {@link TrialSpawner}
     */
    TRIAL_SPAWNER(19902, data = TrialSpawner::class.java),
    TRIAL_KEY(12725),
    OMINOUS_TRIAL_KEY(4986),

    /**
     * BlockData: {@link Vault}
     */
    VAULT(6288, data = Vault::class.java),
    OMINOUS_BOTTLE(26321),

    /**
     * BlockData: {@link Levelled}
     */
    WATER(24998, data = Levelled::class.java),

    /**
     * BlockData: {@link Levelled}
     */
    LAVA(8415, data = Levelled::class.java),

    /**
     * BlockData: {@link Bisected}
     */
    TALL_SEAGRASS(27189, data = Bisected::class.java),

    /**
     * BlockData: {@link PistonHead}
     */
    PISTON_HEAD(30226, data = PistonHead::class.java),

    /**
     * BlockData: {@link TechnicalPiston}
     */
    MOVING_PISTON(13831, data = TechnicalPiston::class.java),

    /**
     * BlockData: {@link Directional}
     */
    WALL_TORCH(25890, data = Directional::class.java),

    /**
     * BlockData: {@link Fire}
     */
    FIRE(16396, data = Fire::class.java),
    SOUL_FIRE(30163),

    /**
     * BlockData: {@link RedstoneWire}
     */
    REDSTONE_WIRE(25984, data = RedstoneWire::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    OAK_WALL_SIGN(12984, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    SPRUCE_WALL_SIGN(7352, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    BIRCH_WALL_SIGN(9887, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    ACACIA_WALL_SIGN(20316, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    CHERRY_WALL_SIGN(20188, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    JUNGLE_WALL_SIGN(29629, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    DARK_OAK_WALL_SIGN(9508, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    PALE_OAK_WALL_SIGN(23103, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    MANGROVE_WALL_SIGN(27203, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    BAMBOO_WALL_SIGN(18857, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    OAK_WALL_HANGING_SIGN(15637, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    SPRUCE_WALL_HANGING_SIGN(18833, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    BIRCH_WALL_HANGING_SIGN(15937, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    ACACIA_WALL_HANGING_SIGN(22477, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    CHERRY_WALL_HANGING_SIGN(10953, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    JUNGLE_WALL_HANGING_SIGN(16691, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    DARK_OAK_WALL_HANGING_SIGN(14296, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    PALE_OAK_WALL_HANGING_SIGN(23484, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    MANGROVE_WALL_HANGING_SIGN(16974, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    CRIMSON_WALL_HANGING_SIGN(28982, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    WARPED_WALL_HANGING_SIGN(20605, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link WallHangingSign}
     */
    BAMBOO_WALL_HANGING_SIGN(6669, data = HangingWallSign::class.java),

    /**
     * BlockData: {@link RedstoneWallTorch}
     */
    REDSTONE_WALL_TORCH(7595, data = RedstoneWallTorch::class.java),

    /**
     * BlockData: {@link Directional}
     */
    SOUL_WALL_TORCH(27500, data = Directional::class.java),

    /**
     * BlockData: {@link Orientable}
     */
    NETHER_PORTAL(19469, data = Orientable::class.java),

    /**
     * BlockData: {@link Directional}
     */
    ATTACHED_PUMPKIN_STEM(12724, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    ATTACHED_MELON_STEM(30882, data = Directional::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    PUMPKIN_STEM(19021, data = Ageable::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    MELON_STEM(8247, data = Ageable::class.java),

    /**
     * BlockData: {@link Levelled}
     */
    WATER_CAULDRON(32008, data = Levelled::class.java),
    LAVA_CAULDRON(4514),

    /**
     * BlockData: {@link Levelled}
     */
    POWDER_SNOW_CAULDRON(31571, data = Levelled::class.java),
    END_PORTAL(16782),

    /**
     * BlockData: {@link Cocoa}
     */
    COCOA(29709, data = Cocoa::class.java),

    /**
     * BlockData: {@link Tripwire}
     */
    TRIPWIRE(8810, data = Tripwire::class.java),
    POTTED_TORCHFLOWER(21278),
    POTTED_OAK_SAPLING(11905),
    POTTED_SPRUCE_SAPLING(29498),
    POTTED_BIRCH_SAPLING(32484),
    POTTED_JUNGLE_SAPLING(7525),
    POTTED_ACACIA_SAPLING(14096),
    POTTED_CHERRY_SAPLING(30785),
    POTTED_DARK_OAK_SAPLING(6486),
    POTTED_PALE_OAK_SAPLING(15538),
    POTTED_MANGROVE_PROPAGULE(22003),
    POTTED_FERN(23315),
    POTTED_DANDELION(9727),
    POTTED_POPPY(7457),
    POTTED_BLUE_ORCHID(6599),
    POTTED_ALLIUM(13184),
    POTTED_AZURE_BLUET(8754),
    POTTED_RED_TULIP(28594),
    POTTED_ORANGE_TULIP(28807),
    POTTED_WHITE_TULIP(24330),
    POTTED_PINK_TULIP(10089),
    POTTED_OXEYE_DAISY(19707),
    POTTED_CORNFLOWER(28917),
    POTTED_LILY_OF_THE_VALLEY(9364),
    POTTED_WITHER_ROSE(26876),
    POTTED_RED_MUSHROOM(22881),
    POTTED_BROWN_MUSHROOM(14481),
    POTTED_DEAD_BUSH(13020),
    POTTED_CACTUS(8777),

    /**
     * BlockData: {@link Ageable}
     */
    CARROTS(17258, data = Ageable::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    POTATOES(10879, data = Ageable::class.java),

    /**
     * BlockData: {@link WallSkull}
     */
    SKELETON_WALL_SKULL(31650, data = WallSkull::class.java),

    /**
     * BlockData: {@link WallSkull}
     */
    WITHER_SKELETON_WALL_SKULL(9326, data = WallSkull::class.java),

    /**
     * BlockData: {@link WallSkull}
     */
    ZOMBIE_WALL_HEAD(16296, data = WallSkull::class.java),

    /**
     * BlockData: {@link WallSkull}
     */
    PLAYER_WALL_HEAD(13164, data = WallSkull::class.java),

    /**
     * BlockData: {@link WallSkull}
     */
    CREEPER_WALL_HEAD(30123, data = WallSkull::class.java),

    /**
     * BlockData: {@link WallSkull}
     */
    DRAGON_WALL_HEAD(19818, data = WallSkull::class.java),

    /**
     * BlockData: {@link WallSkull}
     */
    PIGLIN_WALL_HEAD(4446, data = WallSkull::class.java),

    /**
     * BlockData: {@link Directional}
     */
    WHITE_WALL_BANNER(15967, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    ORANGE_WALL_BANNER(9936, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    MAGENTA_WALL_BANNER(23291, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    LIGHT_BLUE_WALL_BANNER(12011, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    YELLOW_WALL_BANNER(32004, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    LIME_WALL_BANNER(21422, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    PINK_WALL_BANNER(9421, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    GRAY_WALL_BANNER(24275, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    LIGHT_GRAY_WALL_BANNER(31088, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    CYAN_WALL_BANNER(10889, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    PURPLE_WALL_BANNER(14298, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    BLUE_WALL_BANNER(17757, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    BROWN_WALL_BANNER(14731, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    GREEN_WALL_BANNER(15046, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    RED_WALL_BANNER(4378, data = Directional::class.java),

    /**
     * BlockData: {@link Directional}
     */
    BLACK_WALL_BANNER(4919, data = Directional::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    TORCHFLOWER_CROP(28460, data = Ageable::class.java),

    /**
     * BlockData: {@link PitcherCrop}
     */
    PITCHER_CROP(15420, data = PitcherCrop::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    BEETROOTS(22075, data = Ageable::class.java),
    END_GATEWAY(26605),

    /**
     * BlockData: {@link Ageable}
     */
    FROSTED_ICE(21814, data = Ageable::class.java),
    KELP_PLANT(29697),

    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_TUBE_CORAL_WALL_FAN(5128, data = CoralWallFan::class.java),

    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_BRAIN_CORAL_WALL_FAN(23718, data = CoralWallFan::class.java),

    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_BUBBLE_CORAL_WALL_FAN(18453, data = CoralWallFan::class.java),

    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_FIRE_CORAL_WALL_FAN(23375, data = CoralWallFan::class.java),

    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_HORN_CORAL_WALL_FAN(27550, data = CoralWallFan::class.java),

    /**
     * BlockData: {@link CoralWallFan}
     */
    TUBE_CORAL_WALL_FAN(25282, data = CoralWallFan::class.java),

    /**
     * BlockData: {@link CoralWallFan}
     */
    BRAIN_CORAL_WALL_FAN(22685, data = CoralWallFan::class.java),

    /**
     * BlockData: {@link CoralWallFan}
     */
    BUBBLE_CORAL_WALL_FAN(20382, data = CoralWallFan::class.java),

    /**
     * BlockData: {@link CoralWallFan}
     */
    FIRE_CORAL_WALL_FAN(20100, data = CoralWallFan::class.java),

    /**
     * BlockData: {@link CoralWallFan}
     */
    HORN_CORAL_WALL_FAN(28883, data = CoralWallFan::class.java),
    BAMBOO_SAPLING(8478),
    POTTED_BAMBOO(22542),
    VOID_AIR(13668),
    CAVE_AIR(17422),

    /**
     * BlockData: {@link BubbleColumn}
     */
    BUBBLE_COLUMN(31612, data = BubbleColumn::class.java),

    /**
     * BlockData: {@link Ageable}
     */
    SWEET_BERRY_BUSH(11958, data = Ageable::class.java),
    WEEPING_VINES_PLANT(19437),
    TWISTING_VINES_PLANT(25338),

    /**
     * BlockData: {@link WallSign}
     */
    CRIMSON_WALL_SIGN(19242, 16, data = WallSign::class.java),

    /**
     * BlockData: {@link WallSign}
     */
    WARPED_WALL_SIGN(13534, 16, data = WallSign::class.java),
    POTTED_CRIMSON_FUNGUS(5548),
    POTTED_WARPED_FUNGUS(30800),
    POTTED_CRIMSON_ROOTS(13852),
    POTTED_WARPED_ROOTS(6403),

    /**
     * BlockData: {@link Lightable}
     */
    CANDLE_CAKE(25423, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    WHITE_CANDLE_CAKE(12674, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    ORANGE_CANDLE_CAKE(24982, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    MAGENTA_CANDLE_CAKE(11022, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    LIGHT_BLUE_CANDLE_CAKE(7787, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    YELLOW_CANDLE_CAKE(17157, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    LIME_CANDLE_CAKE(14309, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    PINK_CANDLE_CAKE(20405, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    GRAY_CANDLE_CAKE(6777, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    LIGHT_GRAY_CANDLE_CAKE(11318, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    CYAN_CANDLE_CAKE(21202, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    PURPLE_CANDLE_CAKE(22663, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    BLUE_CANDLE_CAKE(26425, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    BROWN_CANDLE_CAKE(26024, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    GREEN_CANDLE_CAKE(16334, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    RED_CANDLE_CAKE(24151, data = Lightable::class.java),

    /**
     * BlockData: {@link Lightable}
     */
    BLACK_CANDLE_CAKE(15191, data = Lightable::class.java),
    POWDER_SNOW(24077),

    /**
     * BlockData: {@link CaveVines}
     */
    CAVE_VINES(7339, data = CaveVines::class.java),

    /**
     * BlockData: {@link CaveVinesPlant}
     */
    CAVE_VINES_PLANT(30645, data = CaveVinesPlant::class.java),

    /**
     * BlockData: {@link Dripleaf}
     */
    BIG_DRIPLEAF_STEM(13167, data = Dripleaf::class.java),
    POTTED_AZALEA_BUSH(20430),
    POTTED_FLOWERING_AZALEA_BUSH(10609),
    POTTED_OPEN_EYEBLOSSOM(24999),
    POTTED_CLOSED_EYEBLOSSOM(16694),

    // ----- Legacy Separator -----
    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_AIR(0, 0),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STONE(1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GRASS(2),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIRT(3),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COBBLESTONE(4),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD(5),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SAPLING(6, data = Sapling::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BEDROCK(7),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WATER(8),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STATIONARY_WATER(9),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LAVA(10),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STATIONARY_LAVA(11),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SAND(12),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GRAVEL(13),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_ORE(14),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_ORE(15),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COAL_ORE(16),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LOG(17),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LEAVES(18, data = Leaves::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPONGE(19),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GLASS(20),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LAPIS_ORE(21),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LAPIS_BLOCK(22),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DISPENSER(23, data = Dispenser::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SANDSTONE(24),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NOTE_BLOCK(25),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BED_BLOCK(26, data = Bed::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_POWERED_RAIL(27, data = RedstoneRail::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DETECTOR_RAIL(28, data = RedstoneRail::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PISTON_STICKY_BASE(29, data = Piston::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WEB(30),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LONG_GRASS(31, data = Bisected::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DEAD_BUSH(32),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PISTON_BASE(33, data = Piston::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PISTON_EXTENSION(34, data = PistonHead::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOL(35),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PISTON_MOVING_PIECE(36),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_YELLOW_FLOWER(37),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RED_ROSE(38),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BROWN_MUSHROOM(39),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RED_MUSHROOM(40),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_BLOCK(41),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_BLOCK(42),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DOUBLE_STEP(43, data = Slab::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STEP(44, data = Slab::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BRICK(45),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_TNT(46),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOOKSHELF(47),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MOSSY_COBBLESTONE(48),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_OBSIDIAN(49),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_TORCH(50),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FIRE(51),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MOB_SPAWNER(52),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_STAIRS(53, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CHEST(54, data = Chest::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_WIRE(55, data = RedstoneWire::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_ORE(56),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_BLOCK(57),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WORKBENCH(58),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CROPS(59),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SOIL(60),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FURNACE(61, data = Furnace::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BURNING_FURNACE(62, data = Furnace::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SIGN_POST(63, 64, data = Sign::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOODEN_DOOR(64, data = Door::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LADDER(65, data = Ladder::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RAILS(66, data = Rail::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COBBLESTONE_STAIRS(67, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WALL_SIGN(68, 64, data = Sign::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LEVER(69, data = Switch::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STONE_PLATE(70, data = AnaloguePowerable::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_DOOR_BLOCK(71, data = Door::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_PLATE(72, data = AnaloguePowerable::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_ORE(73),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GLOWING_REDSTONE_ORE(74),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_TORCH_OFF(75),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_TORCH_ON(76,),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STONE_BUTTON(77, data = Switch::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SNOW(78),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ICE(79),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SNOW_BLOCK(80),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CACTUS(81),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CLAY(82),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SUGAR_CANE_BLOCK(83),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_JUKEBOX(84),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FENCE(85),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PUMPKIN(86),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NETHERRACK(87),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SOUL_SAND(88),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GLOWSTONE(89),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PORTAL(90),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_JACK_O_LANTERN(91),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CAKE_BLOCK(92, 64, data = Cake::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIODE_BLOCK_OFF(93),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIODE_BLOCK_ON(94),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STAINED_GLASS(95),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_TRAP_DOOR(96, data = TrapDoor::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MONSTER_EGGS(97),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SMOOTH_BRICK(98),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_HUGE_MUSHROOM_1(99),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_HUGE_MUSHROOM_2(100),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_FENCE(101),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_THIN_GLASS(102),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MELON_BLOCK(103),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PUMPKIN_STEM(104),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MELON_STEM(105),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_VINE(106, data = CaveVines::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FENCE_GATE(107, data = Gate::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BRICK_STAIRS(108, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SMOOTH_STAIRS(109, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MYCEL(110),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WATER_LILY(111),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NETHER_BRICK(112),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NETHER_FENCE(113),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NETHER_BRICK_STAIRS(114, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NETHER_WARTS(115),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ENCHANTMENT_TABLE(116),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BREWING_STAND(117),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CAULDRON(118),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ENDER_PORTAL(119),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ENDER_PORTAL_FRAME(120),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ENDER_STONE(121),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DRAGON_EGG(122),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_LAMP_OFF(123),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_LAMP_ON(124),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_DOUBLE_STEP(125, data = Slab::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_STEP(126, data = Slab::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COCOA(127, data = Cocoa::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SANDSTONE_STAIRS(128, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_EMERALD_ORE(129),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ENDER_CHEST(130, data = EnderChest::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_TRIPWIRE_HOOK(131, data = TripwireHook::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_TRIPWIRE(132, data = Tripwire::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_EMERALD_BLOCK(133),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPRUCE_WOOD_STAIRS(134, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BIRCH_WOOD_STAIRS(135, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_JUNGLE_WOOD_STAIRS(136, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COMMAND(137, data = CommandBlock::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BEACON(138),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COBBLE_WALL(139),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FLOWER_POT(140),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CARROT(141),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_POTATO(142),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_BUTTON(143, data = Switch::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SKULL(144, data = Skull::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ANVIL(145),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_TRAPPED_CHEST(146, data = Chest::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_PLATE(147),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_PLATE(148),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_COMPARATOR_OFF(149, data = Comparator::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_COMPARATOR_ON(150, data = Comparator::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DAYLIGHT_DETECTOR(151),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_BLOCK(152),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_QUARTZ_ORE(153),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_HOPPER(154, data = Hopper::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_QUARTZ_BLOCK(155),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_QUARTZ_STAIRS(156, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ACTIVATOR_RAIL(157, data = RedstoneRail::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DROPPER(158, data = Dispenser::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STAINED_CLAY(159),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STAINED_GLASS_PANE(160),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LEAVES_2(161, data = Leaves::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LOG_2(162),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ACACIA_STAIRS(163, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DARK_OAK_STAIRS(164, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SLIME_BLOCK(165),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BARRIER(166),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_TRAPDOOR(167, data = TrapDoor::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PRISMARINE(168),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SEA_LANTERN(169),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_HAY_BLOCK(170),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CARPET(171),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_HARD_CLAY(172),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COAL_BLOCK(173),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PACKED_ICE(174),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DOUBLE_PLANT(175),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STANDING_BANNER(176, data = Rotatable::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WALL_BANNER(177),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DAYLIGHT_DETECTOR_INVERTED(178),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RED_SANDSTONE(179),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RED_SANDSTONE_STAIRS(180, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DOUBLE_STONE_SLAB2(181),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STONE_SLAB2(182),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPRUCE_FENCE_GATE(183, data = Gate::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BIRCH_FENCE_GATE(184, data = Gate::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_JUNGLE_FENCE_GATE(185, data = Gate::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DARK_OAK_FENCE_GATE(186, data = Gate::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ACACIA_FENCE_GATE(187, data = Gate::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPRUCE_FENCE(188),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BIRCH_FENCE(189),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_JUNGLE_FENCE(190),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DARK_OAK_FENCE(191),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ACACIA_FENCE(192),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPRUCE_DOOR(193, data = Door::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BIRCH_DOOR(194, data = Door::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_JUNGLE_DOOR(195, data = Door::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ACACIA_DOOR(196, data = Door::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DARK_OAK_DOOR(197, data = Door::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_END_ROD(198),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CHORUS_PLANT(199),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CHORUS_FLOWER(200),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PURPUR_BLOCK(201),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PURPUR_PILLAR(202),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PURPUR_STAIRS(203, data = Stairs::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PURPUR_DOUBLE_SLAB(204),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PURPUR_SLAB(205),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_END_BRICKS(206),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BEETROOT_BLOCK(207),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GRASS_PATH(208),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_END_GATEWAY(209),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COMMAND_REPEATING(210, data = CommandBlock::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COMMAND_CHAIN(211, data = CommandBlock::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FROSTED_ICE(212),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MAGMA(213),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NETHER_WART_BLOCK(214),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RED_NETHER_BRICK(215),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BONE_BLOCK(216),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STRUCTURE_VOID(217),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_OBSERVER(218, data = Observer::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WHITE_SHULKER_BOX(219, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ORANGE_SHULKER_BOX(220, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MAGENTA_SHULKER_BOX(221, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LIGHT_BLUE_SHULKER_BOX(222, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_YELLOW_SHULKER_BOX(223, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LIME_SHULKER_BOX(224, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PINK_SHULKER_BOX(225, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GRAY_SHULKER_BOX(226, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SILVER_SHULKER_BOX(227, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CYAN_SHULKER_BOX(228, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PURPLE_SHULKER_BOX(229, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BLUE_SHULKER_BOX(230, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BROWN_SHULKER_BOX(231, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GREEN_SHULKER_BOX(232, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RED_SHULKER_BOX(233, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BLACK_SHULKER_BOX(234, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WHITE_GLAZED_TERRACOTTA(235),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ORANGE_GLAZED_TERRACOTTA(236),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MAGENTA_GLAZED_TERRACOTTA(237),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LIGHT_BLUE_GLAZED_TERRACOTTA(238),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_YELLOW_GLAZED_TERRACOTTA(239),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LIME_GLAZED_TERRACOTTA(240),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PINK_GLAZED_TERRACOTTA(241),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GRAY_GLAZED_TERRACOTTA(242),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SILVER_GLAZED_TERRACOTTA(243),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CYAN_GLAZED_TERRACOTTA(244),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PURPLE_GLAZED_TERRACOTTA(245),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BLUE_GLAZED_TERRACOTTA(246),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BROWN_GLAZED_TERRACOTTA(247),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GREEN_GLAZED_TERRACOTTA(248),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RED_GLAZED_TERRACOTTA(249),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BLACK_GLAZED_TERRACOTTA(250),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CONCRETE(251),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CONCRETE_POWDER(252),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STRUCTURE_BLOCK(255),

    // ----- Item Separator -----
    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_SPADE(256, 1, 250),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_PICKAXE(257, 1, 250),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_AXE(258, 1, 250),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FLINT_AND_STEEL(259, 1, 64),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_APPLE(260),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOW(261, 1, 384),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ARROW(262),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COAL(263),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND(264),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_INGOT(265),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_INGOT(266),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_SWORD(267, 1, 250),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_SWORD(268, 1, 59),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_SPADE(269, 1, 59),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_PICKAXE(270, 1, 59),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_AXE(271, 1, 59),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STONE_SWORD(272, 1, 131),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STONE_SPADE(273, 1, 131),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STONE_PICKAXE(274, 1, 131),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STONE_AXE(275, 1, 131),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_SWORD(276, 1, 1561),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_SPADE(277, 1, 1561),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_PICKAXE(278, 1, 1561),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_AXE(279, 1, 1561),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STICK(280),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOWL(281),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MUSHROOM_SOUP(282, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_SWORD(283, 1, 32),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_SPADE(284, 1, 32),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_PICKAXE(285, 1, 32),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_AXE(286, 1, 32),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STRING(287),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FEATHER(288),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SULPHUR(289),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_HOE(290, 1, 59),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STONE_HOE(291, 1, 131),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_HOE(292, 1, 250),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_HOE(293, 1, 1561),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_HOE(294, 1, 32),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SEEDS(295),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WHEAT(296),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BREAD(297),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LEATHER_HELMET(298, 1, 55),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LEATHER_CHESTPLATE(299, 1, 80),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LEATHER_LEGGINGS(300, 1, 75),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LEATHER_BOOTS(301, 1, 65),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CHAINMAIL_HELMET(302, 1, 165),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CHAINMAIL_CHESTPLATE(303, 1, 240),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CHAINMAIL_LEGGINGS(304, 1, 225),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CHAINMAIL_BOOTS(305, 1, 195),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_HELMET(306, 1, 165),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_CHESTPLATE(307, 1, 240),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_LEGGINGS(308, 1, 225),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_BOOTS(309, 1, 195),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_HELMET(310, 1, 363),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_CHESTPLATE(311, 1, 528),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_LEGGINGS(312, 1, 495),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_BOOTS(313, 1, 429),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_HELMET(314, 1, 77),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_CHESTPLATE(315, 1, 112),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_LEGGINGS(316, 1, 105),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_BOOTS(317, 1, 91),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FLINT(318),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PORK(319),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GRILLED_PORK(320),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PAINTING(321),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLDEN_APPLE(322),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SIGN(323, 16),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WOOD_DOOR(324, 64),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BUCKET(325, 16),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WATER_BUCKET(326, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LAVA_BUCKET(327, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MINECART(328, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SADDLE(329, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_DOOR(330, 64),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE(331),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SNOW_BALL(332, 16),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOAT(333, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LEATHER(334),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MILK_BUCKET(335, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CLAY_BRICK(336),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CLAY_BALL(337),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SUGAR_CANE(338),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PAPER(339),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOOK(340),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SLIME_BALL(341),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_STORAGE_MINECART(342, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_POWERED_MINECART(343, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_EGG(344, 16),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COMPASS(345),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FISHING_ROD(346, 1, 64),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WATCH(347),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GLOWSTONE_DUST(348),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RAW_FISH(349),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COOKED_FISH(350),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_INK_SACK(351, data = Dye::class.java),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BONE(352),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SUGAR(353),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CAKE(354, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BED(355, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIODE(356),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COOKIE(357),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MAP(358),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SHEARS(359, 1, 238),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MELON(360),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PUMPKIN_SEEDS(361),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MELON_SEEDS(362),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RAW_BEEF(363),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COOKED_BEEF(364),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RAW_CHICKEN(365),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COOKED_CHICKEN(366),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ROTTEN_FLESH(367),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ENDER_PEARL(368, 16),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BLAZE_ROD(369),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GHAST_TEAR(370),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_NUGGET(371),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NETHER_STALK(372),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_POTION(373, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GLASS_BOTTLE(374),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPIDER_EYE(375),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FERMENTED_SPIDER_EYE(376),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BLAZE_POWDER(377),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MAGMA_CREAM(378),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BREWING_STAND_ITEM(379),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CAULDRON_ITEM(380),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_EYE_OF_ENDER(381),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPECKLED_MELON(382),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MONSTER_EGG(383, 64),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_EXP_BOTTLE(384, 64),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FIREBALL(385, 64),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOOK_AND_QUILL(386, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_WRITTEN_BOOK(387, 16),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_EMERALD(388, 64),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ITEM_FRAME(389),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FLOWER_POT_ITEM(390),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CARROT_ITEM(391),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_POTATO_ITEM(392),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BAKED_POTATO(393),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_POISONOUS_POTATO(394),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_EMPTY_MAP(395),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLDEN_CARROT(396),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SKULL_ITEM(397),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CARROT_STICK(398, 1, 25),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NETHER_STAR(399),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PUMPKIN_PIE(400),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FIREWORK(401),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_FIREWORK_CHARGE(402),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ENCHANTED_BOOK(403, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_REDSTONE_COMPARATOR(404),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NETHER_BRICK_ITEM(405),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_QUARTZ(406),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_EXPLOSIVE_MINECART(407, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_HOPPER_MINECART(408, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PRISMARINE_SHARD(409),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_PRISMARINE_CRYSTALS(410),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RABBIT(411),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COOKED_RABBIT(412),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RABBIT_STEW(413, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RABBIT_FOOT(414),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RABBIT_HIDE(415),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ARMOR_STAND(416, 16),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_BARDING(417, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_BARDING(418, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DIAMOND_BARDING(419, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LEASH(420),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_NAME_TAG(421),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COMMAND_MINECART(422, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_MUTTON(423),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_COOKED_MUTTON(424),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BANNER(425, 16),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_END_CRYSTAL(426),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPRUCE_DOOR_ITEM(427),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BIRCH_DOOR_ITEM(428),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_JUNGLE_DOOR_ITEM(429),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ACACIA_DOOR_ITEM(430),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DARK_OAK_DOOR_ITEM(431),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CHORUS_FRUIT(432),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_CHORUS_FRUIT_POPPED(433),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BEETROOT(434),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BEETROOT_SEEDS(435),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BEETROOT_SOUP(436, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_DRAGONS_BREATH(437),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPLASH_POTION(438, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SPECTRAL_ARROW(439),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_TIPPED_ARROW(440),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_LINGERING_POTION(441, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SHIELD(442, 1, 336),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_ELYTRA(443, 1, 431),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOAT_SPRUCE(444, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOAT_BIRCH(445, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOAT_JUNGLE(446, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOAT_ACACIA(447, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_BOAT_DARK_OAK(448, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_TOTEM(449, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_SHULKER_SHELL(450),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_IRON_NUGGET(452),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_KNOWLEDGE_BOOK(453, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GOLD_RECORD(2256, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_GREEN_RECORD(2257, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_3(2258, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_4(2259, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_5(2260, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_6(2261, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_7(2262, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_8(2263, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_9(2264, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_10(2265, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_11(2266, 1),

    @Deprecated("Does not use mojang item ids. These are to keep legacy bukkit compat.")
    LEGACY_RECORD_12(2267, 1),
    ;
}
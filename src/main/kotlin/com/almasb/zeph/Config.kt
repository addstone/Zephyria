package com.almasb.zeph

/**
 * Holds various constants.
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
object Config {

    const val spriteSize = 64
    const val tileSize = 32

    /**
     * Pixels per seconds.
     */
    const val CHAR_MOVE_SPEED = tileSize * 4.0

    /**
     * How much time a char does not move (in seconds) before randomly moving.
     */
    const val CHAR_IDLE_TIME = 3.0

    // These must be outside of tileY values since each char's z-index = tileY
    // We have these statically since, when parsed, a tile layer is a single entity
    const val Z_INDEX_DECOR_BELOW_PLAYER = -50
    const val Z_INDEX_DECOR_ABOVE_PLAYER = 5000

    val mapWidth = 150
    val mapHeight = 150

    // CHARACTER VALUES

    /**
     * When regeneration happens, in seconds.
     */
    val REGEN_INTERVAL = 2.0

    /**
     * How slow can a character attack, i.e. 1 attack in **n** seconds.
     */
    val SLOWEST_ATTACK_INTERVAL = 3.0

    val MAX_LEVEL_BASE = 100
    val MAX_LEVEL_STAT = 100
    val MAX_LEVEL_JOB = 60
    val MAX_LEVEL_SKILL = 10
    val MAX_ATTRIBUTE = 100

    val ATTRIBUTE_POINTS_PER_LEVEL = 3
    val ATTRIBUTE_POINTS_AT_LEVEL1 = 3

    /**
     * By what value should experience needed for next level
     * increase per level
     */
    val EXP_NEEDED_INC_BASE = 1.75f;
    val EXP_NEEDED_INC_STAT = 1.5f;
    val EXP_NEEDED_INC_JOB  = 2.25f;

    val EXP_NEEDED_FOR_LEVEL2 = 10;



    // GAMEPLAY

    val STARTING_MONEY = 100

    val MAX_INVENTORY_SIZE = 30
}
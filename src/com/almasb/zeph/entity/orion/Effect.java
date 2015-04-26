package com.almasb.zeph.entity.orion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Buff that lasts for a period of time, can be negative
 * i.e. atk decrease
 *
 * @author Almas Baimagambetov
 *
 */
public class Effect implements java.io.Serializable {

    private static final long serialVersionUID = 9209936367329122501L;

    private List<Rune> runes = new ArrayList<>();   // attribute bonuses
    private List<Essence> essences = new ArrayList<>(); // stat bonuses

    private float duration;

    /**
     * ID of the skill that created this effect
     */
    public final int sourceID;

    public Effect(float duration, int sourceID) {
        this.duration = duration;
        this.sourceID = sourceID;
    }

    public void reduceDuration(float value) {
        duration -= value;
    }

    public float getDuration() {
        return duration;
    }

    public void addRunes(Rune... rune) {
        runes.addAll(Arrays.asList(rune));
    }

    public void addEssences(Essence... essence) {
        essences.addAll(Arrays.asList(essence));
    }

    public void onBegin(GameCharacter ch) {
        for (Rune r : runes)
            ch.addBonusAttribute(r.attribute, r.bonus);
        for (Essence e : essences)
            ch.addBonusStat(e.stat, e.bonus);
    }

    public void onEnd(GameCharacter ch) {
        for (Rune r : runes)
            ch.addBonusAttribute(r.attribute, -r.bonus);
        for (Essence e : essences)
            ch.addBonusStat(e.stat, -e.bonus);
    }
}

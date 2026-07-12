package de.htw_berlin.fb4.ossd.melda;

import de.htw_berlin.fb4.ossd.prose.Sentence;

/**
 * Provides an adventure sentence for the generated prose.
 */
public final class AdventureSentence implements Sentence {

    @Override
    public String get() {
        return "Kurz darauf begann ein neugieriger Roboter, "
                + "nach einem verlorenen Stern zu suchen.";
    }
}
/*
 * Copyright 2026 Melda Sardogan
 * SPDX-License-Identifier: Apache-2.0
 */
package de.htw_berlin.fb4.ossd.melda;

import de.htw_berlin.fb4.ossd.prose.Sentence;

/**
 * Provides the opening sentence of the generated prose.
 */
public final class OpeningSentence implements Sentence {

    @Override
    public String get() {
        return "Am frühen Morgen öffnete die Stadt langsam ihre Augen.";
    }
}
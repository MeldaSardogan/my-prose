/*
 * Copyright 2026 Melda Sardogan
 * SPDX-License-Identifier: Apache-2.0
 */
package de.htw_berlin.fb4.ossd.melda;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

/**
 * Starts the sentence mixer application.
 */
public final class App {

    private App() {
        // Prevents instantiation.
    }

    public static void main(String[] args) {
        ProseBuilder proseBuilder = new ProseBuilder();

        proseBuilder.register(new OpeningSentence());
        proseBuilder.register(new AdventureSentence());

        System.out.print(proseBuilder.get());
    }
}
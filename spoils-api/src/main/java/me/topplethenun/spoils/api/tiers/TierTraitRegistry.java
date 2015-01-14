/*
 * This file is part of spoils-api, licensed under the ISC License.
 *
 * Copyright (c) 2014 Richard Harrah
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted,
 * provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF
 * THIS SOFTWARE.
 */
package me.topplethenun.spoils.api.tiers;

import java.util.Set;

public interface TierTraitRegistry {
    /**
     * Register a TierTrait if it is not already registered.
     * @param trait TierTrait to register
     */
    void register(TierTrait trait);

    /**
     * Unregister a TierTrait if it is already registered.
     * @param trait TierTrait to unregister
     */
    void unregister(TierTrait trait);

    /**
     * Checks and returns if the given TierTrait is registered.
     * @param trait TierTrait to check
     * @return if TierTrait is registered
     */
    boolean isRegistered(TierTrait trait);

    /**
     * Gets and returns a Set of all registered TierTraits.
     * @return Set of all registered TierTraits
     */
    Set<TierTrait> getRegisteredTraits();
}
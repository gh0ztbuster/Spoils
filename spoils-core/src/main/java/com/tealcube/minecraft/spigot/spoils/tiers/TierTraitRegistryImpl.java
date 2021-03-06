/*
 * This file is part of spoils-core, licensed under the ISC License.
 *
 * Copyright (c) 2014-2015 Richard Harrah
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
package com.tealcube.minecraft.spigot.spoils.tiers;

import com.google.common.base.Optional;
import com.tealcube.minecraft.spigot.spoils.api.tiers.TierTrait;
import com.tealcube.minecraft.spigot.spoils.api.tiers.TierTraitRegistry;
import org.apache.commons.lang.Validate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TierTraitRegistryImpl implements TierTraitRegistry {

    private final Map<String, TierTrait> registeredTraits;

    public TierTraitRegistryImpl() {
        registeredTraits = new HashMap<>();
    }

    @Override
    public void register(TierTrait trait) {
        Validate.notNull(trait, "trait cannot be null");
        if (registeredTraits.containsKey(trait.key().toLowerCase())) {
            return;
        }
        registeredTraits.put(trait.key().toLowerCase(), trait);
    }

    @Override
    public void unregister(TierTrait trait) {
        Validate.notNull(trait, "trait cannot be null");
        if (!registeredTraits.containsKey(trait.key().toLowerCase())) {
            return;
        }
        registeredTraits.remove(trait.key().toLowerCase());
    }

    @Override
    public Optional<TierTrait> findTierTrait(String name) {
        Validate.notNull(name, "name cannot be null");
        Optional<TierTrait> optional = Optional.absent();
        return !registeredTraits.containsKey(name.toLowerCase()) ? optional :
                Optional.of(registeredTraits.get(name.toLowerCase()));
    }

    @Override
    public boolean isRegistered(TierTrait trait) {
        Validate.notNull(trait, "trait cannot be null");
        return registeredTraits.containsKey(trait.key().toLowerCase());
    }

    @Override
    public boolean isRegistered(String name) {
        Validate.notNull(name, "name cannot be null");
        return registeredTraits.containsKey(name.toLowerCase());
    }

    @Override
    public Set<TierTrait> getRegisteredTraits() {
        return new HashSet<>(registeredTraits.values());
    }

}

package com.cemgokmen.wildsex.wildanimal.v1_7_R3;

import org.bukkit.craftbukkit.v1_7_R3.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_7_R3.entity.CraftAnimal;
import net.minecraft.server.v1_7_R3.EntityAnimal;
import net.minecraft.server.v1_7_R3.EntityHuman;

import org.bukkit.entity.Animals;

import com.cemgokmen.wildsex.api.WildAnimal;

public class WildAnimalHandler implements WildAnimal {
    private EntityAnimal getEntityAnimal(Animals animal) {
        EntityAnimal entity = (EntityAnimal) ((CraftEntity) ((CraftAnimals) animal)).getHandle();
    }

    @Override
    public boolean isInLoveMode(Animals animal) {
        EntityAnimal entity = getEntityAnimal(animal);
        return entity.ce();
    }

    @Override
    public void startLoveMode(Animals animal) {
        EntityAnimal entity = getEntityAnimal(animal);
        EntityHuman human = null;

        entity.f(human);
    }

    @Override
    public void endLoveMode(Animals animal) {
        EntityAnimal entity = getEntityAnimal(animal);
        entity.cf();
    }
}

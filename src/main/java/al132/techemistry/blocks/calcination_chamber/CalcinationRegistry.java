package al132.techemistry.blocks.calcination_chamber;



import al132.techemistry.RecipeTypes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CalcinationRegistry {

    private static List<CalcinationRecipe> recipes = null;


    public static void init() {
    }
    /*
        //=====SULFATE=====
        addRecipe(toStack("lead_oxide"), toStack("sulfur_trioxide"), toIngredient(Registration.anglesite.crushedItem), 1360);
        addRecipe(toStack("lead_oxide"), toStack("sulfur_trioxide"), toIngredient(Registration.anglesite.slurryItem), 1360);

        //addRecipe(toStack("barium_oxide"), toStack("sulfur_trioxide"), toIngredient(Registration.barite.crushedItem), 1870);
        //addRecipe(toStack("barium_oxide"), toStack("sulfur_trioxide"), toIngredient(Registration.barite.slurryItem), 1870);

        //=====SULFIDE=====
        addRecipe(toStack("iron_oxide"), toStack("sulfur_dioxide"), toIngredient("iron_disulfide", 2), 820);
        addRecipe(toStack("iron_oxide"), toStack("sulfur_dioxide"), toIngredient(Registration.pyrite.crushedItem, 2), 820);
        addRecipe(toStack("iron_oxide"), toStack("gold"), toStack("sulfur_dioxide"), toIngredient(Registration.pyrite.slurryItem, 2), 820);

        addRecipe(toStack("lead_oxide"), toStack("sulfur_dioxide"), toIngredient("lead_sulfide"), 820);
        addRecipe(toStack("lead_oxide"), toStack("sulfur_dioxide"), toIngredient(Registration.galena.crushedItem), 820);
        addRecipe(toStack("lead_oxide"), toStack("silver"), toStack("sulfur_dioxide"), toIngredient(Registration.galena.slurryItem), 1235);

        addRecipe(toStack("zinc_oxide"), toStack("sulfur_dioxide"), toIngredient("zinc_sulfide"), 1460);
        addRecipe(toStack("zinc_oxide"), toStack("sulfur_dioxide"), toIngredient(Registration.sphalerite.crushedItem), 1460);
        addRecipe(toStack("zinc_oxide"), toStack("cadmium"), toStack("sulfur_dioxide"), toIngredient(Registration.sphalerite.slurryItem), 1460);

        addRecipe(toStack("copper_i_oxide", 2), toStack("sulfur_dioxide", 2), toIngredient("copper_i_sulfide", 2), 870);
        addRecipe(toStack("copper_i_oxide", 2), toStack("sulfur_dioxide", 2), toIngredient(Registration.chalcocite.crushedItem, 2), 870);
        addRecipe(toStack("copper_i_oxide", 2), toStack("iron", 2), toStack("sulfur_dioxide", 2), toIngredient(Registration.chalcocite.slurryItem, 2), 870);

        addRecipe(toStack("mercury"), toStack("sulfur_dioxide"), toIngredient("mercury_sulfide"), 630);
        addRecipe(toStack("mercury"), toStack("sulfur_dioxide"), toIngredient(Registration.cinnabar.crushedItem), 630);
        addRecipe(toStack("mercury", 2), toStack("sulfur_dioxide", 2), toIngredient(Registration.cinnabar.slurryItem), 630);

        addRecipe(toStack("antimony_trioxide"), toStack("sulfur_dioxide", 3), toIngredient("antimony_trisulfide"), 670);
        addRecipe(toStack("antimony_trioxide"), toStack("sulfur_dioxide", 3), toIngredient(Registration.stibnite.crushedItem), 670);
        addRecipe(toStack("antimony_trioxide", 2), toStack("sulfur_dioxide", 6), toIngredient(Registration.stibnite.slurryItem), 670);

        addRecipe(toStack("nickel_oxide"), toStack("platinum"), toStack("sulfur_dioxide"), toIngredient(Registration.braggite.slurryItem), 1600);
        addRecipe(toStack("nickel_oxide", 2), toStack("sulfur_dioxide", 2), toIngredient(Registration.millerite.slurryItem), 1600);
        addRecipe(toStack("sulfuric_acid"), toStack("iron_ii_oxide"), toStack("water", 6), toIngredient(Registration.melanterite.crushedItem), 950);


        //=====NITRATE=====
        addRecipe(toStack("beryllium_oxide", 2), toStack("nitrogen_dioxide", 4), toIngredient("beryllium_nitrate", 2), 415);
        addRecipe(toStack("magnesium_oxide", 2), toStack("nitrogen_dioxide", 4), toIngredient("magnesium_nitrate", 2), 600);
        addRecipe(toStack("calcium_oxide", 2), toStack("nitrogen_dioxide", 4), toIngredient("calcium_nitrate", 2), 500);
        addRecipe(toStack("strontium_oxide", 2), toStack("nitrogen_dioxide", 4), toIngredient("strontium_nitrate", 2), 920);
        addRecipe(toStack("barium_oxide", 2), toStack("nitrogen_dioxide", 4), toIngredient("barium_nitrate", 2), 865);


        //=====CARBONATE=====

        addRecipe(toStack("lithium_oxide"), toStack("carbon_dioxide"), toIngredient("lithium_carbonate"), 1580);
        addRecipe(toStack("sodium_oxide"), toStack("carbon_dioxide"), toIngredient("sodium_carbonate"), 1125);
        addRecipe(toStack("potassium_oxide"), toStack("carbon_dioxide"), toIngredient("potassium_carbonate"), 1165);
        addRecipe(toStack("rubidium_oxide"), toStack("carbon_dioxide"), toIngredient("rubidium_carbonate"), 1170);
        //addRecipe(toStack("cesium_oxide"), toStack("carbon_dioxide"), toIngredient("cesium_carbonate"), 880);

        addRecipe(toStack("beryllium_oxide"), toStack("carbon_dioxide"), toIngredient("beryllium_carbonate"), 373);
        addRecipe(toStack("calcium_oxide"), toStack("carbon_dioxide"), toIngredient("calcium_carbonate"), 1098.0);
        addRecipe(toStack("magnesium_oxide"), toStack("carbon_dioxide"), toIngredient("magnesium_carbonate"), 1173.0);
        addRecipe(toStack("strontium_oxide"), toStack("carbon_dioxide"), toIngredient("strontium_carbonate"), 1400);
        addRecipe(toStack("strontium_oxide"), toStack("carbon_dioxide"), toIngredient(Registration.strontianite.crushedItem), 1400);
        addRecipe(toStack("strontium_oxide"), toStack("carbon_dioxide"), toIngredient(Registration.strontianite.slurryItem), 1400);
        addRecipe(toStack("barium_oxide"), toStack("carbon_dioxide"), toIngredient("barium_carbonate"), 1720);

        addRecipe(toStack("manganese_oxide"), toStack("carbon_dioxide"), toIngredient(Registration.rhodochrosite.crushedItem), 570);
        addRecipe(toStack("manganese_oxide"), toStack("carbon_dioxide"), toIngredient(Registration.rhodochrosite.slurryItem), 570);
        addRecipe(toStack("manganese_oxide"), toStack("carbon_dioxide"), toIngredient("manganese_carbonate"), 570);

        addRecipe(toStack("lead_oxide"), toStack("carbon_dioxide"), toIngredient("lead_carbonate"), 590);
        addRecipe(toStack("lead_oxide"), toStack("carbon_dioxide"), toIngredient(Registration.cerussite.crushedItem), 590);
        addRecipe(toStack("lead_oxide"), toStack("carbon_dioxide"), toIngredient(Registration.cerussite.slurryItem), 590);

        addRecipe(toStack("iron_ii_oxide"), toStack("carbon_dioxide"), toIngredient(Registration.siderite.crushedItem), 605);
        addRecipe(toStack("iron_ii_oxide"), toStack("carbon_dioxide"), toIngredient(Registration.siderite.slurryItem), 605);

        //=====OTHER=====
        addRecipe(toStack(Registration.coke), ItemStack.EMPTY, toIngredient(Items.COAL), 1320.0);
        addRecipe(toStack("hydrochloric_acid"), toStack("ammonia"), toIngredient("ammonium_chloride"), 610);
        addRecipe(toStack("calcium_oxide"), toStack("water"), toIngredient("calcium_hydroxide"), 853.0);
        addRecipe(toStack("water", 2), toStack("oxygen", 2), toStack("nitrogen_dioxide", 4),
                toIngredient("nitric_acid", 4), 360);
    }

    public static void addRecipe(ItemStack output, ItemStack gas, Ingredient input, double heat) {
        recipes.add(new CalcinationRecipe(output, gas, input, heat));
    }

    public static void addRecipe(ItemStack output, ItemStack output2, ItemStack gas, Ingredient input, double heat) {
        recipes.add(new CalcinationRecipe(output, output2, gas, input, heat));
    }
    */

    public static List<CalcinationRecipe> getRecipes(Level level) {
        if (recipes == null) {
            recipes = level.getRecipeManager().getRecipes().stream()
                    .filter(x -> x.getType() == RecipeTypes.CALCINATION_CHAMBER)
                    .map(x -> (CalcinationRecipe) x)
                    .collect(Collectors.toList());
        }
        return recipes;
    }

    public static boolean hasRecipe(Level level, ItemStack stack) {
        return getRecipes(level).stream().anyMatch(x -> matchesRecipe(x, stack));
    }

    public static boolean matchesRecipe(CalcinationRecipe recipe, ItemStack targetStack) {
        Item targetItem = targetStack.getItem();
        if(recipe.getIngredients().size() < 1) return false;
        return Arrays.stream(recipe.getIngredients().get(0).getItems())
                .map(ItemStack::getItem)
                .anyMatch(item -> item == targetItem);
    }

    public static Optional<CalcinationRecipe> getRecipeForInput(Level level,ItemStack input1) {
        return getRecipes(level).stream()
                .filter(recipe -> matchesRecipe(recipe, input1))
                .findFirst();
    }
}
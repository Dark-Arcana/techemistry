package al132.techemistry.datagen;

import com.google.gson.JsonObject;
import net.minecraft.core.Registry;
import net.minecraft.world.item.ItemStack;


public class DatagenUtils {

    public static void addStackToJson(JsonObject json, String key, ItemStack stack) {
        if (!stack.isEmpty()) {
            JsonObject tempJson = new JsonObject();
            tempJson.addProperty("item", Registry.ITEM.getKey(stack.getItem()).toString());
            if (stack.getCount() > 1) tempJson.addProperty("count", stack.getCount());
            json.add(key, tempJson);
        }
    }
}

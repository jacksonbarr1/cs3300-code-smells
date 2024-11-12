import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public enum Action {
        ADD, DELETE, UPDATE
    }

    public void manageInventory(Action action, String item, int quantity) {
        switch (action) {
            case ADD:
                inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
                break;
            case DELETE:
                inventory.remove(item);
                break;
            case UPDATE:
                inventory.put(item, quantity);
                break;
            default:
                throw new IllegalArgumentException("Invalid action: " + action);
        }
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}

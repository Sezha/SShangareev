package ru.job4j.tracker;

/**
 * class EditItem.
 * external class for method fillActions.
 * @author Sergei Shangangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
class EditItem implements UserAction {
    public int key() {
        return 2;
    }
    public void execute(Input input, Tracker tracker) {
        String   id = input.ask("Please, enter the task's ID: ");
        String name = input.ask("Please, enter new task's name: ");
        String desc = input.ask("Please, enter new task's description: ");
        long date = System.currentTimeMillis();
        Item item = new Item(name, desc, date);
        item.setId(id);
        tracker.replace(item.getId(), item);
    }
    public String info() {
        return String.format("%s. %s", this.key(), "Edit the new item.");
    }
}
/**
 * class MenuTracker.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[7];
    /**
     * constructor of class MenuTracker.
     * @param input
     * @param tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * method fillActions.
     * structure of menu.
     */
    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = new MenuTracker.ShowAllItems();
        this.actions[2] = new EditItem();
        this.actions[3] = this.new DeleteItem();
        this.actions[4] = this.new FindItemById();
        this.actions[5] = this.new FindItemByName();
        this.actions[6] = this.new Exit();
    }
    /**
     * method select.
     * @param key
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }
    /**
     * method show.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**
     * method AddItem.
     */
    private class AddItem implements UserAction {
        public int key() {
            return 0;
        }
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name: ");
            String desc = input.ask("Please, enter the task's description: ");
            long date = System.currentTimeMillis();
            tracker.add(new Item(name, desc, date));
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item.");
        }
    }
    /**
     * static class ShowAllItems.
     */
    private static class ShowAllItems implements UserAction {
        public int key() {
            return 1;
        }
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(
                        String.format("%s. %s. %s", item.getId(), item.getName(), item.getDescription())
                );
            }
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items.");
        }
    }
    /**
     * class DeleteItem.
     */
    private class DeleteItem implements UserAction {
        public int key() {
            return 3;
        }
        public void execute(Input input, Tracker tracker) {
            String   id = input.ask("Please, enter the task's ID: ");
            tracker.delete(id);
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Delete the item.");
        }
    }
    /**
     * class FindItemById.
     */
    private class FindItemById implements UserAction {
        public int key() {
            return 4;
        }
        public void execute(Input input, Tracker tracker) {
            String   id = input.ask("Please, enter the task's ID: ");
            System.out.println(
                    String.format("%s. %s. %s", tracker.findById(id).getId(), tracker.findById(id).getName(), tracker.findById(id).getDescription())
            );
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Find the item by ID.");
        }
    }
    /**
     * class FindItemByName.
     */
    private class FindItemByName implements UserAction {
        public int key() {
            return 5;
        }
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name: ");
            for (Item item : tracker.findAll()) {
                if (item.getName().equals(name)) {
                System.out.println(
                        String.format("%s. %s. %s", item.getId(), item.getName(), item.getDescription())
                );
                }
            }
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Find the item by Name.");
        }
    }
    /**
     * class Exit.
     */
    private class Exit implements UserAction {
        public int key() {
            return 6;
        }
        public void execute(Input input, Tracker tracker) {
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Exit Program.");
        }
    }
}

public class Playground {
    private int size;
    private Player player = new Player(5);

    public Playground(int size) {
        this.setSize(size);
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void printPlayground() {
        // TODO print out playground with as many '-' as size and '[]' at the start/end
        System.out.print("[");

        for (int i = 0; i < this.getSize(); i++) {

            if (i == this.player.getPosition()) {
                System.out.print("#");
            } else {
                System.out.print("-");
            }

        }

        System.out.println("]");
    }
}

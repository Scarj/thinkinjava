package ru.arcticweb.reusing;

/**
 * Created by evgeniy on 09.05.14.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}

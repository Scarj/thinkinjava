package ru.arcticweb.innerclasses;

import javax.swing.plaf.basic.BasicSliderUI;

public class Parcel6 {
    private void internalTracking(boolean bool){
        if (bool) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String id) {
                    this.id = id;
                }

                public String getId() {
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("ожидание");
            String s = ts.getId();
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}

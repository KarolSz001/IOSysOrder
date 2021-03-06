package com.app.model.enums;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public enum GuaranteeComponents {

    HELP_DESK, MONEY_BACK, SERVICE, EXCHANGE;

    public static Set<GuaranteeComponents> getRandomComponent() {
        int size = GuaranteeComponents.values().length;
        Set<GuaranteeComponents> componentsList = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            GuaranteeComponents gc = values()[new Random().nextInt(size - 1)];
            if (!componentsList.contains(gc)) {
                componentsList.add(gc);
            }
        }
        return componentsList;
    }



}

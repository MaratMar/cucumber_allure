package ru.ibs.framework.enums;

import ru.ibs.framework.managers.PropertyManager;

public enum DriverEnums {
    BASE_URL("base.url"),
    BROWSER("browser"),
    CHROME("chrome"),
    LOGIN("login"),
    PASSWORD("password"),
    PATH_CHROME_DRIVER_WINDOWS("path.chrome.driver.windows"),
    IMPLICITLY_WAIT("implicitly.wait"),
    PAGE_LOAD_TIMEOUT("page.load.timeout"),
    DRIVER_WAIT_SECONDS("web.driver.wait.seconds"),
    DRIVER_SLEEP_MILLIS("web.driver.sleep.millis");
    private final String s;
    private final PropertyManager propertyManager = PropertyManager.getPropInstance();

    DriverEnums(final String s) {
        this.s = s;
    }

    public String getValue() {
        return propertyManager.getProperty(s);
    }
}

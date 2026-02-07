## 🧠 How Java `enum` Works Behind the Scene

In Java, `enum` is not just a group of constants.
It is actually a **special type of class** that automatically extends:

```
java.lang.Enum
```

When we write a simple enum:

```java
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
```

The Java compiler internally converts it into something similar to the following class:w

```java
public final class Day extends java.lang.Enum<Day> {

    public static final Day SUNDAY = new Day("SUNDAY", 0);
    public static final Day MONDAY = new Day("MONDAY", 1);
    public static final Day TUESDAY = new Day("TUESDAY", 2);
    public static final Day WEDNESDAY = new Day("WEDNESDAY", 3);
    public static final Day THURSDAY = new Day("THURSDAY", 4);
    public static final Day FRIDAY = new Day("FRIDAY", 5);
    public static final Day SATURDAY = new Day("SATURDAY", 6);

    private static final Day[] VALUES = {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    };

    private Day(String name, int ordinal) {
        super(name, ordinal);
    }

    public static Day[] values() {
        return VALUES.clone();
    }

    public static Day valueOf(String name) {
        for (Day day : VALUES) {
            if (day.name().equals(name)) {
                return day;
            }
        }
        throw new IllegalArgumentException("No enum constant " + name);
    }
}
```

### What Java Automatically Provides

Every enum automatically gets:

* `values()` → returns all constants
* `valueOf(String name)` → converts String to enum constant
* `name()` → returns constant name
* `ordinal()` → returns position index

So, **enum is actually a class with fixed predefined objects (Singleton instances).**

That is why enum is commonly used for:

* Roles (ADMIN, USER)
* Status (ACTIVE, INACTIVE)
* Days, Months
* Order status in e-commerce

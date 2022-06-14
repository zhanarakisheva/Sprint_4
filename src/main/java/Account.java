public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // в строке не меньше 3 и не больше 19 символов,
        // в строке есть только один пробел,
        // пробел стоит не в начале и не в конце строки.
        if (name != null
                && name.length() >= 3 && name.length() <= 19
                && name.contains(" ")
                && name.indexOf(' ') == name.lastIndexOf(' ')
                && !name.startsWith(" ") && !name.endsWith(" ")) {
            return true;
        } else {
            return false;
        }
    }
}

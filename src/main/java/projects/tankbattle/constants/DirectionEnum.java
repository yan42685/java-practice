package projects.tankbattle.constants;

import projects.tankbattle.utils.TankUtils;

public enum DirectionEnum {
    UP, DOWN, LEFT, RIGHT;
    // values()方法每次调用都会生成一个新的数组，所以定义为常量，而不是放在方法里
    private static final DirectionEnum[] VALUES = DirectionEnum.values();
    public static DirectionEnum random() {
        int randomIndex = TankUtils.randomInt(0, VALUES.length);
        return VALUES[randomIndex];
    }
}

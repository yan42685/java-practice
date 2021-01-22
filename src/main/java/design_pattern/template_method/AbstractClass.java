package design_pattern.template_method;

public abstract class AbstractClass {
    public final void say() {
        beforeSay();
        System.out.println("say");
    }

    protected abstract void beforeSay();
}

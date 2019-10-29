package jackson.module;

import com.google.inject.AbstractModule;
import jackson.model.Hoge;

public class HogeModule extends AbstractModule {

    static class HogeStatic extends AbstractModule {
        @Override
        protected void configure() {
            bind(Hoge.class);
        }
    }

    @Override
    protected void configure() {
        super.configure();
    }

    public void aa() {
        install(new HogeStatic());
    }
}

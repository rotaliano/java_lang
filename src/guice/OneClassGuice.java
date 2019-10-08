package guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import lombok.AllArgsConstructor;

public class OneClassGuice {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Dependency());
        AnimalService animalService = injector.getInstance(AnimalService.class);
        animalService.fuga();
    }
}

interface Animal {
    void hoge();
}

class Cat implements Animal {

    @Override
    public void hoge() {
        System.out.println("ネコ");
    }
}

@AllArgsConstructor(onConstructor = @__({@Inject}))
class AnimalService {
    private final Animal animal;

    public void fuga() {
        this.animal.hoge();
    }
}

class Dependency extends AbstractModule {
    @Override
    protected void configure() {
        bind(Animal.class).to(Cat.class);
    }
}

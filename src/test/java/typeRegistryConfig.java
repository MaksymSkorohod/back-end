import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;

import java.util.Locale;

public class typeRegistryConfig implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineParameterType(new ParameterType<>(
                "digitString",
                "\"\\d*\"",
                Integer.class,
                (String s)-> Integer.parseInt(s)));

        typeRegistry.defineParameterType(new ParameterType<>(
                "put_post_patch", //Тип данных
                "(POST|PUT|PATCH)",
                String.class,
                (String s) -> s));

        typeRegistry.defineParameterType(new ParameterType<>(
                "get_delete", //Тип данных
                "(GET|DELETE)",
                String.class,
                (String s) -> s));
    }
}


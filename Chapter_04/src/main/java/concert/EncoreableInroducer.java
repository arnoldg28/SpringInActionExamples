package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

//@TODO: Javadoc here
@Aspect
@Component // I just added this but EncoreableInroducer should be added in the application context via xml or java config
public class EncoreableInroducer {

    @DeclareParents(value = "concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}

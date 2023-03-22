package example.model;

import io.helidon.builder.Builder;
import io.helidon.builder.Singular;

import java.util.List;

@Builder(requireLibraryDependencies = false)
public interface NameAndDescriptionAndComments extends NameAndDescription {
  @Singular
  List<String> comments();
}

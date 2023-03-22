package example.model;

import io.helidon.builder.Builder;

import java.util.Optional;

@Builder(requireLibraryDependencies = false)
public interface NameAndDescription {
  String name();
  Optional<String> description();
}


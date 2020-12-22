package student.comparator.reader;

public interface ArgumentReader<T, V> {

    T read(V argument);
}

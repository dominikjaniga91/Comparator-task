package student.reader;

public interface ArgumentReader<T, V> {

    T read(V argument);
}

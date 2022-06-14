package Generic;

import java.util.Objects;

public class Person1<T> {

    private T age;
    private T id;
    private T name;
    private T lastname;

    public Person1(T age, T id, T name, T lastname) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public T getAge() {
        return age;
    }

    public T getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1<?> anna = (Person1<?>) o;
        return Objects.equals(age, anna.age) && Objects.equals(id, anna.id) && Objects.equals(name, anna.name) && Objects.equals(lastname, anna.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, id, name, lastname);
    }
}

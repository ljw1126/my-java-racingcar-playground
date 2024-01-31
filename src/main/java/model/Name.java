package model;

import java.util.Objects;

public class Name {
    private static final String EMPTY_NAME_MESSAGE = "이름을 입력해주세요";
    private static final String OVER_NAME_MESSAGE = "이름은 5글자 초과할 수 없습니다";
    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    public Name(String name) {
        checkInValidName(name);
        this.name = name;
    }

    private void checkInValidName(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException(EMPTY_NAME_MESSAGE);
        }

        if(name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(OVER_NAME_MESSAGE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

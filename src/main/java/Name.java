import com.sun.tools.javac.util.StringUtils;

import java.util.Objects;

public class Name {
    private String name;

    public Name(String name) {
        checkEmpty(name);
        checkLength(name);
        this.name = name.trim();
    }

    private static void checkLength(String name) {
        if(name.length() > 5) {
            throw new IllegalArgumentException("5자 이하의 이름만 받을 수 있습니다");
        }
    }

    private static void checkEmpty(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException("빈 문자열은 입력할 수 없습니다");
        }
    }

    public String getName() {
        return name;
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
}

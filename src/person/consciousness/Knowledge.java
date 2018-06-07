package person.consciousness;

import java.util.Objects;

public class Knowledge {
    private int level;

    public Knowledge(int level) {
        //TODO: Implementation is needed
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knowledge knowledge = (Knowledge) o;
        return level == knowledge.level;
    }

    @Override
    public int hashCode() {

        return Objects.hash(level);
    }
}

package Third.PartTwo.Furniture;

import Third.PartTwo.Interfaces.IFurniture;
import Third.PartTwo.Interfaces.IObject;

public abstract class Chair implements IFurniture, IObject {
    protected boolean isAlignable;

    public Chair(boolean isAlignable) {
        this.isAlignable = isAlignable;
    }

    public boolean isAlignable() {
        return isAlignable;
    }
}

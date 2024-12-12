package systems;

import maps.MapType;

public abstract class NavigationSystem {
    protected MapType mapType; 

    public NavigationSystem(MapType mapType) {
        this.mapType = mapType; 
    }

    public abstract void navigate(String startPoint, String endPoint);
}


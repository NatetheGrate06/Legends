package Game_Levels.arenas;

public class arena {
  
  public static arena arenas; {
    ArrayList<arena> arenas = new ArrayList<>();
    arenas.add(cloud_arena.cloudArena);
    arenas.add(lava_arena.lavaArena);
  }
}

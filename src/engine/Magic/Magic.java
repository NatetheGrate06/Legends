package engine.Magic;

import engine.Characters.playable_characters.Knights.knight;

public abstract class Magic {
    
    public static Magic magic;
    public static Magic knightMagic;

    public Magic getKnightMagic() {
        return this.knightMagic;
    }

    private Magic main(String[] args) {
        if(knight.isKnight(true)) {
            return knightMagic;
        }
        return magic;
    }
}

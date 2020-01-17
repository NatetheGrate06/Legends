package engine.Magic;

import engine.Characters.playable_enemy_characters.bear;

public class air_magic extends enemy_character  {

public Magic getbearmagic(){
return this.bearmagic;

}

  private Magic main(String[]args) {
    if(bear.isbear(true)) {
      return bearmagic;
    }
    return magic;
  }
}

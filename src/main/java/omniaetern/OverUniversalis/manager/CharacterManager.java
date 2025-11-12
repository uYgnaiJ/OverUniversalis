package omniaetern.OverUniversalis.manager;

import jakarta.json.bind.reflect.TypeLiteral;
import omniaetern.OverUniversalis.common.exception.ExceptionType;
import omniaetern.OverUniversalis.common.exception.GameLogicException;
import omniaetern.OverUniversalis.dataObject.Character;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static omniaetern.OverUniversalis.common.exception.ExceptionHandler.handle;

public class CharacterManager {
    HashMap<String, Character> characters = new HashMap<>();

    static final String characterFilePath = "data/default/characters/json";

    public void LoadCharacters(){
        File file = new File(characterFilePath);
        if (!file.exists()){
            throw new GameLogicException(ExceptionType.MISSING_GAME_CONTENT.code(),"/data/default/characters/json is missing");
        }
        try{
            FileReader reader = new FileReader(file);
            Jsonb jsonb = JsonbBuilder.create();
            List<Character> characterList = jsonb.fromJson(reader, new TypeLiteral<List<Character>>(){});
            for (Character c : characterList){
                characters.put(c.getId(),c);
            }
        }catch (IOException e){
            handle(e);
        }
    }

    public void SaveCharacters(){
        List<Character> characterList = new ArrayList<>(characters.values());
        File file = new File(characterFilePath);
        try{
            FileWriter writer = new FileWriter(file);
            Jsonb jsonb = JsonbBuilder.create();
            jsonb.toJson(characterList, writer);
        }catch (IOException e){
            handle(e);
        }
    }
}

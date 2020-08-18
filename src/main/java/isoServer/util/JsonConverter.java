package isoServer.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;

public class JsonConverter {

    private final Gson gson;

    public JsonConverter() {
        gson = new GsonBuilder().create();
    }

    public String convertToJson(List<?> transactions) {
        JsonArray jarray = gson.toJsonTree(transactions).getAsJsonArray();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("transactions", jarray);

        return jsonObject.toString();
    }

}

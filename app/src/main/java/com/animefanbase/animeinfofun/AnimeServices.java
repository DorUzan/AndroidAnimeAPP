package com.animefanbase.animeinfofun;
import java.util.List;
import retrofit2.Call;

public interface AnimeServices {
    @GET("https://api.jikan.moe/v4/anime")
    Call<List<Post>> getPost();
}

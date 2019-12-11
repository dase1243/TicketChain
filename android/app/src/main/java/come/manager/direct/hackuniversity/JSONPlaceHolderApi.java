package come.manager.direct.hackuniversity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JSONPlaceHolderApi {
    @GET("/sign/{id}")
    public Call<Post> getPostWithID(@Path("id") int id);
}

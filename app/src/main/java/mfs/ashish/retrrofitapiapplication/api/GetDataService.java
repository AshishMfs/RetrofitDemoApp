package mfs.ashish.retrrofitapiapplication.api;

import java.util.List;

import mfs.ashish.retrrofitapiapplication.models.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/users")
    Call<List<User>> getUsers();
}

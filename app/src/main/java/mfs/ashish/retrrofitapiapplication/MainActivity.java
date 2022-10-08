package mfs.ashish.retrrofitapiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import mfs.ashish.retrrofitapiapplication.api.GetDataService;
import mfs.ashish.retrrofitapiapplication.api.RetrofitClient;
import mfs.ashish.retrrofitapiapplication.models.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetDataService getDataService = RetrofitClient.getRetrofitInstance().create(GetDataService.class);
        Call<List<User>> call = getDataService.getUsers();

        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                Log.d("Raj", response.body().toString());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.d("Raj", t.toString());
            }
        });

    }
}
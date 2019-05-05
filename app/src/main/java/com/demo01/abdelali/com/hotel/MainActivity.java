package com.demo01.abdelali.com.hotel;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.demo01.abdelali.com.hotel.api.ApiClient;
import com.demo01.abdelali.com.hotel.api.ApiService;
import com.demo01.abdelali.com.hotel.api.PostResponse;
import com.demo01.abdelali.com.hotel.models.post;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPost();
    }
// methode de test
    private void getPost() {
        ApiService service = ApiClient.getService();

        service.getAllPosts().enqueue(new Callback<PostResponse>() {
            @Override
            public void onResponse(@NonNull Call<PostResponse> call, @NonNull Response<PostResponse> response) {
                if (response.isSuccessful() && response.body() != null){
                    //fetch data from api is sucess
                    for (post post : response.body().getPosts()) {
                        Log.i(TAG, "onResponse: " + post);
                        
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<PostResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(),""+t.getMessage(),Toast.LENGTH_LONG).show();
                Log.e(TAG, "onFailure: ", t );
            }
        });

    }
}

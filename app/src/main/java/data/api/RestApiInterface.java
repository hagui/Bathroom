package data.api;

import domain.model.BathRoom;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by z.hagui on 19/03/2018.
 * Bathroom
 */

public interface RestApiInterface {

    @android.support.annotation.NonNull
    @GET
    Single<BathRoom> getBathRoom(@Url String url);

}
